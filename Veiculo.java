//Interface Veiculo 
public interface Veiculo {
    double calcularCustoPorKm(double distancia);
    String getTipo();
}

//Chave para Implementar a interface 
class Carro implements Veiculo {
    private final double consumoPorLitro;
    private final double precoCombustivelPorLitro;

    public Carro(double consumoPorLitro, double precoCombustivelPorLitro) {
        this.consumoPorLitro = consumoPorLitro;
        this.precoCombustivelPorLitro = precoCombustivelPorLitro;
    }
//Metodo Calcular custo
    @Override
    public double calcularCustoPorKm(double distancia) {
        return (distancia / consumoPorLitro) * precoCombustivelPorLitro;
    }

    @Override
    public String getTipo() {
        return "Carro";
    }
}

//Metodo para teste do Veiculo
class Bicicleta implements Veiculo {
    private final double custoDeManutencaoPorKm;

    public Bicicleta(double custoDeManutencaoPorKm) {
        this.custoDeManutencaoPorKm = custoDeManutencaoPorKm;
    }

    @Override
    public double calcularCustoPorKm(double distancia) {
        return distancia * custoDeManutencaoPorKm;
    }

    @Override
    public String getTipo() {
        return "Bicicleta";
    }
}

class Main {
    public static void main(String[] args) {
        Veiculo carro = new Carro(12.0, 6.00); // 12 km/L, R$ 6,00/L
        Veiculo bicicleta = new Bicicleta(0.15); // R$ 0,15/km

        double distancia = 40.0;

        System.out.println("Veículo: " + carro.getTipo());
        System.out.printf("Custo para %.1f km: R$ %.2f%n", distancia, carro.calcularCustoPorKm(distancia));

        System.out.println("\nVeículo: " + bicicleta.getTipo());
        System.out.printf("Custo para %.1f km: R$ %.2f%n", distancia, bicicleta.calcularCustoPorKm(distancia));
    }
}