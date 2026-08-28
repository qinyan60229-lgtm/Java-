package tw.brad.tutor;

import tw.brad.api.TWid;

public class Brad18 {

	public static void main(String[] args) {
		System.out.println(Math.random());
		System.out.println(TWid.isRight("L107618050"));
		
		TWid id1 = new TWid();
		TWid id2 = new TWid(false);
		TWid id3 = new TWid('S');
		TWid id4 = new TWid(true, 'B');
		System.out.println(id1.getId());
		System.out.println(id2.getId());
		System.out.println(id3.getId());
		System.out.println(id4.getId());
		
		TWid id5 = TWid.newTWid("A123456789");
		if (id5 != null) {
			System.out.println(id5.getId());
		}else {
			System.out.println("no");
		}
		
	}

}