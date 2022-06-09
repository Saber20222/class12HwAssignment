package class12HwAssignment;

public class Task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Create a String and if the String is not empty perform the following: if the
		 * String has an odd number of characters and has 3 or more characters, print
		 * the character in the middle of the String.
		 */
				
				// The way I did it.
				String str="horse";
				if(!str.isEmpty()) {
					char x=str.charAt(2);
					System.out.println(x);
				}
				
				
				// The way Teacher did it.
				//str2.length()%2!=0  String has an odd number of characters
				//str2.length()>=3  has 3 or more character
				String str1=new String("Hello");
				String str2="Hello"; // This is preferred
				
				if(!str2.isEmpty()) {
					
					if(str2.length()%2!=0&&str2.length()>=3) {
						int middle=str2.length()/2;
						System.out.println(str2.charAt(middle));
					}
					
				}	
		

	}

}
