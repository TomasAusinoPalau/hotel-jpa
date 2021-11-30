package com.example.jpa.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.Comment;

import lombok.Getter;

// imaginemos que la tabla no está creada

@Getter
@Entity
@Table(name = "users") // user MATCHEA con la tabla de DB users
public class User {


    /**
     * - @MappedSuperClass: Se aplica sobre una clase, indica que se mappea como cualquier clase,
     * pero se aplicará únicamente a sus sublcases, puesto que esta clase no tiene una tabla asociada.
     * ------------- Abstracciones de superclases traspolable a la tabla de la DB ------------------
     * 
     * - @Table: Permite especificar el nombre de la tabla relacionada con la ENTITY
     * 
     * - @Column: Indica la columna en la DB (de la tabla que forma parte). Hay que indicarle el nombre
     * de la columna a la que debería estar asociada
     * 
     * - @Enumerated: Indica los valores de la propiedad van a estar dentro de un rango
     * de un objeto enumerador (enum). 
     *  PARÁMETROS: 
     *      - Value = tipo de valor que se va a usar en la DB. Puede utilizarce "EnumType."
     * 
     * - @Lob: Large Object, objeto pesado. Ligado a un patron creacional (factory, builder, composite)
     * 
     * - @NotEmpty: Es una restricción. Indica que la propuedad no puede tener un valor vacío.
     * 
     * 
     * ------ TIPOS DE RELACIÓN.
     * @OneToOne: Relacion de 1 a 1 con otro objeto (entidad).
     *      - cascade: Indica el tipo de operación de cascada a realizar. Se utiliza "CascadeType."
     *      - fetch: Indica la forma en que se consultarán las entidades asociadas. "FetchType."
     * @OneToMany: Relación de 1 a N
     *      - cascade
     *      - mappedBy: FOREING KEY. Especifica la propiedad de la identidad HIJA 
     *                  (en el extremo "muchos") que sirve para enlazar con la entidad principal(extremo 1)
     * 
     * @ManyToOne: Relacion N a 1
     * @ManyToMany: Relación N a N en la propiedad decorada.
     * Si la relación es unidireccional, se debe especificar el extremo propietario (el que tiene la clave
     * principal) mediante el parámetro mappedBy. 
     * Si es una relación bidireccional, JPA crea una tabla relacional por cada sentido. Para evitar esto,
     * se usa el decorator @JoinTable
     * 
     * @JoinTable: Especifica datos relativos a la tabla de unión en la relación.
     * Este "decorador" se añade en el extremo propietario
     *      - name: nombre de la tabla
     *      -joinColumns:   indica cómo se llamará la columna que contendrá la clave correspondiente (FK)
     *                      a la tabla en el extremo propietaria. @Joincolumn
     *      - inverseJoinColumns: Especifica cómo se llama la columna de FK correspondiente al 
     *                      extremo propietario. @JoinColumns
     * 
     * @JoinColumn: Especifica la columna de unión. A través del parámetro "name"
     * 
     * 
     */
    @Id
    @Column(name = "dni", nullable = false)
    private Long dni;
    
    @Column(name = "username", nullable = false, length = 50, unique = true)
    private String username;

    private String password;

    // @Temporal(TemporalType.TIMESTAMP) //indica que el tipo Date (de java) -> traduce a SQL Date.
    // @Column(name = "fecha", updatable = false, nullable = false)
    // private Date fechaAlta;
    
    protected User() {}
    
    public User(Long dni, String username, String password) {
        this.dni = dni;
        this.username = username;
        this.password = password;
    }
}
