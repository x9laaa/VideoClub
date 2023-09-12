package bytemaster.videoclub.controller;

import bytemaster.videoclub.entity.Arriendo;
import bytemaster.videoclub.entity.Pelicula;
import bytemaster.videoclub.service.IArriendoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/arriendo")
public class ArriendoController {
    @Autowired
    IArriendoService objArriendoService;

    @GetMapping
    public String ListarArriendo (Model model){
        List<Arriendo> lista = objArriendoService.listarArriendo();
        model.addAttribute("attributeListarArriendo", lista);
        return "listarArriendo";
    }
    @GetMapping("/crear")
    public String formularioCrearArriendo() {
        return "crearArriendo";
    }
    @PostMapping("/crear")
    public String crearArriendo (Arriendo arriendo){
        objArriendoService.crearArriendo(arriendo);
        return "redirect:/arriendo";
    }
    @PostMapping("/eliminar/{id}")
    public String eliminarArriendo(@PathVariable int id){
        objArriendoService.eliminarArriendo(id);
        return "redirect:/arriendo";
    }
}
