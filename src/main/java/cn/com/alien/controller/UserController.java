package cn.com.alien.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Root on 2017/6/25.
 */
@RestController
public class UserController {

    @RequestMapping(value = "/userLogin", method = RequestMethod.POST)
    public void userLogin(@RequestParam("name") String name) {

    }
}
