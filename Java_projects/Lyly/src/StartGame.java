import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.UIManager;

/**
 * ��Ϸ��ʼ����
 * 
 * @author Ī�������� 1179307527
 *
 */
public class StartGame extends JFrame implements GameConfig {

	// ��Ϸ���
	JPanel panel;
	int PlayerX = 1;
	int PlayerY = 1;
	JButton shang, xia, zuo, you, zhong;

	/**
	 * ���ô���
	 */
	public StartGame() {

		// ��ȡ��Ϸmap
		ReadMap();

		this.setTitle("������");
		this.setSize(450, 485);// 450*450 ������ռ35
		this.setLayout(null);
		// ���ùرշ�ʽ
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// ���ô������
		this.setLocationRelativeTo(null);
		// ��������
		Font font = new Font("����", 0, 20);
		// �����ı�����
		UIManager.put("Label.font", font);
		// ��
		shang = new JButton("�ϳ�");
		shang.setBounds(150, 0, 150, 150);
		shang.setFont(font);
		this.add(shang);
		shang.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				ReMap(0);
			}
		});
		// ��
		xia = new JButton("�³�");
		xia.setBounds(150, 300, 150, 150);
		xia.setFont(font);
		this.add(xia);
		xia.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				ReMap(1);
			}
		});
		// ��
		zuo = new JButton("���");
		zuo.setBounds(0, 150, 150, 150);
		zuo.setFont(font);
		this.add(zuo);
		zuo.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				ReMap(2);
			}
		});
		// ��
		you = new JButton("�ҳ�");
		you.setBounds(300, 150, 150, 150);
		you.setFont(font);
		this.add(you);
		you.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				ReMap(3);
			}
		});
		// ��
		zhong = new JButton("�ó�");
		zhong.setBounds(150, 150, 150, 150);
		zhong.setFont(font);
		this.add(zhong);
		zhong.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				ReMap(4);
			}
		});
		// ����
		JButton renwu = new JButton("����");
		renwu.setBounds(0, 0, 150, 150);
		renwu.setFont(font);
		this.add(renwu);
		renwu.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				new PlayerJFrame();
				// String[] a = {"da","da","da"};
				// int va =JOptionPane.showOptionDialog(StartGame.this, "��������", "����",
				// JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, a, "da");

			}
		});
		// ����
		JButton backpack = new JButton("����");
		backpack.setBounds(300, 0, 150, 150);
		backpack.setFont(font);
		this.add(backpack);
		backpack.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				new BackpackJFrame();
			}
		});
		// ����
		JButton shezhi = new JButton("����");
		shezhi.setBounds(0, 300, 150, 150);
		shezhi.setFont(font);
		this.add(shezhi);
		shezhi.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub

			}
		});
		// ����
		JButton teshu = new JButton("����");
		teshu.setBounds(300, 300, 150, 150);
		teshu.setFont(font);
		this.add(teshu);
		teshu.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String pojie = JOptionPane.showInputDialog("����������");

				if (pojie != null && pojie.equals("�Ұ�������Ϸ1179307527")) {
					player.PoJie1();
					JOptionPane.showMessageDialog(null, "����key�ɹ�����������Ĵ���", "�ƽ�success", JOptionPane.PLAIN_MESSAGE);
				} else if (pojie != null && pojie.equals("���й������о���")) {
					String aString = "����KEYֵ�ɹ������й������о���\n" + "��ģ�˭û�в����ĵ׵Ĺ����أ�";
					JOptionPane.showMessageDialog(null, aString, "�����ɱ�", JOptionPane.PLAIN_MESSAGE);
				} else {
					JOptionPane.showMessageDialog(null, "����keyʧ��", "�ƽ�ʧ��", JOptionPane.PLAIN_MESSAGE);
				}

			}
		});
		shang.setText(MAP[PlayerX - 1][PlayerY]);
		xia.setText(MAP[PlayerX + 1][PlayerY]);
		zuo.setText(MAP[PlayerX][PlayerY - 1]);
		you.setText(MAP[PlayerX][PlayerY + 1]);
		zhong.setText(MAP[PlayerX][PlayerY]);
		this.setResizable(false);
		this.setVisible(true);
	}

	/**
	 * ��ȡ��ͼ����ͼ���� ��ͼΪres�ļ��е�MAP.txt ��ͼ����Ϊres�ļ��е�MAPabout.txt
	 */
	void ReadMap() {
		// ���ص�ͼ
		try {
			File file = new File("res\\MAP.txt");
			InputStreamReader reader = new InputStreamReader(new FileInputStream(file));
			BufferedReader br = new BufferedReader(reader);
			// ��ȡ��ͼ����Ҫ����
			for (int i = 0; i < 10; i++) {
				String[] iString = br.readLine().split(";");
				for (int j = 0; j < 10; j++) {
					MAP[i][j] = iString[j];
				}
			}
			// �ر������
			reader.close();
		} catch (Exception e) {
			// �����쳣
		}

		// ���ص�ͼ����
		try {
			File file = new File("res\\MAPabout.txt");
			InputStreamReader reader = new InputStreamReader(new FileInputStream(file));
			BufferedReader br = new BufferedReader(reader);
			// ��ȡ��ͼ����Ҫ����
			for (int i = 0; i < 10; i++) {
				for (int j = 0; j < 10; j++) {
					String iString = br.readLine();
					MAPabout[i][j] = iString;
				}
			}
			// �ر������
			reader.close();
		} catch (Exception e) {
			// �����쳣
		}

	}

	/**
	 * ˢ�µ�ͼ
	 * 
	 * @param j
	 *            0=�� 1=�� 2=�� 3=�� 4=�� ��ȡ�ƶ�����
	 */
	void ReMap(int key) {
		switch (key) {
		// ��
		case 0:
			if (MAP[PlayerX - 1][PlayerY] != null && !MAP[PlayerX - 1][PlayerY].equals("��")) {
				PlayerX--;
				shang.setText(MAP[PlayerX - 1][PlayerY]);
				xia.setText(MAP[PlayerX + 1][PlayerY]);
				zuo.setText(MAP[PlayerX][PlayerY - 1]);
				you.setText(MAP[PlayerX][PlayerY + 1]);
				zhong.setText(MAP[PlayerX][PlayerY]);
			}
			break;
		// ��
		case 1:
			if (MAP[PlayerX + 1][PlayerY] != null && !MAP[PlayerX + 1][PlayerY].equals("��")) {
				PlayerX++;
				shang.setText(MAP[PlayerX - 1][PlayerY]);
				xia.setText(MAP[PlayerX + 1][PlayerY]);
				zuo.setText(MAP[PlayerX][PlayerY - 1]);
				you.setText(MAP[PlayerX][PlayerY + 1]);
				zhong.setText(MAP[PlayerX][PlayerY]);
			}
			break;
		// ��
		case 2:
			if (MAP[PlayerX][PlayerY - 1] != null && !MAP[PlayerX][PlayerY - 1].equals("��")) {
				PlayerY--;
				shang.setText(MAP[PlayerX - 1][PlayerY]);
				xia.setText(MAP[PlayerX + 1][PlayerY]);
				zuo.setText(MAP[PlayerX][PlayerY - 1]);
				you.setText(MAP[PlayerX][PlayerY + 1]);
				zhong.setText(MAP[PlayerX][PlayerY]);
			}
			break;
		// ��
		case 3:
			if (MAP[PlayerX][PlayerY + 1] != null && !MAP[PlayerX][PlayerY + 1].equals("��")) {
				PlayerY++;
				shang.setText(MAP[PlayerX - 1][PlayerY]);
				xia.setText(MAP[PlayerX + 1][PlayerY]);
				zuo.setText(MAP[PlayerX][PlayerY - 1]);
				you.setText(MAP[PlayerX][PlayerY + 1]);
				zhong.setText(MAP[PlayerX][PlayerY]);
			}
			break;
		// ��
		case 4:
			int res = JOptionPane.showConfirmDialog(null, GameUtil.StringToHtml(MAPabout[PlayerX][PlayerY], 10),
					"�Ƿ����" + MAP[PlayerX][PlayerY] + "?", JOptionPane.YES_NO_OPTION);
			if (res == JOptionPane.YES_OPTION) {
				// �˴�������뷽��
				System.out.println("������" + MAP[PlayerX][PlayerY]);
			} else {
				// �˴�����������
				System.out.println("û����" + MAP[PlayerX][PlayerY]);
			}
			break;
		default:
			JOptionPane.showMessageDialog(this, "219", "default����", JOptionPane.WARNING_MESSAGE);
			break;
		}

	}
}
