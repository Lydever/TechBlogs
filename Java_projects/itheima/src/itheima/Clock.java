package itheima;
import java.time.*;
public class Clock {

	public static void main(String[] args) {

		
		Duration d = Duration.ofDays(1);
		System.out.println("һ�����"+d.toHours()+"Сʱ");
		System.out.println("һ�����"+d.toMinutes()+"����");
		System.out.println("һ�����"+d.toMillis()+"��");
		
		Instant instant = Instant.now();
		System.out.println("��ȡUTCʱ���ĵ�ǰʱ��Ϊ:"+instant);
		System.out.println("��ǰʱ��һСʱ���ʱ��Ϊ:"+instant.plusSeconds(3600));
		System.out.println("��ǰʱ���һСʱǰ��ʱ��Ϊ:"+instant.minusSeconds(3600));
		
		LocalDate localdate = LocalDate.now();
		System.out.println("��Ĭ��ʱ����ϵͳʱ�ӻ�ȡ��ǰ������Ϊ:"+localdate);
		
		LocalTime localtime = LocalTime.now();
		System.out.println("��Ĭ��ʱ����ϵͳʱ�ӻ�ȡ��ǰ��ʱ��:"+localtime);
		
		
		LocalDateTime localdateTime = LocalDateTime.now();
		System.out.println("��Ĭ��ʱ����ϵͳʱ�ӻ�ȡ��ǰ������,ʱ��:"+localdateTime);
		LocalDateTime times = localdateTime.plusDays(1).plusHours(3).plusMinutes(30);
		System.out.println("��ǰ������,ʱ�����1��3Сʱ30����֮��:"+times);
		
		
		Year year = Year.now();
		System.out.println("��ǰ�����Ϊ:"+year);
		YearMonth yearMonth = YearMonth.now();
		System.out.println("��ǰ�·�Ϊ:"+yearMonth);
		MonthDay monthDay = MonthDay.now();
		System.out.println("��ǰ����Ϊ:"+monthDay);
		
		
		ZoneId zoneId = ZoneId.systemDefault();
		System.out.println("��ǰϵͳĬ��ʱ��Ϊ:"+zoneId);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
