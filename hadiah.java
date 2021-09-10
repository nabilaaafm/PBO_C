//Nabila Fortune Muslimah (202410101142)

//Problem 1 – Prime Number
//import java.util.Scanner;
//public class hadiah {
//    public static void main(String[] args) {
//    Scanner sc = new Scanner(System.in);
//    System.out.print("Masukkan bilangan : ");
//    int bilangan = sc.nextInt(), check = 0;
//    for (int i=1; i<=bilangan; i++){
//        if (bilangan%i==0){
//            check++;
//        }
//    }
//    if (check==2){
//        System.out.println("Bilangan "+bilangan+" adalah prima");
//    }else{
//        System.out.println("Bilangan "+bilangan+" adalah bukan prima");
//    }
//    }
//}

//Problem 2 – Menentukan even/odd number
//
//public class hadiah {
//    public static void main(String[] args) {
//        int angka[] = {1, 2, 3, 123124235, 43641, 263464585, 138246099, 32894702, 192832, 109273890, 109749283, 5, 1, 7, 4,
//                239097518, 283957, 984091, 9834076, 238705928, 3826750, 89743098, 23897091,
//                2836572, 3258962, 23857, 28357209, 2358720};
//
//        System.out.println("\nBilangan genap : ");
//        for (int i = 0; i < angka.length; i++) {
//            if (angka[i] % 2 == 0) {
//                System.out.print(angka[i] + ",");
//            }
//        }
//        System.out.println("\nBilangan ganjil : ");
//        for(int j = 0; j < angka.length; j++) {
//            if (angka[j] % 2 != 0) {
//                System.out.print(angka[j] + ",");
//            }
//        }
//    }
//}

//Problem 3 – Binary Search
//import java.util.Scanner;
//public class hadiah {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("{3, 2, 6, 4, 1, 17, 10, 5}\n");
//        int n = 8;
//        int a[] = {3, 2, 6, 4, 1, 17, 10, 5};
//        int awal, akhir, tengah;
//        int cari = 17;
//        awal = 0; akhir = n - 1; tengah = 0;
//        boolean dapat; dapat = false;
//
//        while ((awal <= akhir) && (dapat == false)) {
//
//            tengah = (awal + akhir) / 2;
//            if (a[tengah] == cari) {
//                dapat = true;
//            } else if (a[tengah] <= cari) {
//                awal = tengah + 1;
//            } else {
//                akhir = tengah - 1;
//            }
//        }
//        if (dapat) {
//            System.out.println("Angka " + cari + " berada di index ke- " + tengah);
//        } else {
//            System.out.println("Angka " + cari + " tidak ditemukan");
//        }
//    }
//}

//Problem 4 – Dragon of Loowater
import java.util.Scanner;
class hadiah {

    public static void main(String[] args) {
        int matrix1[][] = new int[1][2];
        matrix1[0][0] = 5;
        matrix1[0][1] = 4;

        System.out.println("input:");

        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[0].length; j++) {
                System.out.print(matrix1[i][j] + ",");
            }
            System.out.println();
        }
        int matrix2[][] = new int[1][3];
        matrix2[0][0] = 7;
        matrix2[0][1] = 8;
        matrix2[0][2] = 4;

        for (int i = 0; i < matrix2.length; i++) {
            for (int j = 0; j < matrix2[0].length; j++) {
                System.out.print(matrix2[i][j] + ",");
            }
            System.out.println();
        }
        System.out.println("Output :");

        for (int i = 0; i < matrix2.length; i++) {
            for (int j = 0; j < matrix2[0].length; j++) {
                int elem = (matrix2[0]+[2]);
                System.out.print(elem + " ");
            }
            System.out.println();
        }
    }
}
