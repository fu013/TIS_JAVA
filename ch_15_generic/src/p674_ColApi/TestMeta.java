package p674_ColApi;

import java.lang.reflect.Field;
import java.util.Date;

public class TestMeta {

	public static void main(String[] args) {
		Party party = new Party("name", new Date());
		Field[] fields = Party.class.getDeclaredFields();
		for (Field field : fields) {
			try {
				field.setAccessible(true);
				if (field.getType() == String.class) {
						field.set(party), (String)field.get(party) + field.get(party);
					}
				System.out.println(field.getName() + "�� ���� " + field.get(party));
			} catch(IllegalArgumentException | IllegalAccessException e) {
				e.printStackTrace();
			}
		}
	}
}
