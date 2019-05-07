public class MyStack<E>{
	private Node<E> top;
	private E numNode;

	public MyStack()
	{
		top = null;
		numNode = null;
	}
	public void push(E item)
	{
		top = new Node<E>(item,top);
	}
	public E pop()
	{
		if(isEmpty()) return null;
		else
		{
			Node<E> temp = top;
			top = top.getNext();
			return temp.getData();
		}
		
	}

	public E peek()
	{
		if(!isEmpty())
			return top.getData();
		return null;
	}


	public int size()
	{
		int count = 0;
		Node<E> temp = top;
		while(temp != null)
		{
			count++;
			temp = temp.getNext();
		}
		return count;
	}
	public boolean contains(E item)
	{
		if(isEmpty()) return false;
		else
		{
			Node<E> temp = top;
			while(temp != null)
			{
				if(temp.getData().equals(item))
					return true;
				temp = temp.getNext();
			}

		}
		return false;
	}

	public boolean isEmpty()
	{
		return top == null;
	}
	public void printAll()
	{
		Node<E> temp = top;
		while(temp != null)
		{
			System.out.print("-->"+temp.getData()+" ");
			temp = temp.getNext();
		}

	}
}