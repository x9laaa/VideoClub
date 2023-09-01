package bytemaster.videoclub.restcontroller;

import bytemaster.videoclub.entity.Encargado;
import bytemaster.videoclub.service.IEncargadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/encargado")
public class EncargadoRestController {
    @Autowired
    IEncargadoService objEncargadoService;

    @PostMapping
    public Encargado crearEncargado(@RequestBody Encargado nuevoEncargado){
        return objEncargadoService.crearEncargdo(nuevoEncargado);
    }
    @PostMapping
    public Encargado actualizarEncargado(@RequestBody int id, Encargado encargado){
        return  objEncargadoService.actualizarEncargdo(id, encargado);
    }

    @GetMapping
    public List<Encargado> listarEncargado(){
        return objEncargadoService.listarEncargdo();
    }

    @GetMapping
    public Encargado listarEncargadoID(int idEncargado){
        return  objEncargadoService.listarEncargdoID(idEncargado);
    }

    @PostMapping
    public void eliminarEncargado(@RequestBody int id){
        objEncargadoService.eliminarEncargdo(id);
    }

    @PostMapping
    public void eliminarEncargado2(@RequestBody Encargado encargado){
        objEncargadoService.eliminarEncargdo2(encargado);
    }
}
