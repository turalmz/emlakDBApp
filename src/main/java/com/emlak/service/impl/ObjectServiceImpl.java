package com.emlak.service.impl;

import com.emlak.dao.impl.ObjectRepository;
import com.emlak.service.inter.ObjectServiceInter;
import com.emlak.entity.Objekt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
@Transactional
public class ObjectServiceImpl implements ObjectServiceInter {


    @Autowired
    //@Qualifier("countryDao")
    private ObjectRepository entityDao;

    @Override
    public List<Objekt> getAll() {
        return entityDao.findAll();
    }

    @Override
    public Objekt getById(int userId) {
        return entityDao.getById(userId);
    }

    @Override
    public Objekt addObjekt(Objekt u) {

        return  entityDao.save(u);
    }


    @Override
    public Objekt updateObjekt(Objekt u) {
        return  entityDao.save(u);
    }

    @Override
    public void removeObjekt(int id) {

        entityDao.deleteById(id);

    }

}