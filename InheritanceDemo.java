class Calculator{
    public int add(int i,int j){
        return i+j;
    }
}

class CalcAdv extends Calculator{
    public int sub(int i,int j){
        return i-j;
    }
}
public class InheritanceDemo {
    Calculator c1=new Calculator();
    int result=c1.add(5,4);

}
