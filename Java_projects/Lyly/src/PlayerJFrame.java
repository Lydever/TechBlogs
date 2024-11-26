
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.UIManager;

/**
 * �������
 */
public class PlayerJFrame extends JFrame implements GameConfig {

	public PlayerJFrame() {

		JFrame playerjframe = new JFrame("��������");
		JPanel playerJPanel = new JPanel();

		// ��������
		Font font = new Font("����", 0, 20);
		// �����ı�����
		UIManager.put("Label.font", font);

		// �ƺ�
		JLabel jLabel_designation = new JLabel("�ƺ�:" + player.designation, JLabel.CENTER);
		jLabel_designation.setFont(font);
		jLabel_designation.setBounds(0, 0, 200, 20);
		// ����
		JLabel jLabel_name = new JLabel(player.name, JLabel.CENTER);
		jLabel_name.setFont(font);
		jLabel_name.setBounds(0, 20, 200, 20);
		// ����
		JLabel jLabel_age = new JLabel(String.valueOf(player.age) + "��", JLabel.CENTER);
		jLabel_age.setFont(font);
		jLabel_age.setBounds(0, 40, 100, 20);
		// �Ա�
		JLabel jLabel_sex = new JLabel(player.sex, JLabel.CENTER);
		jLabel_sex.setFont(font);
		jLabel_sex.setBounds(100, 40, 100, 20);
		// �ȼ�
		JLabel jLabel_leave = new JLabel("�ȼ�:" + String.valueOf(player.leave), JLabel.CENTER);
		jLabel_leave.setFont(font);
		jLabel_leave.setBounds(0, 60, 200, 20);
		// ����
		JLabel jLabel_jingyan = new JLabel("����:" + String.valueOf(player.jingyan), JLabel.CENTER);
		jLabel_jingyan.setFont(font);
		jLabel_jingyan.setBounds(0, 80, 200, 20);
		// ����ֵ
		JLabel jLabel_life = new JLabel("����" + String.valueOf(player.life), JLabel.CENTER);
		jLabel_life.setFont(font);
		jLabel_life.setBounds(0, 100, 200, 20);
		// ����
		JLabel jLabel_attack = new JLabel("����" + String.valueOf(player.attack), JLabel.CENTER);
		jLabel_attack.setFont(font);
		jLabel_attack.setBounds(0, 120, 100, 20);
		// ����
		JLabel jLabel_defend = new JLabel("����" + String.valueOf(player.defend), JLabel.CENTER);
		jLabel_defend.setFont(font);
		jLabel_defend.setBounds(100, 120, 100, 20);
		// �ٶ�
		JLabel jLabel_speed = new JLabel("�ٶ�" + String.valueOf(player.speed), JLabel.CENTER);
		jLabel_speed.setFont(font);
		jLabel_speed.setBounds(0, 140, 100, 20);
		// ����
		JLabel jLabel_violent = new JLabel("����" + String.valueOf(player.violent), JLabel.CENTER);
		jLabel_violent.setFont(font);
		jLabel_violent.setBounds(100, 140, 100, 20);
		// �ƶ�
		JLabel jLabel_goodevil = new JLabel("�ƶ�" + String.valueOf(player.goodevil), JLabel.CENTER);
		jLabel_goodevil.setFont(font);
		jLabel_goodevil.setBounds(0, 180, 200, 20);
		// ����
		JLabel jLabel_prestige = new JLabel("����" + String.valueOf(player.prestige), JLabel.CENTER);
		jLabel_prestige.setFont(font);
		jLabel_prestige.setBounds(0, 200, 200, 20);
		// ����
		JLabel jLabel_faction = new JLabel("����" + String.valueOf(player.faction), JLabel.CENTER);// ����
		jLabel_faction.setFont(font);
		jLabel_faction.setBounds(0, 220, 200, 20);
		// ����
		JLabel jLabel_lucky = new JLabel("����" + String.valueOf(player.lucky), JLabel.CENTER);
		jLabel_lucky.setFont(font);
		jLabel_lucky.setBounds(0, 240, 200, 20);
		// װ���б�
		JLabel[] jLable_zhuangbei = new JLabel[6];
		for (int i = 0; i < 6; i++) {
			jLable_zhuangbei[i] = new JLabel();
		}
		jLable_zhuangbei[0].setText("װ��1:" + "��");
		jLable_zhuangbei[0].setFont(font);
		jLable_zhuangbei[0].setHorizontalAlignment(JLabel.CENTER);
		jLable_zhuangbei[1].setText("װ��2:" + "��");
		jLable_zhuangbei[1].setFont(font);
		jLable_zhuangbei[1].setHorizontalAlignment(JLabel.CENTER);
		jLable_zhuangbei[2].setText("װ��3:" + "��");
		jLable_zhuangbei[2].setFont(font);
		jLable_zhuangbei[2].setHorizontalAlignment(JLabel.CENTER);
		jLable_zhuangbei[3].setText("װ��4:" + "��");
		jLable_zhuangbei[3].setFont(font);
		jLable_zhuangbei[3].setHorizontalAlignment(JLabel.CENTER);
		jLable_zhuangbei[4].setText("װ��5:" + "��");
		jLable_zhuangbei[4].setFont(font);
		jLable_zhuangbei[4].setHorizontalAlignment(JLabel.CENTER);
		jLable_zhuangbei[5].setText("װ��6:" + "��");
		jLable_zhuangbei[5].setFont(font);
		jLable_zhuangbei[5].setHorizontalAlignment(JLabel.CENTER);
		jLable_zhuangbei[0].setBounds(0, 260, 200, 20);
		jLable_zhuangbei[1].setBounds(0, 280, 200, 20);
		jLable_zhuangbei[2].setBounds(0, 300, 200, 20);
		jLable_zhuangbei[3].setBounds(0, 320, 200, 20);
		jLable_zhuangbei[4].setBounds(0, 340, 200, 20);
		jLable_zhuangbei[5].setBounds(0, 360, 200, 20);
		// �ر������������
		JButton close = new JButton("�رս���");
		close.setFont(font);
		close.setBounds(20, 380, 160, 35);
		// �ر������������İ�ť����
		close.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				playerjframe.dispose();
			}
		});
		// ���������
		playerJPanel.add(jLabel_designation);
		playerJPanel.add(jLabel_name);
		playerJPanel.add(jLabel_age);
		playerJPanel.add(jLabel_sex);
		playerJPanel.add(jLabel_leave);
		playerJPanel.add(jLabel_jingyan);
		playerJPanel.add(jLabel_life);
		playerJPanel.add(jLabel_attack);
		playerJPanel.add(jLabel_defend);
		playerJPanel.add(jLabel_speed);
		playerJPanel.add(jLabel_violent);
		playerJPanel.add(jLabel_goodevil);
		playerJPanel.add(jLabel_prestige);
		playerJPanel.add(jLabel_faction);
		playerJPanel.add(jLabel_lucky);
		playerJPanel.add(jLable_zhuangbei[0]);
		playerJPanel.add(jLable_zhuangbei[1]);
		playerJPanel.add(jLable_zhuangbei[2]);
		playerJPanel.add(jLable_zhuangbei[3]);
		playerJPanel.add(jLable_zhuangbei[4]);
		playerJPanel.add(jLable_zhuangbei[5]);
		playerJPanel.add(close);
		// ���ò��ָ�ʽ
		playerJPanel.setLayout(null);
		// JFame������
		playerjframe.add(playerJPanel);
		playerjframe.setSize(200, 450);
		// ��������ǰ��ʾ
		playerjframe.setAlwaysOnTop(true);
		// �رշ�ʽ��DISPOSE_ON_CLOSE,���ز��ͷŴ��壬dispose()�������һ�����ڱ��ͷź������Ҳ��֮���н�����
		playerjframe.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		// ���ô������
		playerjframe.setLocationRelativeTo(null);
		// ��С���ɱ�
		playerjframe.setResizable(false);
		// ��ʾ����
		playerjframe.setVisible(true);
	}
}
