package com.trybe.idadeemdias;

import java.util.Scanner;
public class Main {

  public static void main(String[] args) {
    /**
    * Método inicial.
    */
    
    Scanner scan = new Scanner(System.in);
    
    System.out.println("Qual seu nome?");
    String nome = scan.next();
    
    System.out.println("Qual sua idade em anos, meses e dias? \n");
    System.out.println("anos: ");
    int anos = scan.nextInt();
    
    System.out.println("meses: ");
    int meses = scan.nextInt();
    
    System.out.println("dias: ");
    int dias = scan.nextInt();
    
    Pessoa pessoa = new Pessoa();
    
    int result = pessoa.calcularIdadeEmDias(anos, meses, dias);
    System.out.println("Olá " + nome + ", sua idade em dias é " + result);
    
    scan.close();
  }
}