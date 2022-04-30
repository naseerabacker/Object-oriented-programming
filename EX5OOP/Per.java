/*Create a class ‘Person’ with data members Name, Gender, Address, Age and a
constructor to initialize the data members and another class ‘Employee’ that inherits
the properties of class Person and also contains its own data members like Empid,
Company_name, Qualification, Salary and its own constructor. Create another class
‘Teacher’ that inherits the properties of class Employee and contains its own data
members like Subject, Department, Teacherid and also contain constructors and
methods to display the data members. Use array of objects to display details of N
teachers*/


import java.util.*;
class Person
{
    String Name,Gender,Address;
    int Age;
    Person(String na,String gen,String add,int age)
    {
        Name=na;
        Gender=gen;
        Address=add;
        Age=age;
    }
}

class Employee extends Person
{
    int Empid;
    String company_name,Qualification;
    float salary;
    Employee(String na,String gen,String add,int age,int id,String cname,String quali,float sal)
    {
        super(na,gen,add,age);
        Empid=id;
        company_name=cname;
        Qualification=quali;
        salary=sal;
    }
}

class Teacher extends Employee
{
    String Subject,Department;
    int Teacher_id;
    Teacher(String na,String gen,String add,int age,int id,String cname,String quali,float sal,String sub,String dpt,int tid)
    {
        super(na,gen,add,age,id,cname,quali,sal);
        Subject=sub;
        Department=dpt;
        Teacher_id=tid;
    }


void display(int i)
{
  System.out.println("\nDetails of teacher no : " + (i+1));
  System.out.println("Person name= " + Name);
  System.out.println("Gender= " + Gender);
  System.out.println("Address= " + Address);
  System.out.println("Age= " + Age);
  System.out.println("Employee id= " + Empid);


  System.out.println("Company Name= " + company_name);
  System.out.println("Qualification= " + Qualification);        
  System.out.println("Salary= " + salary );
  System.out.println("Subject= " + Subject);
  System.out.println("Department= " + Department);
  System.out.println("Teacher id= " + Teacher_id);
 }
}

class Per
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the number of teachers: ");
        int n =in.nextInt();
       
        Teacher obj[]=new Teacher[n];  

	for(int i=0;i<n;i++)
	{
	System.out.println("Enter details of teacher no : " + (i+1));

	System.out.println("Enter person name: ");
	String na=in.next();

	System.out.println("Enter gender : ");
	String gen=in.next();

	System.out.println("Enter employee address : ");
	String add=in.next();

	System.out.println("Enter employee age: ");
	int age=in.nextInt();

	System.out.println("Enter employee id : ");
	int id=in.nextInt();

	System.out.println("Enter company name : ");
	String cname=in.next();

	System.out.println("Enter qualification : ");
	String quali=in.next();

	System.out.println("Enter employee salary : ");
	float sal=in.nextFloat();

	System.out.println("Enter subject : ");
	String sub=in.next();

	System.out.println("Enter department : ");
	String dpt=in.next();


	System.out.println("Enter teacher id : ");
	int tid=in.nextInt();

	System.out.println("------------\n");

	obj[i] = new Teacher(na,gen,add,age,id,cname,quali,sal,sub,dpt,tid);

	}
        System.out.println("Details of employee\n");
        for(int i=0;i<n;i++)
        {
            obj[i].display(i);
        }
    }
}
