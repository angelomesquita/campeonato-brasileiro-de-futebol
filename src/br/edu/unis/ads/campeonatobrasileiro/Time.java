import java.util.List;

public class Time {
    private String nome;
    private String escudo;
    private String estado;
    private String cidade;
    private String sigla;
    private String coresPrincipais;
    private Mascote mascote;
    private List jogadoresTitulares;
    private List jogadoresReservas;
    private treinador treinador;
    private List centroDeTreinamento;
    private List patrocinador;
    private String presidente;

    public Time(){
    }

    public Time(String nome, String escudo, String estado, String cidade, String sigla, String coresPrincipais,
            Mascote mascote, List jogadoresTitulares, List jogadoresReservas, treinador treinador,
            List centroDeTreinamento, List patrocinador, String presidente) {
        this.nome = nome;
        this.escudo = escudo;
        this.estado = estado;
        this.cidade = cidade;
        this.sigla = sigla;
        this.coresPrincipais = coresPrincipais;
        this.mascote = mascote;
        this.jogadoresTitulares = jogadoresTitulares;
        this.jogadoresReservas = jogadoresReservas;
        this.treinador = treinador;
        this.centroDeTreinamento = centroDeTreinamento;
        this.patrocinador = patrocinador;
        this.presidente = presidente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEscudo() {
        return escudo;
    }

    public void setEscudo(String escudo) {
        this.escudo = escudo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public String getCoresPrincipais() {
        return coresPrincipais;
    }

    public void setCoresPrincipais(String coresPrincipais) {
        this.coresPrincipais = coresPrincipais;
    }

    public Mascote getMascote() {
        return mascote;
    }

    public void setMascote(Mascote mascote) {
        this.mascote = mascote;
    }

    public List getJogadoresTitulares() {
        return jogadoresTitulares;
    }

    public void setJogadoresTitulares(List jogadoresTitulares) {
        this.jogadoresTitulares = jogadoresTitulares;
    }

    public List getJogadoresReservas() {
        return jogadoresReservas;
    }

    public void setJogadoresReservas(List jogadoresReservas) {
        this.jogadoresReservas = jogadoresReservas;
    }

    public treinador getTreinador() {
        return treinador;
    }

    public void setTreinador(treinador treinador) {
        this.treinador = treinador;
    }

    public List getCentroDeTreinamento() {
        return centroDeTreinamento;
    }

    public void setCentroDeTreinamento(List centroDeTreinamento) {
        this.centroDeTreinamento = centroDeTreinamento;
    }

    public List getPatrocinador() {
        return patrocinador;
    }

    public void setPatrocinador(List patrocinador) {
        this.patrocinador = patrocinador;
    }

    public String getPresidente() {
        return presidente;
    }

    public void setPresidente(String presidente) {
        this.presidente = presidente;
    }

    public exibirInformacao(){
        System.out.println("Nome: " + getNome());
        System.out.println("Escudo: " + getEscudo());
        System.out.println("Estado: " + getEstado());
        System.out.println("Cidade: " + getCidade());
        System.out.println("Sigla: " + getSigla());
        System.out.println("Cores Principais: " + getCoresPrincipais());
        if (getMascote() != null) {
            System.out.println("Mascote: " + getMascote().toString());
        } else {
            System.out.println("Mascote: Não definido");
        }
    
        System.out.println("Jogadores Titulares: " + getJogadoresTitulares());
        System.out.println("Jogadores Reservas: " + getJogadoresReservas());
    
        if (getTreinador() != null) {
            System.out.println("Treinador: " + getTreinador().toString());
        } else {
            System.out.println("Treinador: Não definido");
        }
    
        System.out.println("Centros de Treinamento: " + getCentroDeTreinamento());
        System.out.println("Patrocinadores: " + getPatrocinador());
        System.out.println("Presidente: " + getPresidente());
    }
}
