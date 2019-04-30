package day33_methodsWithReturnValue;

public class CalcTest {
	public static void main(String[] args) {
		System.out.println(write2Methods.add(10, 23));
		System.out.println(write2Methods.miltiply(4,5));
		System.out.println(write2Methods.deduct(10, 5));
		System.out.println(write2Methods.divide(100, 5));
		
		System.out.println("*******************************************************************************************");
		int addResult = write2Methods.add(21, 41);
		double mResult = write2Methods.miltiply(50,40);
		double miResult = write2Methods.deduct(3000, 200);
		double dResult = write2Methods.divide(455, 5);
		
		System.out.println("addResult "+addResult);
		System.out.println("mResult "+mResult);
		System.out.println("miResult "+miResult);
		System.out.println("dResult "+ dResult);
		System.out.println("*******************************************************************************************");
		
		double a =  10.0, b=5.0;
		double myResult = write2Methods.deduct(a,b);
		System.out.println("myResult "+myResult);
		
		System.out.println("*******************************************************************************************");
		
		double[] dNums = {2.0,4.0};
		double result2 = write2Methods.miltiply(dNums[0],dNums[1]);
		System.out.println("result2: "+result2);
		
		System.out.println("*******************************************************************************************");

		if(write2Methods.add(10, 16)==26){
			System.out.println("Add unit test passed");
		}else {
			System.out.println("Add unit test failed");
		}
		
	}
}
