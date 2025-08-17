import java.util.Scanner;

// ----|----* Bem-vindo ao conversor! *----|----
// Nosso intuito é converter um número de telefone que possui letras no seu conteúdo (ex. 0800-FALE-SBC)
// para um número de telefone que possui somente dígitos! Porém,
// para manter a leitura do telefone fácil, manteremos os hífens(-).

public class TelefoneP1 {
    public static void main(String[] args) {
        while(true) {
            String entrada;
            Scanner sc = new Scanner(System.in);

            System.out.println("----|----* Bem-vindo ao conversor! *----|----");
            System.out.println("Insira o telefone a ser convertido, lembre-se de não usar caracteres especiais além do hifen(-)");
            System.out.println("ou digite SAIR para encerrar o programa. ");
            System.out.println("Insira aqui: ");

            entrada = sc.nextLine();
            entrada = entrada.toLowerCase();

            if (entrada.equals("sair")) {
                sc.close();
                break;
            }

            System.out.println("Telefone convertido: " + converteLetraEmNumero(entrada));
        }
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