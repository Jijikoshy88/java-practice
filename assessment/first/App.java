class Employee
{
int id;
String name;
float salary;
void identity()
{
System.out.println("id ="+id);
}
void nam()
{
System.out.println("name ="+name);
}
void sal()
{
System.out.println("Enter the Salary" +salary);
}
}
class App
{
public static void main(String args[])
{
Employee obj1=new Employee();
Employee obj2=new Employee();

obj1.id=1;
obj2.name="jiji";
obj1.identity();
obj2.nam();
}
}