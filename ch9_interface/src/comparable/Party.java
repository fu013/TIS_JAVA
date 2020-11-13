package comparable;

import java.util.Date;

public class Party implements Comparable<Party> {
	private String name;
	private Date birthDate;
	
	public Party(String name, Date birthDate) {
		this.name = name;
		this.birthDate = birthDate;
	}

	@Override
	public int compareTo(Party o) {
		return birthDate.compareTo(o.birthDate);
	}

	@Override
	public String toString() {
		return "Party [name=" + name + "]";
	}
}
