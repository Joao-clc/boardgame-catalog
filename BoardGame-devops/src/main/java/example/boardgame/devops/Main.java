/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package example.boardgame.devops;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Catalog catalog = new Catalog();

        System.out.println("Quantos jogos deseja cadastrar?");
        int quantidade = scanner.nextInt();
        scanner.nextLine(); 

        for (int i = 0; i < quantidade; i++) {
            System.out.println("Informe o ID do jogo:");
            String id = scanner.nextLine();

            System.out.println("Informe o nome do jogo:");
            String nome = scanner.nextLine();

            BoardGame jogo = new BoardGame(id, nome);
            catalog.add(jogo);
        }

        System.out.println("\nJogos cadastrados:");
        for (BoardGame jogo : catalog.all()) {
            System.out.println("- " + jogo.getId() + ": " + jogo.getName());
        }
    }
}
