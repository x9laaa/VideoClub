package bytemaster.videoclub.entity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Encargados")
public class Encargado {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false,length = 30)
    private String nombre;

    @Column(nullable = false, length = 100)
    private String correo;

    @Column(length = 12)
    private String pass;

    @Column(nullable = false)
    private int edad;

    @Column(length = 30)
    private String direccion;

    @Column(length = 30)
    private String telefono;
}
