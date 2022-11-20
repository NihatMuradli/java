package java_array;

import java.util.Random;

public class exercise_5 {

	public static void main(String[] args) {
		Random r1 = new Random();
        int a1 = r1.nextInt(6) +1;
        System.out.println("Birinci zər:"+a1);
        Random r2 = new Random();
        int a2 = r2.nextInt(6) +1;
        System.out.println("Ikinci zər:"+a2);
	}

}
