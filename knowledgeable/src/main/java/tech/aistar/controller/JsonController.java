package tech.aistar.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import tech.aistar.entity.Knowledge;

/**
 * Created by js on 2019/6/25.
 */
@Controller
@RequestMapping("/json")
public class JsonController {

    @RequestMapping("/jsonstr")
    @ResponseBody
    public Knowledge knowledge(@RequestBody Knowledge knowledge){
        return knowledge;
    }


    @DeleteMapping("/del/{id}/{name}")
    public @ResponseBody Knowledge del(@PathVariable("id") String id,@PathVariable("name") String title){
        Knowledge knowledge=new Knowledge();
        knowledge.setId(id);
        knowledge.setTitle(title);
        return knowledge;
    }
}
