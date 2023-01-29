package com.girik;
interface Writer{
    public abstract void write(); //every function in an interface is by default public abstract, so we can omit mentioning public asbtract too
}
class Pen implements Writer{

    public void write(){
        System.out.println("I am a pen ");
    }
}

class Pencil implements Writer{
    public void write(){
        System.out.println("I am a pencil");
    }
}
class Kit{
    public void doSomething(Writer p){
        p.write();
    }
}
public class InterfaceDemo{
    public static void main(String[] args) {
        Kit k=new Kit();
        Writer pen=new Pen();
        Writer pc=new Pencil();

        k.doSomething(pc);
    }
}
