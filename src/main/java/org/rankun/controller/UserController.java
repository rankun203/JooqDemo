package org.rankun.controller;

import org.rankun.dao.model.User;
import org.rankun.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created on 4/14/15.
 *
 * @author rankun203
 */

@Controller
@RequestMapping("user")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("users")
    @ResponseBody
    public List<User> findAll() {
        List<User> userList = userService.findAll();

        return userList;
    }

}
