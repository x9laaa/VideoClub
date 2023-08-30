package bytemaster.videoclub.repository;

import bytemaster.videoclub.entity.Arriendo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IArriendoRepository  extends JpaRepository<Arriendo, Integer> {

}
