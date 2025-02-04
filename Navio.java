package com.mycompany.transporte;
import java.util.Scanner;

public class Navio extends Transporte {
    
    protected String nome;
    protected int numeroTripulantes;
    protected String dataLancamento;
    
    public Navio(){
        super();
    }
    
    public Navio(String nome){
        super();
        this.nome = nome;
    }
    
    public Navio(String nome, int capacidadeTanque){
        super(capacidadeTanque, 0, 0);
        this.nome = nome;
    }
    
    public Navio(String nome, int capacidadeTanque,  int numeroTripulantes , int numeroPassageiros, double preco) {
        super(capacidadeTanque, numeroPassageiros, preco);
        this.nome = nome;
        this.numeroTripulantes = numeroTripulantes;
    }
    
    public Navio(String nome, int capacidadeTanque, int numeroPassageiros, int numeroTripulantes, double preco, String dataLancamento) {
        super(capacidadeTanque, numeroPassageiros, preco);
        this.nome = nome;
        this.numeroTripulantes = numeroTripulantes;
        this.dataLancamento = dataLancamento;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public String getNome(){
        return nome;
    }
    
    public void setNumeroTripulantes(int numeroTripulantes){
        this.numeroTripulantes = numeroTripulantes;
    }
    
    public int getNumeroTripulantes(){
        return numeroTripulantes;
    }
    
    public void setDataLancamento(String dataLancamento){
        this.dataLancamento = dataLancamento;
    }
    
    public String getDataLancamento(){
        return dataLancamento;
    }
    
    public double PassageirosPorTripulantes(){
        if (numeroTripulantes == 0){
            System.out.print("Nao pode ser 0");
            return 0;
        }
        return (double) numeroPassageiros / numeroTripulantes;
    }
    
    @Override
    public void imprimir(){
        super.imprimir();
        System.out.println("Nome: " + nome);
        System.out.println("Numero de tripulantes: " + numeroTripulantes);
        System.out.println("Data de Lancamento: " + dataLancamento);
    }
    
    @Override
    public void entradaDeDados(){
        super.entradaDeDados();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o nome: ");
        nome = scanner.nextLine();
        System.out.print("Digite o numero de tripulantes: ");
        numeroTripulantes = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Digite a data de lancamento: ");
        dataLancamento = scanner.nextLine();
    }
    
}