package cz.czechitas.java2webapps.lekce4.controller;

import cz.czechitas.java2webapps.lekce4.entity.Pohlavi;
import cz.czechitas.java2webapps.lekce4.entity.Ucastnik;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.Arrays;
import java.util.List;

/**
 * Kontroler obsluhující sekci účastníků.
 */
@Controller()
@RequestMapping(value = "/ucastnici")
public class UcastniciController {
  private final List<Ucastnik> ucastnici;

  public UcastniciController() {
    ucastnici = Arrays.asList(
            new Ucastnik("Panenka", "Maková", "Mákovice", Pohlavi.ZENA, "https://www.postavy.cz/foto/makova-panenka-foto.jpg"),
            new Ucastnik("Emanuel", "Motýl", "Luční Bouda", Pohlavi.MUZ, "https://www.postavy.cz/foto/motyl-emanuel-foto.jpg"),
            new Ucastnik("Čarodějnice", "Malá", "Chaloupka", Pohlavi.ZENA, "https://cdn.alza.cz/ImgW.ashx?fd=f16&cd=TRG002m"),
            new Ucastnik("Amálka", "Víla", null, Pohlavi.ZENA, "https://www.veselepohadky.cz/assets/nahlady-kategorie/116/vila-amalka-pohadka.jpg"),
            new Ucastnik("Vševěd", "Rákosníček", "rybníček Brčálník", Pohlavi.MUZ, "http://www.supermamina.cz/files/img/201304072252_mlha.png")
    );
  }

  /**
   * Seznam účastníků.
   *
   * Metoda kontroleru obsluhující adresu {@code /ucastnici/}. Používá šablonu {@code /templates/ucastnici/index.html}.
   */
  @GetMapping("/")
  public ModelAndView ucastnici() {
    ModelAndView modelAndView = new ModelAndView("ucastnici/index");
    modelAndView.addObject("ucastnici", ucastnici);
    return modelAndView;
  }

  /**
   * Detail účastníka účastníků.
   *
   * Metoda kontroleru obsluhující adresu {@code /ucastnici/detail}. Používá šablonu {@code /templates/ucastnici/detail.html}.
   */
  @GetMapping("/detail")
  public ModelAndView detail(int id) {
    ModelAndView modelAndView = new ModelAndView("ucastnici/detail");
    modelAndView.addObject("ucastnik", ucastnici.get(id));
    return modelAndView;
  }

}
