package org.example.lab2.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.ui.Model;

import java.util.ArrayList;

@Controller
public class ConfiguracionController {
    @RequestMapping(value = {"/patito_hule"}, method = RequestMethod.GET)

    @GetMapping("/config")
    public String formularioPatito(Model model){
        Patito patito = new Patito();
        model.addAttribute("patito",patito);
        return "configuracion";

    }


    @PostMapping("/config/guardar")
    public String guardarDatos(@RequestParam("numFilas") String numFilas,
                                @RequestParam("numColumnas") String numColumnas,
                               @RequestParam("iniciales") ArrayList<String> posIniciales,
                               @RequestParam("cantfotos") String cantFotos
                               ) {
        return "configuracion";
    }
}
