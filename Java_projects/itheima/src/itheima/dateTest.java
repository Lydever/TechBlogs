package itheima;

import java.util.Scanner;

public class dateTest {
int year;
int month;
int day;
//�޲ι���
public dateTest() {
	year = 1949;
	month = 10;
	day = 1;
}
//�вι���
public dateTest(int year,int month,int day) {
	this.year = year;
	this.month = month;
	this.day = day;
	System.out.println("������������� :");
    Scanner sc = new Scanner(System.in);
    int dateTest = sc.nextInt();
}
//������ݷ���
public int getYear(int year) {
	return year;
}
//�����·�
public int getMonth(int month) {
	return month;
}
//�����·�
public int getDay(int day) {
	return day;
}
//��������
public void setDate(int year,int month,int day) {
	this.year = year;
	this.month = month;
	this.day = day;
	 System.out.println(year+" "+month+" "+day);
}
//�����Ƿ�Ϊ����
public boolean isLeapYear(int year) {
	if(year%400==0||year%4==0&&year%100!=0) {
		return true;
	}
	return false;
}
//����������м���
public int daysOfMonth(int year,int month) {
	int a=0;
	switch(month) {
		case 1:a = 31;break;
		case 2:if(year%400==0||year%4==0&&year%100!=0) {
			a = 29;
		}
		else
			a = 28;break;
		case 3:a = 31;break;
		case 4:a = 30;break;
		case 5:a = 31;break;
		case 6:a = 30;break;
		case 7:a = 31;break;
		case 8:a = 31;break;
		case 9:a = 30;break;
		case 10:a = 31;break;
		case 11:a = 30;break;
		case 12:a = 31;break;
	
}
	return a;
}
//���Է���
public static void main(String[] args) {
	dateTest date = new dateTest();
	System.out.println("���Գ�ʼ��ʱ��"+date.year+"��"+date.month+"��"+date.day+"��");
    System.out.println("���Է������"+date.getYear(1999));
    System.out.println("���Է����·�"+date.getMonth(12));
    System.out.println("���Է�������"+date.getDay(28));
    date.setDate(2019,10,23);
    System.out.println(date.isLeapYear(2019));
    System.out.println("���Է������������"+date.daysOfMonth(2019, 10));
}
}
