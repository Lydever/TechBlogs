
public class GameUtil {
	// ���������ֵ�ķ��� ������static ���� ������ʱ ����.������
	public static int getLoseLife(int attack, int defend) {
		return attack - defend;
	}

	// ��a-b֮�����������
	public static int getNumber(int a, int b) {
		// ������������֮����������int��
		return (int) (Math.random() * (b - a) + a);
	}

	/**
	 * ���ı�������ı����ұ��ı��м��Stringȡ����
	 * 
	 * @param �ı�
	 * @param ����ı�
	 * @param �ұ��ı�
	 * @return String
	 */
	public static String ȡָ���ı�(String �ı�, String ����ı�, String �ұ��ı�) {
		// int indexOf(String str)
		// ����ָ�����ַ����ڴ��ַ����е�һ�γ��ִ���������
		// int indexOf(int ch, int fromIndex)
		// �����ڴ��ַ����е�һ�γ���ָ���ַ�������������ָ����������ʼ������
		// String substring(int beginIndex, int endIndex)
		// ����һ�����ַ��������Ǵ��ַ�����һ�����ַ���

		int ��� = �ı�.indexOf(����ı�);
		int �ұ� = �ı�.indexOf(�ұ��ı�, ���);
		return �ı�.substring(��� + ����ı�.length(), �ұ�);
	}

	/**
	 * ��ΪJButton�ǲ��Զ����еģ�����֧��html�еĻ��У�����д���Ϊ�˷��㻻��
	 * 
	 * @param str
	 *            �ı�
	 * @param length
	 *            ÿ��length���Ȼ���
	 * @return
	 */
	public static String StringToHtml(String str, int length) {
		// html���з�
		String strhtmlbr = "<br>";
		// html��׼��ʽͷ
		String strhtmltou = "<html>";
		// html��׼��ʽβ
		String strhtmlwei = "</html>";
		// �ַ����ܳ���
		int strlength = str.length();
		// ѭ������
		int k = strlength / length;
		// һ��ʼ��˼·��
		// ���stringÿһС��
		// String[] strings = new String[99];
		// ����ѭ��ȡ��str��ֵ������
		// for (int i = 0; i < k; i++) {
		// strings[i] = str.substring(i * length, i * length + length);
		// }
		// //����ͷ�͵�һ���ı�
		// String strreturn = strhtmltou.concat(strings[0]);
		// //forѭ����1��ʼ����������
		// for (int i = 1; i < k; i++) {
		// strreturn = strreturn.concat(strhtmlbr + strings[i]);
		// }
		// //����htmlβ
		// strreturn = strreturn.concat(strhtmlwei);

		// �˷������ԸĽ����Ľ���ʽ���£�ȡ�����飬����forѭ���ϲ�
		// ���С����ֱ�����
		if (strlength < length) {
			return str;
		}
		String strreturn = strhtmltou.concat(str.substring(0 * length, 0 * length + length));
		for (int i = 1; i < k; i++) {
			strreturn = strreturn.concat(strhtmlbr + str.substring(i * length, i * length + length));
		}
		if (strlength - k * length != 0) {
			strreturn = strreturn.concat(strhtmlbr + str.substring(k * length, strlength));
		}
		strreturn = strreturn.concat(strhtmlwei);
		// ����ת���õ�html
		return strreturn;
	}

	/**
	 * ��htmlת����string��<br>
	 * =null
	 * 
	 * @param str
	 *            html�ı�
	 * @return string
	 */
	public static String HtmlToString(String str) {
		// html���з�
		String strhtmlbr = "<br>";
		// html��׼��ʽͷ
		String strhtmltou = "<html>";
		// html��׼��ʽβ
		String strhtmlwei = "</html>";

		String strreturn = str.replace(strhtmltou, "");
		strreturn = strreturn.replace(strhtmlwei, "");
		strreturn = strreturn.replaceAll(strhtmlbr, "");
		// ����ת���õ�html
		return strreturn;
	}

	public static String ȡ��ǰ(String str) {
		String strreturn = str.substring(0, str.indexOf("."));
		return strreturn;
	}

	/**
	 * ����Ƿ�Ϊ�ı��͵�0������ǽ��ı�ת������
	 * 
	 * @return "��"
	 */
	public static String ZeroToWu(String str) {
		if (str.equals("0")) {
			str = "��";
		}
		return str;
	}

	/**
	 * 
	 * @param str
	 *            ��������
	 * @return ��������
	 */
	public static String Faction(String str) {

		switch (str) {
		case "0":
			str = "��";
			break;
		case "1":
			str = "����������";
			break;
		case "2":
			str = "Ӷ������";
			break;
		case "3":
			str = "�̿͹���";
			break;
		case "4":
			str = "սʿ����";
			break;
		case "5":
			str = "������";
			break;
		case "6":
			str = "������";
			break;
		case "7":
			str = "�޼���";
			break;
		case "8":
			str = "���׹�";
			break;
		case "9":
			str = "�𶦹�";
			break;
		case "10":
			str = "��ľ��";
			break;
		case "11":
			str = "������";
			break;
		case "12":
			str = "�ȶ���";
			break;
		case "13":
			str = "ʱ�չ�";
			break;
		default:
			break;
		}
		return str;
	}

}
