package tw.brad.tutor;

import java.util.Arrays;

public class PokerV3 {

	public static void main(String[] args) {

	    int[] poker = new int[52];

	    // 先建立 0 ~ 51
	    for (int i = 0; i < poker.length; i++) {
	        poker[i] = i;
	    }

	    // 洗牌 shuffle
	    for (int i = 0; i < poker.length; i++) {

	        int j = (int)(Math.random() * 52);

	        int temp = poker[i];
	        poker[i] = poker[j];
	        poker[j] = temp;
	    }

	    // 顯示結果
	    for (int card : poker) {
	        System.out.println(card);
	    }
	    System.out.println("-----------------");
	    //-----------------------------
	    int[][] players = new int[4][13];
	    for (int i=0;i<poker.length;i++) {
	    	players[i%4][i/4] = poker[i];
	    }
	    
	    String[] shoots = new String[] {"♠", "♥", "♦", "♣"};
	    
	    String[] values = {"A","2","3","4","5","6","7","8","9",
	    		"10","J","Q","K"};
	    
	    for (int[] player: players) {
	    	Arrays.sort(player);
	    	for(int card :player) {
		    	System.out.print(shoots[card/13] + values[card%13] + " ");
		    }
	    	System.out.println();
	    }
	}

}
