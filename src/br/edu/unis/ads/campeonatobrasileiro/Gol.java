public class Gol {
    private Jogo jogo;
    private String favor;
    private String contra;
    private Jogador jogador;
    private String horario;

    public Gol(){
    }

    public Gol(Jogo jogo, String favor, String contra, Jogador jogador, String horario) {
        this.jogo = jogo;
        this.favor = favor;
        this.contra = contra;
        this.jogador = jogador;
        this.horario = horario;
    }

    public Jogo getJogo() {
        return jogo;
    }

    public void setJogo(Jogo jogo) {
        this.jogo = jogo;
    }

    public String getFavor() {
        return favor;
    }

    public void setFavor(String favor) {
        this.favor = favor;
    }

    public String getContra() {
        return contra;
    }

    public void setContra(String contra) {
        this.contra = contra;
    }

    public Jogador getJogador() {
        return jogador;
    }

    public void setJogador(Jogador jogador) {
        this.jogador = jogador;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public exibirInformacao(){
        System.out.println("Jogo: " + getJogo());
        System.out.println("Gols a favor: " + getFavor());
        System.out.println("Gols contra: " + getContra();
        System.out.println("Jogador: " + getJogador());
        System.out.println("Horário: " + getHorario());
    }
}
