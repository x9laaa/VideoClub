package bytemaster.videoclub.service.serviceimpl;

import bytemaster.videoclub.entity.Encargado;
import bytemaster.videoclub.service.IEncargadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("EncargadoServiceImpl")
public class EncargadoServiceImpl implements IEncargadoService {
    @Autowired
    @Override
    public Encargado crearEncargdo(Encargado nuevoEncargdo) {
        return null;
    }

    @Override
    public Encargado actualizarEncargdo(int id) {
        return null;
    }

    @Override
    public List<Encargado> listarEncargdo() {
        return null;
    }

    @Override
    public Encargado listarEncargdoID(int idEncargdo) {
        return null;
    }

    @Override
    public void eliminarEncargdo(int id) {

    }
}
