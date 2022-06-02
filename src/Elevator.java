public class Elevator {
    private int maxpassageiro;
    private int passageiros;
    private int andaratual;
    private int ultimoAndar;
    public Elevator (int maxpassageiro, int ultimoAndar){
        this.maxpassageiro = maxpassageiro;
        this.ultimoAndar = ultimoAndar;
    }
    public Elevator (int maxpassageiro, int passageiros, int andaratual, int ultimoAndar){
        this.maxpassageiro = maxpassageiro;
        this.passageiros = passageiros;
        this.andaratual = andaratual;
        this.ultimoAndar = ultimoAndar;
    }
    public int getMaxpassageiro() {
        return maxpassageiro;
    }
    public void setMaxpassageiro(int maxpassageiro) {
        this.maxpassageiro = maxpassageiro;
    }
    public int getPassageiros() {
        return passageiros;
    }
    public void setPassageiros(int passageiros) {
        this.passageiros = passageiros;
    }
    public int getAndaratual() {
        return andaratual;
    }
    public void setAndaratual(int andaratual) {
        this.andaratual = andaratual;
    }
    public int getUltimoAndar() {
        return ultimoAndar;
    }
    public void setUltimoAndar(int ultimoAndar) {
        this.ultimoAndar = ultimoAndar;
    }
    private boolean canGoUp(int andaratual){
        return andaratual < ultimoAndar ? true : false;
    }
    public int proxAndar(){
        if (canGoUp(andaratual)){
            setAndaratual(this.andaratual += 1);
            return this.andaratual;
        } else {
            return andaratual;
        }
    }
    private boolean canGoDown (int andaratual){
        return andaratual >= 1 ? true : false;
    }
    public int andarAnterior(){
        if (canGoDown(this.andaratual)) {
            setAndaratual(this.andaratual -= 1);
            return this.andaratual;
        } else {
            return andaratual;
        }
    }
    private boolean addnovopassageiro(int passageiro){
        return passageiro >= maxpassageiro ? true : false;
    }
    public int addpassageiro(){
        if (addnovopassageiro(passageiros)){
            setPassageiros(this.passageiros += 1);
            return this.passageiros;
        } else {
            return passageiros;
        }
    }
    private boolean removerpassageiro(int passageiro){
        return passageiro >= 1 ? true : false;
    }
    public int removerpassageiro(){
        if (removerpassageiro(passageiros)) {
            setPassageiros(this.passageiros -= 1);
            return this.passageiros;
        } else {
            return passageiros;
        }
    }
}