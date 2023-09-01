package bytemaster.videoclub.service;

import bytemaster.videoclub.entity.Arriendo;

import java.util.List;

public interface IArriendoService {
    public Arriendo crearArriendo(Arriendo nuevoArriendo);

    public Arriendo actualizarArriendo(int id, Arriendo arriendo);

    public List<Arriendo> listarArriendo();

    public Arriendo listarArriendoID(int idArriendo);

    public void eliminarArriendo(int id);

    public void eliminarArriendo2(Arriendo arriendo) ;
}
