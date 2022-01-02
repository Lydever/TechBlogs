package IOdemo;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;
public class FileCopy1 {
    
    public static boolean succed = true;
    public static void main(String[] args) {
        /*****�ӿ���̨��ȡ�ļ��ĸ��ƺ�ճ��·��****/
        Scanner sca = new Scanner(System.in);
        System.out.println("��������Ҫ���Ƶ��ļ���·��");
        String sourceStr = sca.next();
        System.out.println("��������Ҫ���ļ�ճ������λ��");
        String goalStr = sca.next();
        /********����File������쳣����******/
        File goalFile = null;
        File sourceFile = null;
        try {
            goalFile = new File(goalStr);                                //Ŀ���ļ�·��
            if(!goalFile.exists()){
            goalFile.mkdir();                                            //��Ŀ���ļ��в�����ʱ����Ŀ���ļ���                            
            }        
        }catch (Exception e) {                                            //Ŀ��·���ļ������쳣ʱ�׳�
            System.out.println("Ŀ���ļ��г�������,���Ժ�����!");
            succed = false;
        }
        try{
            sourceFile = new File(sourceStr);                            //�����Ƶ��ļ���·��
        }catch(Exception  e){
            System.out.println("��Ҫ�����Ƶ��ļ����޷�����,���Ժ�����!");            //�������Ƶ��ļ��г����쳣ʱ�׳�
            succed = false;
        }
        
        
        
        /************���÷���************/
        openFile(sourceFile,goalFile.getAbsolutePath());
        /*********�жϸ����Ƿ�ɹ�*********/
        if(succed){
            System.out.println("���Ƴɹ�!");                                //������û���쳣��ִ����Ϻ�������Ƴɹ�
        }
        
    }
    
    
    
    
    /**
     * openFile����:
     * �򿪲���һָ����ļ���,�����ļ�.
     * ������ΪҪ���Ƶ���Ŀ��·��
     */
    public static void openFile(File sourceFile,String goalFile){
        try {
            File[] f = sourceFile.listFiles();
            for (int i = 0; i < f.length; i++) {
                if(!f[i].isFile()){                                        //��������ļ�,����Ŀ���ļ��´���һ���ļ���,���ݹ���ô˷���
                    File mf = new File(goalFile+"\\"+f[i].getName());    //�Խ�Ҫ���и��Ƶ�Ŀ���ļ��д�������
                    mf.mkdir();                                            //��Ŀ���ļ��´���һ���ļ���
                    openFile(f[i],goalFile+"\\"+f[i].getName());        //�ݹ����openFile����,�Ѷ�f[i]ָ����ļ�����������
                }else{
                    String url = f[i].getAbsolutePath();                //��ȡ�ļ��ľ���·��
                    copy(url, goalFile + "\\" + f[i].getName());        //���и���
                }
            }
        } catch (Exception e) {
            System.out.println("����ʱ���ִ���,����·�������Ƿ���ȷ��ռ��");           //���Ƴ��ִ���ʱ�׳�
            succed = false;
        }
        
    }
    
    
    /**
     * copy����:
     * ������������,��һ����Դ�ļ�ȫ·��,�ڶ�����Ŀ���ļ�ȫ·��
     */
    public static void copy(String url,String goal){        
        FileInputStream fis = null;
        FileOutputStream fos = null; 
        try {
            fis = new FileInputStream(url);
            fos = new FileOutputStream(goal);
            byte[] arr = new byte[1024];
            int length;
            while((length = fis.read(arr))!=-1){
                fos.write(arr, 0, length);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

