package com.example.SpringBootWeb1;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

    @ModelAttribute("courses")
    public String addCourses()
    {
        return "Java";
    }

    @RequestMapping("/")
    public String home()
    {
        System.out.println("home method called");
        return "index";
    }

    @RequestMapping("add")
    public ModelAndView add(@RequestParam("num1") int num1, @RequestParam("num2") int num2, ModelAndView mv){
//        int num1= Integer.parseInt(req.getParameter("num1"));
//        int num2= Integer.parseInt(req.getParameter("num2"));
        int result=num1+num2;
        //System.out.println(result);  //Printing the in console
        mv.addObject("result",result);
        mv.setViewName("result");
        return mv;
    }

    @RequestMapping("addAlien")
    public String addAlien(Alien alien)
    {
//        Alien alien=new Alien();
//        alien.setAid(aid);
//        alien.setAname(aname);
//        mv.addObject("alien",alien);
//        mv.setViewName("result");

        return "result";



    }
//


}
