package a.b;

public class Student {

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Student(String name) {
		super();
		this.name = name;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Student [name=" + name + "]";
	}
	public void init()
	{
		System.out.println("i m in method");
	}
	public void destroy()
	{
		System.out.println("i m in destroy");
	}
	
	
}
