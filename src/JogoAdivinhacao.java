import java.util.Random;
import java.util.Scanner;

public class JogoAdivinhacao {
    public static void main(String[] args) {

        Scanner leitura =  new Scanner(System.in);

        int numero=0,certo ;
        int chances=5;

//começo
        certo = new Random().nextInt(100);
        String comeco =  """
                 Bem vindo(a) ao jogo de adivinhação do mano Tikkas!!
                 O jogo funciona da seguinte forma: Você terá 5 chances para acertar o número em que eu estou pensando 
                 e a cada erro eu irei dizer se o número é maior ou menor que o sorteado.
                 Digite o número :""";
        System.out.println(comeco);

        while (numero!=certo) {


            numero = leitura.nextInt();


//errou
            if (chances == 0) {
                System.out.println("""
                        Você conseguiu errar tudo KKKKK.
                        O número era  """+" "+certo);
                break;
            } else {
//tentando
                if (numero < certo) {
                    System.out.println("Parabéns, você errou e o número escolhido é maior que " + numero + "--Chances: " + chances);
                    chances = (chances - 1);
                }
                else if (numero > certo) {
                    System.out.println("Parabéns, você errou e o número escolhido é menor que " + numero + "--Chances: " + chances);
                    chances = (chances - 1);
                }
            }
        }
//acerto
        if(numero== certo){

            System.out.println("Acertou o número escolhido foi o "+certo+ ".");

        }
    }
}
