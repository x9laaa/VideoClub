package bytemaster.videoclub.service;

import bytemaster.videoclub.entity.Arriendo;

import java.util.List;

public interface IArriendoService {
    public Arriendo crearArriendo(Arriendo nuevoArriendo);

    public Arriendo actualizarArriendo(int id);

    public List<Arriendo> listarArriendo();

    public Arriendo listarArriendoID(int idArriendo);

    public void eliminarArriendo(int id);
}
