package www.dream.com.framework.array;

public class ArrayStatic {
	public static <T> T getLast(T[] a) {
		if (!isSafe(a))
			return null;
		return a[a.length - 1];
	}

	private static <T> boolean isSafe(T[] a) {
		return a != null && a.length != 0;
	}

	public static <T extends Comparable<T>> T getMax(T[] a) {
		if (!isSafe(a))
			return null;
		
		T largest = a[0];
		for (T e : a) {
			if (largest.compareTo(e) < 0) {
				largest = e;
			}
		}
		return largest;
	}

	public static <T> void swap(T[] a, int i, int j) {
		if (a == null)
			return;
		if (a.length == 0)
			return;
		if (i < 0 || i >= a.length || j < 0 || j >= a.length)
			return;
		T temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}

	/**
	 * "[a, b, c]"
	 * @param a
	 * @return
	 */
	public static <T> String toString(T[] a) {
		if (a == null)
			return "null";
		StringBuilder sb = new StringBuilder("[");
		boolean isFirst = true;
		for (T e : a) {
			if (isFirst) {
				isFirst = false;
			} else {
				sb.append(", ");
			}
			sb.append(e);
		}
		sb.append("]");
		
		return sb.toString();
	}
}
