package org.example.lab2.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.ui.Model;

import java.util.ArrayList;

@Controller
public class ConfiguracionController {

    @GetMapping("/patito_hule")
    public String formularioPatito(Model model){
        Patito patito = new Patito();
        model.addAttribute("patito",patito);
        return "configuracion";

    }


    @PostMapping("/patito_hule/fotogramas")
    public String guardarDatos( Patito patito){
        return "fotogramas";
    }

}
