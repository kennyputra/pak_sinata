import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;

public class tugas1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("masukan nilai baterai anda (0-100): ");
        int baterai = input.nextInt();

        if(baterai ==100 && baterai >= 75) {
            System.out.println("baterai full ("+ baterai + "%)");
        }else if (baterai >=50) {
            System.out.println("hampir penuh ("+ baterai + "%)");
        }else if (baterai >= 25) {
            System.out.println("Baterai tinggal 25%(" + baterai +"%)");
        }else {
            System.out.println("batrai hampir habis (" + baterai +"%)");
        }
    }
}