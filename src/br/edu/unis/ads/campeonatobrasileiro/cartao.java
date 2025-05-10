
class Cartao{
    Private String cor;
    Private String participante;
    Private String jogo;

    Cartao(String cor, String jogo, String participante){
        this.cor=cor;
        this.jogo=jogo;
        this.participante=participante;

        // Construtor
    public Cartao(String cor, String participante, String jogo, String funcaoDoCartao) {
        this.cor = cor;
        this.participante = participante;
        this.jogo = jogo;
        this.funcaoDoCartao = funcaoDoCartao;
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
>>>>>>> 477634771e56454a385858eee9aede6833910632
    public void setJogo(String jogo) {
        this.jogo = jogo;
    }

<<<<<<< HEAD
    public void setFuncaoDoCartao(String funcaoDoCartao) {
        this.funcaoDoCartao = funcaoDoCartao;
    }

    
=======
>>>>>>> 477634771e56454a385858eee9aede6833910632
}