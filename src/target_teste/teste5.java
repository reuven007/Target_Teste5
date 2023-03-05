package target_teste;

public class teste5 {

	public static String invertida (String str) {

		if (str == null || str.equals("")) {
			return str;
		}

		char[] c = str.toCharArray();

		for (int l = 0, h = str.length() - 1; l < h; l++, h--) {

			char temp = c[l];
			c[l] = c[h];
			c[h] = temp;
		}

		return String.copyValueOf(c);
	}

//	public static void main(String[] args) {
//		String str = "Seja bem vindo!";
//
//		str = invertida (str);
//
//		System.out.println("String invertida:  " + str);
//	}

}
