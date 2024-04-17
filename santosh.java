code

\\ instance variable execute 

 class student 
{
String name ="santosh";
int roll =130110089;
public static void main(String args[]){
    student s1 = new student();
    System.out.println(s1.name);
}
}


\\ local variable execute

class student 
{
String name ="santosh";
int roll =130110089;
public static void main(String args[]){
    student s1 = new student();
    int b = 10;
    System.out.println("inst="+s1.name);
    System.out.println("local="+b);
}
}


// using constrcutor for return type 
class fun 
{
    String name;
    int roll;
    
    fun() {
        name = "santosh";
        roll = 123;
    }

    public static void main(String args[])
    {
        fun s1 = new fun();
        System.out.println(s1.name);
    }
}



// parametrized constructor 

class rat 
{
    String name;
    int roll;
    
    rat()
    {
        name = "sant";
        roll = 1244;
    }

    rat(String str,int n)
    {
        name = str;
        roll = n;
        
    }
    
    public static void main(String args[])
        {
            rat s1 = new rat();
            rat s2 = new rat("santosh1",1234);
            System.out.println(s1.name);
            System.out.println(s2.name);
        }
}

//static methosd and variabels and blcok

class cat{
    static String name ="santosh";
    static void display()
    {
        System.out.println("biba");
    }
    
    static 
    {
        System.out.print("ani");
    }
    
    public static void main(String args[])
    {
        System.out.println(name);
        display();
    }
}



// accessing a class inside of another class



class cat {
    
    static int a = 10;
    static void display()
    {
        System.out.print("san");
    }
}
  public class staticdemo {
     
    public static void main(String args[])
    {
        System.out.println(cat.a);
        cat.display(); 
        
    }
    
}






