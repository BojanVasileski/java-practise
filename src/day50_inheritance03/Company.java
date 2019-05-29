package day50_inheritance03;

public class Company {
	public static void main(String[] args) {
		Employee emp = new Employee();
		FullTimeEmployee fullTime = new FullTimeEmployee();
		Contractor cont = new Contractor();
		
		
		emp.calculatePay(80, 13);
		fullTime.calculatePay(80, 13);
		cont.calculatePay(80, 13);
	}
}
