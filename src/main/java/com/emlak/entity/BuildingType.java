/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.emlak.entity;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author TURAL
 */
@Entity
@Table(name = "building_type", catalog = "emlak", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "BuildingType.findAll", query = "SELECT b FROM BuildingType b")
    , @NamedQuery(name = "BuildingType.findById", query = "SELECT b FROM BuildingType b WHERE b.id = :id")
    , @NamedQuery(name = "BuildingType.findByName", query = "SELECT b FROM BuildingType b WHERE b.name = :name")})
public class BuildingType implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Column(name = "NAME")
    private String name;
    @OneToMany(mappedBy = "buildingType")
    private List<Objekt> objektList;

    public BuildingType() {
    }

    public BuildingType(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @XmlTransient
    public List<Objekt> getObjektList() {
        return objektList;
    }

    public void setObjektList(List<Objekt> objektList) {
        this.objektList = objektList;
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
        if (!(object instanceof BuildingType)) {
            return false;
        }
        BuildingType other = (BuildingType) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.emlak.BuildingType[ id=" + id + " ]";
    }
    
}
