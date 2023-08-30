package bytemaster.videoclub.repository;

import bytemaster.videoclub.entity.Arriendo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IArriendoRepository  extends JpaRepository<Arriendo, Integer> {

}
