package android.chatserver;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class ChatServer {
	// 서버를 만들기 위해서 java.net ServerSocket을 생성한다.
		// Stream IO 통신 - ArrayList,Thread 필요
		private ServerSocket ss;
		private ArrayList<ServerThread> clist; // 클라이언트를 저장할 공간
		public ChatServer() {
			try {
				
				// IP찾고 현재 서비스(9999) 서버 소켓이 응답 
				ss = new ServerSocket(9000);	
				clist = new ArrayList<>();
				System.out.println("Server Start!");
			
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		public void execute(){
			// 대기를 하다가 클라이언트가 접속을 시도했다면
			// 그때 이메서드가 호출되면서 접속해온 클라이언트의
			// Socket과 연결.
			while(true){
			try {
				Socket s = ss.accept(); 
				ServerThread ct = new ServerThread(s, this);
				clist.add(ct); // 소켓을 담당하는 스레드들의 주소저장
				ct.setDaemon(true);
				ct.start(); // 스레드를 동작
				System.out.println("Current number of Clients :"+clist.size());
			} catch (IOException e) {
				e.printStackTrace();
			} //blocking메서드 
			}
			
		}
		public static void main(String[] args) {
			ChatServer sv = new ChatServer();
			 sv.execute();
		}
		public void sendMsg(String msg, String reip) {
			msg = "["+reip+"]"+msg;
			for(ServerThread c : clist){
				c.getPw().println(msg);
			}
		}
	}

