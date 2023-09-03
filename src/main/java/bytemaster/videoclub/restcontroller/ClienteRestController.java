package bytemaster.videoclub.restcontroller;

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
    @PutMapping("/{id}")
    public Cliente actualizarCliente(@PathVariable int id,@RequestBody Cliente cliente){
        return objClienteService.actualizarCliente(id, cliente);
    }
    @GetMapping
    public List<Cliente> listarCliente() { return objClienteService.listarCliente(); }
    @GetMapping("/{idCliente}")
    public Cliente listarClienteID(@PathVariable int idCliente) { return objClienteService.listarClienteID(idCliente);}

    @DeleteMapping("/{id}")
    public void eliminarCliente(@PathVariable int id){ objClienteService.eliminarCliente(id);}

    @DeleteMapping
    public void eliminarCliente2(@RequestBody Cliente cliente){ objClienteService.eliminarCliente2(cliente);}

}
