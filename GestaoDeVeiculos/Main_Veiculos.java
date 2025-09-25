package GestaoDeVeiculos;

public class Main_Veiculos {
    public static void main(String[] args) {

        Carro c1 = new Carro("Toyota", "Corolla", 4);
        System.out.println("--- Gestao de Veiculos ---");
        System.out.println("Carro: " + c1.getMarca());
        System.out.println("Modelo: " + c1.getModelo());
        System.out.println(" - Portas: " + c1.getNumeroDePortas());

        Moto m1 = new Moto("Honda", "xr200", 50);
        System.out.println("--- Gestao de Veiculos ---");
        System.out.println("Moto: " + m1.getMarca());
        System.out.println("Modelo: " +m1.getModelo());
        System.out.println("Cilindradas: " + m1.getCilindradas());
        
    } }

