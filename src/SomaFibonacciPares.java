public class SomaFibonacciPares {

    public static void main(String[] args) {
        int limite = 4000000;
        int termo1 = 1;
        int termo2 = 2;
        int soma = 0;

        while (termo2 <= limite) {
            if (termo2 % 2 == 0) {
                soma += termo2;
            }

            int proximoTermo = termo1 + termo2;
            termo1 = termo2;
            termo2 = proximoTermo;
        }

        System.out.println("A soma dos termos pares da sequência até " + limite + " é: " + soma);
    }
}
