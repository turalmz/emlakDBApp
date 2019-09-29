/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.emlak.dao.impl;

import com.emlak.entity.Objekt;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ObjectRepository extends  JpaRepository<Objekt, Integer>  {

    public List<Objekt> findAll();

    public Objekt getById(int id);


    public Objekt save(Objekt u);

    public void deleteById(Integer id);

}
