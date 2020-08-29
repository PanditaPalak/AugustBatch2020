package constructorsDemo;

import java.util.Scanner;

public class StudentMains {

	public static void main(String[] args) {
       
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("ENter name: ");
		String name = sc.next();
		
		System.out.println("ENter marks of "+name+" : ");
		int marks = sc.nextInt();
		
		Student student = new Student(name,marks);
		student.display();
		

	    
	}

}











//ist step: object creation of that class
//2nd step: method calling using object
/*//  new Student();//constructor callling part
		
          new Student(10);
          //object gets created --refernce variable --no name explicitly
        
        Student student3 = new Student(20, 66);
        //object get created -- reference variable --student3*/