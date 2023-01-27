class Outer{
    int a;
    public void show(){

    }
    static class Inner{
        public void display(){
            System.out.println(" In display ");
        }
    }
}


public class InnerDemo{

    //variable,method

    public static void main(String [] args){ 
        Outer obj=new Outer();
        obj.show();
        Outer.Inner obj1=new Outer.Inner(); //LHS is data type and RHS is object of Inner type, in case of static class we don't need an object so we can use syntax like outer.inner()
        obj1.display();
    }
}