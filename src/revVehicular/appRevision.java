package revVehicular;

public class appRevision {
    public static void main(String[] args) {

        // Creamos las partes que conformaran el vehiculo
        Freno freno = new Freno();
        Llanta llanta = new Llanta();
        Motor motor = new Motor();
        Transmision transmision = new Transmision();

        // Creamos el vehiculo con sus partes
        Vehiculo vh1 = new Vehiculo(motor,freno,llanta,transmision,"Negro","PAR-1512");

        // Creamos un duenio
        Duenio duenio = new Duenio("Ricardo Villarreal","172879",vh1);

        // Realizamos la evaluacion

        Revisor revisor = new Revisor(duenio);
        revisor.asignarEvaluacion();

        // Revision
        Revision revision = new Revision(vh1);

        // Resultado Final
        System.out.println(vh1.toString());
        System.out.println(duenio.toString());
        System.out.println("Obtuvo los siguientes resultados en la evaluacion");
        System.out.println("Prueba de estado de Estado Freno : " + freno.getEstadoFreno());
        System.out.println("Prueba de estado de Estado Llanta : " + llanta.getEstadoLlanta());
        System.out.println("Prueba de estado de Estado Motor : " + motor.getEstadoMotor());
        System.out.println("Prueba de estado de Estado Transmision: " + transmision.getEstadoTransmision());
        if(vh1.isKitEmergencia()){
            System.out.println("Kit de emergencia: Verificado");
        }else {
            System.out.println("Kit de emergencia: Sin kit");
        }
        System.out.println("Obtuvo un total de " + revision.getTotalRevision());
        System.out.println("El resultado fue: "+revision.getResultadoRevision());




    }
}
