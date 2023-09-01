package bytemaster.videoclub.service.serviceimpl;

import bytemaster.videoclub.entity.Cliente;
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
    public Pelicula actualizarPelicula(int id,Pelicula actualizarpelicula) {
        Pelicula pelicula1= objPeliculaRepo.findById(id).orElse(null);
        pelicula1.setTitulo(actualizarpelicula.getTitulo());
        pelicula1.setGenero(actualizarpelicula.getGenero());
        pelicula1.setPrecioArriendo(actualizarpelicula.getPrecioArriendo());
        return  objPeliculaRepo.save(pelicula1);
    }

    @Override
    public List<Pelicula> listarPelicula() {
        return objPeliculaRepo.findAll();
    }

    @Override
    public Pelicula listarPeliculasID(int idPelicula) {
        return objPeliculaRepo.findById(idPelicula).orElse(null);
    }
    @Override
    public void eliminarPelicula(int id) {
        objPeliculaRepo.deleteById(id);
    }
    @Override
    public void eliminarPelicula2(Pelicula pelicula){
        objPeliculaRepo.delete(pelicula);

    }
}
