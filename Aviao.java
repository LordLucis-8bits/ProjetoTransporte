package com.mycompany.transporte;
import java.util.Scanner;

public class Aviao extends Transporte {
    
    protected String prefixo;
    protected String dataRevisao;
    
    public Aviao(){
    }
    
    public Aviao(String prefixo, String dataRevisao, int capacidadeTanque, int numeroPassageiros, double preco) {
        super(capacidadeTanque, numeroPassageiros, preco);
        this.prefixo = prefixo;
        this.dataRevisao = dataRevisao;
    }
    
    public void setPrefixo(String prefixo){
        this.prefixo = prefixo;
    }
    
    public String getPrefixo(){
        return prefixo;
    }
    
    public void setDataRevisao(String dataRevisao){
        this.dataRevisao = dataRevisao;
    }
    
    public String getDataRevisao(){
        return dataRevisao;
    }
    
    @Override
    public void imprimir(){
        super.imprimir();
        System.out.println("Prefixo: " + prefixo);
        System.out.println("Data de Revisao: " + dataRevisao);
    }
    
    @Override
    public void entradaDeDados(){
        super.entradaDeDados();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o prefixo: ");
        prefixo = scanner.nextLine();
        System.out.print("Digite a data de revisao:");
        dataRevisao = scanner.nextLine();
    }
    
}
