package co.com.automationpractice.models.Builder;

import co.com.automationpractice.models.Usuario;
import co.com.automationpractice.utilities.Builder;

public class UsuarioBuilder implements Builder<Usuario> {

    private String correo;
    private String clave;
    private String nombreUsuario;
    private String nombreEmpresa;
    private String direccion;
    private String metodoPago;


    public static UsuarioBuilder usuario() {
        return new UsuarioBuilder();
    }

    public UsuarioBuilder conCorreo(String correo) {
        this.correo = correo;
        return this;
    }

    public UsuarioBuilder conClave(String clave) {
        this.clave = clave;
        return this;
    }

    public UsuarioBuilder conNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
        return this;
    }

    public UsuarioBuilder conNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
        return this;
    }

    public UsuarioBuilder conDireccion(String direccion) {
        this.direccion = direccion;
        return this;
    }

    public UsuarioBuilder conMetodoPago(String metodoPago) {
        this.metodoPago = metodoPago;
        return this;
    }

    public String getCorreo() {
        return correo;
    }

    public String getClave() {
        return clave;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getMetodoPago() {
        return metodoPago;
    }

    @Override
    public Usuario builder() {
        return new Usuario(this);
    }
}
