import java.time.LocalDate;

public class Arbitro {
    private String nome;
    private String profissao;
    private LocalDate dataDeNascimento;
    private String naturalidade;
    private String sexo;
    private double peso; // em kg
    private double altura; // em metros

    public Arbitro(String nome, String profissao, LocalDate dataDeNascimento, String naturalidade, String sexo, double peso, double altura) {
        this.nome = nome;
        this.profissao = profissao;
        this.dataDeNascimento = dataDeNascimento;
        this.naturalidade = naturalidade;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    public LocalDate getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(LocalDate dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    public String getNaturalidade() {
        return naturalidade;
    }

    public void setNaturalidade(String naturalidade) {
        this.naturalidade = naturalidade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void exibirInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Profissão: " + profissao);
        System.out.println("Data de nascimento: " + dataDeNascimento);
        System.out.println("Naturalidade: " + naturalidade);
        System.out.println("Sexo: " + sexo);
        System.out.println("Peso: " + peso + " kg");
        System.out.println("Altura: " + altura + " m");
    }
}
