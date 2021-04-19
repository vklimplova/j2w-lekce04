package cz.czechitas.java2webapps.lekce4.entity;

import java.time.LocalDate;
import java.time.LocalTime;

/**
 * Informace o jedné lekci.
 */
public class Lekce {
  private String nazev;
  private LocalDate datum;
  private LocalTime casOd;
  private LocalTime casDo;
  private String misto;
}
