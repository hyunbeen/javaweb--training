package android.chatserver;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class ServerThread extends Thread {
	private Socket s; //소켓의 주소
	private ChatServer server; // 서버의 주소
	private BufferedReader in; 
	private PrintWriter pw; 
	private String reip;
	//서버가 브로드케스트로 클라이언트에게 전송할 스트림을 제공
	public PrintWriter getPw() {
		return pw;
	}
	
	//생성자가 호출이 되는 시점에에는 접속해온 클라이언트 소켓 , 서버의 주소,
	// 스트림까지 생성을 마침
	public ServerThread(Socket s, ChatServer server) {
		this.s = s;
		this.server = server;
		// 각각의 Socket에서 IP를 얻어내야 한다.
		reip = s.getInetAddress().getHostAddress();
		System.out.println("reip:"+reip);
		// 스트림을 소켓으로 부터 연결
		try {
			//PrintWriter : 바이트/문자 모두 가능, true:버퍼를 사용할 때 반드시 작성
			// flush를 자동으로 해줌.
			pw = new PrintWriter(
					new BufferedOutputStream(s.getOutputStream()),true);
			in = new BufferedReader(new InputStreamReader(
					s.getInputStream()));
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void run() { // 스레드에게 시킬 동작 
		while(true){
			try {
				//소켓으로 부터 메세지를 받기 위해서 대기 .....
				String msg = in.readLine();
				if(msg != null){
				System.out.println("Server Log :"+msg);
				transMsg(msg);
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	private void transMsg(String msg) {
		server.sendMsg(msg,reip);
	}
}
