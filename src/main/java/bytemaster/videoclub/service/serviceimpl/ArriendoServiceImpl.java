package bytemaster.videoclub.service.serviceimpl;

import bytemaster.videoclub.entity.Arriendo;
import bytemaster.videoclub.repository.IArriendoRepository;
import bytemaster.videoclub.service.IArriendoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("ArriendoServiceImpl")
public class ArriendoServiceImpl implements IArriendoService {
    @Autowired
    IArriendoRepository objArriendoRepo;

    @Override
    public Arriendo crearArriendo(Arriendo nuevoArriendo) {
        return objArriendoRepo.save(nuevoArriendo);
    }

    @Override
    public Arriendo actualizarArriendo(int id) {
        return null;
    }

    @Override
    public List<Arriendo> listarArriendo() {
        return objArriendoRepo.findAll();
    }

    @Override
    public Arriendo listarArriendoID(int idArriendo) {
        return null;
    }

    @Override
    public void eliminarArriendo(int id) {

    }
}