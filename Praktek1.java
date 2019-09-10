import java.util.Scanner;
class Praktek1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int nilai = sc.nextInt();
        if (nilai %2==0){
            System.out.println(nilai + "genap");

        }
        else{
            System.out.println(nilai + "ganjil");

        }
        if (nilai > 10){
            System.out.println("lebih dari 10");
        
        }
        else{
            System.out.println("kurang dari 10");
        }
    }

}