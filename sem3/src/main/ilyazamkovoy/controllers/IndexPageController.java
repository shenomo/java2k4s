package main.ilyazamkovoy.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by zamkovoyilya on 16/05/16.
 */

@Controller
@RequestMapping("/")
public class IndexPageController {


    @RequestMapping
    public String getFTl(){
        return "redirect: /login";
    }


}
