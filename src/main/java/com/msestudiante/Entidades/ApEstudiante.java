/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.msestudiante.Entidades;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author root
 */
@Entity
@Table(name = "ap_estudiante", catalog = "dsweb", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ApEstudiante.findAll", query = "SELECT a FROM ApEstudiante a")
    , @NamedQuery(name = "ApEstudiante.findById", query = "SELECT a FROM ApEstudiante a WHERE a.id = :id")
    , @NamedQuery(name = "ApEstudiante.findByFirstname", query = "SELECT a FROM ApEstudiante a WHERE a.firstname = :firstname")
    , @NamedQuery(name = "ApEstudiante.findByLastname", query = "SELECT a FROM ApEstudiante a WHERE a.lastname = :lastname")})
public class ApEstudiante implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(nullable = false)
    private Integer id;
    @Size(max = 50)
    @Column(length = 50)
    private String firstname;
    @Size(max = 50)
    @Column(length = 50)
    private String lastname;

    public ApEstudiante() {
    }

    public ApEstudiante(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ApEstudiante)) {
            return false;
        }
        ApEstudiante other = (ApEstudiante) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.msestudiante.Entidades.ApEstudiante[ id=" + id + " ]";
    }
    
}
