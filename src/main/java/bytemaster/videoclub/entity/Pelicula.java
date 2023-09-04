package bytemaster.videoclub.entity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "peliculas")
public class Pelicula {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false, length = 75)
    private String titulo;

    @Column(length = 75)
    private String genero;

    @ManyToMany(mappedBy = "peliculas")
    private List<Arriendo> arriendos;

    private double precioArriendo; //(Decimal)

}
