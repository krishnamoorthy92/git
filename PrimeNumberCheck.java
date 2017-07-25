package selenium;

public class PrimeNumberCheck {

	public static void main(String[] args) {
		
		int i , number , divider,cond=0;
		number = 12;
		divider = number/2;
		for (i=2;i<=divider;i++){
			
			if (number%i==0){
				System.out.println("Not a Prime number");
				cond = 1;
				break;
			}
			}
			if (cond == 0){
			
			System.out.println(" Prime number ");
			}
		}
		
		

	}


