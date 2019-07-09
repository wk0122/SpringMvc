package tech.aistar.mapper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import tech.aistar.entity.Ktype;

import java.util.List;

/**
 * @author success
 * @version 1.0
 * @description:本类用来演示:
 * @date 2019/6/20 0020
 */
@WebAppConfiguration
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:springmvc.xml","classpath:spring/*.xml"})
public class KTypeMapperTest {

    @Autowired
    private KtypeMapper ktypeMapper;

    @Test
    public void testFindAll(){
        List<Ktype> list = ktypeMapper.findAll(null);

        list.forEach(System.out::println);
    }
}
