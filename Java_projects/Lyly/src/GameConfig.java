import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * ��Ϸ�ӿ�
 */
public interface GameConfig {

	String[][] MAP = new String[10][10];// ���ִ��ͼ
	String[][] MAPabout = new String[10][10];// ���ִ��ͼע��
	int[][][] coordinate = new int[10][10][10];// 10�����ִ���ô��ĵ�ͼ
	Player player = new Player();
	List<Map<String, String>> zhuangbeilist = new ArrayList<Map<String, String>>();// ����װ��
}
