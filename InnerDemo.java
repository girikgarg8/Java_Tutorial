class Outer{
    int a;
    public void show(){

    }
    class Inner{
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
        Outer.Inner obj1=obj.new Inner(); //LHS is data type and RHS is object of Inner type
        obj1.display();
    }
}