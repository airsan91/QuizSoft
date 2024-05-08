package Controlador;

import Entidades.Ciudadano;
import Operaciones.OperacionesCiudadano;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ControladorCiudadano {
    @Autowired
    private OperacionesCiudadano operacionesCiudadano;

    @GetMapping("/ListarCiudadano")
    public String listarCiudadano(Model modelo) {
        modelo.addAttribute("ciudadano", operacionesCiudadano.listarCiudadanos());
        return "listaCiudadano.html";
    }

    @GetMapping("/nuevoCiudadano")
    public String mostrarFormularioCiudadano(Model modelo) {
        Ciudadano ciudadano = new Ciudadano();
        modelo.addAttribute("ciudadanos", ciudadano);
        return "registroCiudadano.html";
    }

    @PostMapping("/nuevoCiudadano")
    public String guardarCiudadano(@ModelAttribute("Ciudadano")Ciudadano ciudadano) {
        operacionesCiudadano.guardarCiudadano(ciudadano);
        return "redirect:/ListarCiudadano.html";
    }

}
