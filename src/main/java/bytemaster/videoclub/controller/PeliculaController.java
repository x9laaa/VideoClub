package bytemaster.videoclub.controller;

import bytemaster.videoclub.entity.Pelicula;
import bytemaster.videoclub.service.IPeliculaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/pelicula")
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
    public String formularioCrearPelicula()
    {return "crearPelicula";}

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
    @GetMapping("/editar/{id}")
    public String formularioEditarPelicula(@PathVariable int id, Model model){
        Pelicula pelicula = objPeliculaService.listarPeliculasID(id);
        model.addAttribute("attributePelicula", pelicula);
        return "editarPelicula";
    }

    @PostMapping("/editar")
    public String editarPelicula(@ModelAttribute Pelicula pelicula){
        objPeliculaService.actualizarPelicula(pelicula.getId(),pelicula);
        return "redirect:/pelicula";
    }


}
