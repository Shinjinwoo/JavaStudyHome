package Study;

public class MethodStudy1 {

	public static void numberingInput(int n, int m) {
		int i = n;
		while (i < m) {
			System.out.println(i);
			i++;
		}
	}

	public static void main(String[] args) {
		numberingInput(1,5);

	}
}
