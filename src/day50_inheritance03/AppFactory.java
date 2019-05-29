package day50_inheritance03;

public class AppFactory {
	public static void main(String[] args) {
		IPhoneApp iApp = new IPhoneApp();
		IPhoneApp iApp1 = new IPhoneApp("Uber");
		
		AndroidApp andrApp = new AndroidApp();
		AndroidApp andrApp1 = new AndroidApp("Lyft");
		
		System.out.println(iApp.getName());
		System.out.println(iApp1.getName());
		System.out.println(andrApp.getName());
		System.out.println(andrApp1.getName());
		
		App.count = 33;
		System.out.println(IPhoneApp.count);
		AndroidApp.count = 100;
		System.out.println("App count: "+App.count);
		System.out.println("IPhoneApp count: "+IPhoneApp.count);
		System.out.println("AndroidApp count: "+AndroidApp.count);
		
		App.buildWith("Swift");
		IPhoneApp.buildWith("Objactive c");
		AndroidApp.buildWith("Java");
	}
}
