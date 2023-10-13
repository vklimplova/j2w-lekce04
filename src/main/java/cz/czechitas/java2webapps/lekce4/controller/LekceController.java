package cz.czechitas.java2webapps.lekce4.controller;

import cz.czechitas.java2webapps.lekce4.entity.Lekce;
import cz.czechitas.java2webapps.lekce4.entity.Ucastnik;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

@Controller()
@RequestMapping("/lekce")
public class LekceController {

  private final LocalDate datum = LocalDate.of(2023, 9, 19);
  private final LocalTime cas = LocalTime.of(18, 0);
  private final List<Lekce> seznamLekci = List.of(
          new Lekce("Lekce 1",datum.minusWeeks(0),cas,"Chaloupka u lesa"),
          new Lekce("Lekce 2",datum.minusWeeks(1), cas, "Chaloupka u lesa")
  );
  @GetMapping("/")
  public ModelAndView seznam() {
    ModelAndView result = new ModelAndView("/lekce/index");
    result.addObject("lekce",seznamLekci);
    return result;
  }


  @GetMapping("/detail/{id}")
  public ModelAndView detail(@PathVariable int id) {
    ModelAndView result = new ModelAndView("/lekce/detail");
    result.addObject("lekce", seznamLekci.get(id));
    return result;
  }
}
