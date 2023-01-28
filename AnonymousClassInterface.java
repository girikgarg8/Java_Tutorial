interface Abc{
    void show();
}

public class AnonymousClassInterface {
    public static void main(String[] args) {
        Abc obj=new Abc(){
            public void show(){
                System.out.println("I am the best");
            }
        };
        obj.show();
    }
}
