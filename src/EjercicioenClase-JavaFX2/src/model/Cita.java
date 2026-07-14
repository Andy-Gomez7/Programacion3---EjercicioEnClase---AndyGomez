package model;

import java.time.LocalDate;

public class Cita {
    private String codigo;
    private String paciente;
    private String cedula;
    private String telefono;
    private String medico;
    private String especialidad;
    private LocalDate fecha;
    private String hora;
    private String motivoConsulta;
    private String estado;

    public Cita(String Codigo, String Paciente, String Cedula, String Telefono, String Medico, String Especialidad, LocalDate Fecha, String Hora, String MotivoConsulta, String Estado){
        setCodigo(Codigo);
        setPaciente(Paciente);
        setcedula(Cedula);
        settelefono(Telefono);
        setMedico(Medico);
        setEspecialidad(Especialidad);
        setFecha(Fecha);
        setHora(Hora);
        setMotivoConsulta(MotivoConsulta);
        setEstado(Estado);
    }

    public void setCodigo(String Codigo){
        codigo = Codigo;
    }

    public String getCodigo(){
        return codigo;
    }

    public void setPaciente(String Paciente){
        paciente = Paciente;
    }

    public String getPaciente(){
        return paciente;
    }

    public void setcedula(String Cedula){
        cedula = Cedula;
    }

    public String getcedula(){
        return cedula;
    }

    public void settelefono(String Telefono){
        telefono = Telefono;
    }

    public String gettelefono(){
        return telefono;
    }

    public void setMedico(String Medico){
        medico = Medico;
    }

    public String getMedico(){
        return medico;
    }

    public void setEspecialidad(String Especialidad){
        especialidad = Especialidad;
    }

    public String getEspecialidad(){
        return especialidad;
    }

    public void setFecha(LocalDate Fecha){
        fecha = Fecha;
    }

    public LocalDate getFecha(){
        return fecha;
    }

    public void setHora(String Hora){
        hora = Hora;
    }

    public String getHora(){
        return hora;
    }

    public void setMotivoConsulta(String MotivoConsulta){
        motivoConsulta = MotivoConsulta;
    }

    public String getMotivoConsulta(){
        return motivoConsulta;
    }

    public void setEstado(String Estado){
        estado = Estado;
    }

    public String getEstado(){
        return estado;
    }
}