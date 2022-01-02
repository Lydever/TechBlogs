
import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Calculator15 extends JFrame implements ActionListener{
	
	       //������Ҫ��ť
    private  String keys[]={"%","��","x^2","1/x",
    		"CE","C","<-","/",
    		"7","8","9","*","4",
    		"5","6","-","1","2",
    		"3","+","+/-","0",".","="};    
    private  String Storage[]={"MC","MR","M+","M-","MS","M"};
    private JButton Keys[]=new JButton[keys.length];    //������ť��
    private JButton storage[]=new JButton[Storage.length];
    static JMenuBar menuBar=new JMenuBar();
    JPanel CenterPanel=new JPanel();
    JPanel NorthPanel=new JPanel();
    JPanel SouthPanel=new JPanel();
    JTextField textField=new JTextField(20);       //���ı���
    JTextField textFieldUp=new JTextField(20);     //���ı���
    private double firstNum;                           //�����д���ֵ
    private double secondNum;                          //�����д���ֵ
    private double result;
    private String Result;
    private String num="";
    private static int option;
    private static String num1="";
  
    public Calculator15(){
    	//��ʼ��������
       JMenu fileItem=new JMenu("      ���ܲ˵�");       
       JMenu colorItem=new JMenu("      ����");  
       JMenu aboutItem=new JMenu("      ����");
       JMenuItem seicece=new JMenuItem("       ��ѧ������");
       JMenuItem standre=new JMenuItem("       ��׼");
       JMenuItem color1=new JMenuItem("       ��ɫ");
       JMenuItem font2=new JMenuItem("       ����");
       JMenuItem about1=new JMenuItem("       ����");
       JMenuItem about2=new JMenuItem("       �鿴");
       menuBar.add(fileItem);
       menuBar.add(colorItem);
       menuBar.add(aboutItem);
       fileItem.add(seicece);                
       fileItem.add(standre);
       colorItem.add(color1);                
       colorItem.add(font2);
       aboutItem.add(about1);                
       aboutItem.add(about2);
 
       about1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				new LookHelp();
			}
		});
		
       about2.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				new AboutBook();
			}
		});
       SouthPanel.setLayout(new GridLayout(2,1));              
       CenterPanel.setLayout(new GridLayout(6,4));
       NorthPanel.setLayout(new GridLayout(1,6));
       CenterPanel.setPreferredSize(new Dimension(400,300));   
       NorthPanel.setPreferredSize(new Dimension(50,50));
       addRom(Storage);
       
       //ѭ������ť����ϼ����������������
       for(int i=0;i<keys.length;i++){                      
           addKeys(keys[i],i);
       }
       SouthPanel.add(textFieldUp);            
       SouthPanel.add(textField);                
       add(SouthPanel,BorderLayout.NORTH);
       add(CenterPanel,BorderLayout.SOUTH);
       add(NorthPanel,BorderLayout.CENTER);
       
        //�����ɲ����޸�
       textField.setHorizontalAlignment(JTextField.RIGHT); 
       textField.setEditable(false);
       textFieldUp.setHorizontalAlignment(JTextField.RIGHT);
       textFieldUp.setEditable(false);
   }
     public void addKeys(String keys,int i){
         Keys[i]= new  JButton(keys);
         CenterPanel.add(Keys[i]);
         Keys[i].addActionListener(this);
  }
    public void addRom(String Storage[]){
      for(int i=0;i<Storage.length;i++){
    	  storage[i]= new  JButton(Storage[i]);
          NorthPanel.add(storage[i]);
      }
  }

	
    
    public void actionPerformed(ActionEvent e) { 
    	//���ּ��̵ļ�����
         if(e.getSource()==Keys[8]){
             num+="7";
             num1+="7";
             textField.setText(num);

         }else if(e.getSource()==Keys[9]){
        	 num1+="8";
        	 num+="8";
             textField.setText(num);

         }else if(e.getSource()==Keys[10]){
        	 num1+="9";
        	 num+="9";
             textField.setText(num);

         }else if(e.getSource()==Keys[12]){
        	 num1+="4";
        	 num+="4";
             textField.setText(num);

         }else if(e.getSource()==Keys[13]){
        	 num1+="5";
        	 num+="5";
             textField.setText(num);

         }else if(e.getSource()==Keys[14]){
        	 num1+="6";
             num+="6";
             textField.setText(num);

         }else if(e.getSource()==Keys[16]){
        	 num1+="1";
        	 num+="1";
             textField.setText(num);
         }
         else if(e.getSource()==Keys[17]){
        	 num1+="2";
             num+="2";
             textField.setText(num);
         }
         else if(e.getSource()==Keys[18]){
        	 num1+="3";
        	 num+="3";
             textField.setText(num);
         }
        if(e.getSource()==Keys[0]){
        	firstNum=Double.parseDouble(textField.getText());
            textField.setText("");
            num="";
            num1+="%";
            textFieldUp.setText(num1);
            option=2;
        }
      //���ںŷ���
        else if(e.getSource()==Keys[23]){   
            if(option==1){
                String Right=textField.getText();
                secondNum=Double.parseDouble(Right);
                result=firstNum+secondNum;
                Result=""+result;
            }else if (option==2){
            	secondNum=Double.parseDouble(textField.getText());
                result=firstNum%secondNum;
                Result=""+result;
            }else if(option==3){
            	secondNum=Double.parseDouble(textField.getText());
                result=firstNum/secondNum;
                Result=""+result;
            }else if(option==4){
            	secondNum=Double.parseDouble(textField.getText());
                result=firstNum*secondNum;
                Result=""+result;
            }else if(option==5){
            	secondNum=Double.parseDouble(textField.getText());
                result=firstNum-secondNum;
                Result=""+result;
            }
            textField.setText(Result);
        }else if (e.getSource()==Keys[1]){           //�Ӽ��˳��ȹ��ܼ��ļ���������
        	firstNum=Double.parseDouble(textField.getText());
            textField.setText("");
            num="";
            result=Math.sqrt(firstNum);
            Result=""+result;
            textFieldUp.setText(Result);
        }else if(e.getSource()==Keys[2]){
        	firstNum=Double.parseDouble(textField.getText());
            textField.setText("");
            num="";
            result=firstNum*firstNum;
            Result=""+result;
            textFieldUp.setText(Result);
        }else if(e.getSource()==Keys[3]){
        	firstNum=Double.parseDouble(textField.getText());
            textField.setText("");
            num="";
            result=1/firstNum;
            Result=""+result;
            textFieldUp.setText(Result);
        }else if(e.getSource()==Keys[4]){
            textField.setText("");
            num="";
            num1="";
        }else if(e.getSource()==Keys[19]){
        	firstNum=Double.parseDouble(textField.getText());
            num1+="+";
            textFieldUp.setText(num1);
            textField.setText("");
            num="";
            option=1;
        }else if(e.getSource()==Keys[5]){
            textField.setText("");
            num="";
            num1="";
        }else if(e.getSource()==Keys[6]){
            textField.setText("");
            num="";
            num1="";
        }else if(e.getSource()==Keys[7]){
        	firstNum=Double.parseDouble(textField.getText());
            num1+="/";
            textFieldUp.setText(num1);
            textField.setText("");
            num="";
            option=3;
        }else if(e.getSource()==Keys[11]){
        	firstNum=Double.parseDouble(textField.getText());
            num1+="*";
            textFieldUp.setText(num1);
            textField.setText("");
            num="";
            option=4;
        }else if(e.getSource()==Keys[15]){
        	firstNum=Double.parseDouble(textField.getText());
            num1+="-";
            textFieldUp.setText(num1);
            textField.setText("");
            num="";
            option=5;
        }else if(e.getSource()==Keys[22]){
        	num1+=".";
        	num+=".";
            textField.setText(num);
        }
    }



    class ROM implements ActionListener{
    	//�Ӽ��˳��ļ�����
      
        public void actionPerformed(ActionEvent e) {
        	//δ��ɵļ���������
            if(e.getSource()==Keys[0]){

            }
        }
    }
    
    
    public static void main(String[] args) {
    	Calculator15 Cal=new Calculator15();        //����Jframe����
    	Cal.setTitle("���׼�����");
    	Cal.setSize(500,300);
    	Cal.setBackground(Color.blue);               //��������ɫ����,��Ч��������....
    	Cal.getContentPane().setBackground(Color.orange);
    	Cal.getContentPane().setVisible(true);
    	Cal.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);//��������С�����
    	Cal.pack();    //����Ӧ��С
    	Cal.setJMenuBar(menuBar); 
    	
    	 //��ʾ����
    	Cal.setVisible(true);   
    }

}


