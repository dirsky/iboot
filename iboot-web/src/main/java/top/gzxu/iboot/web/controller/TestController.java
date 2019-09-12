package top.gzxu.iboot.web.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Frank
 */
@RestController
@RequestMapping("/test")
public class TestController {

    /* 没有斜杠在访问的时候比较好 */

    @GetMapping("")
    public String index() {
        return "Success";
    }
}
