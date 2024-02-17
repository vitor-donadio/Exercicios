package veiculo_ex01_02_03java;

public class Veiculo{
    public String marca;
    public String modelo;
    public String dono;
    private double tanque_capacid;
    private double tanque_atual;
    private double autonomia_km_l;
    private double km_rodados;

    public Veiculo (String marca,
                    String modelo,
                    String dono,
                    double tanque_capacid,
                    double autonomia_km_l){
        this.dono = dono;
        this.marca = marca;
        this.modelo = modelo;
        this.tanque_atual = 0.0;
        this.km_rodados = 0.0;

        if(validarProp(tanque_capacid) == false || validarProp(autonomia_km_l) == false){
            System.out.println("Parâmetro Inválido!");
        }
        this.tanque_capacid = (validarProp(tanque_capacid) ? tanque_capacid : 10);
        this.autonomia_km_l = (validarProp(autonomia_km_l) ? autonomia_km_l : 10);
    }

    public double lerTanqueAtual(){
        return tanque_atual;
    }
    public double lerTanqueCapacid(){
        return tanque_capacid;
    }
    public double lerAutonomia(){
        return autonomia_km_l;
    }
    public double lerRodagem(){
        return km_rodados;
    }
    public  boolean alterarCapacidade(double capacidade){
        if(validarProp(capacidade)){
            tanque_capacid = capacidade;
            return true;
        }
        System.out.println("Parâmetro Inválido!");
        return false;

    }
    public  boolean alterarKMRodados(double km_rodados){
        if(validarProp(km_rodados)){
            this.km_rodados = km_rodados;
            return true;
        }
        System.out.println("Parâmetro Inválido!");
        return false;

    }

    public boolean alterarAutonomia(double autonomia){
        if(validarProp(autonomia)){
            autonomia_km_l = autonomia;
            return true;
        }
        System.out.println("Parâmetro Inválido!");
        return false;
    }
    public boolean abastecerTanque(double litros){
        if (validarProp(litros)){
            boolean res = (tanque_atual + litros <= tanque_capacid ? true : false);
            tanque_atual = (tanque_atual + litros <= tanque_capacid ? litros : 0);
            return res;
        }
        return false;
    }
    public boolean fazerViagem(double km){
        if(tanque_atual >= km / autonomia_km_l){
            km_rodados += km;
            tanque_atual -= (km / autonomia_km_l);
            return true;
        }
        return false;
    }
    private  boolean validarProp(double prop){
        if (prop >= 0){
            return true;
        }
        return false;
    }
}
