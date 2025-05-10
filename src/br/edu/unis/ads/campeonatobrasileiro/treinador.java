import java.time.LocalDate;

public class Treinador {
    private String nome;
    private LocalDate dataDeNascimento;
    private int tempoDeCarreira;
    private boolean jaFoiJogador;
    private int numeroDeTitulos;
    private String nacionalidade;


    public Treinador(String nome, LocalDate dataDeNascimento, int tempoDeCarreira, boolean jaFoiJogador, int numeroDeTitulos, String nacionalidade) {
        this.nome = nome;
        this.dataDeNascimento = dataDeNascimento;
        this.tempoDeCarreira = tempoDeCarreira;
        this.jaFoiJogador = jaFoiJogador;
        this.numeroDeTitulos = numeroDeTitulos;
        this.nacionalidade = nacionalidade;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(LocalDate dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    public int getTempoDeCarreira() {
        return tempoDeCarreira;
    }

    public void setTempoDeCarreira(int tempoDeCarreira) {
        this.tempoDeCarreira = tempoDeCarreira;
    }

    public boolean isJaFoiJogador() {
        return jaFoiJogador;
    }

    public void setJaFoiJogador(boolean jaFoiJogador) {
        this.jaFoiJogador = jaFoiJogador;
    }

    public int getNumeroDeTitulos() {
        return numeroDeTitulos;
    }

    public void setNumeroDeTitulos(int numeroDeTitulos) {
        this.numeroDeTitulos = numeroDeTitulos;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public String toString() {
        return "Treinador{" +
                "nome='" + nome + '\'' +
                ", dataDeNascimento=" + dataDeNascimento +
                ", tempoDeCarreira=" + tempoDeCarreira +
                ", jaFoiJogador=" + jaFoiJogador +
                ", numeroDeTitulos=" + numeroDeTitulos +
                ", nacionalidade='" + nacionalidade + '\'' +
                '}';
    }
}