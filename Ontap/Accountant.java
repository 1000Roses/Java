public class Accountant extends Employee{
	private double rate;

	public Accountant()
	{
		super();
		rate = 0;
	}
	public Accountant(String name,String DOB, double basicPay, double rate)
	{
		super(name,DOB,basicPay);
		this.rate = rate;
	}
	// thieu Sao chep
	@Override
	public double getSalary()
	{
		return rate * basicPay + basicPay;
	}
	public String toString()
	{
		return "Name: "+name+", DOB: "+DOB+", basicPay = "+basicPay+", rate = "+(double)rate;
	}
}