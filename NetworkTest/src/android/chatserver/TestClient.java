package android.chatserver;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class TestClient extends JFrame {

	private Socket s;
	private JPanel p1, p2;
	private JTextField msg;
	private JButton btn1;
	private JTextArea txt;
		
	public TestClient() {
		
		p1 = new JPanel();
		p1.add( msg = new JTextField(15));
		p1.add( btn1 = new JButton("click"));
		
		p2 = new JPanel();
		p2.add(txt = new JTextArea(10, 20));
		
		add(p1, "North");
		add(p2, "Center");
		setBounds(100, 100, 300, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//System.out.println("evt");
				// 소켓 연결 후
				// 필요한 요청 후
				// 결과값을 텍스트에어리어에 출력
				
				 Socket s = null;
				 Scanner in = null;
				 PrintWriter out = null;
				 try {
s = new Socket("127.0.0.1", 9000);
in = new Scanner( new BufferedInputStream(s.getInputStream()));
out = new PrintWriter( new BufferedOutputStream(s.getOutputStream()), true);
					
out.println(msg.getText().trim());	// request
String smsg = in.nextLine();	// response
					
					txt.append(smsg +"\n");
					
				} catch (IOException e1) {	
					e1.printStackTrace();
				}
			}
		});
	}
	
	public static void main(String[] args) {
		new TestClient();
	}
}

