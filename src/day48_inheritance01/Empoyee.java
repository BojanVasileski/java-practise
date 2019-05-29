package day48_inheritance01;

public class Empoyee extends Person{
	 String jobTitle;
	

	    
		@Override
	public String toString() {
		return "Empoyee [jobTitle=" + jobTitle + ", name=" + name + ", age=" + age + ", gender=" + gender
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}



		public void work() {
	    	System.out.println(name + " is working as " + jobTitle);
	    	
	    }
	    
}
