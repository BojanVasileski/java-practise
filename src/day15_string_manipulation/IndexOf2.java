package day15_string_manipulation;

public class IndexOf2 {
 public static void main(String[] args) {
	String list = "html-selenium-andgular-jenkins-grid";
	
	int firstDash = list.indexOf("-");
	System.out.println("First dash: " + firstDash);
	
	
	int secondDash = list.indexOf("-",5);   //look for dash but start searching from index 5
	System.out.println("second dash:" + secondDash);
	int thirdDash  = list.indexOf("-", secondDash+1)		;
	System.out.println(thirdDash);
	//find the last dash
	int lastDash = list.lastIndexOf("-");
	System.out.println(lastDash);
	
	
	
}

}
