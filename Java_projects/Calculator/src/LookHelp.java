
import javax.swing.*;
import java.awt.*;
 
public class LookHelp extends JFrame{
	
	public LookHelp(){
		super("�鿴����");
		this.setSize(500, 300);
		this.setLocation(200,300);
		this.setResizable(false);
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		this.setVisible(true);
		
		Container c = this.getContentPane();
		c.setLayout(new GridLayout(5,0));
		
		JLabel label0 = new JLabel("�����ļ�������������");
		JLabel label1 = new JLabel("1�������ͼ����������ɽ��мӡ������ˡ����ȼ򵥵��������㣬�ֳƼ򵥼�������һ�㶼��ʵ���������");
		JLabel label2 = new JLabel("2����ѧ�ͼ����������ɽ��г˷���������ָ�������������Ǻ�����ͳ�Ƶȷ�������㣬�ֳƺ����������� ���������,Ҳ������ʵ�");
		JLabel label3 = new JLabel("3������Ա����������ר��Ϊ����Ա��Ƶļ�����, ��Ҫ�ص���֧��And, Or, Not, Xor�� ����������Ǻ�������, ��λ���� Lsh,"
				                  + "Rsh��ȫ����Left Shift��Right Shift��Ҳ�������ƺ����Ʋ���������Ҫ������Ҫ�ƶ���λ�������ܴ������λ���� RoL, RoR��ȫ����"
				                   + "Rotate Left��Rotate Right������RoL���������������ƶ�һλ�������Ƴ�����λ�������ұ���λ�ϣ�RoR����");
		JLabel label4 = new JLabel("4�� ͳ�Ƽ�����-- Ϊ��ͳ��Ҫ�����Ա��Ƶ���Ƶļ�����, ���������,Ҳ������ʵ��");
		JLabel label5 = new JLabel("5����ѧ���㣺�ɽ��к������������㣬�Լ��׳ˡ�������ȡ���");
		
		c.add(label0);
		c.add(label1);
		c.add(label2);
		c.add(label3);
		c.add(label4);
		c.add(label5);
	}
}

