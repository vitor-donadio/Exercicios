package veiculo_ex01_02_03java;

/*
Veiculo - Exercicios 02 e 03 - Computação II
@Vitor_Butler_Donadio
 */
public class Main {
    public static void main(String[] args){
        Veiculo Carro = new Veiculo("BMW",
                "BMW VOA",
                "Vitor",
                100,
                5);
        System.out.println(Carro.lerRodagem());
        System.out.println(Carro.lerTanqueAtual());
        System.out.println(Carro.lerTanqueCapacid());
        System.out.println(Carro.lerAutonomia());
        Carro.abastecerTanque(50);
        Carro.fazerViagem(240);
        System.out.println("NOVO:" + Carro.lerRodagem());
        System.out.println("NOVO:" + Carro.lerTanqueAtual());

    }
}
