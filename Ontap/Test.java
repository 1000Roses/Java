public class Test{
	public static void main(String[] args) {
		/*Cylinder tt = new Cylinder(5,7);
		tt.setRadius(4);
		System.out.println(tt.toString());
		Accountant jj = new Accountant("Le Van Tien","27/10/2000",3.500000,0.2);
		System.out.println(jj.toString());
		Salesman kk = new Salesman("Le Van Tien","28/10/2000",3.500000,2);
		System.out.print(kk.toString());
		MyStack<Integer> st = new MyStack<Integer>();
		st.push(5);
		st.push(6);
		st.push(4);
		st.pop();
		st.pop();
		st.peek();
		st.printAll();*/
		MyQueue<Integer> aa = new MyQueue<Integer>();
		//aa.enQueue(5);
		aa.enQueue(8);
		aa.enQueue(7);
		aa.deQueue();
		aa.printAll();
		System.out.println();
		System.out.print("Tong so size la: "+aa.size());
	}
}