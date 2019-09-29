/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.emlak.dao.impl;

import com.emlak.entity.District;
import java.util.List;

/**
 *
 * @author TURAL
 */
public interface DistrictRepositoryCostum {

    public List<District> getAll();

    public District getById(int id);

    public boolean insertDistrict(District u);

    public boolean updateDistrict(District u);

    public boolean removeDistrict(int id);
}
