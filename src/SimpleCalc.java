import java.util.Scanner; /*almost forgot to import this lol */
public class SimpleCalc {
    public static void main(String[] args)  {
        Variabel var = new Variabel();

        /*tampilan utama*/
        System.out.println("\t1 - Penjumlahan \n\t2 - Pengurangan \n\t3 - Perkalian \n\t4 - Pembagian");
        System.out.print("Pilih Operasi (1/2/3/4): ");
        Scanner sc = new Scanner(System.in);
        var.operator = sc.nextInt();

        /*user input values*/
        System.out.print("Masukkan Nilai Pertama: ");
        var.n1 = sc.nextInt();
        System.out.print("Masukkan Nilai Kedua: ");
        var.n2 = sc.nextInt();

        int result = 0;
        switch (var.operator) {
            case 1:
                result = var.n1 + var.n2;
                System.out.println("Hasil dari " + var.n1 + " + " + var.n2 + " = " + result);
                break;

            case 2:
                result = var.n1 - var.n2;
                System.out.println("Hasil dari " + var.n1 + " - " + var.n2 + " = " + result);
                break;
            
            case 3:
                result = var.n1 * var.n2;
                System.out.println("Hasil dari " + var.n1 + " * " + var.n2 + " = " + result);
                break;

            case 4:
                if (var.n2 != 0) {
                    result = var.n1 / var.n2;
                    System.out.println("Hasil dari " + var.n1 + " / " + var.n2 + " = " + result);
                } else {
                    System.out.println("Error: Pembagian dengan nol tidak diperbolehkan.");
                }
                break;

            default:
                System.out.println("Operasi tidak valid.");
        }
        /*use to close the scanner object to avoid resource leaks */
        sc.close();
    }
}

/*  Nama: Muhammad Hanif Fawwaz
    NIM: 2407421052
    Kelas TMJ 3B
 */