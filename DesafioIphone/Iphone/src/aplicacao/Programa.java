package aplicacao;


import entidades.Iphone;

import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Iphone iphone = new Iphone();

        System.out.println("Digite o número para qual deseja ligar: ");
        int numero = sc.nextInt();

        iphone.ligar(numero);



    }
}
