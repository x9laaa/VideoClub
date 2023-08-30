package bytemaster.videoclub.entity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "peliculas")
public class Pelicula {
    @id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false, length = 75)
    private String titulo;

    @Column(length = 75)
    private String genero;

    @Column(length = 15)
    private String Disponibilidad; //(Texto, por ejemplo: "Disponible", "Alquilada", "Reservada")

    @Column(length = 10)
    private double PrecioArriendo; //(Decimal)

}
