package p666_inheritanceAndGeneric;

public class TestGeneric {
	//Number를 상속 받은 어떤 것이 담긴 박스
	private void doSome(Box<? extends Number> box) {
		System.out.println(box);
	}
	public static void main(String[] args) {
		TestGeneric tg = new TestGeneric();
		Box<Number> box = tg.new Box<>(55);
		tg.doSome(box);

		Box<Integer> box2 = tg.new Box<>(23);
		tg.doSome(box2);

		Box<Double> box3 = tg.new Box<>(23.45);
		tg.doSome(box2);

	}

	private class Box<T> {
		private T data;

		public Box(T data) {
			this.data = data;
		}

		public T getData() {
			return data;
		}

		@Override
		public String toString() {
			return "Box [data=" + data + "]";
		}
	}
}
