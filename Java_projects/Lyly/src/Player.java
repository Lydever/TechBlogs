import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Player {
	String name = "������";// ����
	int age = 15;// ���䣨Ĭ��������70��������ð����15�꣩
	String sex = "��";// �Ա𣨼���������ƣ���תְ����
	String designation = "��";// �ƺ�
	int leave = 0;// �ȼ���ÿ������
	int jingyan = 0;// ��ǰ����
	int[] shengjijingyan = { 100, 200, 400, 800, 1600, 3200, 6400, 12800, 25600, 51200, 102400, 204800, 409600,
			999999 };// ��������ľ���
	int life = 100;// ����ֵ
	int attack = 20;// �����������㷨��
	int defend = 10;// �����������㷨��
	int speed = 5;// �ٶȣ��ٶȴ�����֣�

	int violent = 2; // �����ʣ�2�������ٷֱȣ����100����С0��
	int goodevil = 0;// �ƶ�ֵ �ɴ���һЩ�¼�����
	int prestige = 0;// ����ֵ ����ĳЩָ������ֵʱ���������ɴ���
	int faction = 0;// ���� �����ɿ���ѧϰ�ܶණ������ȻҪ�����ɵĻ�����������Щ������������ʱ�޵�
	int lucky = 5;// ����ֵ���������ʴ󣬱����ӳɣ������ӳɾ��屦�������㷨������=ԭ�б���+����ֵ*0.5��

	boolean burns1;// 1�����ˣ�ÿ�غ�2%
	boolean burns2;// 2�����ˣ�ÿ�غ�5%
	boolean burns3;// 3�����ˣ�ÿ�غ�10%

	boolean frostbite1;// 1�����ˣ�ÿ�غ�2%
	boolean frostbite2;// 2�����ˣ�ÿ�غ�5%
	boolean frostbite3;// 3�����ˣ�ÿ�غ�10%

	boolean poisoning1;// 1���ж���ÿ�غ�2%
	boolean poisoning2;// 2���ж���ÿ�غ�5%
	boolean poisoning3;// 3���ж���ÿ�غ�10%

	boolean deceleration;// ����

	List<Map<String, String>> juesezhuangbeilist = new ArrayList<Map<String, String>>();// ��ɫװ���б�
	String[] backpackcontent = new String[99];// ��������

	String equipment1;// װ��1������
	String equipment2;// װ��2��ͷ��
	String equipment3;// װ��3�����¼�
	String equipment4;// װ��4���¿��
	String equipment5;// װ��5��Ь��
	String equipment6;// װ��6������

	boolean pojie1 = true;

	/**
	 * �ƽⷽ�� ����10����0��������ֵ ���� ���� �ٶ� ���� ���˵���20
	 */
	public void PoJie1() {
		if (pojie1) {
			life = life + 1000;
			attack = attack + 200;
			defend = defend + 100;
			speed = speed + 50;
			lucky = lucky + 20;
			pojie1 = false;
		}
	}

	boolean pojie2 = true;

	/**
	 * �ƽⷽ�� ����20����0��������ֵ ���� ���� �ٶ� ���� ���˵���50
	 */
	public void PoJie2() {
		if (pojie2) {
			life = life + 2000;
			attack = attack + 400;
			defend = defend + 200;
			speed = speed + 100;
			lucky = lucky + 50;
			pojie2 = false;
		}
	}

}
