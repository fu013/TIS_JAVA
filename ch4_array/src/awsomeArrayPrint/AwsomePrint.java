package awsomeArrayPrint;

public class AwsomePrint {

	public static void main(String[] args) {
		char[][] eng = { { 'a', 'b', 'c', 'd' }, { 'e', 'f', 'g', 'h' }};

		for (int j = 3; j > -1; j--) {
			for (int i = 1; i > -1; i--) {
				System.out.print(eng[i][j]);
			}
		}
	}

}
