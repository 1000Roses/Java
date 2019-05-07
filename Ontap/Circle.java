public class Circle implements Shape{

	protected  double radius;
	public Circle()
	{
		radius = 0;
	}
	public Circle(double radius)
	{
		this.radius = radius;	//+ la public, - la private, # protected
	}
	public void setRadius(double radius)
	{
		this.radius = radius;
	}

	@Override
	public double getArea()
	{
		return Math.PI * Math.pow(radius,2);
	}

	@Override
	public double getPerimeter()
	{
		return Math.PI * radius * 2;
	}	
	public String toString()
	{
		return "radius = "+radius+" Area = "+getArea()+" Perimeter = "+getPerimeter();
	}

}