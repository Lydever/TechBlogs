package itheima;
import java.util.Scanner;
public class gragePrint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       System.out.println("���������ĳɼ�:");
       Scanner sc = new Scanner(System.in);
       int score = sc.nextInt();
       if(score<=100 && score>=90){
    	   System.out.println("��");
       }
       else if(score<90 && score>=80){
    	   System.out.println("��");
       }
       else if(score<80 && score>=70){
    	   System.out.println("��");
       }
       else if(score<70 && score>=60){
    	   System.out.println("����");
       }
       else if(score<60 && score>=0){
    	   System.out.println("������");
       }
       else{
    	   System.out.println("��Ч�ɼ�");
       }
 
	}

}
