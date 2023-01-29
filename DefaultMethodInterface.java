interface Demo{
    void abc();
    default void show(){
        System.out.println("In show ");
    }
}

interface MyDemo{
    default void show(){
        System.out.println(" in MyDemo show ");
    }
}
class DemoImp implements Demo,MyDemo {
    public void abc(){
        System.out.println ("in abc ");
    }
    @Override
    public void show(){
        // System.out.println(" Demo implementation ");
        MyDemo.super.show();
    }
}
public class DefaultMethodInterface {
    public static void main(String[] args) {
        Demo obj=new DemoImp();
        obj.abc();
        obj.show();
    }
}
