package day48_inheritance02;
import day49_inheritance.Device;
public class IPad extends Device {
	public void readEBook(String title) {
		System.out.println("Reading a book "+title + " using "
	+ brand+" tablet");
		System.out.println("Model: "+ model);
		//System.out.println("Price = "+ price); not inherited not visable
	}
}
