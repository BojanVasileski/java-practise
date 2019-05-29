package day45_encaptulation_practice;

public class EtsyDotCom {
public static void main(String[] args) {
	EtsyAccount acc1 = new EtsyAccount();
	acc1.setEmail("bojan.vasileski@yahoo.com");
	acc1.setFirstName("Bojan");
	acc1.setPassword("bulgaria123");
	
	System.out.println(acc1);
	
	EtsyAccount acc2 = new EtsyAccount();
	acc2.setEmail("stojkoDver.com");
	acc2.setFirstName("stojko123");
	acc2.setPassword("123sd");
	System.out.println(acc2);
	
	EtsyAccount acc3 = new EtsyAccount("oiii@my.com","hello","qwe1231");
	System.out.println(acc3);
	
	EtsyAccount acc4 = new EtsyAccount("boj4o@yahoo.com","bojanne");
	System.out.println(acc4);
	
}
}
