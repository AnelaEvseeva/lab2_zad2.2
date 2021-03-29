import java.util.Scanner;

public class Main{
    public static String str = "";
    public static Scanner sc;

    public static String decToBin(int n){
        if(n/2!=0){
            decToBin(n/2);
        }
        str = str.concat(Integer.toString(n%2));
        return str;
    }

    public static void main(String[] args){
        sc = new Scanner(System.in);
        System.out.print("n = ");
        int n = sc.nextInt();
        System.out.println(decToBin(n));
    }
}