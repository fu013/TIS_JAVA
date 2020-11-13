package randomStudy;

public class MyRandom {

	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			double seedRan = Math.random();	//0~1
			//1, 2, 3, 4, 5, 6
			int diceNum = (int) Math.ceil(seedRan * 6);
			System.out.print(diceNum);
		}
		
		
		
		System.out.print('*');
	}

}
