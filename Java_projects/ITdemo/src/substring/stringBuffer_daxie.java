package substring;

public class stringBuffer_daxie {
/*����ת������ַ���*/
	public static void main(String[] args) {
		String str="HelloWorld";
		char []s=str.toCharArray();
		StringBuffer buffer=new StringBuffer();
		for(int i=str.length()-1;i>0;i--){
			if('A'<=s[i]&&s[i]<='Z')
				buffer.append(String.valueOf(s[i]).toLowerCase());
			else if('a'<=s[i]&&s[i]<='z')
				buffer.append(String.valueOf(s[i]).toUpperCase());
		}
         System.out.println(buffer.toString());
	}

}
