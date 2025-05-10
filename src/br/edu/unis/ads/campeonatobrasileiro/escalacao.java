class Escalacao{
   Private String titular;
   Private String reservas;

    Escalacao(String titular, String reservas){
        this.titular=titular;
        this.reservas=reservas;
        
    }
    public String getTitular() {
        return titular;
    }
    public void setTitular(String titular) {
        this.titular = titular;
    }
    public String getReservas() {
        return reservas;
    }
    public void setResrvas(String reservas) {
        this.reservas = reservas;
    }
}