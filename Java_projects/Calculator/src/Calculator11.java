import java.awt.*;
import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculator11 {

	public class Calculator extends JFrame{
		private double result=0;
		private int count=0;
		
		public Calculator(){
			this.setSize(350,450);
			this.setTitle("������");
			init();
			this.setVisible(true);
			this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}
		
		//��ʼ������
		public void init(){
			this.setLayout(new BorderLayout()); //�߿�ʽ����
			//���ı��������north
			JTextField textField=new JTextField();
		
			textField.setPreferredSize(new Dimension(this.getWidth(),50));
			this.add(textField,BorderLayout.NORTH);
			
			//���JPanel���,panelΪ���񲼾�
			JPanel panel=new JPanel();
			panel.setLayout(new BorderLayout());
			this.add(panel,BorderLayout.CENTER);
			
			JPanel panelNorth=new JPanel();
			panelNorth.setLayout(new GridLayout(1,6));
			//���������������ť
			JButton MC=new JButton("MC");  
			JButton MR=new JButton("MR");
			JButton M0=new JButton("M+");
			JButton M1=new JButton("M-");
			JButton MS=new JButton("MS");
			JButton M=new JButton("M");
			
			panelNorth.add(MC);
			panelNorth.add(MR);
			panelNorth.add(M0);
			panelNorth.add(M1);
			panelNorth.add(MS);
			panelNorth.add(M);
			panel.add(panelNorth,BorderLayout.NORTH);
			
			CardLayout cardLayout=new CardLayout();
			JPanel panelCard=new JPanel();
			panelCard.setLayout(cardLayout);
			
			JPanel panel0=new JPanel();
			panel0.setLayout(new GridLayout(6,4));
			
			//������ť����
			TextField text=new TextField();
			JButton[] standreButton=new JButton[24];
			String str[]={"%","��","x2","1/x",
					      "CE","C","��","/",
					      "7","8","9","*",
					      "4","5","6","-",
					      "1","2","3","+",
					      "��","0",".","="
					      };
					//����ѭ������ע�ᰴť�¼�
			for(int i=0;i<standreButton.length;i++){
				standreButton[i]=new JButton(str[i]);
				standreButton[i].addActionListener(new ActionListener(){
					public void actionPerformed(ActionEvent e){
						if(text.equals("CE")||text.equals("C")){
							textField.setText("");
						}
						else if(text.equals("=")){
							String expression=textField.getText();
							Calculator cal=new Calculator();
							textField.setText(result+"");
						}
						else if(text.equals("%")){
							
						}
						else if(text.equals("��")){
							result=Double.parseDouble(textField.getText());
							result=Math.sqrt(result);
							textField.setText(result+"");
						}
						else if(text.equals("x2")){
							result=Double.parseDouble(textField.getText());
							result*=result;
							textField.setText(result+"");
						}
						else if(text.equals("1/x")){
							result=Double.parseDouble(textField.getText());
							result*=1/result;
							textField.setText(result+"");
						}
					
				    	else if(text.equals("��")){
						if(count==0){
							textField.setText(textField.getText()+"-");
							count=1;
						}
						else{
							textField.setText(textField.getText()+"+");
							count=0;
						}
					}
				    	else if(text.equals("x")){
				    		textField.setText(textField.getText().substring(0,textField.getText().length()-1));
				    		
				    	}
				    	else{
				    		textField.setText(textField.getText()+text);
				    	}
				   }
				});
				
				panel0.add(standreButton[i]);
			}
			panelCard.add(panel0);
			
			JPanel panel1=new JPanel();
			panel1.setLayout(new GridLayout(7,5));
			JButton scienceButton[]=new JButton[35];
			String str1[]={"x2","x^y","sin","cos","tan",
					"��","10^x","log","Exp","Mod",
					"��","CE","C","��","/",
					"��","7","8","9","*",
					"n!","4","5","6","-",
					"��","1","2","3","+",
					"(",")","0",".","="				
					};
			
			//����ѭ��������Ӱ�ť
			for(int i=0;i<str1.length;i++){
				scienceButton[i]=new JButton(str1[i]);
				panel1.add(scienceButton[i]);
		}
			panelCard.add(panel1);
			panel.add(panelCard,BorderLayout.CENTER);
			
			JMenuBar menuBar=new JMenuBar();
			this.setJMenuBar(menuBar);
			JMenu modelMenu=new JMenu("ģʽ");
			menuBar.add(modelMenu);
			JMenuItem standred=new JMenuItem("��׼");		
			standred.addActionListener(new ActionListener() {
				
				public void actionPerformed(ActionEvent e) {
					
					cardLayout.first(panelCard);
				}		
			});
			modelMenu.add(standred);
			JMenuItem science=new JMenuItem("��ѧ");
			science.addActionListener(new ActionListener() {
	
				public void actionPerformed(ActionEvent e) {
					cardLayout.last(panelCard);
				}			
			});
			modelMenu.add(science);
			
		}	
	}
	
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	new Calculator11();
	}

}
