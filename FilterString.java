package huawei;
import java.util.HashMap;
import java.util.Scanner;

/*
 * 通过键盘输入一串小写字母（a~z）组成的字符串。
 * 请编写一个字符串过滤程序，若字符串中出现多个相同的字符，将非首次出现的字符过滤掉。
 * 比如字符串abacacde过滤结果为abcde。
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
