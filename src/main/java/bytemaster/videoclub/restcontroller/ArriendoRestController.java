package bytemaster.videoclub.restcontroller;

import bytemaster.videoclub.entity.Arriendo;
import bytemaster.videoclub.service.IArriendoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/arriendo")
public class ArriendoRestController {
    @Autowired
    IArriendoService objArriendoService;

    @PostMapping
    public Arriendo crearArriendo(@RequestBody Arriendo nuevoArriendo){
        return objArriendoService.crearArriendo(nuevoArriendo);

    }
    @PutMapping("/{id}")
    public Arriendo actualizarArriendo(@PathVariable int id,@RequestBody Arriendo arriendoActualizar){
        return  objArriendoService.actualizarArriendo(id, arriendoActualizar);
    }

    @GetMapping
    public List<Arriendo> listarArriendo(){
        return objArriendoService.listarArriendo();
    }

    @GetMapping("/{idArriendo}")
    public Arriendo listarArriendoID(@PathVariable int idArriendo){
        return  objArriendoService.listarArriendoID(idArriendo);
    }

    @DeleteMapping("/{id}")
    public void eliminarArriendo(@PathVariable int id){
        objArriendoService.eliminarArriendo(id);
    }

    @DeleteMapping
    public void eliminarArriendo2(@RequestBody Arriendo arriendo){
        objArriendoService.eliminarArriendo2(arriendo);
    }
}