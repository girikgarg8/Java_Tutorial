class Calculator{ //superclass,parent class, base class
    public int add(int i,int j){
        return i+j;
    }
}

class CalcAdv extends Calculator{ //subclass,child class,derived class
    public int sub(int i,int j){
        return i-j;
    }
}

class CalcVeryAdv extends CalcAdv{
    public int multi(int i,int j){
        return i*j;
    }
}
public class InheritanceDemo {
    public static void main(String[] args) {
        CalcAdv c1 = new CalcAdv();
        int result = c1.add(5, 4);
        int result2 = c1.sub(9, 4);
        System.out.println(result);
        System.out.println(result2);
    }
}
