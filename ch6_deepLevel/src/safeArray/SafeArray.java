package safeArray;
	
public class SafeArray {
	private int[] a;
	public int length;
	
	public SafeArray (int size) {
		a = new int[size];
		length = size;
	}
		
	public int get(int index) {
		if (isSafeRange(index)) {
			return a[index];
		}
		return -1;
	}

	public void put(int index, int value) {
		if (isSafeRange(index)) {
			a[index] = value;
		} else {
			System.out.println("잘못된 인덱스"+ index);
		}
	}
	
	private boolean isSafeRange(int index) {
		return index >= 0 && index < length;
	}

}
