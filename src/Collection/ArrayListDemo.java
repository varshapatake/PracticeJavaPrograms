package Collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {

	public static void main(String[] args) {
		//non generic ArrayList
		ArrayList al=new ArrayList();
		al.add(1234);
		al.add("varsha");
		al.add(12.34);
		
		for(int i=0;i<al.size();i++)
		{
			System.out.println(al.get(i));
		}
		
		//generic ArrayList
		ArrayList<String> als=new ArrayList<String>();
		als.add("pallavi");
		als.add("rani");
		als.add("peter");
		System.out.println(als);
		
		//using for loop
		System.out.println("******using for loop*******");
		for(int i=0;i<als.size();i++)
		{
			System.out.println(als.get(i));
		}
		//using iterator
		System.out.println("******using iterator*******");
		Iterator<String> it=als.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		
		//using advance for loop
		System.out.println("******using advance for loop*******");
		for(String  str:als){
			System.out.println(str);
		}
		//using while loop
		System.out.println("******using while loop*******");
		int num=0;
		while(als.size()>num)
		{
			System.out.println(als.get(num));
			num++;
		}
		
		//storing objects in ArrayList
		System.out.println("*****storing array in array list*****");
		Employee e1=new Employee("kalyani",21,"QA");
		Employee e2=new Employee("kavita",21,"Dev");
		Employee e3=new Employee("varsha",21,"QA");
		
		ArrayList<Employee> eo=new ArrayList<Employee>();
		eo.add(e1);
		eo.add(e2);
		eo.add(e3);
		
		Iterator<Employee> ite=eo.iterator();
		while(ite.hasNext()){
			Employee emp=ite.next();
			System.out.println(emp.name);
			System.out.println(emp.age);
			System.out.println(emp.prof);
			
		//addAll
			System.out.println("******addAll example********");
			ArrayList<String> al1=new ArrayList<String>();
			al1.add("selenium");
			al1.add("QA");
			al1.add("Dev");
			
			ArrayList<String> al2=new ArrayList<String>();
			al2.add("selenium");
			al2.add("supriya");
			al2.add("kartik");
			
			al1.addAll(al2);
			for(int i=0;i<al1.size();i++){
				System.out.println(al1.get(i));	
			}
			
		//removeAll
			System.out.println("******removeAll example********");
			al1.removeAll(al2);
			for(int j=0;j<al1.size();j++){
				System.out.println(al1.get(j));
			}
				
		//retainAll (find out common values)
			ArrayList<String> al3=new ArrayList<String>();
			al3.add("selenium");
			al3.add("QA");
			al3.add("Dev");
				
			ArrayList<String> al4=new ArrayList<String>();
			al4.add("selenium");
			al4.add("QA");
			al4.add("kartik");
			
			System.out.println("******retain All example*****");
			al3.retainAll(al4);
			for(int j=0;j<al3.size();j++){
				System.out.println(al1.get(j));	
				}
			
		}
			
	}

}
