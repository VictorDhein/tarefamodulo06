package TarefaConversa;

import java.util.Scanner;

public class ConversaComigo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String entrada;

        System.out.println("Vamos começar uma conversa! Escreva 'sair' para encerrar.");

        while (true) {
            System.out.print("Eu:");
            entrada = scanner.nextLine();

            if (entrada.equalsIgnoreCase("sair")) {
                System.out.println("Encerrando a conversa. Até mais!");
                break;
            }

            // Resposta simples para a entrada do usuário
            System.out.println("Você:" + processarEntrada(entrada));
        }

        scanner.close();
    }

    private static String processarEntrada(String entrada) {
        // Aqui você pode personalizar as respostas
        if (entrada.contains("oi")) {
            return "oi, tudo bem com você?";
        } if (entrada.contains("estou bem e voce")) {
            return "estou bem tambem e o que esta fazendo?";
        } else if (entrada.contains("conversando")) {
            return "Estou Estudando o que você devereia estar fazendo, e não jogando coversa fora!";
        } else {
            return "digite algumas destas opções: (oi, estou bem e voce, conversando)";
        }
    }
}