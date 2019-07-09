package tech.aistar.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import tech.aistar.entity.Knowledge;
import tech.aistar.entity.Ktype;
import tech.aistar.service.IKtypeService;

import java.util.List;

/**
 * Created by js on 2019/6/25.
 */
@Controller
public class RestfulController {
    @Autowired
    private IKtypeService iKtypeService;

    @GetMapping("/ktype")
    @ResponseBody
    public List<Ktype> list(Ktype ktype){

        List<Ktype> ktypeList=iKtypeService.findAll("");
        return ktypeList;
    }

    @GetMapping("/ktype/{type}")
    @ResponseBody
    public List<Ktype> find(@PathVariable("type") String type){
        List<Ktype> ktypeList=iKtypeService.findAll(type);
        return ktypeList;
    }
}
