package day44_constructor_encaptulation;
import java.util.*;
public class Dice {
	public static void main(String[] args) {
		Job job1=new Job();
		Job job2=new Job("Java Developer");
		Job job3=new Job("SDET","Amazon",130_000.0);
		System.out.println(job1);
		System.out.println(job2);
		System.out.println(job3);
		
		//create a list of jobs and add 5 different jobs with 
		//company salasry and title
		
		List<Job> jobs = new ArrayList<>();
		jobs.add(job3);
		jobs.add(new Job("Dev", "LabCom",500_000.0));
		jobs.add(new Job("Scrum", "Google",400_000.0));
		jobs.add(new Job("Programmer", "Google",420_000.0));
		jobs.add(new Job("BA", "FreddieMac",430_000.0));
		System.out.println("*****************************************");
		System.out.println(jobs);
		double maxSalary = 0;
		int highestIndex = -1;
		for(int i = 0;i<jobs.size();i++) {
			if(jobs.get(i).getAnnualSalary()>maxSalary) {
				maxSalary = jobs.get(i).getAnnualSalary();
				highestIndex=i;
			}
		}
		Job bestJob = jobs.get(highestIndex);
		System.out.println("Highest Salary: "+bestJob);
	}
}
