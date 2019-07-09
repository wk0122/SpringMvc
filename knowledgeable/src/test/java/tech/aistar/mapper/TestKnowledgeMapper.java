package tech.aistar.mapper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import tech.aistar.entity.Knowledge;
import tech.aistar.util.IdWorker;

import java.util.Date;

/**
 * Created by js on 2019/6/21.
 */
@WebAppConfiguration
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:springmvc.xml","classpath:spring/*.xml"})
public class TestKnowledgeMapper {

    @Autowired
    private KnowledgeMapper knowledgeMapper;

    @Autowired
    private IdWorker idWorker;

    @Test
    public void testSave(){
        Knowledge knowledge=new Knowledge();
        knowledge.setId(idWorker.nextId());

        knowledge.setTitle("字符串");
        knowledge.setDetail("int s=100");
        knowledge.setCtime(new Date());
        knowledge.setIslike(0);
        knowledge.setContenturl("var.md");
        knowledge.setKtypeId("1");
        knowledgeMapper.save(knowledge);
    }

    @Test
    public void testFindById(){
        knowledgeMapper.findById(1).forEach(System.out::println);
    }
}
