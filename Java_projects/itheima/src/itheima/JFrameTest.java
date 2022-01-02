package itheima;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class JFrameTest {
               
	public class JFrameTest extends JFrame{
		
		JLabel interestLabel = new JLabel("��Ȥ");
		JCheckBox badmintonCheck = new JCheckBox("��ë��");
		JCheckBox tableTtennisCheck = new JCheckBox("ƹ����");
		JCheckBox singCheck = new JCheckBox("����");
		
		JLabel genderLabel = new JLabel("�Ա�");
		JRadioButton maleRadioButton = new JRadioButton("��");
		JRadioButton femalRadioButton = new JRadioButton("Ů");
		JTextArea textArea = new JTextArea(5,30);
		
		JFrameTest(){
			super("��Ȥdemo");
			Container contentPane = new getContentPane();
			JPanel northPane = new JPanel();
			northPanel.setLayout(new GirdLayout(2,1));
			Box box1 = Box.createHorizontalBox();
			Box box2 = Box.createHorizontalBox();
			box1.add(Box.createHorizontalStrut(3));
			box1.add(interestLabel);
			box1.add(badmintonCheck);
			box1.add(tableTtennisCheck);
			box1.add(singCheck);
			
			
			ButtonGroup group = new ButtonGroup();
			group.add(maleRadioButton);
			group.add(femalRadioButton);
			box2.add(Box.createHorizontalStrut(3));
			box2.add(genderLabel );
			box2.add(maleRadioButton);
			box2.add(femalRadioButton);
			
			northPanel.add(box1);
			northPanel.add(box2);
			contentPane.add(northPane,BorderLayout.NORTH);
			JScrollPane scrollPane  = new JScrollPane(textArea);
			contentPane.add(scrollPane,BorderLayout.CENTER);
			setVisible(true);
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setSize(400,300);
			
			badmintonCheck.addActionListener(new Clickclass(this));
			tableTtennisCheck.addActionListener(new Clickclass(this));
			singCheck.addActionListener(new Clickclass(this));
			maleRadioButton.addActionListener(new Clickclass(this));
			femalRadioButton.addActionListener(new Clickclass(this));
			
	
		}
		
		
		class Clickclass implements ActionListener{
			JFrameTest oce;
			
			public Clickclass(JFrameTest oce){
				this.oce=oce;
				
			}
			public void actionPerformed(ActionEvent e)
			{
				if(e.getSource()==badmintonCheck){
					if(badmintonCheck.isSelected()==true){
						textArea.append("��ë��"+"\n");	
					}
					else if(e.getSource()==tableTtennisCheck){
						if(tableTtennisCheck.isSelected()==true){
						textArea.append("ƹ����"+"\n");	
						}
					}
					else if(e.getSource()==singCheck){
						if(singCheck.isSelected()==true){
						textArea.append("����"+"\n");	
						}
					}
					else if(e.getSource()==maleRadioButton){
						if(maleRadioButton.isSelected()==true){
						textArea.append("��"+"\n");	
						}
					}
					else if(e.getSource()==femalRadioButton){
						if(femalRadioButton.isSelected()==true){
						textArea.append("Ů"+"\n");	
						}
					}
					else{
						return;
						
					}
				}
			}
			
		}
		
	}
	
	
	
	public static void main(String[] args) {
		new JFrameTest();

	}

}
