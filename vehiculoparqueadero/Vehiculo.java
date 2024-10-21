// Clase base Vehiculo
public class Vehiculo {
    protected String tipo;
    protected int ruedas;
    protected int velocidadMaxima;

    // Constructor
    public Vehiculo(String tipo, int ruedas, int velocidadMaxima) {
        this.tipo = tipo;
        this.ruedas = ruedas;
        this.velocidadMaxima = velocidadMaxima;
    }

    // Método para describir el vehículo
    public String describir() {
        return "Tipo: " + tipo + ", Ruedas: " + ruedas + ", Velocidad máxima: " + velocidadMaxima + " km/h";
    }
}

// Subclase Moto
class Moto extends Vehiculo {
    public Moto(int velocidadMaxima) {
        super("Moto", 2, velocidadMaxima);
    }
}

// Subclase Carro
class Carro extends Vehiculo {
    public Carro(int velocidadMaxima) {
        super("Carro", 4, velocidadMaxima);
    }
}

// Subclase Camion
class Camion extends Vehiculo {
    public Camion(int velocidadMaxima) {
        super("Camion", 6, velocidadMaxima);
    }
}

// Subclase Bicicleta
class Bicicleta extends Vehiculo {
    public Bicicleta(int velocidadMaxima) {
        super("Bicicleta", 2, velocidadMaxima);
    }
}

// Clase principal para probar los vehículos
class Main {
    public static void main(String[] args) {
        Moto moto = new Moto(180);
        Carro carro = new Carro(220);
        Camion camion = new Camion(120);
        Bicicleta bicicleta = new Bicicleta(40);

        // Imprimir descripciones
        System.out.println(moto.describir());
        System.out.println(carro.describir());
        System.out.println(camion.describir());
        System.out.println(bicicleta.describir());
    }
}
