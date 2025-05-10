package br.edu.unis.ads.campeonatobrasileiro;
public class Mascote {
    // Atributos
    private String nome;
    private String descricao;

    // Construtor
    public Mascote(String nome, String descricao) {
        this.nome = nome;
        this.descricao = descricao;
    }

    // Métodos getters e setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    // Método animar
    public void animar() {
        System.out.println(nome + " está animando a galera! " + descricao);
    }

    // Método toString (opcional)
    @Override
    public String toString() {
        return "Mascote{" +
               "nome='" + nome + '\'' +
               ", descricao='" + descricao + '\'' +
               '}';
    }
}
