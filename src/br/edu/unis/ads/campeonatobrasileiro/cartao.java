class Cartao {
    Private String cor;
    Private String participante;
    Private String jogo;
    Private String funcaoDoCartao;

        // Construtor
    public Cartao(String cor, String participante, String jogo, String funcaoDoCartao) {
        this.cor = cor;
        this.participante = participante;
        this.jogo = jogo;
        this.funcaoDoCartao = funcaoDoCartao;
    }

    // Getters 
    public String getCor() {
        return cor;
    }
 
    public String getParticipante() {
        return participante;
    }

    public String getJogo() {
        return jogo;
    }

    public String getFuncaoDoCartao() {
        return funcaoDoCartao;
    }

    // Setters 
    public void setCor(String cor) {
        this.cor = cor;
    }

    public void setParticipante(String participante) {
        this.participante = participante;
    }

    public void setJogo(String jogo) {
        this.jogo = jogo;
    }

    public void setFuncaoDoCartao(String funcaoDoCartao) {
        this.funcaoDoCartao = funcaoDoCartao;
    }

    
}