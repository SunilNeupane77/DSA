import java.util.Scanner;
class GCD {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Two numbers :");
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        System.out.println(gcd(n1, n2));
    }
    public static int gcd(int n1,int n2){
        if(n1==0){
            return n2;
        }
        else{
            return gcd(n2%n1, n1);
        }
    }
}