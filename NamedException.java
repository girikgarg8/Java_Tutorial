import java.io.BufferedReader;
import java.io.InputStreamReader;

//Buffered Reader
//Scanner
public class NamedException {
    public static void main(String[] args){
        System.out.println("Enter a number");
        BufferedReader br=null;
        int n=0;
        try{
            br = new BufferedReader(new InputStreamReader(System.in));
            n=Integer.parseInt(br.readLine());
        }
        catch(Exception e){
            System.out.println(e);
        }
        finally{
            try{
                br.close();
            }
            catch(Exception e){
                System.out.println("Exceptoion encounmterd while trying to close buffer ");
            }
        }
        System.out.println(n);
    }
}
