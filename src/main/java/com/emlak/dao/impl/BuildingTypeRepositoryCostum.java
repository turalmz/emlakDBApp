/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.emlak.dao.impl;

import com.emlak.entity.BuildingType;
import java.util.List;

/**
 *
 * @author TURAL
 */
public interface BuildingTypeRepositoryCostum {

    public List<BuildingType> getAll();

    public BuildingType getById(int id);

    public boolean insertBuildingType(BuildingType u);

    public boolean updateBuildingType(BuildingType u);

    public boolean removeBuildingType(int id);
}
