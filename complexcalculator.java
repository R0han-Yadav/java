import java.util.Scanner;
class operations
{
    public static void addition(int r1,int r2,int im1, int im2)
    {
        int R = r1 + r2;
        int IMG = im1 + im2;
        System.out.println("sum of the given complex numbers is : "+R+" +i"+IMG);
    }
    public static void subtraction(int r1, int r2, int im1, int im2)
    {
        int Q = r1 - r2;
        int W = im1 - im2;
        if (W < 0) {
            W = W * (-1); 
            System.out.println("the final ans is : "+Q+" -i"+W);
        }
        else
            System.out.println("the final ans is : "+Q+" +i"+W);
    }
    public static void multiply(int r1,int r2,int im1, int im2)
    {
        int E = r1 * r2;
        int T = im1 * im2;
        int ans = E - T;
        System.out.println("the ans is : "+ans);
    }
}
public class complexcalculator {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("enter the first complex number's real part : ");
    int real1 = sc.nextInt();
    System.out.print("enter the first complex number's imaginary part : ");
    int img1 = sc.nextInt();
    System.out.print("enter the second complex mumber's real part : ");
    int real2 = sc.nextInt();
    System.out.print("enter the second complex number's imaginary part : ");
    int img2 = sc.nextInt();
    System.out.println("first complex number :"+real1+" + i"+img1);
    System.out.println("second complex mumber :"+real2+" + i"+img2);
    System.out.println("WELCOME TO COMPLEX CALCI");
    System.out.println("->for addition press :      1");
    System.out.println("->for subtraction press :   2");
    System.out.println("->for mutiplication press : 3");
    System.out.println("->to exit press :           0");
    int n = sc.nextInt();
    //int option = sc.nextInt();
    switch (n) {
        case 1:
            operations.addition(real1, real2, img1, img2);         
            break;
        case 2:
            operations.subtraction(real1, real2, img1, img2);
            break;
        case 3:
            operations.multiply(real1, real2, img1, img2);
            break;
        case 0:
            break;
        default:
            System.out.println("pls enter again");
            break;
    }
    }
}
