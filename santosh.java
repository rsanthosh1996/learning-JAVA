
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

 -- constructor overloading 
class demo {
    demo() {
        System.out.println("hello");
    }

    demo(int a) {
        System.out.println("a=" + a);
    }
}

public class demo1 {
    public static void main(String args[]) {
        demo a1 = new demo();
        demo a2 = new demo(3);
    }
}

/// methods overloader 


class a {
    void display(){
        System.out.println("err");
    }
    void display(int b){
        System.out.println(+b);
    }
}
public class c {
    public static void main (String args[]){
        a str=new a();
        str.display();
        str.display(12);
    }
}

//Operator overloader 
class demo{
    int a =13;
    int b =12;
    public  static void main (String args[]){
        demo obj = new demo();
        System.out.println("a+b="+(obj.a+obj.b)); // for sum use braket.
    }
}  

class demo{
    int a =13;
    int b =12;
    public  static void main (String args[]){
        demo obj = new demo();
        System.out.println("a+b="+obj.a+obj.b);// for concatnate dont use brackets 
    }
}  


///This key word . -- when we have instance and local variable have same name ,local variable will be given preference .
so we can use this key where instance variable will be printed.

class demo{
    int a = 10;
    void display(){
        int a = 20;
        System.out.println(this.a);
    }
    public static void main(String args[]){
        demo obj = new demo();
        obj.display();
    }
}

///Inheritance 
parent cant access method and variables of child class but reverse can happen 
use extends key word 
types --  single,multiple ,hierarcchy inheritance 
single-- one base class and one child class 
multiple -- base (parent) --- derived (P) --- drived (c)
hierarchy --- base -- derived\derived.

multiple?? and hybrid inheritance cant be achieved in java.but can be achieved by interfaces.

//Single inheritance code 

class parent {
    int a = 10;
    void display(){
        System.out.println("hi");
    }
    
}

class child extends parent{
    int b= 30;
    void wow(){
        System.out.println("ro");
    }
}
public class jam{
    public static void main(String args[]){
        child obj= new child();
        System.out.println(obj.b);
        System.out.println(obj.a);
        obj.display();
        obj.wow();
        
    }
}

// alternate code.

class parent {
    int a = 10;
    void display(){
        System.out.println("hi");
    }
    
}

public class child extends parent{
    int b= 30;
    void wow(){
        
        System.out.println("ro");
    }
    public static void main(String args[]){
        child obj= new child();
        System.out.println(obj.b);
        System.out.println(obj.a);
        obj.display();
        obj.wow();
}
}

// multi level inheritance

    class Parent {
    int a = 10;
    void display() {
        System.out.println("hi");
    }
}

 class Child extends Parent {
    int b = 20;

    void wow() {
        System.out.println("ji");
    }
}

  public class GChild extends Child {
    int c = 30;
    void fun() {
        System.out.println("yo");
    }
    public static void main(String[] args) {
        GChild v = new GChild();
        v.wow();
        v.fun();
        v.display();
        System.out.println(v.a);
        System.out.println(v.b);
        System.out.println(v.c);
    }
} 

//hirarchical inheritance
class parent {
    int a=10;
    void display(){
        System.out.println("hi");
    }
}

class child1 extends parent {
    int b=100;
    void wow(){
        System.out.println("ji");
    }
}
    
    class child2 extends parent {
    int c=101;
    void woe(){
        System.out.println("ki");
    }
    }
    
    public class hierarchy {
    public static void main(String args[]){
        child1 obj1=new child1();
        obj1.display();
        System.out.println(obj1.a);
        child2 obj2 =new child2();
        obj2.display();
        System.out.println(obj2.c);
    }
}

