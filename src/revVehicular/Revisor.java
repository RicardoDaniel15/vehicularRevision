package revVehicular;
import java.security.SecureRandom;
public class Revisor {
    private Duenio duenio;
    SecureRandom sc = new SecureRandom();


    public Revisor(Duenio duenio) {
        this.duenio = duenio;
        asignarEvaluacion();

    }

    public int evaluarVehiculo(){
        int evaluacion = sc.nextInt(7);
        return evaluacion;
    }
    public int generadorKitEmergencia(){
        int evalKit = sc.nextInt(2);
        return evalKit;
    }

    public void asignarEvaluacion(){
        // Asignar estado freno
        duenio.getVehiculo().getFreno().setEstadoFreno(evaluarVehiculo());
        // Asignar estado llanta
        duenio.getVehiculo().getLlanta().setEstadoLlanta(evaluarVehiculo());
        // Asignar estado Motor
        duenio.getVehiculo().getMotor().setEstadoMotor(evaluarVehiculo());
        // Asignar estado Transmision
        duenio.getVehiculo().getTransmision().setEstadoTransmision(evaluarVehiculo());
        // Generador kit emergencia
        if(generadorKitEmergencia()==1){
            duenio.getVehiculo().setKitEmergencia(true);
        }else {
            duenio.getVehiculo().setKitEmergencia(false);
        }

    }
}
