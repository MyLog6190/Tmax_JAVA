package ch19.sec07;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;

import org.json.JSONObject;

public class SocketClient {
	ChatServer chatServer;
	Socket socket;
	DataInputStream dis;
	DataOutputStream dos;
	String clientIp;
	String chatName;
	
	public SocketClient(ChatServer chatServer, Socket socket) {
		try {
			this.chatServer = chatServer;
			this.socket = socket;
			this.dis = new DataInputStream(socket.getInputStream());
			this.dos = new DataOutputStream(socket.getOutputStream());
			InetSocketAddress isa = (InetSocketAddress)socket.getRemoteSocketAddress();
			this.clientIp = isa.getHostName();
			receive();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	// JSON
	public void receive() {
		// Runnable 익명객체는 Runnable클래스 안의 구현체이기 때문에
		// 현재 클래스의 this로 필드 접근이 불가함
		
		// 람다식으로 하면 this로 필드 접근가능하다
		// Runnable안의 구현체로 인식하는게 아니라 하나의 식으로 인식
		chatServer.threadPool.execute(() -> {
				try {
					while(true) {
						String receiveJson = dis.readUTF();
						JSONObject jsonObject = new JSONObject(receiveJson);
						String command = jsonObject.getString("command");
						switch(command) {
						case "incomming":
							this.chatName = jsonObject.getString("data");
							chatServer.sendToAll(this, "들어오셨습니다.");
							chatServer.addSocketClient(this);
							break;
						case "message":
							String message = jsonObject.getString("data");
							chatServer.sendToAll(this, message);
							break;
						}
					}
				} catch (Exception e) {
					chatServer.sendToAll(this, "나갔습니다.");
					chatServer.removeSocketClient(this);
				}
			}
		);
	}
	
	public void send(String json) {
		try {
			dos.writeUTF(json);
			dos.flush();
		} catch(Exception e) {
			System.out.println(e);
		}// send()
	}
	
	public void close() {
		try {
			socket.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
