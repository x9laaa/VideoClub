package bytemaster.videoclub.service.serviceimpl;

import bytemaster.videoclub.entity.Encargado;
import bytemaster.videoclub.repository.IEncargadoRepository;
import bytemaster.videoclub.service.IEncargadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("EncargadoServiceImpl")
public class EncargadoServiceImpl implements IEncargadoService {
    @Autowired
    IEncargadoRepository objEncargadoRepo;
    @Override
    public Encargado crearEncargdo(Encargado nuevoEncargdo) {
        return objEncargadoRepo.save(nuevoEncargdo);
    }

    @Override
    public Encargado actualizarEncargdo(int id) {
        return null;
    }

    @Override
    public List<Encargado> listarEncargdo() {
        return objEncargadoRepo.findAll();
    }

    @Override
    public Encargado listarEncargdoID(int idEncargdo) {
        return null;
    }

    @Override
    public void eliminarEncargdo(int id) {

    }
}
