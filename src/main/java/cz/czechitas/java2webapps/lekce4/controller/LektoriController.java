package cz.czechitas.java2webapps.lekce4.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Kontroler obsluhující sekci lektorů.
 */
@Controller()
@RequestMapping("/lektori")
public class LektoriController {

  /**
   * Metoda kontroleru obsluhující adresu {@code /lektori/}. Používá šablonu {@code /templates/lektori/index.html}.
   *
   */
  @GetMapping("/")
  public String lektori() {
    return "lektori/index";
  }

}
