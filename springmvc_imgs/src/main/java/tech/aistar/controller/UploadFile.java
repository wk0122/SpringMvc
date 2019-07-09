package tech.aistar.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;

import java.util.UUID;

/**
 * Created by js on 2019/6/24.
 */
@Controller
@RequestMapping("/upload")

public class UploadFile {

    @CrossOrigin
    @RequestMapping("/diyupload")
    @ResponseBody
    public String upload(MultipartFile file, HttpServletRequest request){

        System.out.println(file.getOriginalFilename());

        String path=request.getServletContext().getRealPath("/");

        String imgsName = UUID.randomUUID()+"_"+file.getOriginalFilename();

        String imgsAddr = "http://localhost:8085/springmvc_imgs/upload/"+imgsName;


        path=path+"/upload/"+ UUID.randomUUID()+"_"+file.getOriginalFilename();

        try {
            file.transferTo(new File(path));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return imgsAddr;
    }
}
