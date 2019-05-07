import java.util.NoSuchElementException;
public class MyQueue<E>{
	private Node<E> front;
	private Node<E> rear;
	private int numNode;
	public MyQueue()
	{
		front = null;
		rear = null;
	}
	public void enQueue(E item)
	{
		if(front == null)
		{
			front = new Node<E>(item,null);
			rear = front;
			numNode++;
		}
		else
		{
			Node<E> temp = front;
			while(temp.getNext() != null)
			{
				temp = temp.getNext();
			}
			temp.setNext(new Node<E>(item,null));
			
			rear = temp.getNext();
			numNode++;
		}

	}
	public E deQueue() throws NoSuchElementException
	{
		if(front == null)
		{
			//System.out.println("Quang Exception");
			 throw new NoSuchElementException("Can't find");
		}
		else
		{
			Node<E> temp = front;
			front = front.getNext();
			numNode --;
		
		return temp.getData();
		}
	}
	public E getHead() throws NoSuchElementException
	{
		if(front == null)
			throw new NoSuchElementException("Can't find");
		else return front.getData();
	}
	public void printAll()
	{
		Node<E> temp = front;
		while(temp != null)
		{
			System.out.print(temp.getData()+" ");
			temp = temp.getNext();
		}

	}
	public E getLast()
	{
		return rear.getData();
	}
	public boolean isEmpty()
	{
		return front == null;
	}
	public int size()
	{
		return numNode;
	}

}