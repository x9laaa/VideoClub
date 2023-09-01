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
    public Cliente actualizarCliente(int id, Cliente clienteactualizar) {
        Cliente cliente1= objClienterepo.findById(id).orElse(null);
        cliente1.setNombre(clienteactualizar.getNombre());
        cliente1.setCorreo(clienteactualizar.getCorreo());
        return objClienterepo.save(cliente1);
    }

    @Override
    public List<Cliente> listarCliente() {return objClienterepo.findAll();
    }

    @Override
    public Cliente listarClienteID(int idCliente) {
        return objClienterepo.findById(idCliente).orElse(null);
    }

    @Override
    public void eliminarCliente(int id) {
        objClienterepo.deleteById(id);
    }
    @Override
    public void eliminarCliente2( Cliente cliente) {
        objClienterepo.delete(cliente);
    }
}
