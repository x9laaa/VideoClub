package bytemaster.videoclub.controller;

import bytemaster.videoclub.entity.Pelicula;
import bytemaster.videoclub.service.IPeliculaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping
public class PeliculaController {
    @Autowired
    IPeliculaService objPeliculaService;

    @GetMapping
    public String ListarPelicula (Model model){
        List<Pelicula> lista = objPeliculaService.listarPelicula();
        model.addAttribute("attributeListarPelicula", lista);
        return "listarPelicula";
    }
    @GetMapping("/crear")
    public String formularioCrearPelicula() {return "crearPelicula";}

    @PostMapping("/crear")
    public String crearPelicula (Pelicula pelicula){
        objPeliculaService.crearPelicula(pelicula);
        return "redirect:/pelicula";
    }
    @PostMapping("/eliminar/{id}")
    public String eliminarPelicula(@PathVariable int id){
        objPeliculaService.eliminarPelicula(id);
        return "redirect:/pelicula";
    }


}
