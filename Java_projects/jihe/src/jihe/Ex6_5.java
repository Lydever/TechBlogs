package jihe;
import java.util.HashMap;
import java.util.Map.Entry;
/*��дһ������,����һ��HashMap����,���ڴ洢ѧ����Ϣ*/
public class Ex6_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Student stu1 = new Student(1001,"����",16);
     Student stu2 = new Student(1002,"����",17);
     Student stu3 = new Student(1003,"����",18);
     
     HashMap<Integer,Student> map = new HashMap<Integer,Student>();
     map.put(1,stu1);
     map.put(2,stu2);
     map.put(3,stu3);
     for(Entry<Integer,Student> entry:map.entrySet()){
    	 System.out.println(entry.getValue());
     }
	}
}

class Student{
	int id;
	String name;
	int age;
	
	public Student(int id,String name,int age){
		super();
		this.id=id;
		this.name=name;
		this.age=age;	
	}
	
	public String toString(){
		return "ѧ��ѧ��Ϊ:"+this.id+"ѧ������Ϊ:"+this.name+"ѧ������Ϊ:"+this.age;
	}
}
