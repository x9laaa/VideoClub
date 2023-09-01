package bytemaster.videoclub.restcontroller;

import bytemaster.videoclub.entity.Pelicula;
import bytemaster.videoclub.service.IPeliculaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/pelicula")
public class PeliculaRestController {
    @Autowired
    IPeliculaService objPeliculaService;

    @PostMapping
    public Pelicula crearPelicula(@RequestBody Pelicula nuevoPelicula){
        return objPeliculaService.crearPelicula(nuevoPelicula);
    }
    @PostMapping
    public Pelicula actualizarPelicula(@RequestBody int id, Pelicula pelicula){
        return  objPeliculaService.actualizarPelicula(id, pelicula);
    }

    @GetMapping
    public List<Pelicula> listarPelicula(){
        return objPeliculaService.listarPelicula();
    }

    @GetMapping
    public Pelicula listarPeliculaID(int idPelicula){
        return  objPeliculaService.listarPeliculasID(idPelicula);
    }

    @PostMapping
    public void eliminarPelicula(@RequestBody int id){
        objPeliculaService.eliminarPelicula(id);
    }
    @PostMapping
    public void eliminarPelicula2(@RequestBody Pelicula pelicula){
        objPeliculaService.eliminarPelicula2(pelicula);
    }
}
