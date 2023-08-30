package bytemaster.videoclub.repository;

import bytemaster.videoclub.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface IClienteRepository  extends JpaRepository<Cliente,Integer> {
}
