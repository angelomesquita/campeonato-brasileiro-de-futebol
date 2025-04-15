<<<<<<< HEAD
class Cartao {
    Private String cor;
    Private String participante;
    Private String jogo;
    Private String funcaoDoCartao;
=======
class Cartao{
    String cor;
    String participante;
    String jogo;

    Cartao(String cor, String jogo, String participante){
        this.cor=cor;
        this.jogo=jogo;
        this.participante=participante;
>>>>>>> 477634771e56454a385858eee9aede6833910632

        // Construtor
    public Cartao(String cor, String participante, String jogo, String funcaoDoCartao) {
        this.cor = cor;
        this.participante = participante;
        this.jogo = jogo;
        this.funcaoDoCartao = funcaoDoCartao;
    }
<<<<<<< HEAD

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

=======
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