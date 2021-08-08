package Calculator;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class Calculator extends JFrame implements ActionListener{

	JFrame frame;
	JPanel panel;
	JTextField textfield;
	JButton button9,button8,button7,button6,button5,button4,button3,button2,button1,button0,buttonDot,buttonMul,buttonDiv,buttonSub,buttonAdd,buttonEqual,ButtonClear;
	int value1,flag=0;
	String str1,str2,str;
	String str3;
	
	Calculator(){
		panel=new JPanel();
		
		textfield=new JTextField();
		textfield.setPreferredSize(new Dimension(170,50));
		textfield.setCaretColor(Color.BLACK);
		
		button9=new JButton("9");
		button9.addActionListener(this);
		button8=new JButton("8");
		button8.addActionListener(this);
		button7=new JButton("7");
		button7.addActionListener(this);
		button6=new JButton("6");
		button6.addActionListener(this);
		button5=new JButton("5");
		button5.addActionListener(this);
		button4=new JButton("4");
		button4.addActionListener(this);
		button3=new JButton("3");
		button3.addActionListener(this);
		button2=new JButton("2");
		button2.addActionListener(this);
		button1=new JButton("1");
		button1.addActionListener(this);
		button0=new JButton("0");
		button0.addActionListener(this);
		buttonDot=new JButton(".");
		buttonDot.addActionListener(this);
		buttonEqual=new JButton("=");
		buttonEqual.addActionListener(this);
		buttonAdd=new JButton("+");
		buttonAdd.addActionListener(this);
		buttonSub=new JButton("-");
		buttonSub.addActionListener(this);
		buttonMul=new JButton("x");
		buttonMul.addActionListener(this);
		buttonDiv=new JButton("/");
		buttonDiv.addActionListener(this);
		
		panel.add(button7);
		panel.add(button8);
		panel.add(button9);
		panel.add(buttonDiv);
		panel.add(button4);
		panel.add(button5);
		panel.add(button6);
		panel.add(buttonMul);
		panel.add(button1);
		panel.add(button2);
		panel.add(button3);
		panel.add(buttonSub);
		panel.add(buttonDot);
		panel.add(button0);
		panel.add(buttonAdd);
		panel.add(buttonEqual);
		
		
		this.add(textfield);
		this.add(panel);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(200,210);
		this.setLayout(new FlowLayout());
		panel.setLayout(new GridLayout(4,4));
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==button9) {
			 str1=textfield.getText();
			 str2="9";
			 str=str1+str2;
			textfield.setText(str);
		}
		if(e.getSource()==button8) {
			 str1=textfield.getText();
			 str2="8";
			 str=str1+str2;
			textfield.setText(str);
		}
		if(e.getSource()==button7) {
			 str1=textfield.getText();
			 str2="7";
			 str=str1+str2;
			textfield.setText(str);
			
		}
		if(e.getSource()==button6) {
			 str1=textfield.getText();
			 str2="6";
			 str=str1+str2;
			textfield.setText(str);
		}
		if(e.getSource()==button5) {
			 str1=textfield.getText();
			 str2="5";
			 str=str1+str2;
			textfield.setText(str);
		}
		if(e.getSource()==button4) {
			 str1=textfield.getText();
			 str2="4";
			 str=str1+str2;
			textfield.setText(str);
		}
		if(e.getSource()==button3) {
			 str1=textfield.getText();
			 str2="3";
			 str=str1+str2;
			textfield.setText(str);
		}
		if(e.getSource()==button2) {
			 str1=textfield.getText();
			 str2="2";
			 str=str1+str2;
			textfield.setText(str);
		}
		if(e.getSource()==button1) {
			 str1=textfield.getText();
			 str2="1";
			 str=str1+str2;
			textfield.setText(str);
		}
		if(e.getSource()==button0) {
			 str1=textfield.getText();
			 str2="0";
			 str=str1+str2;
			textfield.setText(str);
		}
		if(e.getSource()==buttonDot) {
			 str1=textfield.getText();
			 str2=".";
			 str=str1+str2;
			textfield.setText(str);
		}
		if(e.getSource()==buttonMul) {
			 str1=textfield.getText();
			 str2=" x ";
			 str=str1+str2;
			textfield.setText(str);
		}
		if(e.getSource()==buttonDiv) {
			 str1=textfield.getText();
			 str2=" / ";
			 str=str1+str2;
			textfield.setText(str);
		}
		if(e.getSource()==buttonSub) {
			 str1=textfield.getText();
			 str2=" - ";
			 str=str1+str2;
			textfield.setText(str);
		}
		if(e.getSource()==buttonAdd) {
			 str1=textfield.getText();
			 str2=" + ";
			 str=str1+str2;
			textfield.setText(str);
		}
		if(e.getSource()==buttonEqual) {
			int q;
			
			for(int i=0;i<=50;i++) {
				String text=textfield.getText();
				int val=text.indexOf('x');
				System.out.println(val);
				if(val>0) {
					String yo=charRemoveAt(text,val);
					for(int j=0;j<val-1;j++) {
						char first=yo.charAt(j);
						q=Character.getNumericValue(first);
						System.out.print(q);
					}
//					for(int j=val+1;j<yo.length();j++) {
//						char second=yo.charAt(j);
//						System.out.print(second);
//					}
					break;
				}
			}
		}
		
	}
	public static String charRemoveAt(String str, int p) { 
		
        return str.substring(0, p) + str.substring(p + 1);  
        
     }
	

	
}
