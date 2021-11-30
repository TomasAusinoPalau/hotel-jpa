package com.example.jpa.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import org.hibernate.annotations.ManyToAny;

import lombok.Getter;
import lombok.Setter;

// @ManyToMany
        // Entity de JPA. Como no hay @Table, JPA asume que Habitación es una entity mapped a una tabla 
        // Habitacion dentro de la DB.
@Entity // Es decir, a una tabla mapped con el mismo nombre.
@Getter
@Setter
@Table(name = "rooms")
public class Room {
    
    @Id // Establece que el atributo siguiente es un valor único indexado no null.
    @GeneratedValue(strategy = GenerationType.AUTO) //el ID debería ser generado automáticamente,
    private Long roomNumber;                         // y le dejamos la responsabilidad a la DB.
    
    private int capacity;
    private boolean isAvaliable;
    //private ArrayList<Commodities> commodities;



    /**
     * Tenemos 2 constructores, el normal (public), que devuelve las instancias de habitación,
     * Luego el protected que existe PARA JPA.
     *  - Crea las relaciones de instancia con la habitación.
     */
    protected Room() {}

    public Room(int capacity/*, ArrayList<Commodities> commodities */) {
        this.capacity = capacity;
        this.isAvaliable = true;
        //this.commodities = commodities;
    }   
    
    // @ManyToMany
    // @JoinTable(name = "commodities", 
    //     joinColumns = @JoinColumn(name = "fk_idCommodities",referencedColumnName = "roomNumber"),
    //     inverseJoinColumns = @JoinColumn(name = "idCommodities"))
    // public ArrayList<Commodities> getCommodities() {
    //     return this.commodities;
    // }

}
