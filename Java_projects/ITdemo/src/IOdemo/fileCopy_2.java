package IOdemo;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
public class fileCopy_2 {

	public static void main(String[] args) {
		//��f���µ�file.txt�ļ�������������
		String desPathStr = "C:\\User\\Administrator\\Desktop";
		String srcPathStr = "F:\\file.txt";
		copyFile(srcPathStr,desPathStr);
	
	}

	private static void copyFile(String srcPathStr,String desPathStr){
			//��ȡԴ�ļ�������
		String newFileName = srcPathStr.substring(srcPathStr.lastIndexOf("\\")+1);//Ŀ���ļ���ַ
		System.out.println(newFileName);
		desPathStr = desPathStr + File.separator + newFileName;//Դ�ļ�
		System.out.println(desPathStr);
		
		try{
			//���������������
			FileInputStream fis = new FileInputStream(srcPathStr);
			FileOutputStream fos = new FileOutputStream(desPathStr);
			
			//�������˹���
			byte[] dates = new byte[1024];
			//��������
			int len=0;
			//ѭ����ȡ����
			while((len = fis.read(dates))!=-1){
				fos.write(dates,0,len);
			}
			
			//�ͷ���Դ
			fis.close();
			fos.close();
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}
	
	
	
}
