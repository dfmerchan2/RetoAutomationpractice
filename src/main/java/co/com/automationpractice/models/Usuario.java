package co.com.automationpractice.models;

import co.com.automationpractice.models.Builder.UsuarioBuilder;

public class Usuario {

    private String correo;
    private String clave;
    private String nombreUsuario;
    private String nombreEmpresa;
    private String direccion;
    private String metodoPago;

    public Usuario(UsuarioBuilder usuarioBuilder) {
        this.correo = usuarioBuilder.getCorreo();
        this.clave = usuarioBuilder.getClave();
        this.nombreUsuario = usuarioBuilder.getNombreUsuario();
        this.nombreEmpresa = usuarioBuilder.getNombreEmpresa();
        this.direccion = usuarioBuilder.getDireccion();
        this.metodoPago = usuarioBuilder.getMetodoPago();
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
}
