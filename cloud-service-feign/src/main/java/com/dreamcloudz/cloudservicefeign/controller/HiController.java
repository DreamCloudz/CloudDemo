package com.dreamcloudz.cloudservicefeign.controller;

import com.dreamcloudz.cloudservicefeign.service.SchedualServiceHi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author dsz
 * @date 18/10/18
 */
@RestController
public class HiController {

  @Autowired
  SchedualServiceHi schedualServiceHi;


  @GetMapping(value = "/hi")
  public String sayHi(@RequestParam String name) {
    return schedualServiceHi.sayHiFromClientOne(name);
  }
}
