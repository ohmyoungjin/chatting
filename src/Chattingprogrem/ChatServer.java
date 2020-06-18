package Chattingprogrem;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ChatServer {
	ServerSocket ser;

	public void chatStart() {
		final int PORT = 2020;
		try {
			ser = new ServerSocket(PORT);
			System.out.println("서버 접속을 환영합니다 연결을 기다리고있습니다");
			while (true) {

				
				Socket sock = ser.accept();
				System.out.println("서버접속됐습니다");
				String home = sock.getInetAddress().getHostAddress();
				System.out.println(home);
				
			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
