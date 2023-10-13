package cz.czechitas.java2webapps.lekce4.entity;

import java.time.LocalDate;
import java.time.LocalTime;

public class Lekce {
    private String nazevLekce;
    private LocalDate datum;
    private LocalTime cas;
    private String mistoKonani;


    public Lekce(String nazevLekce, LocalDate datum, LocalTime cas, String mistoKonani) {
        this.nazevLekce = nazevLekce;
        this.datum = datum;
        this.cas = cas;
        this.mistoKonani = mistoKonani;

    }
    public String getNazevLekce() {
        return nazevLekce;
    }

    public void setNazevLekce(String nazevLekce) {
        this.nazevLekce = nazevLekce;
    }

    public LocalDate getDatum() {
        return datum;
    }

    public void setDatum(LocalDate datum) {
        this.datum = datum;
    }

    public LocalTime getCas() {
        return cas;
    }

    public void setCas(LocalTime cas) {
        this.cas = cas;
    }

    public String getMistoKonani() {
        return mistoKonani;
    }

    public void setMistoKonani(String mistoKonani) {
        this.mistoKonani = mistoKonani;
    }

}
