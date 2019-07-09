package tech.aistar.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import tech.aistar.entity.Knowledge;

import java.util.List;

/**
 * Created by js on 2019/6/21.
 */
public interface KnowledgeMapper {


    //保存知识点
    @Insert("insert into knowledge values(#{id},#{title},#{detail},#{ctime},#{contenturl},#{islike},#{ktypeId})")
    void save(Knowledge knowledge);

    //根据知识类型id来得到对应的知识点集合
    @Select("select * from knowledge where ktype_id=#{id}")
    List<Knowledge> findById(Integer id);

}
