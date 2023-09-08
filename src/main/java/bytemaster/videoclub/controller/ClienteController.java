package bytemaster.videoclub.controller;

import bytemaster.videoclub.entity.Cliente;
import bytemaster.videoclub.service.IClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

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
}
