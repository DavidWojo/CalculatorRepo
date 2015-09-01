
public class CalculatorTester {

	public static void main(String[] args) 
	{	
		Calculator calculator = new Calculator();
		int x = 7;
		int y = 14 ;
		System.out.printf("The result of %d plus %d is %d",x,y,calculator.add2Ints(x, y));
		
		x = 7;
		y = 14 ;
		System.out.printf("\nThe result of %d minus %d is %d",x,y,calculator.sub2Ints(x, y));
	}
}
