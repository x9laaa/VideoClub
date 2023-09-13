package bytemaster.videoclub.controller;

import bytemaster.videoclub.entity.Encargado;
import bytemaster.videoclub.service.IEncargadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/encargado")
public class EncargadoController {
    @Autowired
    IEncargadoService objEncargadoService;

    @GetMapping
    public String ListarEncargado (Model model){
        List<Encargado> lista = objEncargadoService.listarEncargado();
        model.addAttribute("attributeListarEncargado",lista);
        return "listarEncargados";
    }
    @GetMapping("/crear")
    public String formularioCrearEncargado() {return "crearEncargado";}

    @PostMapping("/creaeditarPelicular")
    public String crearEncargado (Encargado encargado){
        objEncargadoService.crearEncargado(encargado);
        return "redirect:/encargado";
    }
    @PostMapping("/eliminar/{id}")
    public String eliminarEncargado(@PathVariable int id){
        objEncargadoService.eliminarEncargado(id);
        return "redirect:/encargado";
    }
    @GetMapping("/editar/{id}")
    public String formularioEditarEncargado(@PathVariable int id, Model model){
        Encargado encargado = objEncargadoService.listarEncargadoID(id);
        model.addAttribute("attributeEncargado", encargado);
        return "editarEncargado";
    }

    @PostMapping("/editar")
    public String editarEncargado(@ModelAttribute Encargado encargado){
        objEncargadoService.actualizarEncargado(encargado.getId(),encargado);
        return "redirect:/encargado";
    }
}

