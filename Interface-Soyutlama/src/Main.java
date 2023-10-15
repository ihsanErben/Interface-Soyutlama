
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.print("kisi ismi: ");
            String isim = input.next();
            System.out.print("kisi yas: ");
            int yas = input.nextInt();

            Kisi kisi = new Kisi(isim, yas);

            Ad_yas_kontrol kontrol = new Ad_yas_kontrol();

            if (!kontrol.kontrol(kisi)) {
                System.out.println("girdiginiz bilgiler admin bilgileri ile eslesmiyor");
                continue;
            }

            System.out.println("sisteme hosgeldiniz " + kisi.getIsim() + " bey. iyi calismalar");
            return;
        }
    }
}
