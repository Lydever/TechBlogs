package itheima;
import java.util.*;
public class Canlendartext {

	public static void main(String[] args) {

		  Calendar calendar = Calendar.getInstance();
		int year = calendar.get(Calendar.YEAR);
		int month = calendar.get(Calendar.MONTH)+1;
		int date = calendar.get(Calendar.DATE);
		System.out.println("��ǰ����Ϊ��"+year+"��"+month+"��"+date+"��");
		calendar.add(Calendar.DATE,100);
		System.out.println("100��������Ϊ��"+year+"��"+month+"��"+date+"��");

		}

	}


