package bytemaster.videoclub.controller;

import bytemaster.videoclub.entity.Encargado;
import bytemaster.videoclub.service.IEncargadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/encargado")
public class EncargadoController {
    @Autowired
    IEncargadoService objEncargadoService;

    @GetMapping
    public String ListarEncargado (Model model){
        List<Encargado> lista = objEncargadoService.listarEncargado();
        model.addAttribute("attributeListarEncargado", lista);
        return "listarEncargados";
    }
    @GetMapping
    public String formularioCrearEncargado() {return "crearEncargado";}

    @PostMapping("/crear")
    public String crearEncargado (Encargado encargado){
        objEncargadoService.crearEncargado(encargado);
        return "redirect:/cliente";
    }
    @PostMapping("/eliminar/{id}")
    public String eliminarEncargado(@PathVariable int id){
        objEncargadoService.eliminarEncargado(id);
        return "redirect:/encargado";
    }
}

