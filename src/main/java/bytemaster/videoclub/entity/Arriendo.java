package bytemaster.videoclub.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDate;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "arriendo")
public class Arriendo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    @JoinColumn(name = "cliente_id")
    private Cliente cliente;

    @ManyToOne
    @JoinColumn(name = "encargado_id")
    private Encargado encargado;

    @ManyToMany
    @JoinTable(name = "arriendo_pelicula",
            joinColumns = @JoinColumn(name = "arriendo_id"),
            inverseJoinColumns = @JoinColumn(name = "pelicula_id"))
    private List<Pelicula> peliculas;

    private LocalDate fecha;

    @Column(length = 30)
    private int precioTotal;




}
