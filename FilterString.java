package huawei;
import java.util.HashMap;
import java.util.Scanner;

/*
 * ͨ����������һ��Сд��ĸ��a~z����ɵ��ַ�����
 * ���дһ���ַ������˳������ַ����г��ֶ����ͬ���ַ��������״γ��ֵ��ַ����˵���
 * �����ַ���abacacde���˽��Ϊabcde��
 */
public class FilterString {
	public static String filterString(String str) {
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		String result = "";
		if (str == null) {
			return null;
		}
		for (int i = 0; i < str.length(); i++) {
			if(!map.containsKey(str.charAt(i)))
			{
				map.put(str.charAt(i), 1);
				result += str.charAt(i);
			}
		}
		return result;
	}
	 public static void main(String args[])
	 {
		 Main s = new Main();
		 Scanner cin = new Scanner(System.in);
		 String string = cin.next();
		 System.out.print(filterString(string));
	    }
}
