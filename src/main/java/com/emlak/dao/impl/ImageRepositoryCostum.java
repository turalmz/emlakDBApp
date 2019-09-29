/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.emlak.dao.impl;

import com.emlak.entity.Image;
import java.util.List;

/**
 *
 * @author TURAL
 */
public interface ImageRepositoryCostum {

    public List<Image> getAll();

    public Image getById(int id);

    public boolean insertImage(Image u);

    public boolean updateImage(Image u);

    public boolean removeImage(int id);
}
