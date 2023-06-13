package phone;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        //membuat objek hp
        phone xia = new xiaomi();
        phone sm = new samsung();
        phone opp = new oppo();
        phone ip = new iPhone();

        //membuta objek user
        userPhone a = new userPhone(xia);
        userPhone b = new userPhone(sm);
        userPhone c = new userPhone(opp);
        userPhone d = new userPhone(ip);

        //coba nyalakan hp
        //a.turnOnThePhone();
        //b.turnOnThePhone();
        //c.turnOnThePhone();
        //d.turnOnThePhone();
        Scanner input = new Scanner(System.in);
        String aksi;
        String hp;

        while (true) {
            System.out.println("/// JENIS HP ///");
            System.out.println("[1] XIAOMI");
            System.out.println("[2] SAMSUNG");
            System.out.println("[3] OPPO");
            System.out.println("[4] iPHONE");
            System.out.println("[0] Keluar");
            System.out.println("============================");
            System.out.print("Pilih jenis> ");
            hp = input.nextLine();

            if (hp.equalsIgnoreCase("1")) {
                a.turnOnThePhone();
                while (true) {
                    System.out.println("/// APLIKASI INTERFACE ///");
                    System.out.println("[1] Nyalakan HP");
                    System.out.println("[2] Matikan HP");
                    System.out.println("[3] Besarkan Volume");
                    System.out.println("[4] Kecilkan Volume");
                    System.out.println("[0] Keluar");
                    System.out.println("============================");
                    System.out.print("Pilih aksi> ");
                    aksi = input.nextLine();

                    if (aksi.equalsIgnoreCase("1")) {
                        a.turnOnThePhone();
                    } else if (aksi.equalsIgnoreCase("2")) {
                        a.turnOffThePhone();
                    } else if (aksi.equalsIgnoreCase("3")) {
                        a.makePhoneLouder();
                    } else if (aksi.equalsIgnoreCase("4")) {
                        a.makePhoneSilent();
                    } else if (aksi.equalsIgnoreCase("0")) {
                        System.exit(0);
                    } else {
                        System.out.println("Pilihan tidak tersedia");
                    }
                }
            } else if (hp.equalsIgnoreCase("2")) {
                b.turnOnThePhone();
                while (true) {
                    System.out.println("/// APLIKASI INTERFACE ///");
                    System.out.println("[1] Nyalakan HP");
                    System.out.println("[2] Matikan HP");
                    System.out.println("[3] Besarkan Volume");
                    System.out.println("[4] Kecilkan Volume");
                    System.out.println("[0] Keluar");
                    System.out.println("============================");
                    System.out.print("Pilih aksi> ");
                    aksi = input.nextLine();

                    if (aksi.equalsIgnoreCase("1")) {
                        b.turnOnThePhone();
                    } else if (aksi.equalsIgnoreCase("2")) {
                        b.turnOffThePhone();
                    } else if (aksi.equalsIgnoreCase("3")) {
                        b.makePhoneLouder();
                    } else if (aksi.equalsIgnoreCase("4")) {
                        b.makePhoneSilent();
                    } else if (aksi.equalsIgnoreCase("0")) {
                        System.exit(0);
                    } else {
                        System.out.println("Pilihan tidak tersedia");
                    }
                }

            } else if (hp.equalsIgnoreCase("3")) {
                c.turnOnThePhone();
                while (true) {
                    System.out.println("/// APLIKASI INTERFACE ///");
                    System.out.println("[1] Nyalakan HP");
                    System.out.println("[2] Matikan HP");
                    System.out.println("[3] Besarkan Volume");
                    System.out.println("[4] Kecilkan Volume");
                    System.out.println("[0] Keluar");
                    System.out.println("============================");
                    System.out.print("Pilih aksi> ");
                    aksi = input.nextLine();

                    if (aksi.equalsIgnoreCase("1")) {
                        c.turnOnThePhone();
                    } else if (aksi.equalsIgnoreCase("2")) {
                        c.turnOffThePhone();
                    } else if (aksi.equalsIgnoreCase("3")) {
                        c.makePhoneLouder();
                    } else if (aksi.equalsIgnoreCase("4")) {
                        c.makePhoneSilent();
                    } else if (aksi.equalsIgnoreCase("0")) {
                        System.exit(0);
                    } else {
                        System.out.println("Pilihan tidak tersedia");
                    }
                }
            } else if (hp.equalsIgnoreCase("4")) {
                d.turnOnThePhone();
                while (true) {
                    System.out.println("/// APLIKASI INTERFACE ///");
                    System.out.println("[1] Nyalakan HP");
                    System.out.println("[2] Matikan HP");
                    System.out.println("[3] Besarkan Volume");
                    System.out.println("[4] Kecilkan Volume");
                    System.out.println("[0] Keluar");
                    System.out.println("============================");
                    System.out.print("Pilih aksi> ");
                    aksi = input.nextLine();

                    if (aksi.equalsIgnoreCase("1")) {
                        d.turnOnThePhone();
                    } else if (aksi.equalsIgnoreCase("2")) {
                        d.turnOffThePhone();
                    } else if (aksi.equalsIgnoreCase("3")) {
                        d.makePhoneLouder();
                    } else if (aksi.equalsIgnoreCase("4")) {
                        d.makePhoneSilent();
                    } else if (aksi.equalsIgnoreCase("0")) {
                        System.exit(0);
                    } else {
                        System.out.println("Pilihan tidak tersedia");
                    }
                }
            } else {
                System.out.println("Pilihan tidak tersedia");
            }
        }
    }
}
