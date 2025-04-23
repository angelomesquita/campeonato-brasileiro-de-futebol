public class Jogo {

    // atributos
    private String horario;
    private String estadio;
    private String timeMandante;
    private String timeVisitante;
    private String equipeDeArbitragem;
    private int numeroDeTorcedores;
    private String delegadoPartida;
    private int gols;
    private String sumula;

    // getters e setters
    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getEstadio() {
        return estadio;
    }

    public void setEstadio(String estadio) {
        this.estadio = estadio;
    }

    public String getTimeMandante() {
        return timeMandante;
    }

    public void setTimeMandante(String timeMandante) {
        this.timeMandante = timeMandante;
    }

    public String getTimeVisitante() {
        return timeVisitante;
    }

    public void setTimeVisitante(String timeVisitante) {
        this.timeVisitante = timeVisitante;
    }

    public String getEquipeDeArbitragem() {
        return equipeDeArbitragem;
    }

    public void setEquipeDeArbitragem(String equipeDeArbitragem) {
        this.equipeDeArbitragem = equipeDeArbitragem;
    }

    public int getNumeroDeTorcedores() {
        return numeroDeTorcedores;
    }

    public void setNumeroDeTorcedores(int numeroDeTorcedores) {
        this.numeroDeTorcedores = numeroDeTorcedores;
    }

    public String getDelegadoPartida() {
        return delegadoPartida;
    }

    public void setDelegadoPartida(String delegadoPartida) {
        this.delegadoPartida = delegadoPartida;
    }

    public int getGols() {
        return gols;
    }

    public void setGols(int gols) {
        this.gols = gols;
    }

    public String getSumula() {
        return sumula;
    }

    public void setSumula(String sumula) {
        this.sumula = sumula;
    }

    // Método Listar informação do jogo
    public void informacoesDoJogo() {
        System.out.println("Horário: " + horario);
        System.out.println("Estádio: " + estadio);
        System.out.println("Time Mandante: " + timeMandante);
        System.out.println("Time Visitante: " + timeVisitante);
        //System.out.println("Equipe de Arbitragem: " + equipeDeArbitragem);
        System.out.println("Número de Torcedores: " + numeroDeTorcedores);
        System.out.println("Delegado da Partida: " + delegadoPartida);
        //System.out.println("Gols: " + gols);
        System.out.println("Súmula: " + sumula);
        System.out.println("-------------------------------------\n");
    }
}
