import coches.AutoCombustion;
import coches.AutoElectrico;
import coches.Motocicleta;
import coches.Vehiculo;
import interfaces.ITecnico;
import servicios.AjusteFrenos;
import servicios.MecanicoGeneral;
import servicios.RevisionGeneral;
import servicios.Taller;

public class Main {
    public static void main(String[] args) {
// 1) Crear instancias de vehículos
        AutoElectrico autoEl1 = new AutoElectrico("Tesla", "Model S", 12000, 75);
        AutoElectrico autoEl2 = new AutoElectrico("Nissan", "Leaf", 6000, 40);
        AutoCombustion autoC1 = new AutoCombustion("Toyota", "Corolla", 25000, 50, 5);
        AutoCombustion autoC2 = new AutoCombustion("Ford", "Fiesta", 18000, 45, 10);
        Motocicleta moto1 = new Motocicleta("Yamaha", "R3", 8000, "Integral");
        Motocicleta moto2 = new Motocicleta("Honda", "CBR600", 12000, "Semi-integral");


        // 2) Crear el mecánico que implementa ITecnico
        ITecnico mecanico = new MecanicoGeneral();

        // 3) Crear un Taller y pasarle el mecánico
        Taller taller = new Taller("Taller Mecánico XYZ", mecanico);

        // 4) Admitir los vehículos al Taller
        taller.admitirVehiculo(autoEl1);
        taller.admitirVehiculo(autoEl2);
        taller.admitirVehiculo(autoC1);
        taller.admitirVehiculo(autoC2);
        taller.admitirVehiculo(moto1);
        taller.admitirVehiculo(moto2);

        // 5) Mostrar el estado inicial de los vehículos
        System.out.println("ESTADO INICIAL DE LOS VEHÍCULOS:");
        System.out.println(autoEl1);
        System.out.println(autoEl2);
        System.out.println(autoC1);
        System.out.println(autoC2);
        System.out.println(moto1);
        System.out.println(moto2);

        // 6) Aplicar algunos servicios puntuales desde fuera del taller (opcional)
        System.out.println("APLICANDO SERVICIOS PUNTUALES: ");
        autoEl1.recibirServicio(new RevisionGeneral(), mecanico);      // Ejemplo: Revisión al primer auto eléctrico
        autoC2.recibirServicio(new AjusteFrenos(), mecanico);          // Ajuste de frenos al segundo auto de combustión

        // 7) El Taller procesa servicios pendientes (por ejemplo, AjusteFrenos y RevisionGeneral a todos)
        taller.procesarServiciosPendientes();

        // 8) Mostrar el estado final de los vehículos

        System.out.println("ESTADO FINAL DE LOS VEHÍCULOS:");
        System.out.println(autoEl1);
        System.out.println(autoEl2);
        System.out.println(autoC1);
        System.out.println(autoC2);
        System.out.println(moto1);
        System.out.println(moto2);

        // 9) Mostrar (opcional) el total de vehículos creados si tu clase Vehiculo lleva un contador


        System.out.println("Fin del programa.");
    }
}