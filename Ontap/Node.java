public class Node<E>{
	private E data;
	private Node<E> next;

	public Node()
	{
		data = null;
		next = null;
	}
	public Node(E data, Node<E> next)
	{
		this.data = data;
		this.next = next;
	}
	public Node(E data)
	{
		this(data, null);
	}
	public E getData()
	{
		return data;
	}
	public Node<E> getNext()
	{
		return next;
	}
	public void setNext(Node<E> e)
	{
		this.next = e;
	}
}