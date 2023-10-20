package exercises;

// Upcasting and downcasting in Java are the two forms of typecasting. The purpose of typecasting is to enable a function in a program to process the variables correctly. Upcasting refers to typecasting a child object to a parent object. Downcasting provides casting a parent object to a child object.
class Parent{
    void display(){
        System.out.println("Parent");
    }
}
class Child extends Parent{
void display(){
    System.out.println("Child");
}
}

class Printout{
    public static void main(String[] args){
        Parent obj1= (Parent) new Child();
        obj1.display(); //output: Parent
        Child obj2= (Child) new Parent();
        obj2.display(); //output: Parent
    
    }
    
}