package itheima;

import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer {

	public static void main(String[] args)throws Exception{
		
			ServerSocket serverSocket = new ServerSocket(8002);
			Socket client = serverSocket.accept();
			
			OutputStream os = client.getOutputStream();
			
			System.out.println("��ͻ��˽������ݽ���");
			os.write(("Hello World").getBytes());
			
			Thread.sleep(5000);

			os.close();
			serverSocket.close();
			client.close();

		}
	}


