package itheima;

import java.util.Scanner;

public class LaTinPig {

	public static void main(String[] args) {
		System.out.println("������һ��Ӣ�ľ���");
		Scanner scanner = new Scanner(System.in);
		String word = scanner.nextLine();
		System.out.println("ԭ��Ϊ:"+word);
		System.out.println("�޸ĺ�:"+LaTin(word));
		
	}
public static String LaTin(String str){
	char[] s = str.toCharArray();
	int y = 0;
	StringBuffer stringBuffer= new StringBuffer();
	for(int i=0;i<s.length;i++){
		if(y!=i){
			stringBuffer.append(s[i]);
			
		}
	}
	stringBuffer.append(" ");
	stringBuffer.append(s[y]);
	stringBuffer.append("ay");

	return stringBuffer.toString();

}}