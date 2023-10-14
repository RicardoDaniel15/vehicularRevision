package revVehicular;

public class Transmision {
    private int estadoTransmision;

    public Transmision() {
        this.estadoTransmision = 0;
    }

    public int getEstadoTransmision() {
        return estadoTransmision;
    }

    public void setEstadoTransmision(int estadoTransmision) {
        if(estadoTransmision>= 0 && estadoTransmision<=5){
            this.estadoTransmision = estadoTransmision;
        }else {
            this.estadoTransmision = 0;
        }
    }

    @Override
    public String toString() {
        return String.format("Estado Transmision: %s", this.estadoTransmision);
    }
}
