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
    @PostMapping
    public Arriendo actualizarArriendo(@RequestBody int id){
        return  objArriendoService.actualizarArriendo(id);

    }

    @GetMapping
    public List<Arriendo> listarArriendo(){
        return objArriendoService.listarArriendo();
    }

    @GetMapping
    public Arriendo listarArriendoID(int idArriendo){
        return  objArriendoService.listarArriendoID(idArriendo);
    }

    @PostMapping
    public void eliminarArriendo(@RequestBody int id){
        objArriendoService.eliminarArriendo(id);
    }
}