import java.util.Scanner;
public class q8 {
    public static void main(String args[]){
            Scanner sc=new Scanner(System.in);
            int hexa=sc.nextInt();
            String octal=Integer.toOctalString(hexa);
            System.out.println(octal);
        }
    }

