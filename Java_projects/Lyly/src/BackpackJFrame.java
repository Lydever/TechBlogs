import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.UIManager;

public class BackpackJFrame extends JFrame implements GameConfig {

	public BackpackJFrame() {

		JFrame backpackjframe = new JFrame("��������");
		JPanel backpackJPanel = new JPanel();

		// ��������
		Font font = new Font("����", 0, 20);
		// �����ı�����
		UIManager.put("Label.font", font);
		// ���ò��ָ�ʽ
		backpackJPanel.setLayout(null);
		// ���������
		JButton[] JButton_zhuangbei = new JButton[99];
		for (int i = 0; i < 33; i++) {
			for (int j = 0; j < 3; j++) {
				JButton_zhuangbei[i * 3 + j] = new JButton();
				JButton_zhuangbei[i * 3 + j].setText(GameUtil.StringToHtml(
						GameUtil.ȡָ���ı�(UnitXLS.ȡ����(player.juesezhuangbeilist, i * 3 + j), "����=", "}"), 3));
				JButton_zhuangbei[i * 3 + j].setFont(font);
				backpackJPanel.add(JButton_zhuangbei[i * 3 + j]);
				// ����λ��
				JButton_zhuangbei[i * 3 + j].setBounds(j * 100, i * 100, 100, 100);// i=�� j=��
			}
		}
		ActionListener jbutton = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				int k = -1;
				// html��׼��ʽͷ
				String strhtmltou = "<html>";
				// html��׼��ʽβ
				String strhtmlwei = "</html>";
				// ѭ���жϵ���İ�ť��
				for (int i = 0; i < 99; i++) {
					if (!GameUtil.ȡָ���ı�(e.getSource().toString(), "text=", ",").equals("��")) {
						if (GameUtil.HtmlToString(GameUtil.ȡָ���ı�(e.getSource().toString(), strhtmltou, strhtmlwei))
								.equals(GameUtil.ȡָ���ı�(UnitXLS.ȡ����(zhuangbeilist, i), "����=", ","))) {
							k = i;
						}
					}
				}
				// �򿪸�ID��װ����Ϣ
				if (k != -1) {
					new EquipDetailJFrame(k);
				}

			}
		};

		for (int i = 0; i < JButton_zhuangbei.length; i++) {
			JButton_zhuangbei[i].addActionListener(jbutton);
		}
		// JFame������
		// backpackJPanel.setSize(300, 3300);��������ķ������ô�С
		backpackJPanel.setPreferredSize(new Dimension(300, 3300));
		// ��jscrollpane����ӱ������
		JScrollPane jsp = new JScrollPane(backpackJPanel);
		// Jfame���JScerollPane
		backpackjframe.add(jsp);
		// ���ô�С
		backpackjframe.setSize(324, 335);
		// �رշ�ʽ��DISPOSE_ON_CLOSE,���ز��ͷŴ��壬dispose()�������һ�����ڱ��ͷź������Ҳ��֮���н�����
		backpackjframe.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		// ��������ǰ��ʾ
		backpackjframe.setAlwaysOnTop(true);
		// ���ô������
		backpackjframe.setLocationRelativeTo(null);
		// ��С���ɱ�
		backpackjframe.setResizable(false);
		// ��ʾ����
		backpackjframe.setVisible(true);
	}
}
