import java.util.Scanner;
class Practice4
{
  public static void main(String[] args)
  {
    Scanner key = new Scanner(System.in);
    int uang = key.nextInt();
    int seratus = uang/100000;
    int sisa = uang % 100000;
    int limapuluh = sisa/50000;
    sisa = sisa % 50000;
    int duapuluh = sisa/20000;
    sisa = sisa%20000;
    int sepuluh = sisa/10000;
    sisa = sisa%10000;
    int limaribu= sisa/5000;
    sisa = sisa%5000;
    int duaribu = sisa/2000;
    sisa = sisa%2000;
    int seribu = sisa / 1000;


    System.out.printf("uang 100.000 = %d lembar %n",seratus);
    System.out.printf("uang 50.000  = %d lembar %n",limapuluh);
    System.out.printf("uang 20.000  = %d lembar %n",duapuluh);
    System.out.printf("uang 10.000  = %d lembar %n",sepuluh);
    System.out.printf("uang 5.000   = %d lembar %n",limaribu);
    System.out.printf("uang 2.000   = %d lembar %n",duaribu);
    System.out.printf("uang 1.000   = %d lembar %n",seribu);
  }

}
