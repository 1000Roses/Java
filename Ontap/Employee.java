public abstract class Employee{
	protected String name;
	protected String DOB;	//Date of birth
	protected double basicPay;

	public Employee()
	{
		name = " ";
		DOB = " ";
		basicPay = 0;
	}
	public Employee(String name,String DOB, double basicPay)
	{
		this.name = name;
		this.DOB = DOB;
		this.basicPay = basicPay;
	}
	public abstract double getSalary();
}