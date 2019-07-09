package tech.aistar.mapper;

import org.junit.Test;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;

import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import tech.aistar.entity.Ktype;

import java.util.List;

/**
 * Created by js on 2019/6/20.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:springmvc.xml","classpath:spring/*.xml"})
public class TestMapper {
    @Autowired
    private KtypeMapper ktypeMapper;

    @Test
    public void testFindAll(){
        System.out.println("=====");
        System.out.println(ktypeMapper);
        List<Ktype> list = ktypeMapper.findAll();

        list.forEach(System.out::println);
    }

}
