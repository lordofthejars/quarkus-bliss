package org.acme;

import javax.persistence.Column;
import javax.persistence.Entity;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

@Entity
public class Greeting extends PanacheEntity {
    
    @Column public String greeting;

}
