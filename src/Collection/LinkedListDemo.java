package Collection;
import java.util.*;

public class LinkedListDemo {

	public static void main(String[] args) {
		LinkedList<String> ll=new LinkedList<String>();
		//add
		ll.add("test");
		ll.add("qtp");
		ll.add("selenium");
		ll.add("RFT");
		System.out.println("content of linked lis:"+ll);
		
		//addFirst
		ll.addFirst("varsha");
		System.out.println(ll);
		
		//addLast
		ll.addLast("sanika");
		System.out.println(ll);
		
		//get element at specified location
		System.out.println("element at index 0 : "+ll.get(0));
		
		//removeFirst
		ll.removeFirst();
		System.out.println(ll);
		
		//removeLast
		ll.removeLast();
		System.out.println(ll);
		
		//remove element at specified location
		
		ll.remove(0);
		System.out.println(ll);
		
		//printing using different methods
		//using for loop
		System.out.println("*******using for loop*******");
		for(int i=0;i<ll.size();i++){
			System.out.println(ll.get(i));
		}
		//using advance for loop
		System.out.println("********using adavance for loop*****");
		for(String str:ll){
			System.out.println(str);
		}
		//using iterator
		System.out.println("********using iterator*******");
		Iterator<String> it=ll.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		//using while loop
		System.out.println("******using while loop********");
		int num=0;
		while(ll.size()>num){
			System.out.println(ll.get(num));
			num++;
		}

	}	

}
