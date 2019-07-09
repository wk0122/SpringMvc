package tech.aistar.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


/**
 * Created by js on 2019/6/21.
 */
@Controller
@RequestMapping("/array")
public class ArrayController {

    @RequestMapping("/get")
    public String ids(Integer[] id){
        System.out.println(id);
        return null;
    }
}
