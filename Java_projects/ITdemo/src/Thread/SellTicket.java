package Thread;

public class SellTicket {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TicketWindow tw = new TicketWindow();
		Thread t1 = new Thread(tw,"һ�Ŵ���");
		Thread t2 = new Thread(tw,"���Ŵ���");
		Thread t3 = new Thread(tw,"���Ŵ���");
		t1.start();
		t2.start();
		t3.start();
	}

}

class TicketWindow implements Runnable{
	private int tickets=10;
	
	public synchronized void run(){
		while(true){
			if(tickets>0){
				System.out.println(Thread.currentThread().getName()+"׼����Ʊ,��ʣ��:"+tickets+"��");
				tickets--;
				System.out.println(Thread.currentThread().getName()+"����һ��,��ʣ��:"+tickets+"��");
			}
			else{
				System.out.println("��Ʊ����,��ͣ����!");
				try{Thread.sleep(1000*60*5);
				}catch(InterruptedException e){
					e.printStackTrace();
				}
			}
		}
	}
}
