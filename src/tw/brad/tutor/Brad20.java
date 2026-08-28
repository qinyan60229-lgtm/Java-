package tw.brad.tutor;

import tw.brad.api.TWid;

public class Brad20 {

	public static void main(String[] args) {
		TWid id = TWid.newTWid("A123456789");
		if (id != null) {
			System.out.println(id);
			System.out.println(id.isMale()?"male":"female");
			System.out.println(id.getArea());
		}
	}

}