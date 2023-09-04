package bytemaster.videoclub.service;
import bytemaster.videoclub.entity.Pelicula;
import java.util.List;

public interface IPeliculaService {
        public Pelicula crearPelicula(Pelicula nuevaPelicula);
        public Pelicula actualizarPelicula(int id, Pelicula pelicula);
        public List<Pelicula> listarPelicula();
        public Pelicula listarPeliculasID(int idPelicula);
        public void eliminarPelicula(int id);
        public void eliminarPelicula2(Pelicula pelicula);
}
