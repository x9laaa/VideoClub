package bytemaster.videoclub.service.serviceimpl;

import bytemaster.videoclub.entity.Cliente;
import bytemaster.videoclub.repository.IClienteRepository;
import bytemaster.videoclub.service.IClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("ClienteServiceImpl")
public class ClienteServiceImpl implements IClienteService {
    @Autowired
    IClienteRepository objClienterepo;
    @Override
    public Cliente crearCliente(Cliente nuevoCliente) {
        return objClienterepo.save(nuevoCliente);
    }

    @Override
    public Cliente actualizarCliente(int id) {
        return null;
    }

    @Override
    public List<Cliente> listarCliente() {
        return objClienterepo.findAll();
    }

    @Override
    public Cliente listarClienteID(int idCliente) {
        return null;
    }

    @Override
    public void eliminarCliente(int id) {

    }
}
