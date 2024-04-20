package org.example.lab2.Controller;

import org.example.lab2.Controller.Patito;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.ui.Model;

import javax.security.auth.login.Configuration;
import java.util.ArrayList;

@Controller
@RequestMapping(value = "patito_hule", method = RequestMethod.GET)
public class ConfiguracionController {

    Patito patito = new Patito();

    private String cantFilas;
    private String cantColumnas;
    private int cantCasillas;
    private int cantidadFotos;


    @GetMapping(value = "")
    public String configuracion(){
        return "configuracion";
    }

    @PostMapping(value = "/config")
    public String guardarDatos( @RequestParam(name = "numFilas") String numFilas ,
                                @RequestParam(name = "numColumnas") String numColumnas,
                                @RequestParam(name = "posIniciales") String posIniciales,
                                @RequestParam(name = "cantFotos") String cantFotos){


        patito.setNumFilas(Integer.parseInt(numFilas));
        patito.setNumColumnas(Integer.parseInt(numColumnas));
        patito.setPosIniciales(posIniciales);
        patito.setCantFotos(Integer.parseInt(cantFotos));

        cantFilas = String.valueOf(patito.getNumFilas());
        cantColumnas = String.valueOf(patito.getNumColumnas());
        cantCasillas = Integer.parseInt(cantFilas) * Integer.parseInt(cantColumnas);
        cantidadFotos = Integer.parseInt(cantFotos);

        return "redirect:fotogramas";
    }



    @GetMapping("/fotogramas")
    public String juegoPatito(Model model){

        model.addAttribute("filas",cantFilas);
        model.addAttribute("columnas",cantColumnas);
        model.addAttribute("cantidadCasillas",cantCasillas);
        model.addAttribute("cantidadFotos", cantidadFotos);

        return "fotogramas";
    }
}
