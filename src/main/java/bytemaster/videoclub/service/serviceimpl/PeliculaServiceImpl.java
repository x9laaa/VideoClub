package bytemaster.videoclub.service.serviceimpl;

import bytemaster.videoclub.entity.Pelicula;
import bytemaster.videoclub.repository.IPeliculaRepository;
import bytemaster.videoclub.service.IPeliculaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("PeliculaServiceImpl")
public class PeliculaServiceImpl implements IPeliculaService {
    @Autowired
    IPeliculaRepository objPeliculaRepo;
    @Override
    public Pelicula crearPelicula(Pelicula nuevaPelicula) {
        return objPeliculaRepo.save(nuevaPelicula);
    }

    @Override
    public Pelicula actualizarPelicula(int id) {
        return null;
    }

    @Override
    public List<Pelicula> listarPelicula() {
        return objPeliculaRepo.findAll();
    }

    @Override
    public Pelicula listarPeliculasID(int idPelicula) {
        return null;
    }

    @Override
    public void eliminarPelicula(int id) {

    }
}
