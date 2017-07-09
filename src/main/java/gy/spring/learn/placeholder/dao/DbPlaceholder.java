package gy.spring.learn.placeholder.dao;

import gy.spring.learn.placeholder.dto.DbProperty;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by PicaHelth on 2017/7/9.
 */
@Repository
public interface DbPlaceholder {
    List<DbProperty> getAllProperties();
}
