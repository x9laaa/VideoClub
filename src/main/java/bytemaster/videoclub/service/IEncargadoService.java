package bytemaster.videoclub.service;

import bytemaster.videoclub.entity.Encargado;
import java.util.List;

public interface IEncargadoService {
    public Encargado crearEncargdo(Encargado nuevoEncargdo);

    public Encargado actualizarEncargdo(int id);

    public List<Encargado> listarEncargdo();

    public Encargado listarEncargdoID(int idEncargdo);

    public void eliminarEncargdo(int id);
}