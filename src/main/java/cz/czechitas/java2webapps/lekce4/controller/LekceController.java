package cz.czechitas.java2webapps.lekce4.controller;

import cz.czechitas.java2webapps.lekce4.entity.Lekce;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

/**
 * Kontroler obsluhující sekci lekcí.
 */
@Controller()
@RequestMapping("/lekce")
public class LekceController {

  private final List<Lekce> lekce;

  public LekceController() {
    lekce = List.of(
            new Lekce("Lekce 1 – HTML", LocalDate.of(2021, 4, 26), LocalTime.of(14, 0), LocalTime.of(16, 0), "V mechu"),
            new Lekce("Lekce 2 – CSS", LocalDate.of(2021, 4, 27), LocalTime.of(14, 0), LocalTime.of(16, 0), "V kapradí"),
            new Lekce("Lekce 3 – JavaScript", LocalDate.of(2021, 4, 28), LocalTime.of(14, 0), LocalTime.of(16, 0), "V lese"),
            new Lekce("Lekce 4 – React", LocalDate.of(2021, 4, 29), LocalTime.of(14, 0), LocalTime.of(16, 0), "Na palouku"),
            new Lekce("Lekce 5 – TypeScript", LocalDate.of(2021, 4, 30), LocalTime.of(14, 0), LocalTime.of(16, 0), "U lesa"),
            new Lekce("Lekce 6 – Java", LocalDate.of(2021, 5, 3), LocalTime.of(14, 0), LocalTime.of(16, 0), null),
            new Lekce("Lekce 7 – Spring", LocalDate.of(2021, 5, 4), LocalTime.of(14, 0), LocalTime.of(16, 0), null),
            new Lekce("Lekce 8 – SQL", LocalDate.of(2021, 5, 5), LocalTime.of(14, 0), LocalTime.of(16, 0), null),
            new Lekce("Lekce 9 – JPA", LocalDate.of(2021, 5, 6), LocalTime.of(14, 0), LocalTime.of(16, 0), null),
            new Lekce("Lekce 10 – REST", LocalDate.of(2021, 5, 7), LocalTime.of(14, 0), LocalTime.of(16, 0), null)
    );
  }

  /**
   * Metoda kontroleru obsluhující adresu {@code /lekce/}. Používá šablonu {@code /templates/lekce/index.html}.
   * @return
   */
  @GetMapping("/")
  public ModelAndView lekce() {
    ModelAndView result = new ModelAndView("lekce/index");
    result.addObject("seznamLekci", lekce);
    return result;
  }
}
