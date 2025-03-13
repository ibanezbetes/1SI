package servicios;

import coches.AutoCombustion;
import coches.AutoElectrico;
import coches.Motocicleta;
import coches.Vehiculo;
import interfaces.IServicio;
import interfaces.ITecnico;

public class MecanicoGeneral implements ITecnico {

    @Override
    public void realizarServicio(Vehiculo vehiculo, IServicio servicio) {
        if (vehiculo instanceof AutoElectrico && servicio instanceof CargaElectrica){
            ((AutoElectrico)vehiculo).recargarBateria(35);
        }else if (vehiculo instanceof AutoCombustion && servicio instanceof CambioAceite){
            ((AutoCombustion)vehiculo).llenarTanque(35);
        }else if (vehiculo instanceof Motocicleta && servicio instanceof AjusteFrenos){
            ((Motocicleta)vehiculo).verificarCasco();
        }else {

        }
    }


}
