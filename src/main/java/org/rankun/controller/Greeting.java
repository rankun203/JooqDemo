package org.rankun.controller;

import org.rankun.data.tables.records.TCityRecord;
import org.rankun.service.GreetService;
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
@RequestMapping("/")
public class Greeting {
    @Autowired
    private GreetService greetService;

    @RequestMapping("/")
    @ResponseBody
    public List<TCityRecord> index() throws Exception {

        return greetService.fetchData();
    }

}
