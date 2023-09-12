package bytemaster.videoclub.controller;

import bytemaster.videoclub.entity.Arriendo;
import bytemaster.videoclub.entity.Cliente;
import bytemaster.videoclub.entity.Encargado;
import bytemaster.videoclub.entity.Pelicula;
import bytemaster.videoclub.service.IArriendoService;
import bytemaster.videoclub.service.IClienteService;
import bytemaster.videoclub.service.IEncargadoService;
import bytemaster.videoclub.service.IPeliculaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/arriendo")
public class ArriendoController {
    @Autowired
    IArriendoService objArriendoService;

    @Autowired
    IClienteService objClienteService;

    @Autowired
    IPeliculaService objPeliculaService;

    @Autowired
    IEncargadoService objEncargadoService;

    @GetMapping
    public String ListarArriendo (Model model){
        List<Arriendo> lista = objArriendoService.listarArriendo();
        model.addAttribute("attributeListarArriendo", lista);
        return "listarArriendo";
    }
    @GetMapping("/crear")
    public String formularioCrearArriendo(Model model) {
        List<Pelicula> listaPeli = objPeliculaService.listarPelicula();
        model.addAttribute("attributeListarPelicula", listaPeli);
        List<Cliente> listaCliente = objClienteService.listarCliente();
        model.addAttribute("attributeListarCliente", listaCliente);
        List<Encargado> listaEncargado = objEncargadoService.listarEncargado();
        model.addAttribute("attributeListarEncargado", listaEncargado);
        return "crearArriendo";
    }
    @PostMapping("/crear")
    public String crearArriendo (@ModelAttribute Arriendo arriendo){
        objArriendoService.crearArriendo(arriendo);
        return "redirect:/arriendo";
    }
    @PostMapping("/eliminar/{id}")
    public String eliminarArriendo(@PathVariable int id){
        objArriendoService.eliminarArriendo(id);
        return "redirect:/arriendo";
    }
}
