public class Cylinder extends Circle{
	private double height;
	public Cylinder()
	{
		height = 0;
		radius = 0;
	}
	public Cylinder(double radius, double height)
	{
		this.radius = radius;
		this.height = height;
	}
	public void setHeight(double height)
	{
		this.height = height;
	}
	@Override
	public double getArea()
	{
		return super.getArea() * height;
	}
	public double getLSurface()
	{
		return Math.PI * 2 * radius;
	}
	public String toString1()
	{
		return super.toString() +" height = "+ height;
	}
}