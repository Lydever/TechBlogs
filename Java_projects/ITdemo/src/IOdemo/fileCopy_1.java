package IOdemo;
import java.io.*;

public class fileCopy_1 {

	public void fileCopy(){
		FileInputStream input = null;
		FileOutputStream output = null;
		
		try{
			input = new FileInputStream(new File("�ļ�·��"));
			output = new FileOutputStream(new File("Ŀ���ļ�·��"));
			
			byte[] bt = new byte[1024];
			int readbyte=0;
			while((readbyte = input.read(bt))>0){
				output.write(bt,0,readbyte);
			}
			output.close();
		}
		catch(Exception e){
			e.printStackTrace();
		}finally{
			try{
				if(input!=null){input.close();}
				if(output!=null){output.close();}
			}catch(IOException e){
				e.printStackTrace();
			}
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
