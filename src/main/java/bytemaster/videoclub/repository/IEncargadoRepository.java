package bytemaster.videoclub.repository;
import bytemaster.videoclub.entity.Encargado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IEncargadoRepository extends JpaRepository<Encargado, Integer>{
}
