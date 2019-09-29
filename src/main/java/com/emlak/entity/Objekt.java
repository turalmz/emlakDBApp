/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.emlak.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author TURAL
 */
@Entity
@Table(name = "objekt", catalog = "emlak", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Objekt.findAll", query = "SELECT o FROM Objekt o")
    , @NamedQuery(name = "Objekt.findById", query = "SELECT o FROM Objekt o WHERE o.id = :id")
    , @NamedQuery(name = "Objekt.findByAdress", query = "SELECT o FROM Objekt o WHERE o.adress = :adress")
    , @NamedQuery(name = "Objekt.findByArea", query = "SELECT o FROM Objekt o WHERE o.area = :area")
    , @NamedQuery(name = "Objekt.findByBalconyCount", query = "SELECT o FROM Objekt o WHERE o.balconyCount = :balconyCount")
    , @NamedQuery(name = "Objekt.findByPrice", query = "SELECT o FROM Objekt o WHERE o.price = :price")
    , @NamedQuery(name = "Objekt.findByStatus", query = "SELECT o FROM Objekt o WHERE o.status = :status")
    , @NamedQuery(name = "Objekt.findByCreatedDate", query = "SELECT o FROM Objekt o WHERE o.createdDate = :createdDate")
    , @NamedQuery(name = "Objekt.findBySellOrRent", query = "SELECT o FROM Objekt o WHERE o.sellOrRent = :sellOrRent")
    , @NamedQuery(name = "Objekt.findByObjectType", query = "SELECT o FROM Objekt o WHERE o.objectType = :objectType")})
public class Objekt implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Column(name = "ADRESS")
    private String adress;
    @Column(name = "AREA")
    private Integer area;
    @Column(name = "BALCONY_COUNT")
    private Integer balconyCount;
    @Column(name = "PRICE")
    private Integer price;
    @Lob
    @Column(name = "ABOUT")
    private String about;
    @Column(name = "STATUS")
    private String status;
    @Column(name = "CREATED_DATE")
    @Temporal(TemporalType.DATE)
    private Date createdDate;
    @Column(name = "SELL_OR_RENT")
    private Boolean sellOrRent;
    @Lob
    @Column(name = "CONTACTS")
    private String contacts;
    @Column(name = "OBJECT_TYPE")
    private String objectType;
    @OneToMany(mappedBy = "object1")
    private List<Image> imageList;
    @JoinColumn(name = "BUILDING_TYPE", referencedColumnName = "ID")
    @ManyToOne
    private BuildingType buildingType;
    @JoinColumn(name = "DISTRICT", referencedColumnName = "ID")
    @ManyToOne
    private District district;

    public Objekt() {
    }

    public Objekt(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public Integer getArea() {
        return area;
    }

    public void setArea(Integer area) {
        this.area = area;
    }

    public Integer getBalconyCount() {
        return balconyCount;
    }

    public void setBalconyCount(Integer balconyCount) {
        this.balconyCount = balconyCount;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public Boolean getSellOrRent() {
        return sellOrRent;
    }

    public void setSellOrRent(Boolean sellOrRent) {
        this.sellOrRent = sellOrRent;
    }

    public String getContacts() {
        return contacts;
    }

    public void setContacts(String contacts) {
        this.contacts = contacts;
    }

    public String getObjectType() {
        return objectType;
    }

    public void setObjectType(String objectType) {
        this.objectType = objectType;
    }

    @XmlTransient
    public List<Image> getImageList() {
        return imageList;
    }

    public void setImageList(List<Image> imageList) {
        this.imageList = imageList;
    }

    public BuildingType getBuildingType() {
        return buildingType;
    }

    public void setBuildingType(BuildingType buildingType) {
        this.buildingType = buildingType;
    }

    public District getDistrict() {
        return district;
    }

    public void setDistrict(District district) {
        this.district = district;
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
        if (!(object instanceof Objekt)) {
            return false;
        }
        Objekt other = (Objekt) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.emlak.Objekt[ id=" + id + " ]";
    }
    
}
