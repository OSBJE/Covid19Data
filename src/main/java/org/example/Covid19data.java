package org.example;

public class Covid19data {

    //*** attributes ***//

    private String region;
    private String aldersgruppe;
    private int tilfælde;
    private int døde;
    private int indlagteIntensiv;
    private int indlagte;
    private String dato;

    // *** construcot *** //
    public Covid19data(String region, String aldersgruppe, int tilfælde, int døde, int indlagteIntensiv, int indlagte, String dato) {
        this.region = region;
        this.aldersgruppe = aldersgruppe;
        this.tilfælde = tilfælde;
        this.døde = døde;
        this.indlagteIntensiv = indlagteIntensiv;
        this.indlagte = indlagte;
        this.dato = dato;
    }


    @Override
    public String toString() {
        return "Covid19Data{" +
                "region =" + region +
                ", aldersgruppe ='" + aldersgruppe + '\'' +
                ", tilfælde ='" + tilfælde + '\'' +
                ", døde ='" + døde + '\'' +
                ", indlagteInvensiv  ='" + indlagteIntensiv + '\'' +
                ", indlagte  ='" + indlagte + '\'' +
                ", dato  ='" + dato + '\'' +
                '}';
    }




}
