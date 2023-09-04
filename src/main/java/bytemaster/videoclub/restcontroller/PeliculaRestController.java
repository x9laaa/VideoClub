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

    @PutMapping("/{id}")
    public Pelicula actualizarPelicula(@RequestBody int id,@RequestBody Pelicula pelicula){
        return  objPeliculaService.actualizarPelicula(id, pelicula);
    }

    @GetMapping
    public List<Pelicula> listarPelicula(){
        return objPeliculaService.listarPelicula();
    }

    @GetMapping("/{idPelicula}")
    public Pelicula listarPeliculaID(@PathVariable int idPelicula){
        return  objPeliculaService.listarPeliculasID(idPelicula);
    }

    @DeleteMapping("/{id}")
    public void eliminarPelicula(@PathVariable int id){
        objPeliculaService.eliminarPelicula(id);
    }

    @DeleteMapping
    public void eliminarPelicula2(@RequestBody Pelicula pelicula){
        objPeliculaService.eliminarPelicula2(pelicula);
    }
}
