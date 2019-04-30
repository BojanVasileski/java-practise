package day27_ArraysPractiseAndMethods;

public class ProgtamingTools {
public static void main(String[] args) {
	String [] tools = {"Java","Selenium","TestNG","JUnit","Cucumber","Git","Maven"};
	
	
	for(String tool:tools) {
		if(tool.equals("Java")) {
			System.out.println(tool+"- Programming Language");
		}else if(tool.equals("Selenium")) {
			System.out.println(tool+"- Test Automation");
		}else if(tool.equals("TestNG")) {
			System.out.println(tool+"- Unit Tests");
		}else if(tool.equals("JUnit")) {
			System.out.println(tool+"- Unit Tests");
		}else if(tool.equals("Cucumber")) {
			System.out.println(tool+"- BDD Style testing");
		}else if(tool.equals("Git")) {
			System.out.println(tool+"- Version control");
		}else if(tool.equals("Maven")) {
			System.out.println(tool+"- Building and execution for project");
		}
	}
	
	
}
}
