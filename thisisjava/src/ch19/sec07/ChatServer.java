package ch19.sec07;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.function.Consumer;

import org.json.JSONObject;

public class ChatServer {
	ServerSocket serverSocket;
	ExecutorService threadPool = Executors.newFixedThreadPool(100);
	Map<String, SocketClient> chatRoom = Collections.synchronizedMap(new HashMap<>());
	
	public void start() throws IOException {
		serverSocket = new ServerSocket(50001);
		System.out.println("[서버] 시작됨");
		
		Thread thread = new Thread(() -> {
				try {
					while(true) {
						Socket socket = serverSocket.accept();
						SocketClient sc = new SocketClient(this, socket);
					}
				}catch(Exception e) {
					System.out.println(e);
				}
			}
		);
		
		thread.start();
	}
	
	public void removeSocketClient(SocketClient socketClient) {
		String key = socketClient.chatName + "@" + socketClient.clientIp;
		chatRoom.remove(key);
		System.out.println("나감: " + key);
		System.out.println("현재 채팅자 수 : " + chatRoom.size()+ "\n");
	}
	
	public void addSocketClient(SocketClient socketClient) {
		String key = socketClient.chatName + "@" + socketClient.clientIp;
		chatRoom.put(key, socketClient);
		System.out.println("입장: " + key);
		System.out.println("현재 채팅자 수 : " + chatRoom.size()+ "\n");
	}
	
	public void sendToAll(SocketClient sender, String message) {
		JSONObject root = new JSONObject();
		root.put("clientIp", sender.clientIp);
		root.put("chatName", sender.chatName);
		root.put("message", message);
		String json = root.toString();
		Collection<SocketClient> socketClients = chatRoom.values();
		for(SocketClient sc : socketClients) {
			if(sc == sender) continue;
			sc.send(json);
		}
	}
	
	public void stop() {
		try {
			serverSocket.close();
			threadPool.shutdown();
			chatRoom.values().stream().forEach(new Consumer<SocketClient>() {

				@Override
				public void accept(SocketClient t) {
					t.close();
				}
				
			});
			System.out.println("[서버] 종료됨");
		}catch(Exception e) {
			System.out.println(e);
		}
	}
}
