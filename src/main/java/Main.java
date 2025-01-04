package niva;

public class ListLvl2 {
public static Node exc1(Node<Integer>l1,Node<Integer>l2) {
	Node<Integer>order=new Node<>(0);
	Node<Integer>current=order;
	while(l1.hasNext()&&l2.hasNext()) {
		if(l1.getValue().compareTo(l2.getValue())<=0) {
			Node<Integer>n=new Node<>(l1.getValue());
			current.setNext(n);
			l1=l1.getNext();
			}
		else {
			Node<Integer>m=new Node<>(l2.getValue());
			current.setNext(m);
			l2=l2.getNext();
		}
		current=current.getNext();
		
			
	}
	if(l1.hasNext()) {
		current.setNext(l1);
	}
	else if(l2.hasNext()){
		current.setNext(l2);
}
	return order.getNext();
}
public static Node exc2(Node<Integer>head) {
        Node<Integer> sortedList = null; 
        Node<Integer> current = head;     

       
        while (current != null) {
            Node<Integer> minNode = current;  
            Node<Integer> prevMinNode = null;  
            Node<Integer> prevCurrent = null;  

            
            Node<Integer> temp = current;
            while (temp != null) {
                if (temp.getValue() < minNode.getValue()) {
                    minNode = temp;
                    prevMinNode = prevCurrent; 
                }
                prevCurrent = temp;
                temp = temp.getNext();
            }

            
            if (minNode != current) {
                if (prevMinNode != null) {
                    prevMinNode.setNext(minNode.getNext());  
                }
            } else {
          
                current = current.getNext();
            }

           
            if (sortedList == null) {
                sortedList = minNode;
            } else {
                Node<Integer> tempSorted = sortedList;
                while (tempSorted.getNext() != null) {
                    tempSorted = tempSorted.getNext();  
                }
                tempSorted.setNext(minNode);  
            }
        }

        return sortedList; 
    }
public static boolean exc4(Node<Integer>head) {
	Node<Integer> current = head;
	Node<Integer> first = head;
	boolean bool=true;
	while(current.hasNext()) {
		while(first.hasNext()) {
			if(current.getValue().equals(first.getNext().getValue())) 
				bool=false;
			else {
				first=first.getNext();
			}
		}
		first=head;
	}
	return bool;
}
public static Node exc5(Node<Integer>head) {
	Node<Integer> current = head;
	Node<Integer> first = head;
	while(current.hasNext()) {
		while(first.hasNext()) {
			if(current.getValue().equals(first.getNext().getValue())) 
				first.setNext(first.getNext().getNext());
			else {
				first=first.getNext();
			}
		}
		first=head;
	}
	return head;
}
public static void main(String[] args) {
	Node<Integer>l1=new Node<>(6);
	Node<Integer>order1=new Node<>(3);
	Node<Integer>order2=new Node<>(2);
	Node<Integer>order3=new Node<>(5);
	Node<Integer>order4=new Node<>(4);
	l1.setNext(order1);
	order1.setNext(order2);
	order2.setNext(order3);
	order3.setNext(order4);
	Node<Integer>l2=new Node<>(0);
	Node<Integer>rder1=new Node<>(1);
	Node<Integer>rder2=new Node<>(2);
	Node<Integer>rder3=new Node<>(3);
	Node<Integer>rder4=new Node<>(4);
	l2.setNext(rder1);
	rder1.setNext(rder2);
	rder2.setNext(rder3);
	rder3.setNext(rder4);
	System.out.println(exc5(l1));
}
}
