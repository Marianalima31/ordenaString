import collections.Sequencia;
import collections.Textos;

public class Main {
    public static void main(String[] args) {

        Sequencia seq = new Sequencia();
        Textos t = new Textos("acbda","fasdlkh","poiwqd","xzcqwtop","qfgophl");

        //loop para cada elemento String de Textos t
        t.getTextos().forEach( tex -> {

            //transforma a string em um array onde cada elemento eh uma letra da string
            char[] char_vet = tex.toCharArray();

            //sequencia atual analisada
            String atual ="";

            //a maior sequencia de letras crescentes ate entao
            String maior = "";

            //pega cada letra por vez do vetor de letras montado acima
            for(char c : char_vet) {
                if(atual.isEmpty()) {
                    atual = Character.toString(c);
                }else if ((int) atual.charAt(atual.length() -1) < (int) c) { //converte em int para ver a tabela ascii, se for maior entao eh crescente.
                    atual += Character.toString(c);
                }else {
                    if(atual.length() >= maior.length()) {
                        maior=atual;
                    }
                    atual = Character.toString(c);
                }
            }
            //adiciona a maior sequencia da string analisada numa ArrayList
            seq.addSequencia(maior);
        });

        //imprime o resultado da funcao que retorna a maior sequencia
        System.out.println(seq.retornaMaiorSequencia());
    }
}