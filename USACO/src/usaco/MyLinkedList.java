package usaco;

public class MyLinkedList<TObject> {
	Node<TObject> head;
	
	public class Node<TData> {
		Node<TData> next;
		TData data;
		
		public Node(TData data, Node<TData> next) {
			this.data = data;
			this.next = next;
		}
	}
	
	private Node<TObject> GetFirstNode() {
		return head;
	}
	
	private Node<TObject> GetLastNode() {
		Node<TObject> temp = head;
		if (temp == null)
			return null;
		while (temp.next != null)
			temp = temp.next;
		return temp;
	}
	
    public void AddToEnd(TObject data) {
    	Node<TObject> last = GetLastNode();
    	Node<TObject> newNode = new Node<>(data, null);
        if (last == null) //If there were no values
            head = newNode;
        else
            last.next = newNode;
    }

    public void AddToFront(TObject data) {
    	Node<TObject> newNode = new Node<>(data, head);
    	head = newNode;
    }
    
    public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("[");
		sb.append(head.data);
		Node<TObject> temp = head;
		while (temp.next != null) {
			temp = temp.next;
			sb.append(", ");
			sb.append(temp.data);
		}
		sb.append("]");
		return sb.toString();
    }
}
