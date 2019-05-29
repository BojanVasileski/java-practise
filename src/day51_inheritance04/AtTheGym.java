package day51_inheritance04;

//import day51_inheritance04.Exercise.Running;

public class AtTheGym {
	public static void main(String[] args) {
		Exercise e = new Exercise();
		Running r= new Running();
		Swimming s = new Swimming();
		Yoga y = new Yoga();
		Judjitsu j = new Judjitsu();
		Sprinting sp = new Sprinting();
		
		Snowboarding sn = new Snowboarding();
		
		System.out.println(sn.perform(100));
		System.out.println(j.perform(100));
		System.out.println(y.perform(150));
	}
}
