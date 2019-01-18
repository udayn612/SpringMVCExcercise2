package com.stackroute.controller;

import com.stackroute.Configuration.Person;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class LoginController {

    @RequestMapping(value="/")
    public String greeting(ModelMap map)
    {
        return "index";

    }

        @RequestMapping(value="/loginaadmele")
        public ModelAndView log(HttpServletRequest request, HttpServletResponse response) {
            Person person = new Person();
            person.setName(request.getParameter("username"));
            person.setPassword(request.getParameter("password"));

            ModelAndView mv = new ModelAndView();
            mv.setViewName("result");
            mv.addObject("result", "welcome " + person.getName() + " to Stackroute");

            return mv;

        }
    }

