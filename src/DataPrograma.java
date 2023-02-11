import java.util.Objects;
import java.util.Scanner;

public class DataPrograma {
     public static void main(String[] args) {
      Data();
}

     public static void Data()  {
        Scanner entrada = new Scanner(System.in);
        Data ano = new Data();

        System.out.println("DIGITE O DIA : \n");
        ano.dia = entrada.nextInt();

        if (ano.dia > 31) {
            do {
                System.out.println("DIGITE APENAS DIAS VÁLIDOS!\n" +
                        "DIGITE O DIA: ");
                ano.dia = entrada.nextInt();
            } while (ano.dia > 31);
        }
        System.out.println("DIGITE O MÊS : \n");
        ano.mes = entrada.nextInt();

        if (ano.mes > 12) {
            do {
                System.out.println("DIGITE APENAS MESES VÁLIDOS!\n" +
                        "DIGITE O MÊS :");
                ano.mes = entrada.nextInt();
            } while (ano.mes > 12);
        }
         System.out.println("DIGITE O ANO : \n");
         ano.ano = entrada.nextInt();

         if (ano.ano > 9999) {
             do {
                 System.out.println("DIGITE APENAS ANOS VÁLIDOS !\n" +
                         "DIGITE O ANO:");
                 ano.ano = entrada.nextInt();
             } while (ano.ano > 9999);
         }
         System.out.println("o ano que vc digitou é :");
         System.out.printf("%d/%d/%d", ano.dia, ano.mes, ano.ano);

         System.out.println("\n\nVOÇÊ DESEJA CONTINUAR? S/N");
         String a = entrada.next();

         if ((Objects.equals(a, "S")) || (a.equals("s"))) {
             Data();
         } else {
             System.exit(0);
         }
    }


}




