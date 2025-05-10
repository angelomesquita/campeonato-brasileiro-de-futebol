package br.edu.unis.ads.campeonatobrasileiro;
public class Estadio {
    private String estado;
    private String cidade;
    private String endereco;
    private int lotacaoMaxima;
    private int quantidadeDeSegurancas;

    public Estadio(String estado, String cidade, String endereco, int lotacaoMaxima, int quantidadeDeSegurancas){
        this.estado = estado;
        this.cidade = cidade;
        this.endereco = endereco;
        this.lotacaoMaxima = lotacaoMaxima;
        this.quantidadeDeSegurancas = quantidadeDeSegurancas;

    }
    public String getEstado(){
        return estado;
    }

    public void setEstado(String estado){
        this.estado = estado;
    }
    public String getCidade(){
        return cidade;
    }

    public void setCidade(String cidade){
        this.cidade = cidade;
    }
    public String getEndereco(){
        return endereco;
    }

    public void setEndereco(String endereco){
        this.endereco = endereco;
    }
    public int getLotacaoMaxima(){
        return lotacaoMaxima;
    }

    public void setLotacaoMaxima(int lotacaoMaxima){
        this.lotacaoMaxima = lotacaoMaxima;
    }
    public int getQuantidadeDeSegurancas(){
        return quantidadeDeSegurancas;
    }

    public void setQuantidadeDeSegurancas(int quantidadeDeSegurancas){
        this.quantidadeDeSegurancas = quantidadeDeSegurancas;
    }
}

public void exibirInformacoes(){
    System.out.println("Estadio localizado em " + cidade + "," + estado);
     System.out.println("Endereço: " + endereco);
      System.out.println("Lotação máxima: " + lotacaoMaxima);
       System.out.println("Quantidade de seguranças: " + quantidadeDeSegurancas);
}