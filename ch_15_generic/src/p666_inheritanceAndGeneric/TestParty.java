package p666_inheritanceAndGeneric;

import java.util.ArrayList;
import java.util.List;

public class TestParty {

	public static void main(String[] args) {
		List<Party> lParty = new ArrayList<>();
		List<Person> lPerson = new ArrayList<>();
		List<Org> lOrg = new ArrayList<>();
		
		lParty.addAll(lPerson);
		lParty.addAll(lOrg);
	}

}
