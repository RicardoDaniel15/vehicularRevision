package revVehicular;

public class Motor {
    private int estadoMotor;

    public Motor() {
        this.estadoMotor = 0;
    }

    public int getEstadoMotor() {
        return estadoMotor;
    }

    public void setEstadoMotor(int estadoMotor) {
        if(estadoMotor>= 0 && estadoMotor<=5){
            this.estadoMotor = estadoMotor;
        }else {
            this.estadoMotor = 0;
        }
    }

    @Override
    public String toString() {
        return String.format("Estado Motor: %s",this.estadoMotor);
    }
}
