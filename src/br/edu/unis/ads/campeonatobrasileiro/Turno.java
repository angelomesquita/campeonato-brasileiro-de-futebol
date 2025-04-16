public class Turno {
    private int quantidadeDeRodadas;
    private int jogosPorRodada;

    public Turno(){
    }

    public Turno(int quantidadeDeRodadas, int jogosPorRodada){
        this.quantidadeDeRodadas = quantidadeDeRodadas;
        this.jogosPorRodada = jogosPorRodada;
    }

    public int getQuantidadeDeRodadas() {
        return quantidadeDeRodadas;
    }

    public void setQuantidadeDeRodadas(int quantidadeDeRodadas) {
        this.quantidadeDeRodadas = quantidadeDeRodadas;
    }

    public int getJogosPorRodada() {
        return jogosPorRodada;
    }

    public void setJogosPorRodada(int jogosPorRodada) {
        this.jogosPorRodada = jogosPorRodada;
    }

    public exibirInformacao(){
        System.out.println("A quantidade de rodadas são: " + getQuantidadeDeRodadas());
        System.out.println("A quantidade de jogos são: " + getJogosPorRodada());
    }
}
