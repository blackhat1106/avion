public class Main {
    public static void main(String[] args) {
        // Crear instancias de vehículos
        Moto moto = new Moto(180);
        Carro carro = new Carro(220);
        Camion camion = new Camion(120);
        Bicicleta bicicleta = new Bicicleta(40);

        // Crear una instancia del parqueadero con tarifas específicas
        Parqueadero parqueadero = new Parqueadero(5.0, 10.0, 15.0, 2.0);

        // Registrar los vehículos en el parqueadero
        parqueadero.registrarVehiculo(moto);
        parqueadero.registrarVehiculo(carro);
        parqueadero.registrarVehiculo(camion);
        parqueadero.registrarVehiculo(bicicleta);

        // Mostrar los vehículos registrados y sus tarifas
        parqueadero.mostrarVehiculos();
    }
}
