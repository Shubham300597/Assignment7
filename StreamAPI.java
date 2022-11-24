package assignment7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Student
{
	public Student(int id, String name, double mathmarks)
	{
		super();
		this.id = id;
		this.name = name;
		this.mathmarks = mathmarks;
	}
	public int getId()
	{
		return id;
	}
	public void setId(int id)
	{
		this.id = id;
	}
	public String getName()
	{
		return name;
	}
	public void setName(String name) 
	{
		this.name = name;
	}
	public double getMathmarks() {
		return mathmarks;
	}
	public void setMathmarks(double mathmarks) {
		this.mathmarks = mathmarks;
	}
	private int id;
	private String name;
	private double mathmarks;
}
public class StreamAPI {

	public static void main(String[] args) {
	
List<Student> sdata=new ArrayList<>();
		sdata.add(new Student(100,"Shubham",85));
		sdata.add(new Student(101,"Rohit",55));
		sdata.add(new Student(102,"Kushal",67));
		sdata.add(new Student(103,"Abhi",71));
		sdata.add(new Student(104,"Raj",81));
		sdata.add(new Student(105,"Akash",30));
		
		System.out.println("Student marks before filtering:");
		
		sdata.forEach(m->System.out.println(m.getMathmarks()));
		
		List<Student> sdata1=sdata.stream().filter(m-> m.getMathmarks()>=60 && m.getMathmarks()<=80).collect(Collectors.toList());
		System.out.println("Student marks between 60 to 80:");
		 
		sdata1.forEach(s->System.out.println(s.getMathmarks()));
		   
	}

}
