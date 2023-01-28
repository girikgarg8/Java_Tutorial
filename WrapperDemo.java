public class WrapperDemo {
    public static void main(String[] args) {
        // int i=5; //primitive data type 
        // Integer ii=new Integer(i); //boxing-wrapping
        // System.out.println(ii);
        // int j=ii.intValue(); //unboxing--unwrapping
        // System.out.println(j);
        // Integer value=i; //autoboxing
        // int k=value; //autounboxing

        String str="123";
        int n=Integer.parseInt(str);
        System.out.println(n);
    } 
}
