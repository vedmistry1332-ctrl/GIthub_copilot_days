class Student{
	String name;
	int marks;
	
	Student(String n,int m){
		name=n;
		marks=m;
	}
	
	Void display(){
		System.out.println("Name : "+name);
		System.out.println("Marks :"+marks);
	}
}  
public class marks{
	public static void Main (string[] args){
		Student s1 = new Student("ved",100);
		s1.display();
	}
}