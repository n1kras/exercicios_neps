import java.util.Scanner;

public class TelefoneP1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String entrada = sc.next();

        System.out.println("O telefone que voce digitou: " + entrada);
        System.out.println("Telefone convertido: " + converteLetraEmNumero(entrada.toLowerCase()));
    }

    public static String converteLetraEmNumero(String entrada) {
        StringBuilder saida = new StringBuilder();
            for (Character teste: entrada.toCharArray()) {
                if (!Character.isAlphabetic(teste)) {
                    saida.append(teste);
                }
                switch(teste) {
                    case 'a','b','c':
                        saida.append('2');
                        break;
                    case 'd','e','f':
                        saida.append('3');
                        break;
                    case 'g','h','i':
                        saida.append('4');
                        break;
                    case 'j','k','l':
                        saida.append('5');
                        break;
                    case 'm','n','o':
                        saida.append('6');
                        break;
                    case 'p','q','r','s':
                        saida.append('7');
                        break;
                    case 't','u','v':
                        saida.append('8');
                        break;
                    case 'w','x','y','z':
                        saida.append('9');
                        break;
                }
            }
        return saida.toString();
    }
}