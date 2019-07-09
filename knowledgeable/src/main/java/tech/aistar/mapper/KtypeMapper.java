package tech.aistar.mapper;

import org.apache.ibatis.annotations.Select;
import tech.aistar.entity.Ktype;

import java.util.List;

/**
 * @author success
 * @version 1.0
 * @description:本类用来演示:
 * @date 2019/6/20 0020
 */
public interface KtypeMapper {

//    @Select("select * from ktype")
//    List<Ktype> findAll();

    @Select("select * from ktype where type like concat('%',#{type},'%')")
    List<Ktype> findAll(String type);
}
