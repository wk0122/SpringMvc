package tech.aistar.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

/**
 * Created by js on 2019/6/21.
 */
@WebAppConfiguration
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:springmvc.xml","classpath:spring/*.xml"})
public class TestKnowledgeService {

    @Autowired
    private IKnowledgeService iKnowledgeService;

    @Test
    public void testFindById(){
        iKnowledgeService.findById(1).forEach(System.out::println);
    }
}
