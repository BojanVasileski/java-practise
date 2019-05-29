package day47_blocks;

public class AllBlocks {
	int nonStaticInt = 10;
	static int staticInt = 10;
	static {
		System.out.println("Static Bloc - runs first and ONLY ONCE");
		staticInt--;
		
	}
	{
		System.out.println("Init Block - runs everytime object is called");
		nonStaticInt +=5;
		staticInt +=5;
	}
	public AllBlocks() {
		System.out.println("CONSTRUCTOR - runs everytime object is created");
		nonStaticInt+=3;
		staticInt +=3;
	}
}
