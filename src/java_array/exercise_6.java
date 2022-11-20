package java_array;
public class exercise_6 {

	public static void main(String[] args) {
		int [] array6 = {1,2,3,4,5};
		
		int sum = 0;
		for(int i = 0; i<array6.length;i++) {
			sum+=array6[i];
		}
		System.out.println("massivin cemi: "+sum);
		
		int max = 0;
		for(int i : array6) {
			if(i>max) {
				max=i;
			}
		}
		System.out.println("Max: "+max);
		
		int min = 5;
		for(int i : array6) {
			if(i<min) {
				min=i;
			}
		}
		System.out.println("Min: "+min);
	}

}
