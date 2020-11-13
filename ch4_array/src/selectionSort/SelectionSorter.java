package selectionSort;

import java.util.Arrays;

public class SelectionSorter {

	public static void main(String[] args) {
		int[] problem = { 5, 22, 4, 6, 1, 4, 7 };
		// �־��� �迭 �߿��� �ּڰ��� ã�´�.
		// �� ���� �� �տ� ��ġ�� ���� ��ü�Ѵ�(�н�(pass)).
		// �� ó�� ��ġ�� �� ������ ����Ʈ�� ���� ������� ��ü�Ѵ�.
		// �ϳ��� ���Ҹ� ���� ������ ���� 1~3 ������ �ݺ��Ѵ�.
		
		// �񱳽�����
		int compareStartPoint = 0;
		for (; compareStartPoint < problem.length - 1; compareStartPoint++) {
			// ���� ���� ���� �ִ� ��ġ
			int indexOfMinVal = compareStartPoint;
			//���� ��
			for(int comparePoint = compareStartPoint + 1; comparePoint < problem.length; comparePoint++) {
				//���ݱ��� ã�� ���� ���� ���� �񱳰��� ũ�⸦ ���Ѵ�
				if(problem[comparePoint] < problem[indexOfMinVal]){
					//���� ���� ��ġ�� ���� ���� ��ġ�� �Ǿ�� �Ѵ�.
					indexOfMinVal = comparePoint;
				}
			}
			// for�� ������ ���ݱ��� ã�ƴ� ���� �������� �������� ����ִ� ���� �ٲپ� �ش�.swap
			int swap = problem[indexOfMinVal];
			problem[indexOfMinVal] = problem[compareStartPoint];
			problem[compareStartPoint] = swap;
		}
		System.out.println(Arrays.toString(problem));
	}

}
