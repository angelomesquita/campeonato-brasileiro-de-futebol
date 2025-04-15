class Cartao{
    String cor;
    String participante;
    String jogo;

    Cartao(String cor, String jogo, String participante){
        this.cor=cor;
        this.jogo=jogo;
        this.participante=participante;

    }
    public String getCor(){
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }
    public String getParticipante() {
        return participante;
    }
    public void setParticipante(String participante) {
        this.participante = participante;
    }
    public String getJogo() {
        return jogo;
    }
    public void setJogo(String jogo) {
        this.jogo = jogo;
    }

}