package itheima;
import java.io.*;
public class filestream {

	public static void main(String[] args) throws Exception{
		
		//ʹ��FileInputStreamʵ�ֶ�ȡ�ļ�
		FileInputStream in = new FileInputStream("text.txt");
		int content;
		while((content=in.read())!=-1){
			System.out.println((char)content);
		}
      in.close();
      
      
    //ʹ��FileOutputStreamʵ��д���ļ�
      FileOutputStream out = new FileOutputStream("out.txt");
      String str = "hello! Ly!";
      out.write(str.getBytes());
      
      out.close();
      
      BufferedInputStream bis = new BufferedInputStream
    		  (new FileInputStream("source/adva.jpg"));
      BufferedOutputStream bos = new BufferedOutputStream
    		  (new FileOutputStream("target/adva1.jpg"));
      
      int len=0;
      long beginTime = System.currentTimeMillis();
      
      while((len = in.read())!=-1){
    	  out.write(len);
    	  
      }
      
      long endTime = System.currentTimeMillis();
      System.out.println("����ʱ��Ϊ:"+(endTime-beginTime)+"����");
      
      bis.close();
      bos.close();
      
      
      
      
	}

}
