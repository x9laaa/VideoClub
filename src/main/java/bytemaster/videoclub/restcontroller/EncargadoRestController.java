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
        return objEncargadoService.crearEncargado(nuevoEncargado);
    }
    @PutMapping("/{id}")
    public Encargado actualizarEncargado(@PathVariable int id,@RequestBody Encargado encargado){
        return  objEncargadoService.actualizarEncargado(id, encargado);
    }

    @GetMapping
    public List<Encargado> listarEncargado(){
        return objEncargadoService.listarEncargado();
    }

    @GetMapping("/{idEncargado}")
    public Encargado listarEncargadoID(@PathVariable int idEncargado){
        return  objEncargadoService.listarEncargadoID(idEncargado);
    }

    @DeleteMapping("/{id}")
    public void eliminarEncargado(@PathVariable int id){
        objEncargadoService.eliminarEncargado(id);
    }

    @DeleteMapping
    public void eliminarEncargado2(@RequestBody Encargado encargado){
        objEncargadoService.eliminarEncargado2(encargado);
    }
}
