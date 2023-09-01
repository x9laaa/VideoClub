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
    public Encargado actualizarEncargdo(int id, Encargado encargadoActualizar) {
        Encargado encargadoEncontrado = objEncargadoRepo.findById(id).orElse(null);
        encargadoEncontrado.setNombre(encargadoActualizar.getNombre());
        encargadoEncontrado.setCorreo(encargadoActualizar.getCorreo());
        encargadoEncontrado.setPass(encargadoActualizar.getPass());
        encargadoEncontrado.setEdad(encargadoActualizar.getEdad());
        encargadoEncontrado.setDireccion(encargadoActualizar.getDireccion());
        encargadoEncontrado.setTelefono(encargadoActualizar.getTelefono());
        return objEncargadoRepo.save(encargadoEncontrado);
    }

    @Override
    public List<Encargado> listarEncargdo() {
        return objEncargadoRepo.findAll();
    }

    @Override
    public Encargado listarEncargdoID(int idEncargdo) {
        return objEncargadoRepo.findById(idEncargdo).orElse(null);
    }

    @Override
    public void eliminarEncargdo(int id) {
        objEncargadoRepo.deleteById(id);

    }
    @Override
    public void eliminarEncargdo2(Encargado encargado) {
        objEncargadoRepo.delete(encargado);

    }
}
