package itheima;

class NoteWindow implements Runnable{
private int notes = 80;
public void run(){
	while(true){
		if(notes>0){
			System.out.println(Thread.currentThread().getName()+"���ڷ��͵�"+notes--+"�ݱʼ�");
		}
	 }
  }
}




public class noteThread {

	public static void main(String[] args) {
		//����TicketWindowʵ������nw
		NoteWindow nw = new NoteWindow();
		new Thread(nw,"���ǲ�������ʦ").start();
		new Thread(nw,"���ǲ�������ʦ").start();
		new Thread(nw,"���ǲ�������ʦ").start();

	}

}