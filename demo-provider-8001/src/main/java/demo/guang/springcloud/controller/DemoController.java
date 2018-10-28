package demo.guang.springcloud.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @version V1.0
 * @author: LuoGuang
 * @Package demo.guang.springcloud.controller
 * @Description:
 * @date: 2018/10/27 16:10
 */
@RestController
@RequestMapping("/demo")
public class DemoController {

    @RequestMapping
    public String demo(){
        return "demo index";
    }
}
