import java.awt.Container;
import java.awt.Desktop;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.UIManager;

/**
 * ��Ϸ�˵�
 */
public class MenuGame implements GameConfig{
	
	public static JFrame loginFrame;// ��������
	
	public MenuGame() {
		Initialization1();
		loginFrame = new JFrame("������Ϸ");
		// ���ô�С
		loginFrame.setSize(200, 235);
		// ���ô������
		loginFrame.setLocationRelativeTo(null);
		// ���ò������
		loginFrame.setResizable(false);
		// ����û�б�����
		// loginFrame.setUndecorated(true);
		// ����ͼ��
		Image icon = Toolkit.getDefaultToolkit().getImage("images/icon.png");
		loginFrame.setIconImage(icon);
		// ���ùر�
		loginFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// ��������
		Font font = new Font("����", 0, 16);
		// �����ı�����
		UIManager.put("Label.font", font);
		// ��壬������Ӱ�ť
		JPanel jPanel = new JPanel();
		Container container = loginFrame.getContentPane();
		// ��ťʵ����
		JButton stargame = new JButton("��ʼ��Ϸ");
		JButton duqugame = new JButton("��ȡ��Ϸ");
		JButton guanyugame = new JButton("������Ϸ");
		JButton helpgame = new JButton("��Ϸ����");
		JButton tuichugame = new JButton("�˳���Ϸ");
		// ������5���˵���ť
		jPanel.add(stargame);
		jPanel.add(duqugame);
		jPanel.add(guanyugame);
		jPanel.add(helpgame);
		jPanel.add(tuichugame);
		// Ϊ��ť��������
		stargame.setFont(font);
		duqugame.setFont(font);
		guanyugame.setFont(font);
		tuichugame.setFont(font);
		helpgame.setFont(font);
		// ������
		container.add(jPanel);
		// ��ʼ��Ϸ��ť����
		stargame.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {

				// ��ʼ��Ϸ
				StartGame ks = new StartGame();
				loginFrame.dispose();
			}
		});
		// ��ȡ��Ϸ��ť����
		duqugame.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// ������Ϣ��
				JOptionPane.showMessageDialog(jPanel, "��������", "��ȡ�浵", JOptionPane.WARNING_MESSAGE);
			}
		});
		// ���ڰ�ť������
		guanyugame.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// �����ı�����
				String guanyu = "�����Ϊ��������Ϸ��ok";
				// ��Ϣ��
				JOptionPane.showMessageDialog(null, guanyu, "����", JOptionPane.PLAIN_MESSAGE);
			}
		});
		// ������ť������
		helpgame.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// �����ı�����
				String help = "���ǰ���";
				// ��Ϣ��
				JOptionPane.showMessageDialog(null, help, "����", JOptionPane.PLAIN_MESSAGE);
			}
		});
		// �˳���Ϸ����
		tuichugame.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				int res = JOptionPane.showConfirmDialog(null, "��������Ŭ�������Ϸ���ֹ���\n" + "�����ڴ�", "�˳�?",
						JOptionPane.YES_NO_OPTION);
				if (res == JOptionPane.YES_OPTION) {
					Desktop desktop = Desktop.getDesktop();
					try {
						desktop.browse(new URI("http://www.520mylove.com"));
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (URISyntaxException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					System.exit(0);// �˳�
				}
			}
		});
		// ��ʾ����
		loginFrame.setVisible(true);
	}
	

	/**
	 * ��ʼ��1���ж��Ƿ������Ϸ�ĵ��ļ��У���Ϸ�ĵ�������Ϸ�浵�ȣ�
	 */
	void Initialization1() {
		File file = new File("D:\\������Ϸ");//��ϷĿ¼
		File file1 = new File("D:\\������Ϸ\\map");//��Ϸ��ͼ
		File file2 = new File("D:\\������Ϸ\\cundang");//��Ϸ�浵
		if (!file.exists() && !file.isDirectory()) {
			// �����ڴ��ļ��У��������ļ���
			file.mkdir();
		}
		if (!file1.exists() && !file1.isDirectory()) {
			// �����ڴ��ļ��У��������ļ���
			file1.mkdir();
		}
		if (!file2.exists() && !file2.isDirectory()) {
			// �����ڴ��ļ��У��������ļ���
			file2.mkdir();
		}
	}
	
	public static void main(String[] args) {
		//������Ϸװ���б�
		String ����װ�� = "res/װ��ƥ���.xls";
		String ����1[] = {"ID", "Ʒ��", "λ��", "����", "˵��", "�ȼ�", "�ƶ�", "����", "����", "����", "����", "�ٶ�", "����",
				"����", "����", "�����ӳ�", "�����ӳ�", "�����ӳ�", "�ٶȼӳ�", "��Ѫ"};
		UnitXLS.AddXls(zhuangbeilist,����װ��,����1);
		//���ص�ǰװ���б�
		String ��ɫװ�� = "res/��ɫװ��.xls";
		String ����2[] = {"ID", "����"};
		UnitXLS.AddXls(player.juesezhuangbeilist,��ɫװ��,����2);
		new MenuGame();
	}
	
}
