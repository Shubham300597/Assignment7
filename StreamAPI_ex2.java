package assignment7;

import java.util.ArrayList;
import java.util.List;

class Student1
{

	public Student1(int id, String name, double mathmarks)
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
public class StreamAPI_ex2 {

	public static void main(String[] args) {

List<Student1> sdata=new ArrayList<>();
		
		sdata.add(new Student1(100,"Shubham",85));
		sdata.add(new Student1(101,"Rohit",55));
		sdata.add(new Student1(102,"Kushal",67));
		sdata.add(new Student1(103,"Abhi",71));
		sdata.add(new Student1(104,"Raj",81));
		sdata.add(new Student1(105,"Akash",30));
		
		Student1 maxmark=sdata.stream().max((m1,m2)->m1.getMathmarks()>m2.getMathmarks()?1:-1).get();
		System.out.println("Maximum mark:"+maxmark.getMathmarks());

		Student1 minmark=sdata.stream().min((m1,m2)->m1.getMathmarks()>m2.getMathmarks()?1:-1).get();
		System.out.println("Minimum mark:"+minmark.getMathmarks());

	}

}
