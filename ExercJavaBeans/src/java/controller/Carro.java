package controller;

/**
 *
 * @author José Flávio
 */
public class Carro {
    
    private String placa, nome, marca, modelo;
    private double preco, valorDiariaAluguel;
    private int diasLocacao;
    private boolean situacao;

    public Carro() {
    }

    public Carro(String placa, String nome, String marca, String modelo, double preco, double valorDiariaAluguel, boolean situacao) {
        this.placa = placa;
        this.nome = nome;
        this.marca = marca;
        this.modelo = modelo;
        this.preco = preco;
        this.valorDiariaAluguel = valorDiariaAluguel;
        this.situacao = situacao = false;
    }
    
    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double getValorDiariaAluguel() {
        return valorDiariaAluguel;
    }

    public void setValorDiariaAluguel(double valorDiariaAluguel) {
        this.valorDiariaAluguel = valorDiariaAluguel;
    }

    public int getDiasLocacao() {
        return diasLocacao;
    }

    public void setDiasLocacao(int diasLocacao) {
        this.diasLocacao = diasLocacao;
    }

    public boolean isSituacao() {
        return situacao;
    }

    public void setSituacao(boolean situacao) {
        this.situacao = situacao;
    }
    
    public double calcularValorMulta(int diasLocados){
     double multa = 0;
        if (diasLocados>diasLocacao){
        multa = (valorDiariaAluguel * 0.07) * (diasLocados - diasLocacao);
    }
    return multa;
    }
    
    public double calcularValorTotalAluguel(double valorTotal, double multa){
        valorTotal = (diasLocacao * valorDiariaAluguel) + multa ;
        return valorTotal;
    }
    
    
    }
    
    

    
    

