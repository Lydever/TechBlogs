import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.UIManager;

/**
 * ��Ʒ�������
 */
public class EquipDetailJFrame implements GameConfig {
	/**
	 * ��Ʒ������棬IDΪ��ƷID
	 * 
	 * @param ID
	 */
	public EquipDetailJFrame(int ID) {

		JFrame equipdetailjframe = new JFrame("����");
		JPanel equipdetailJPanel = new JPanel();
		equipdetailJPanel.setLayout(null);
		// ��������
		Font font = new Font("����", 0, 20);
		// �����ı�����
		UIManager.put("Label.font", font);

		// attribute����
		String[] attribute = { "ID", "Ʒ��", "λ��", "����", "˵��", "�ȼ�", "�ƶ�", "����", "����", "����", "����", "�ٶ�", "����", "����", "����",
				"�����ӳ�", "�����ӳ�", "�����ӳ�", "�ٶȼӳ�", "��Ѫ" };
		// JLabel Ʒ��,λ��,����,˵��,�ȼ�,�ƶ�,����,����,����,����,����,�ٶ�,����,����,����,�����ӳ�,�����ӳ�,�����ӳ�,�ٶȼӳ�,��Ѫ;
		// Ʒ��=new JLabel(GameUtil.ȡָ���ı�(UnitXLS.ȡ����(ID),"Ʒ��",","));
		// ����=new JLabel(GameUtil.ȡָ���ı�(UnitXLS.ȡ����(ID),"����",","));
		// ��������̫�鷳����Ϊ�����
		JLabel[] JLabel_attribute = new JLabel[20];
		for (int i = 0, k = JLabel_attribute.length; i < k; i++) {
			// forѭ��ֱ�ӳ�ʼ��
			if (i == k - 1) {
				JLabel_attribute[i] = new JLabel(
						GameUtil.ȡָ���ı�(UnitXLS.ȡ����(zhuangbeilist, ID), attribute[i] + "=", "}"), JLabel.CENTER);
			} else {
				JLabel_attribute[i] = new JLabel(
						GameUtil.ȡָ���ı�(UnitXLS.ȡ����(zhuangbeilist, ID), attribute[i] + "=", ","), JLabel.CENTER);
			}

			// �������
			JLabel_attribute[i].setFont(font);
		}
		// ����λ��,ID
		JLabel_attribute[0].setText(attribute[0] + ":" + GameUtil.ȡ��ǰ(JLabel_attribute[0].getText()));
		JLabel_attribute[0].setBounds(0, 0, 250, 20);
		// ����
		JLabel_attribute[3].setText(JLabel_attribute[3].getText());
		JLabel_attribute[3].setBounds(0, 20, 250, 20);
		// Ʒ��
		JLabel_attribute[1].setText(attribute[1] + ":" + JLabel_attribute[1].getText());
		JLabel_attribute[1].setBounds(0, 40, 130, 20);
		// λ��
		JLabel_attribute[2].setText(attribute[2] + ":" + JLabel_attribute[2].getText());
		JLabel_attribute[2].setBounds(130, 40, 130, 20);
		// ����
		JLabel_attribute[9].setText(attribute[9] + ":" + GameUtil.ȡ��ǰ(JLabel_attribute[9].getText()));
		JLabel_attribute[9].setBounds(0, 60, 130, 20);
		// ����
		JLabel_attribute[10].setText(attribute[10] + ":" + GameUtil.ȡ��ǰ(JLabel_attribute[10].getText()));
		JLabel_attribute[10].setBounds(130, 60, 130, 20);
		// �ٶ�
		JLabel_attribute[11].setText(attribute[11] + ":" + GameUtil.ȡ��ǰ(JLabel_attribute[11].getText()));
		JLabel_attribute[11].setBounds(0, 80, 130, 20);
		// ����
		JLabel_attribute[12].setText(attribute[12] + ":" + GameUtil.ȡ��ǰ(JLabel_attribute[12].getText()));
		JLabel_attribute[12].setBounds(130, 80, 130, 20);
		// ����
		JLabel_attribute[13].setText(attribute[13] + ":" + GameUtil.ȡ��ǰ(JLabel_attribute[13].getText()));
		JLabel_attribute[13].setBounds(0, 100, 130, 20);
		// ����
		JLabel_attribute[14].setText(attribute[14] + ":" + GameUtil.ȡ��ǰ(JLabel_attribute[14].getText()));
		JLabel_attribute[14].setBounds(130, 100, 130, 20);
		// ��Ѫ
		JLabel_attribute[19].setText(attribute[19] + ":" + GameUtil.ȡ��ǰ(JLabel_attribute[19].getText()));
		JLabel_attribute[19].setBounds(0, 120, 130, 20);
		// �����ӳ�
		JLabel_attribute[15].setText(attribute[15] + ":" + GameUtil.ȡ��ǰ(JLabel_attribute[15].getText()));
		JLabel_attribute[15].setBounds(0, 140, 130, 20);
		// �����ӳ�
		JLabel_attribute[16].setText(attribute[16] + ":" + GameUtil.ȡ��ǰ(JLabel_attribute[16].getText()));
		JLabel_attribute[16].setBounds(130, 140, 130, 20);
		// �����ӳ�
		JLabel_attribute[17].setText(attribute[17] + ":" + GameUtil.ȡ��ǰ(JLabel_attribute[17].getText()));
		JLabel_attribute[17].setBounds(0, 160, 130, 20);
		// �ٶȼӳ�
		JLabel_attribute[18].setText(attribute[18] + ":" + GameUtil.ȡ��ǰ(JLabel_attribute[18].getText()));
		JLabel_attribute[18].setBounds(130, 160, 130, 20);
		// �ȼ�
		JLabel_attribute[5]
				.setText(attribute[5] + "����:" + GameUtil.ZeroToWu(GameUtil.ȡ��ǰ(JLabel_attribute[5].getText())));
		JLabel_attribute[5].setBounds(0, 180, 260, 20);
		// �ƶ�
		JLabel_attribute[6]
				.setText(attribute[6] + "����:" + GameUtil.ZeroToWu(GameUtil.ȡ��ǰ(JLabel_attribute[6].getText())));
		JLabel_attribute[6].setBounds(0, 200, 260, 20);
		// ����
		JLabel_attribute[7]
				.setText(attribute[7] + "����:" + GameUtil.Faction(GameUtil.ȡ��ǰ(JLabel_attribute[7].getText())));
		JLabel_attribute[7].setBounds(0, 220, 260, 20);
		// ˵��
		JLabel_attribute[4].setText(
				GameUtil.StringToHtml(attribute[4] + "��" + GameUtil.Faction(JLabel_attribute[4].getText()), 12));
		JLabel_attribute[4].setBounds(0, 240, 260, 100);
		/**
		 * { "ID", "Ʒ��", "λ��", "����", "˵��", "�ȼ�", "�ƶ�", "����", , "����", "����", "����", "�ٶ�",
		 * "����", "����", "����", "�����ӳ�", "�����ӳ�", "�����ӳ�", "�ٶȼӳ�", "��Ѫ" };
		 */
		// JLabel_attribute[14].setText(attribute[14] + ":"
		// +GameUtil.ȡ��ǰ(JLabel_attribute[14].getText()));
		// JLabel_attribute[14].setBounds(0, 120, 130, 20);
		for (int i = 0, k = JLabel_attribute.length; i < k; i++) {
			equipdetailJPanel.add(JLabel_attribute[i]);
		}

		JButton װ�� = new JButton("װ��");
		JButton ж�� = new JButton("ж��");
		װ��.setFont(font);
		ж��.setFont(font);
		װ��.setBounds(0, 350, 130, 40);
		ж��.setBounds(130, 350, 130, 40);
		equipdetailJPanel.add(װ��);
		equipdetailJPanel.add(ж��);

		// JFame������
		equipdetailjframe.add(equipdetailJPanel);
		// ���ô�С
		equipdetailjframe.setSize(260, 420);
		// �رշ�ʽ��DISPOSE_ON_CLOSE,���ز��ͷŴ��壬dispose()�������һ�����ڱ��ͷź������Ҳ��֮���н�����
		equipdetailjframe.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		// ��������ǰ��ʾ
		equipdetailjframe.setAlwaysOnTop(true);
		// ���ô������
		equipdetailjframe.setLocationRelativeTo(null);
		// ��С���ɱ�
		equipdetailjframe.setResizable(false);
		// ��ʾ����
		equipdetailjframe.setVisible(true);

	}

}
