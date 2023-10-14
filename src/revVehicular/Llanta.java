package revVehicular;

public class Llanta {
    private int estadoLlanta;

    public Llanta() {
        this.estadoLlanta = 0;
    }

    public int getEstadoLlanta() {
        return estadoLlanta;
    }

    public void setEstadoLlanta(int estadoLlanta) {
        if(estadoLlanta>= 0 && estadoLlanta<=5){
            this.estadoLlanta = estadoLlanta;
        }else {
            this.estadoLlanta = 0;
        }
    }

    @Override
    public String toString() {
        return String.format("Estado LLanta: %s",this.estadoLlanta);
    }
}
