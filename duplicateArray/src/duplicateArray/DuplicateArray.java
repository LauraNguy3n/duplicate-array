package duplicateArray;
import java.util.Arrays;
public class DuplicateArray {

	public static void main(String[] args) {
		
		int [] numbers={2,10,4,8,10};{
			
			for(int i=0; i<numbers.length;i++) {
				for (int o=i+1; o<numbers.length;o++) {
					if ((numbers[i]==numbers[o]) && (i!=o)) {
						System.out.println(numbers[i]);
					}
					
				}
			}
			
		}
		
		
	}

}
