package training;

public class RemoveSplChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("\n---Remove special character---");
		String  s ="####^%$ vinitha *** &&&& 123";
		System.out.println(s);
		s=s.replaceAll("[^a-zA-Z0-9]","");
		System.out.println(s);
		
		System.out.println("\n--remove white space---");
		String d = "V I N I T H A ";
		System.out.println(d);
		d=d.replaceAll(" ", "");
		System.out.println(d);
		
		System.out.println("\n--adding white space--");
		String w = "vinithasoftwareengineer";
		System.out.println(w);
		w=w.replaceAll("", " ");
		System.out.println(w);

	}

}
