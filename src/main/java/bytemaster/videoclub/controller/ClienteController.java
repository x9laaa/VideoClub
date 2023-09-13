package bytemaster.videoclub.controller;

import bytemaster.videoclub.entity.Cliente;
import bytemaster.videoclub.service.IClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/cliente")
public class ClienteController {
    @Autowired
    IClienteService objClienteService;

    @GetMapping
    public String listarClientes(Model model){
        List<Cliente> lista = objClienteService.listarCliente();
        model.addAttribute("attributeListaCliente",lista);
        return "listarClientes";
    }

    @GetMapping("/crear")
    public String formularioCrearCliente(){
        return "crearCliente";
    }

    @PostMapping("/crear")
    public String crearCliente(Cliente cliente){
        objClienteService.crearCliente(cliente);
        return "redirect:/cliente";
    }
    @PostMapping("/eliminar/{id}")
    public String elimniarAlumno(@PathVariable int id){
        objClienteService.eliminarCliente(id);
        return "redirect:/cliente";
    }

    @GetMapping("/editar/{id}")
    public String formularioEditarCliente(@PathVariable int id, Model model){
        Cliente cliente = objClienteService.listarClienteID(id);
        model.addAttribute("attributeCliente",cliente);
        return "editarCliente";
    }

    @PostMapping("/editar")
    public String editarCliente(@ModelAttribute Cliente cliente){
        objClienteService.actualizarCliente(cliente.getId(), cliente);
        return "redirect:/cliente";
    }


}
