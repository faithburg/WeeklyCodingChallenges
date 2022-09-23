package triplets;

public class Triplets {

	public static void main(String[] args) {
		int a = 10;
		int b = 14;
		int c = -5;
		findTriple(a, b, c);

	}
	
	public static void findTriple(int a, int b, int c) {
		int[] triplets = new int[]{a, b, c};
		
		for(int i = 0; i < triplets.length-1; i++) {
			if(triplets[i] > triplets[i+1]) {
				int temp = triplets[i];
				triplets[i] = triplets[i+1];
				triplets[i+1] = temp;
				//reset loop
				i = -1;
			}
		}
		int maxMidian = triplets[1];
		System.out.println(maxMidian);
		}
	
	}


