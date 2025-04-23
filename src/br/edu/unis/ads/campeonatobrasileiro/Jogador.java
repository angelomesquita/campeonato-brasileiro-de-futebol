package br.edu.unis.ads.campeonatobrasileiro;



 public class Jogador {
        private String nome;
        private String posicao;
        private int numeroCamisa;
        private int gols;
        



public void fazerGol () {
    gols++;
    System.out.println("Joagador"+ nome +" fez um gol!");
}

public void correr () {
    System.out.println("Jogador "+ nome + "está correndo.");

}

public void fazerPasse(boolean certo) {
    if (certo) {
        passesCertos++;
        System.out.println(nome + " fez um passe certo!");
    } else {
        passesErrados++;
        System.out.println(nome + " errou o passe.");
    }
}
public void exibirInformacoesJogador(){
    System.out.println("Nome: "+nome);
    
}
 }