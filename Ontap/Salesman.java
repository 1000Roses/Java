public class Salesman extends Employee{
	private int productQuanity;
	public Salesman()
	{
		super();
		productQuanity = 0;
	}
	public Salesman(String name, String DOB, double basicPay, int productQuanity)
	{
		super(name,DOB,basicPay);
		this.productQuanity = productQuanity;
	}
	@Override
	public double getSalary()
	{
		return productQuanity * 0.05 + basicPay;
	}
	public String toString()
	{
		return "Name: "+name+",DOB: "+DOB+", basicPay = "+ basicPay+", productQuanity = "+productQuanity;
	}
}