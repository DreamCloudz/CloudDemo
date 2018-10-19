package com.dreamcloudz.cloudserviceribbon.controller;

import com.dreamcloudz.cloudserviceribbon.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author dsz
 * @date 18/10/18
 */
@RestController
public class HelloController {

  @Autowired
  HelloService helloService;

  @GetMapping(value = "/hi")
  public String hi(@RequestParam String name) {
    return helloService.hiService(name);
  }
}
