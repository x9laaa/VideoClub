package bytemaster.videoclub.service.serviceimpl;

import bytemaster.videoclub.entity.Arriendo;
import bytemaster.videoclub.service.IArriendoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("ArriendoServiceImpl")
public class ArriendoServiceImpl implements IArriendoService {
    @Autowired

    @Override
    public Arriendo crearArriendo(Arriendo nuevoArriendo) {
        return null;
    }

    @Override
    public Arriendo actualizarArriendo(int id) {
        return null;
    }

    @Override
    public List<Arriendo> listarArriendo() {
        return null;
    }

    @Override
    public Arriendo listarArriendoID(int idArriendo) {
        return null;
    }

    @Override
    public void eliminarArriendo(int id) {

    }
}