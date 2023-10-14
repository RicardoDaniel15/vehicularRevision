package revVehicular;

import java.awt.image.AbstractMultiResolutionImage;

public class Vehiculo {
    private Motor motor;
    private Freno freno;
    private Llanta llanta;
    private Transmision transmision;
    private String color;
    private String placa;
    private boolean kitEmergencia;

    public Vehiculo(Motor motor, Freno freno, Llanta llanta, Transmision transmision, String color, String placa) {
        this.motor = motor;
        this.freno = freno;
        this.llanta = llanta;
        this.transmision = transmision;
        this.color = color;
        this.placa = placa;
        this.kitEmergencia = false;
    }

    public Motor getMotor() {
        return motor;
    }


    public Freno getFreno() {
        return freno;
    }


    public Llanta getLlanta() {
        return llanta;
    }


    public Transmision getTransmision() {
        return transmision;
    }

    public boolean isKitEmergencia() {
        return kitEmergencia;
    }

    public void setKitEmergencia(boolean kitEmergencia) {
        this.kitEmergencia = kitEmergencia;
    }

    @Override
    public String toString() {
        return String.format("El vehiculo con placa: %s, color %s",this.placa,this.color);
    }
}
