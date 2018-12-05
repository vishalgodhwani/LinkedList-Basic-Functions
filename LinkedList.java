
public class LinkedList {
	Node head;
	public void insert(int data)
	{
		Node node=new Node();
		node.data=data;
		node.next=null;
		if(head==null)
		{
			head=node;
		}
		else
		{
			Node n=new Node();
			n=head;
			while(n.next!=null)
			{
				n=n.next;
			}
			n.next=node;
		}
	}
	public void show()
	{
		Node node=head;
		while(node.next!=null)
		{
			System.out.println(node.data);
			node=node.next;
		}
		System.out.println(node.data);
	}
	public void insertAtStart(int data)
	{
		Node n=new Node();
		n.data=data;
		n.next=null;
		n.next=head;
		head=n;
	}
	public void insertAt(int data,int i)
	{
		Node n=new Node();
		Node m=new Node();
		Node p=new Node();
		n.data=data;
		n.next=null;
		int k=i;
		if(k==0)
		{
			insertAtStart(data);
		}
		else
		{
			int j=0;
			m=head;
			while(j<i)
			{
				m=m.next;
				if(j==(i-1))
				{
					p=m.next;
				}
				j++;
			}
			m.next=n;
			n.next=p;
		}
	}
	public void deleteAt(int i)
	{
		if(i==0)
		{
			head=head.next;
		}
		else
		{	
			Node n=new Node();
			Node p=null;
			n=head;
			int j=0;
			while(j<i-1)
			{
				n=n.next;
				j++;
			}
			p=n.next;
			n.next=p.next;
			System.out.println("Deleted the element at "+i+" i.e " +p.data);
		}
	}
}
