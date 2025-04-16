class Torcedor{
    Private String nome;
    Private int idade;
    Private String nacionalidade;
    Private int jogosAssistidos;
    Private String timeFavorito;

    Torcedor(String nome, int idade, String nacionalidade, int jogosAssistidos, String timeFavorito){
        this.nome= nome:
        this.idade= idade;
        this.nacionalidade = nacionalidade;
        this.jogosAssistidos=jogosAssistidos;
        this.timeFavorito=timeFavorito;

    }
    public String getNome(){
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getIdade(){
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public String getNacionalidade(){
        return nacionalidade;
    }
    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }
    public int getJogosAssistidos(){
        return jogosAssistidos;
    }
    public void setJogosAssistidos(int jogosAssistidos){
        this.jogosAssistidos = jogosAssistidos;
    }
    public String getTimeFavorito(){
        return timeFavorito;
    }
    public void setTimeFavorito(String timeFavorito) {
        this.timeFavorito = timeFavorito;
    }
}



