
public class CalculatorTester {

	public static void main(String[] args) 
	{	
		Calculator calculator = new Calculator();
		int x = 7;
		int y = 14 ;
		System.out.printf("The sum of %d and %d is %d",x,y,calculator.add2Ints(x, y));
	}
}
