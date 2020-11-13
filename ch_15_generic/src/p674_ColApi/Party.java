package p674_ColApi;

import java.util.Date;

public class Party implements Comparable<Party> {
	private static int ID_SEED = 0;	//?
	private int id;
	private String name;
	private Date birthDate;

	public Party(String name, Date birthDate) {
		id = ++ID_SEED;
		this.name = name;
		this.birthDate = birthDate;
	}

	
	public Date getBirthDate() {
		return birthDate;
	}


	@Override
	public int compareTo(Party o) {
		return name.compareTo(o.name);
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((birthDate == null) ? 0 : birthDate.hashCode());
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Party other = (Party) obj;
		if (birthDate == null) {
			if (other.birthDate != null)
				return false;
		} else if (!birthDate.equals(other.birthDate))
			return false;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "Party [id=" + id + ", name=" + name + ", birthDate=" + birthDate + "]";
	}
	
	
}
