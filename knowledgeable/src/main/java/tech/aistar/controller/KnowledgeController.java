package tech.aistar.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import tech.aistar.entity.Group1;
import tech.aistar.entity.Knowledge;
import tech.aistar.service.IKnowledgeService;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by js on 2019/6/21.
 */
@Controller
@RequestMapping("/knowledge")
public class KnowledgeController {

    @Autowired
    private IKnowledgeService iKnowledgeService;


    @GetMapping("/list")
    public String list(Model model,Integer id){
        //通过知识类型的id找到对应的所有知识点
        List<Knowledge> knowledgeList=iKnowledgeService.findById(id);
        //把找到的知识点放到作用域中
        model.addAttribute("knowledgeList",knowledgeList);

        model.addAttribute("kid",id);
        return "index/list";
    }



//    @GetMapping("/save")
//    public String save(){
//        return "";
//    }

//    @PostMapping("/save")
//    public String add(Knowledge knowledge){
//
//        System.out.println(knowledge);
//        iKnowledgeService.save(knowledge);
//        return "redirect:list?id="+knowledge.getKtypeId();
//    }

    @RequestMapping("/save")
    public String add(@Validated(value = {Group1.class}) @ModelAttribute("kw") Knowledge knowledge, BindingResult bindingResult, Model model){
        List<FieldError> fieldErrors=bindingResult.getFieldErrors();

        if (null!=fieldErrors){
            Map<String ,String> map=new HashMap<>();
            for (FieldError e:fieldErrors){
                map.put(e.getField(),e.getDefaultMessage());
            }
            model.addAttribute("errors",map);

            return "index/add";
        }
        return "redirect:list?id="+knowledge.getKtypeId();
    }
}
