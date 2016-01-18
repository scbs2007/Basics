
public class LinkedList {

	LinkedList next = null;
	int data;
	
	public LinkedList(int d)
	{
		data = d;
	}

	public void display()
	{
		LinkedList node = this;
		while(node != null)
		{
			System.out.println(node.data+" ");
			node = node.next;
		}
	}
	
	void addEnd(int d)
	{
		LinkedList node = this;
		LinkedList newNode = new LinkedList(d);
		while(node.next != null)
		{
			node = node.next;
		}
		node.next = newNode;
		node.next.next = null;
	}
}

class UseList
{
	public static void main(String args[])
	{
		LinkedList node = new LinkedList(1);
		node.addEnd(2);
		node.addEnd(3);
		node.addEnd(4);
		node.addEnd(5);
		node.display();
	}
}
