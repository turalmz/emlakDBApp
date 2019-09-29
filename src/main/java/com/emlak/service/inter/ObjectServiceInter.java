/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.emlak.service.inter;

import com.emlak.entity.Objekt;
import java.util.List;

/**
 *
 * @author TURAL
 */

public interface ObjectServiceInter {
    List<Objekt> getAll();
     
    public Objekt getById(int id);

    Objekt updateObjekt(Objekt u);
    Objekt addObjekt(Objekt u);

    void removeObjekt(int id);
}
