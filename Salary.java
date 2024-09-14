import java.util.Scanner;
public class Salary {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double jamUpah, gajiKotor, gajiBersih, bonus, gajisebelumPajak, pajak;
        int jamKerja;

        System.out.print("Masukkan total jam kerja anda di bulan ini : ");
        jamKerja = input.nextInt();
        System.out.print("Masukkan upah anda perjam kerja : Rp ");
        jamUpah = input.nextDouble();

        gajiKotor = jamKerja * jamUpah;
        bonus = gajiKotor * 0.1;
        gajisebelumPajak = gajiKotor + bonus;
        pajak = gajisebelumPajak * 0.05;
        gajiBersih = gajisebelumPajak - pajak;

        System.out.println("Bonus : Rp " + bonus);
        System.out.println("Pajak : Rp " + pajak);
        System.out.println("Gaji bulan ini : Rp " + gajiBersih );
    }
}
