package com.itheima.addition1;

public class Test06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GirlFriend girlFriend = new GirlFriend("Å·ÑôÇàÇà", 1.6, "¹Ï×ÓÁ³");
		girlFriend.cook();
		girlFriend.wash(new Clothes("LiNing", "ºÚÉ«"));

		BoyFriend boyFriend = new BoyFriend("Ä½Èİ×ÏÓ¢", 1.75);
		boyFriend.earn();
		boyFriend.play(girlFriend);
	}

}
