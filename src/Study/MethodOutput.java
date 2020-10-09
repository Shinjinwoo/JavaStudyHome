package Study;

public class MethodOutput {

	public static String numbering(int init, int limit) {

		int i = init;

		String output = "";
//		안녕하세요.d

		while (i < limit) {
			output += i;
			i++;
		}
		return output;
	}

	public static void main(String[] args) {

		String result = numbering(1, 5);
		System.out.println(result);

	}

}
