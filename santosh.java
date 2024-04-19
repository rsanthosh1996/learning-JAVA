
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


///String class and methods 
class demo {
    public static void main(String args[])
{
    String str = new String("hello");
    System.out.println(str);
}
}

//concate method 
class demo {
    public static void main(String args[]) {
        String str = new String("hello");
        str = str.concat("welcome"); // Added semicolon here
        System.out.println(str);
    }
}

//length of string , indexOf

class demo {
    public static void main(String args[]) {
        String str = new String("hello");
        System.out.println(str);
        System.out.println(str.length());
        System.out.println(str.indexOf("h"));
    }
}

//string buffer class
in this class objects are muttable but in string class the object are not modifiable .

class StringBufferExample {
    public static void main(String args[]) {
        StringBuffer str = new StringBuffer("welcome");
        System.out.println(str);   
        System.out.println(str.append("java"));
        System.out .println(str.insert(4,"hi"));
    }
}


//Overloading 
constructor, method ,operator overloading.-------polymorphism(executing same in diff ways 
-- in c not two functions will have same name.
in java same name allowed in function with diff parameters.
const overloading - defualt ,parametraized 
operator -- + add or concatenation.

