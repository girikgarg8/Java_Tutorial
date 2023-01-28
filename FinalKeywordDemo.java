final class A{
    final int DAY=0; //constant, this value cannot be changed
    final int DATE;
    public A(){
        //DAY=10;
        DATE=9;
    }
    public void show(){
        System.out.println("In show");
    }
}

// class B extends A{

// }

class B{
    public final void show() {
        System.out.println("In show");
    }
}
// class C extends B{
//     public void show() {}
// }


public class FinalKeywordDemo {
    public static void main(String[] args) {
        A obj=new A();
        System.out.println(obj.DATE);
    }
}
