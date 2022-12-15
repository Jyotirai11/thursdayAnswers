package jyoti;

class Myemployee
{
  String ename;
  int id;
  int esalary;
  Myemployee()
  {
	  id=0;
	  ename="Jyoti";
	  esalary=50000;
  }
  Myemployee(int i,String name,int salary)
  {
	  id=i;
	  ename=name;
	  esalary=salary;
  }
  public void display()
  {
	  System.out.println("employee name: " +ename);
	  System.out.println("employee id: "  +id);
	  System.out.println("employee salary: "+esalary);
  }
}

public class EmployeeData {

	public static void main(String[] args) {
		
	    System.out.println("the employee details are:");
	    Myemployee e1=new Myemployee(1,"Himani",15000);
	    Myemployee e2=new Myemployee(2,"Nitu",14000);
	    Myemployee e3=new Myemployee();
	    e1.display();
	    e2.display();
	    e3.display();

	}

}
