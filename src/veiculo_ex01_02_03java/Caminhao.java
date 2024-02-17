package veiculo_ex01_02_03java;

public class Caminhao extends Veiculo {
    public int qnt_eixos;
    private double capacid_carga;

    public Caminhao(String marca,
                    String modelo,
                    String dono,
                    double tanque_capacid,
                    double autonomia_km_l,
                    double capacid_carga,
                    int qnt_eixos){
        super(marca, modelo, dono, tanque_capacid, autonomia_km_l);
        if(capacid_carga < 0 || qnt_eixos < 0 == false) System.out.println("Parâmetro Inválido!");
        this.capacid_carga = (capacid_carga < 0 ? capacid_carga : 10);
        this.qnt_eixos = (qnt_eixos < 0 ? qnt_eixos : 10);


    }
    public Caminhao(String marca,
                    String modelo,
                    String dono,
                    double tanque_capacid,
                    double autonomia_km_l,
                    double km_rodados,
                    double capacid_carga,
                    int qnt_eixos){
        super(marca, modelo, dono, tanque_capacid, autonomia_km_l);
        if(capacid_carga < 0 || qnt_eixos < 0 == false) System.out.println("Parâmetro Inválido!");
        this.capacid_carga = (capacid_carga < 0 ? capacid_carga : 10);
        this.qnt_eixos = (qnt_eixos < 0 ? qnt_eixos : 10);
        alterarKMRodados(km_rodados);
    }
    public double lerCapacidCarga(){
        return capacid_carga;
    }
    public boolean fazerViagem(double km, double carga){
        if(capacid_carga < carga) return false;
        return super.fazerViagem(km);
    }


}