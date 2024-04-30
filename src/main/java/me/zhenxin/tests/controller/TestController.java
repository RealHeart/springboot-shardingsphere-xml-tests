package me.zhenxin.tests.controller;

import me.zhenxin.tests.entity.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Test Controller
 *
 * @author 真心
 * @since 2024/4/30 下午5:29
 */
@RestController
public class TestController {

    @GetMapping
    public ResponseEntity test() {
        var responseEntity = new ResponseEntity();
        responseEntity.setCode(200);
        responseEntity.setMessage("success");
        responseEntity.setData("Hello, World!");
        return responseEntity;
    }
}
