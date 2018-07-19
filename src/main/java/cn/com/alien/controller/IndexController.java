package cn.com.alien.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


/**
 * Created by Root on 2017/6/25.
 */
@RestController
public class IndexController {

    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public void index() {
        System.out.println("index");
    }

    @RequestMapping(value = "/info", method = RequestMethod.GET)
    public void info() {
        System.out.println("info");
    }


}
