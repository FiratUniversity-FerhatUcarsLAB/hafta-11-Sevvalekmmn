Ad Soyad: Şevval Ekmen
Öğrenci No: 250541080

  public class Exercise4_2 { // 1

    // Her satirin sonuna çalisma sirasi yorumlarini ekleyin. // 2

    public static void main(String[] args) { // 3
        zippo("rattle", 13); // 4
    } // 5

    public static void baffle(String blimp) { // 6
        System.out.println(blimp); // 7
        zippo("ping", -5); // 8
    } // 12

    public static void zippo(String quince, int flag) { // 9
        if (flag < 0) { // 10
            System.out.println(quince + " zoop"); // 11
        } else { // 13
            System.out.println("ik"); // 14
            baffle(quince); // 15
            System.out.println("boo-wa-ha-ha"); // 16
        } // 17
    } // 18
} // 19
