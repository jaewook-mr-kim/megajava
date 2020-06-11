package 크롤링;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class 주식크롤링 {

	public static void main(String[] args) {
		JFrame f = new JFrame("나의 주식 크롤링");
		FlowLayout flow = new FlowLayout();
		
		JButton b1 = new JButton("셀트리온");
		JButton b2 = new JButton("삼성전자");
		JButton b3 = new JButton("현대약품");
		JButton b4 = new JButton("불러오기");
		
		JLabel l = new JLabel("CODE: ");
		JTextField input = new JTextField(7);
		JTextArea result = new JTextArea(5,10);
		
		Font font = new Font("궁서", Font.BOLD, 50);
		Font font2 = new Font("궁서", Font.BOLD, 30);
		f.setSize(390, 800);
		f.setLayout(flow);
		
		b1.setFont(font);
		b2.setFont(font);
		b3.setFont(font);
		b4.setFont(font);
		l.setFont(font);
		input.setFont(font);
		result.setFont(font2);
		
		b1.setBackground(Color.orange);
		b2.setBackground(Color.orange);
		b3.setBackground(Color.orange);
		b4.setBackground(Color.white);
		
		l.setForeground(Color.red);
		input.setBackground(Color.green);
		
		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(l);
		f.add(input);
		f.add(b4);
		f.add(result);
		
		f.getContentPane().setBackground(Color.yellow);
		result.setEnabled(false); // 임의로 내용을 못치게 하는 법
		
		b1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String data = "068270";
				네이버증권크롤링5 네이버 = new 네이버증권크롤링5();
				String[] values = 네이버.naver(data);
				result.setText("현재가: " + values[0] + "\n" + "어제가: " + values[1] + "\n" + "최고가: " + values[2] + "\n");
			}
		});
		
		b2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String data = "005930";
				네이버증권크롤링5 네이버 = new 네이버증권크롤링5();
				String[] values = 네이버.naver(data);
				result.setText("현재가: " + values[0] + "\n" + "어제가: " + values[1] + "\n" + "최고가: " + values[2] + "\n");
			}
		});
		
		b3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String data = "004310";
				네이버증권크롤링5 네이버 = new 네이버증권크롤링5();
				String[] values = 네이버.naver(data);
				result.setText("현재가: " + values[0] + "\n" + "어제가: " + values[1] + "\n" + "최고가: " + values[2] + "\n");
			}
		});
		
		b4.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String data = input.getText();
				네이버증권크롤링5 네이버 = new 네이버증권크롤링5();
				String[] values = 네이버.naver(data);
				result.setText("현재가: " + values[0] + "\n" + "어제가: " + values[1] + "\n" + "최고가: " + values[2] + "\n");
				// result.append => 기본 텍스트에서 더하기
				
				
			}
		});
		
		f.setVisible(true);
		

		
	}

}
