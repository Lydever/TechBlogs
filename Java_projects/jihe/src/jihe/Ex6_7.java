package jihe;

import java.util.HashSet;
import java.util.Scanner;

import javax.swing.plaf.synth.SynthSpinnerUI;
//�Ӽ��̻�ȡһ���ַ���,��ȥ�ظ��ַ���
public class Ex6_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//���������������
		Scanner sc = new Scanner(System.in);
		System.out.println("������һ���ַ���");
		String line = sc.nextLine();
		
		//�ַ���ת��Ϊ�ַ�����
		char[] c = line.toCharArray();
		
		//�ַ�����ת��Ϊ���϶��� ,����HashSet
		HashSet<Character> hs = new HashSet<>();
		
		//�������� ,Ԫ���������������
		for(Character character:hs){
			System.out.println(character);
		}
		
	}

}
