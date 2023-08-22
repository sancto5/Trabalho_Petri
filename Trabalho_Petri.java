package com.company;
import java.util.ArrayList;
import java.util.Scanner;

class Produto {
    private String nome;
    private double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public void exibirDetalhes() {
        System.out.println("Nome: " + nome);
        System.out.println("Preço: " + preco);
    }
}

class Livro extends Produto {
    private String autor;
    private int numPaginas;

    public Livro(String nome, double preco, String autor, int numPaginas) {
        super(nome, preco);
        this.autor = autor;
        this.numPaginas = numPaginas;
    }

    public String getAutor() {
        return autor;
    }

    public int getNumPaginas() {
        return numPaginas;
    }

    @Override
    public void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.println("Autor: " + autor);
        System.out.println("Número de Páginas: " + numPaginas);
    }
}

public class Trabalho_Petri {
    public static void main(String[] args) {
        ArrayList<Produto> produtos = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Escolha uma opção:");
            System.out.println("1. Adicionar um livro");
            System.out.println("2. Listar produtos");
            System.out.println("3. Sair");
            int opcao = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            if (opcao == 1) {
                System.out.print("Nome do livro: ");
                String nome = scanner.nextLine();
                System.out.print("Preço do livro: ");
                double preco = scanner.nextDouble();
                scanner.nextLine(); // Consume newline
                System.out.print("Autor do livro: ");
                String autor = scanner.nextLine();
                System.out.print("Número de páginas do livro: ");
                int numPaginas = scanner.nextInt();
                produtos.add(new Livro(nome, preco, autor, numPaginas));
                System.out.println("Livro adicionado!");
            } else if (opcao == 2) {
                for (Produto produto : produtos) {
                    System.out.println("Detalhes do produto:");
                    produto.exibirDetalhes();
                    System.out.println("-------------------------");
                }
            } else if (opcao == 3) {
                System.out.println("Saindo do programa.");
                break;
            } else {
                System.out.println("Opção inválida. Escolha novamente.");
            }
        }
    }
}