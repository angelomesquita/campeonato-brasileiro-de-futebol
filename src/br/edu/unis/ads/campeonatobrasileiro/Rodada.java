package br.edu.unis.ads.campeonatobrasileiro;

import java.util.ArrayList;
import java.util.List;

public class Rodada {
    private int numero;
    private String data;
    private List<Jogo> jogos;

    public Rodada(int numero, String data) {
        this.numero = numero;
        this.data = data;
        this.jogos = new ArrayList<>();
    }

    public void adicionarJogo(Jogo jogo) {
        jogos.add(jogo);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Rodada ").append(numero).append(" - ").append(data).append("\n");
        for (Jogo jogo : jogos) {
            sb.append(" - ").append(jogo).append("\n");
        }
        return sb.toString();
    }
}
