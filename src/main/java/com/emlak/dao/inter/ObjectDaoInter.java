/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.emlak.dao.inter;

import com.emlak.entity.Objekt;
import java.util.List;

/**
 *
 * @author TURAL
 */
public interface ObjectDaoInter {
     
    List<Objekt> findAll();
     
    public Objekt getById(int id);

    Objekt updateObject(Objekt u);
    Objekt insertObject(Objekt u);

    void removeObject(int id);
    
}

