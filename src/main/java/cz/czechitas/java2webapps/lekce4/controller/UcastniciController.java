package cz.czechitas.java2webapps.lekce4.controller;

import cz.czechitas.java2webapps.lekce4.entity.Ucastnik;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller()
@RequestMapping("/ucastnici")
public class UcastniciController {

  private final List<Ucastnik> seznamUcastniku = List.of(
        new Ucastnik("Medvídek","Pú","Stokorcový les","https://upload.wikimedia.org/wikipedia/en/3/3e/Pooh_Shepard1928.jpg"),
        new Ucastnik("Čarodějnice","Malá","Bouda u lesa",null)
  );
  @GetMapping("/")
  public ModelAndView seznam() {
    ModelAndView result = new ModelAndView("/ucastnici/index");
    result.addObject("ucastnici",seznamUcastniku);
    return result;
  }


  @GetMapping("/detail/{id}")
  public ModelAndView detail(@PathVariable int id) {
    ModelAndView result = new ModelAndView("/ucastnici/detail");
    result.addObject("ucastnik", seznamUcastniku.get(id));
    return result;
  }

}
