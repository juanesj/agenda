package edu.galileo.Agenda.model;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@jakarta.persistence.Entity

@Table(name= "Contacto")
@Data

public class Contacto {
@GeneratedValue(strategy = GenerationType.AUTO)

    @Id
    private Integer id;

    @Column

    private String name;
    @Column
    
    private String direccion;
    @Column

    private String telefono;
   


   


}
