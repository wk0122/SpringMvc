package tech.aistar.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import tech.aistar.entity.KnowledgeCustom;
import tech.aistar.entity.Ktype;
import tech.aistar.service.IKtypeService;

import java.util.List;

/**
 * Created by js on 2019/6/21.
 */
@Controller
@RequestMapping("/ktype")
public class KtypeController {

    @Autowired
    private IKtypeService iktypeService;


//    @RequestMapping("/list")
//    public ModelAndView list(){
//        List<Ktype> ktypeList=iktypeService.findAll();
//
//        ModelAndView modelAndView=new ModelAndView();
//
//        modelAndView.addObject("ktypeList",ktypeList);
//
//
//        modelAndView.setViewName("index/index");
//        return modelAndView;
//
//    }

    @RequestMapping("/search")
    public String list(Model model, @RequestParam(value = "type",defaultValue = "")String type){
        List<Ktype> ktypeList=iktypeService.findAll(type.toLowerCase());
        model.addAttribute("ktypeList",ktypeList);

        model.addAttribute("type",type);

        return "index/index";
    }

    //测试级联属性的参数绑定
    @RequestMapping("/cascade")
    public String cascade(KnowledgeCustom knowledgeCustom){
        System.out.println(knowledgeCustom.getKtypeCustom().getType());

        return null;
    }

    @GetMapping("/list")
    public String list(Model model){
        List<Ktype> ktypeList=iktypeService.findAll("");
        model.addAttribute("ktypeList",ktypeList);

        return "index/add";
    }
}
