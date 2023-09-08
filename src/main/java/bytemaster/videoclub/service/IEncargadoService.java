package bytemaster.videoclub.service;

import bytemaster.videoclub.entity.Encargado;
import java.util.List;

public interface IEncargadoService {
    public Encargado crearEncargado(Encargado nuevoEncargado);

    public Encargado actualizarEncargado(int id, Encargado encargado);

    public List<Encargado> listarEncargado();

    public Encargado listarEncargadoID(int idEncargado);

    public void eliminarEncargado(int id);
    public void eliminarEncargado2(Encargado encargado);
}