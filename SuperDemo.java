class A{
    public A(){
        System.out.println("in A constructor");
    }
    public A(int i){
        System.out.println("in A int");
    }
    public void show(){
        System.out.println("in A");
    }
}
class B extends A{
    public B(){
        //super(5);
        System.out.println("in B constructor");
    }
    public B(int i){
        //super(i);
        System.out.println("in B int");
    }
    @Override
    public void show(){
        System.out.println("in B");
    }
    public void config(){
        System.out.println ("in config");
    }
}
class C extends A{
    public void show(){
        System.out.println("in C");
    }
}
public class SuperDemo { 
    public static void main(String[] args) {
        // A obj1=new A();
        // B obj2=new B(5);
        // B obj3=new B();
        A obj1=new B();  //binding takes place at runtime only
        obj1.show();
        //obj1.config();
        obj1=new C(); //refernce is still of A, but I am putting object of C
        obj1.show();
    }
}
