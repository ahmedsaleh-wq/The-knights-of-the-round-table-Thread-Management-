import java.util.*;

public class RoundTable {
	
	public static Map<Sword, Knight> pickedSwords = new HashMap<>();
	
	public static void main(String[] args) {
		Knight knight_1 = new Knight();
		Knight knight_2 = new Knight();
		Knight knight_3 = new Knight();
		Knight knight_4 = new Knight();
		Knight knight_5 = new Knight();
		Sword sword_1 = new Sword("Callandor");
        Sword sword_2 = new Sword("Sihill");
        Sword sword_3 = new Sword("Needle");
        Sword sword_4 = new Sword("Sting");
        Sword sword_5 = new Sword("Anduril");
		Thread thread_1 = new Thread(knight_1, "knight 1");
		Thread thread_2 = new Thread(knight_2, "knight 2");
		Thread thread_3 = new Thread(knight_3, "knight 3");
		Thread thread_4 = new Thread(knight_4, "knight 4");
		Thread thread_5 = new Thread(knight_5, "knight 5");
		pickedSwords.put(sword_1, null);
		pickedSwords.put(sword_2, null);
		pickedSwords.put(sword_3, null);
		pickedSwords.put(sword_4, null);
		pickedSwords.put(sword_5, null);
		thread_1.start();
		thread_2.start();
		thread_3.start();
		thread_4.start();
		thread_5.start();

	}

}
