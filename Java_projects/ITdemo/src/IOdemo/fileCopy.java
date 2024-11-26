package IOdemo;
import java.io.*;

public class fileCopy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		long lengthOfDir=getLengthOfDir(new File("."));
		
		System.out.println(lengthOfDir);

	}
	
	
	//��ȡ�ļ��еĴ�С
	public  static  long  getLengthOfDir(File dir)
	{
		//����һ��long�ı����洢�ļ��еĴ�С
		long length=0;
		//��ȡ��dir�е������ļ������ļ�����Ϣ    listFiles()
		File[] files=dir.listFiles();
		//����File����
		for(File file:files)
		{
			//ѭ���ṹ��Ƕ��ѡ��ṹ�������ļ����ļ���
			if(file.isFile())
			{
				length=length+file.length();
			}
			else
			{
				length=length+getLengthOfDir(file);
			}
		}
		
		return length;
		
	}
	
	
	//�����ļ���
	public static void copyDir(File srcDir,File destDir) throws IOException
	{
		//����Ŀ���ļ���      mkdir()  mkdirs()
		if(!destDir.exists())
		{
			destDir.mkdirs();
		}
		//��ȡ��srcDir�е������ļ������ļ�����Ϣ    listFiles()
		File[] files=srcDir.listFiles();
	    //����File����
		for(File file:files)
		{
			//ѭ���ṹ��Ƕ��ѡ��ṹ  
			if(file.isFile())
			{
				copyFile(file,new File(destDir,file.getName()));
			}
			else
			{
				copyDir(file,new File(destDir,file.getName()));
			}
		}
		
		
	}
	
	
	
	//�����ļ�
	public static void copyFile(File srcFile,File destFile) throws IOException
	{
		
	}
	
	

}
