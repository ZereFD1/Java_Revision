package you.activity;

public class DivisibleBy11_Self {
	
	public static void main(String[] args) {
		
		
		int num=242;
		
		String numString=String.valueOf(num);
		int sum1=0;
		int sum2=0;
		
		for(int i=0; i<numString.length(); i++) {
			
			int digit = Character.getNumericValue(numString.charAt(i));

			
			if(i%2==0) {
				sum1+=digit;
			}else {
				sum2+=digit;
			}
//			System.out.println(sum1+" "+sum2);
		}
		
		int diff=(sum1>sum2) ? (sum1-sum2):(sum2-sum1);
		
		if(diff==0||diff%11==0) {
			System.out.println(num+" is divisible by 11");
		}else {
			System.out.println(num+" is not divisible by 11");
		}
		
	}
	
}
