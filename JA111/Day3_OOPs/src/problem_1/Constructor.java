package problem_1;

public class Constructor {
		
	int a;
	String h;
	
//	constructor
	
	Constructor(){
		
		a=25;
		h="harsh";
		
	}
	
//	cons end
	void methodforOUtpustshow() {
		System.out.println(a+" "+h);
	}
	
	
}


class mainmethod{
	
	public static void main(String[] args) {
		Constructor ref= new Constructor();
		
		ref.methodforOUtpustshow();
	}
	
}
