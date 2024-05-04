package application;

import exceptions.ParametrosInvalidosException;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o primeiro parâmetro: ");
        int parametroUm = sc.nextInt();
        System.out.print("Digite o segundo parâmetro: ");
        int parametroDois = sc.nextInt();

        try {
            contar(parametroUm, parametroDois);

        }catch (ParametrosInvalidosException exception) {
            System.out.println("O segundo parâmetro deve ser maior que o primeiro: ");
        }

    }
    static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {

            if (parametroUm < parametroDois){
                int contagem = parametroDois - parametroUm;
                for (int i = 0; i <= contagem; i++){
                    System.out.println("Imprimindo o numero: " + (i+1));
                }
            }
            else {
              throw new ParametrosInvalidosException();
            }
    }
}
