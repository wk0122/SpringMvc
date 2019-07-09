package tech.aistar.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by js on 2019/6/21.
 */
@Controller
@RequestMapping("/return")
public class ReturnAction {

    @RequestMapping("/param")
    public String find(Integer id,String usernmae){

        System.out.println(id);
        System.out.println(usernmae);
        return "login";
    }
}
