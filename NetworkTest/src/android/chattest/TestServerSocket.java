package android.chattest;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader; 
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Properties;

public class TestServerSocket {

	// 1. ServerSocket 생성 
	// 2. Client와 Server 간의 소켓 통신의 간단한 개념을 학습
	// 3. GUI로 만들어서 테스트 한 후 안드로이드 이동
	
	private ServerSocket ss;
	
	public TestServerSocket() {
		try {
			ss = new ServerSocket(9999);
			System.out.println("서버를 구동합니다.");
			
		// 원래 아래 부분은 멀티 테스킹일 때는 쓰레드를 처리하여 동작해야 한다.
			while(true){
				Socket s = ss.accept();
				String cip =  s.getInetAddress().getHostAddress();
				System.out.println("클라이언트 접속됨 : " + cip);
			
BufferedReader in = new BufferedReader(new InputStreamReader(s.getInputStream()));
PrintWriter out = new PrintWriter( new BufferedOutputStream ( s.getOutputStream()), true);
				
				String msg = in.readLine();

// 서버는 request 요청을 처리하고 response를 보내는 것이 역할이다.
//				StringBuffer sb = new StringBuffer();
//				sb.append("Respone msg : ").append(msg+"\n");
//				sb.append("IP : ").append(cip);
				
				String result = "";
				try{

					// 프로퍼티 객체 생성
					Properties prop = new Properties();
					// 프로퍼티 파일 위치
					String propFile = "src\\android\\chattest\\msg.properties";

					// 프로퍼티 파일 스트림에 담기
					FileInputStream fis = new FileInputStream(propFile);

					// 프로퍼티 파일 로딩
					prop.load(fis);

					// 항목 읽기
					result = prop.getProperty(msg, "no!") ;

					// 콘솔 출력
					// System.out.println(result) ;
				}catch( Exception ex ){
					System.out.println("프라퍼티 파일 읽기 실패 : " + ex.getMessage());
				}				
				out.println(result); // 응답				
			}
		} catch (IOException e) {			
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {		
			new TestServerSocket();
	}
}
