public class Lampada{

    private boolean situacaoLampada;

    public boolean isSituacaoLampada() {      // usa o 'is' pq estamos usando o boolean
        return situacaoLampada;
    }
    public void setSituacaoLampada(boolean situacaoLampada) {
        this.situacaoLampada = situacaoLampada;
    }

    public void ligar(){
        situacaoLampada=true;

    }
    public void desligar(){
        situacaoLampada=false;
    }

}