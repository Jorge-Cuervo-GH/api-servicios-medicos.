package med.voll.api.domain.direccion;


import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Embeddable
public class Direccion {
    private String calle;
    private String numero;
    private String complemento;
    private String barrio;
    private String ciudad;
    private String codigoPostal;
    private String estado;

    public Direccion (DatosDireccion datos){
        this.calle = datos.calle();
        this.numero = datos.numero();
        this.complemento = datos.complemento();
        this.barrio = datos.barrio();
        this.ciudad = datos.ciudad();

        this.codigoPostal = datos.codigoPostal();
        this.estado = datos.estado();
    }

    public void actualizarDireccion(DatosDireccion datos) {
        if (datos.calle() != null){
            this.calle = datos.calle();
        }
        if (datos.numero() != null) {
            this.numero = datos.numero();
        }
        if (datos.complemento() != null) {
            this.complemento = datos.complemento();
        }
        if (datos.barrio() != null) {
            this.barrio = datos.barrio();
    }
        if (datos.ciudad() != null) {
            this.ciudad = datos.ciudad();
        }
        if (datos.codigoPostal() != null) {
            this.codigoPostal = datos.codigoPostal();
        }
        if (datos.estado() != null) {
            this.estado = datos.estado();
        }
    }
}
