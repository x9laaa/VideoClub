package bytemaster.videoclub.restcontroller;


import bytemaster.videoclub.entity.Arriendo;
import bytemaster.videoclub.entity.Cliente;
import bytemaster.videoclub.service.IClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/cliente")
public class ClienteRestController {
    @Autowired
    IClienteService objClienteService;

    @PostMapping
    public Cliente crearCliente(@RequestBody Cliente nuevoCliente){
        return objClienteService.crearCliente(nuevoCliente);
    }
    @PostMapping
    public Cliente actualizarCliente(@RequestBody int id){
        return objClienteService.actualizarCliente(id);
    }
    @GetMapping
    public List<Cliente> listarCliente() { return objClienteService.listarCliente(); }
    @GetMapping
    public Cliente listarClienteID(int idCliente) { return objClienteService.listarClienteID(idCliente);}

    @PostMapping
    public void eliminarCliente(@RequestBody int id){ objClienteService.eliminarCliente(id);}
}
