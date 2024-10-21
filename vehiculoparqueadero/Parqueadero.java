import java.util.ArrayList;
import java.util.List;

// Clase Parqueadero
public class Parqueadero {
    // Lista para almacenar los vehículos registrados
    private List<Vehiculo> vehiculos;
    private double tarifaMoto;
    private double tarifaCarro;
    private double tarifaCamion;
    private double tarifaBicicleta;

    // Constructor de la clase Parqueadero
    public Parqueadero(double tarifaMoto, double tarifaCarro, double tarifaCamion, double tarifaBicicleta) {
        this.vehiculos = new ArrayList<>(); // Inicializar la lista de vehículos
        this.tarifaMoto = tarifaMoto;
        this.tarifaCarro = tarifaCarro;
        this.tarifaCamion = tarifaCamion;
        this.tarifaBicicleta = tarifaBicicleta;
    }

    // Método para registrar un vehículo
    public void registrarVehiculo(Vehiculo vehiculo) {
        vehiculos.add(vehiculo);
        System.out.println(vehiculo.tipo + " registrado en el parqueadero.");
    }

    // Método para calcular la tarifa de un vehículo
    public double calcularTarifa(Vehiculo vehiculo) {
        if (vehiculo instanceof Moto) {
            return tarifaMoto;
        } else if (vehiculo instanceof Carro) {
            return tarifaCarro;
        } else if (vehiculo instanceof Camion) {
            return tarifaCamion;
        } else if (vehiculo instanceof Bicicleta) {
            return tarifaBicicleta;
        } else {
            return 0; // Si es un tipo desconocido
        }
    }

    // Método para mostrar todos los vehículos registrados y su tarifa
    public void mostrarVehiculos() {
        for (Vehiculo vehiculo : vehiculos) {
            System.out.println(vehiculo.describir() + " - Tarifa: $" + calcularTarifa(vehiculo));
        }
    }
}


