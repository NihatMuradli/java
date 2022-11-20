package java_array;

public class exercise_7 {

	public static void main(String[] args) {
		int [][] array7 = new int [2][2];
        array7[0][0] = 1;
        array7[0][1] = 2;
        array7[1][0] = 3;
        array7[1][1] = 4;
        
        for(int[] i:array7) {
        	for(int j :i) {
        		System.out.println(j);
        	}
        }
	}

}
