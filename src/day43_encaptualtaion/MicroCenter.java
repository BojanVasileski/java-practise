package day43_encaptualtaion;

public class MicroCenter {
	public static void main(String[] args) {
		Computer comp = new Computer();
		Computer comp2 = new Computer();
		
		System.out.println(comp.toString());
		System.out.println(comp2.toString());
		
		comp.setBrand("Dell");
		comp.setOs("Windows 10");
		comp.setCpu(4);
		
		comp2.setBrand("HP");
		comp2.setOs("Windows 8");
		comp2.setCpu(8);
		System.out.println(comp.toString());
		System.out.println(comp2.toString());
		
		Computer myComp = new Computer("ASUS", "Windows 7",8);
		System.out.println(myComp.toString());
		myComp.setCpu(myComp.getCpu()+4);
		System.out.println(myComp.toString());
	}
}
