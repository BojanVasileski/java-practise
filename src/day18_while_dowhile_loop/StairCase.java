package day18_while_dowhile_loop;

public class StairCase {
public static void main(String[] args) {
	String star = "*";
	//checking length
	while (star.length()<10) {
		System.out.println(star);
		star +="*";
		}
	// with a counter     
			int num = 1;
			while(num <= 10) {
				System.out.println(star);
				star += "*";
				num++;
			}
	//
}
}
