package bytemaster.videoclub.repository;
import bytemaster.videoclub.entity.Pelicula;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository

public interface IPeliculaRepository extends JpaRepository<Pelicula, Integer> {
}

