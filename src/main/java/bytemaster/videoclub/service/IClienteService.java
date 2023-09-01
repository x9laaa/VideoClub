package bytemaster.videoclub.service;

import bytemaster.videoclub.entity.Cliente;

import java.util.List;

public interface IClienteService {
    public Cliente crearCliente(Cliente nuevoCliente);

    public Cliente actualizarCliente(int id, Cliente clienteactualizar);

    public List<Cliente> listarCliente();

    public Cliente listarClienteID(int idCliente);

    public void eliminarCliente(int id);

    public void eliminarCliente2(Cliente cliente);
}
