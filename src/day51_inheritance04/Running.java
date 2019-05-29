package day51_inheritance04;

public 	class Running extends Exercise{
	
	public int perform(int minutes) {
		System.out.println("Running");
		return minutes*10;
	}
}
