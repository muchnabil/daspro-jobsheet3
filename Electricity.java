import java.util.Scanner;
public class Electricity {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int kwh, total, tarif;
        boolean pemakaian;
        tarif = 1500;

        System.out.print("Masukkan kwh: ");
        kwh = input.nextInt();
        total = kwh * tarif;
        pemakaian = kwh > 500;

        System.out.println("Total tagihan anda sebesar : Rp " + total);
        if (pemakaian){
            System.out.println("Pemakaian anda melebihi 500 kwh ");
        }else{
            System.out.println("Pemakaian anda kurang dari 500 kwh ");
        }
    }
}