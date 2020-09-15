package com.example.erdetfredag.controllers;

import com.example.erdetfredag.ErdetfredagApplication;
import com.example.erdetfredag.services.ErDetFredag;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController
{
    @GetMapping("/")
    @ResponseBody
    public String erDetFredag()
    {
        ErDetFredag erdet = new ErDetFredag();

        if(erdet.fredag())
            return "Ja :D";
        else
            return "Nej :(";
    }

    @GetMapping("hvilkenDag")
    @ResponseBody
    public String hvilkenDag()
    {
        ErDetFredag erdet = new ErDetFredag();

        return "" + erdet.hvilkenDag();
    }

}
