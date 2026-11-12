package capitulo_07.recursividade;

public class Exercicio01 {

        public static void main(String[] args) {
            contagem(3);
        }

        static void contagem(int n) {
            if (n == 0) {
             return;
            }
            System.out.println(n);
            contagem(n - 1);

        }
    }



