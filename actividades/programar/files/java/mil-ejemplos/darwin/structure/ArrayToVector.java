package structure;

import java.util.Arrays;
import java.util.Date;
import java.util.Enumeration;
import java.util.List;
import java.util.Vector;

/** Convert an Array to a Vector. */
public class ArrayToVector {
	public static void main(String[] args) {
		String[] a1d = {
			"Hello World",
			new Date().toString(),
			Runtime.getRuntime().toString(),
		};
		// Arrays.asList(Object[]) --> List
		List<String> l = Arrays.asList(a1d);

		// Vector contstructor takes Collection
		// List is a subclass of Collection
		Vector<String> v;
		v = new Vector<String>(l);

		// Or, more simply:
		v = new Vector<String>(Arrays.asList(a1d));

		// Just to prove that it worked.
		Enumeration e = v.elements();
		while (e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}
	}
}
