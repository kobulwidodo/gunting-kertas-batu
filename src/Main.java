import java.util.Scanner;
import java.util.Random;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException, InterruptedException {

        Scanner userInput = new Scanner(System.in);

        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();

        System.out.println("==  SELAMAT DATANG DI GAME ==");
        Thread.sleep(1000);
        System.out.println("==   GUNTING BATU KERTAS   ==");
        Thread.sleep(1000);
        System.out.println("");

        System.out.printf("Masukan Nama Kamu : ");
        String inputNama = userInput.next();
        System.out.println("");
        Thread.sleep(1000);

        System.out.println("Halo, " + inputNama + " Semoga beruntung ^^");
        int pointUser;
        int pointKomp;
        pointUser = 0;
        pointKomp = 0;

        while (pointKomp < 3 && pointUser < 3){
            Thread.sleep(1000);
            System.out.printf("Point sementara : Kamu %d - %d Komputer\n",pointUser,pointKomp);
            System.out.println("");

            Thread.sleep(1000);
            System.out.printf("1. Gunting\n2. Kertas\n3. Batu\n");
            System.out.println("");
            Thread.sleep(1000);
            System.out.print("Masukan Pilihan Kamu : ");
            int inputPilihan = userInput.nextInt();
            System.out.println("");

            switch (inputPilihan){
                case 1:
                    String pilihanUser1 = "Gunting";
                    Thread.sleep(1000);
                    System.out.println("Pilihan Kamu     : " + pilihanUser1);
                    Thread.sleep(1000);

                    String[] pilihanTersedia1 = {"Gunting", "Batu", "Kertas"};
                    Random random1 = new Random();
                    int pilihanKomputer1 = random1.nextInt(pilihanTersedia1.length);
                    String pilihanFinal1 = pilihanTersedia1[pilihanKomputer1];
                    System.out.println("Pilihan Komputer : " + pilihanFinal1);
                    Thread.sleep(1000);

                    if (pilihanUser1.equals(pilihanFinal1)){
                        System.out.println("Pilihannya sama, coba lagi yuk");
                        Thread.sleep(1000);
                        System.out.println("");
                        System.out.println("=====================================");
                        System.out.println("");
                    } else {
                        if (pilihanFinal1.equals("Batu")){
                            System.out.println("Yah kamu kalah :((");
                            Thread.sleep(1000);
                            System.out.println("");
                            System.out.println("=====================================");
                            System.out.println("");
                            pointKomp++;
                        } else if (pilihanFinal1.equals("Kertas")){
                            System.out.println("Yuhu kamu menang!!");
                            Thread.sleep(1000);
                            System.out.println("");
                            System.out.println("=====================================");
                            System.out.println("");
                            pointUser++;
                        }
                    }
                    break;
                case 2:
                    String pilihanUser2 = "Kertas";
                    Thread.sleep(1000);
                    System.out.println("Pilihan Kamu     : " + pilihanUser2);
                    Thread.sleep(1000);

                    String[] pilihanTersedia2 = {"Gunting", "Batu", "Kertas"};
                    Random random2 = new Random();
                    int pilihanKomputer2 = random2.nextInt(pilihanTersedia2.length);
                    String pilihanFinal2 = pilihanTersedia2[pilihanKomputer2];
                    System.out.println("Pilihan Komputer : " + pilihanFinal2);
                    Thread.sleep(1000);

                    if (pilihanUser2.equals(pilihanFinal2)){
                        System.out.println("Pilihannya sama, coba lagi yuk");
                        Thread.sleep(1000);
                        System.out.println("");
                        System.out.println("=====================================");
                        System.out.println("");
                    } else {
                        if (pilihanFinal2.equals("Gunting")){
                            System.out.println("Yah kamu kalah :((");
                            Thread.sleep(1000);
                            System.out.println("");
                            System.out.println("=====================================");
                            System.out.println("");
                            pointKomp++;
                        } else if (pilihanFinal2.equals("Batu")){
                            System.out.println("Yuhu kamu menang!!");
                            Thread.sleep(1000);
                            System.out.println("");
                            System.out.println("=====================================");
                            System.out.println("");
                            pointUser++;
                        }
                    }
                    break;
                case 3:
                    String pilihanUser3 = "Batu";
                    Thread.sleep(1000);
                    System.out.println("Pilihan Kamu     : " + pilihanUser3);
                    Thread.sleep(1000);

                    String[] pilihanTersedia3 = {"Gunting", "Batu", "Kertas"};
                    Random random3 = new Random();
                    int pilihanKomputer3 = random3.nextInt(pilihanTersedia3.length);
                    String pilihanFinal3 = pilihanTersedia3[pilihanKomputer3];
                    System.out.println("Pilihan Komputer : " + pilihanFinal3);
                    Thread.sleep(1000);

                    if (pilihanUser3.equals(pilihanFinal3)){
                        System.out.println("Pilihannya sama, coba lagi yuk");
                        Thread.sleep(1000);
                        System.out.println("");
                        System.out.println("=====================================");
                        System.out.println("");
                    } else {
                        if (pilihanFinal3.equals("Gunting")){
                            System.out.println("Yuhu kamu menang!!");
                            Thread.sleep(1000);
                            System.out.println("");
                            System.out.println("=====================================");
                            System.out.println("");
                            pointUser++;
                        } else if (pilihanFinal3.equals("Kertas")){
                            System.out.println("Yah kamu kalah :((");
                            Thread.sleep(1000);
                            System.out.println("");
                            System.out.println("=====================================");
                            System.out.println("");
                            pointKomp++;
                        }
                    }
                    break;
            }
        }
        if (pointKomp == 3){
            System.out.printf("Hasil akhir = Kamu %d - %d Komputer\n",pointUser,pointKomp);
            Thread.sleep(1000);
            System.out.println("Komputer menang, kamu kalah hahahaha");
        } else {
            System.out.printf("Hasil akhir = Kamu %d - %d Komputer\n",pointUser,pointKomp);
            Thread.sleep(1000);
            System.out.println("Selamat, kamu memenangkan game ini!!!!");
        }
    }
}
