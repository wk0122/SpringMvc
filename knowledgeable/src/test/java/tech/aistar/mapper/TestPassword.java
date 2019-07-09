package tech.aistar.mapper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

/**
 * Created by js on 2019/6/21.
 */
@WebAppConfiguration
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:springmvc.xml","classpath:spring/*.xml"})
public class TestPassword {

    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    @Test
    public void testPassword(){
        String password="admin";

//        String pwd=bCryptPasswordEncoder.encode(password);
//        System.out.println(pwd);
        //$2a$10$fAxV0jOpxX7o4TJS92p9yu0oazRYFuKWziWrvkK4MpMD7X44PUnDy

        System.out.println(bCryptPasswordEncoder.matches(password,"$2a$10$fAxV0jOpxX7o4TJS92p9yu0oazRYFuKWziWrvkK4MpMD7X44PUnDy"));
    }
}
