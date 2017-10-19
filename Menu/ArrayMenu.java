import java.util.Scanner;

class ArrayMenu {
	public static void main(String[] args) {
		
		Scanner reader = new Scanner(System.in);						
		int index = 0;
		int number = 0;
		int action = 0;
		int n = 0;
		int amount = 0;
		int trig = 0;
		int array[] = new int[100];
		while(action != 6) {
			System.out.println("Menu");
			System.out.println("1. Create the array");
			System.out.println("2. Add an element to the end");
			System.out.println("3. Delete an element");
			System.out.println("4. Add an element to the array");
			System.out.println("5. Array out");
			System.out.println("6. Exit");
			trig = 0;
			action = reader.nextInt();
			if(action == 1) {
				n = reader.nextInt();
			} else if(action == 2) {
				for(int i = amount; i < n; i++) {
					if((trig == 0) & (array[i] == 0)) {			//2nd option
						array[i] = reader.nextInt();
					}
					trig++;							
				}
				amount++;
			} else if(action == 3) {
				index = reader.nextInt();
				if(index == 0) {
					for(int i = 0; i < array.length -1; i++) {
						array[i] = array[i+1];
					}
				} else {
					for(int i = index; i < array.length; i++) {		
					array[i-1] = array[i];
				}
			}
				array[array.length - 1] = 0;	
			} else if(action == 4) {
				number = reader.nextInt();
				index = reader.nextInt();
				for(int i = array.length - 1; i > index; i--) { 
					array[i] = array[i-1];
				}
				array[index] = number;	
			} else if(action == 5) {
				for(int i = 0; i < n; i++) {
					System.out.print(array[i]+ " ");
				}
			} else if(action == 6) {
				System.exit(0);
			}
			
		}
	}
}