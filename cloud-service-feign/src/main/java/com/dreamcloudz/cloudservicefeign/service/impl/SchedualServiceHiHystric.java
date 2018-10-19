package com.dreamcloudz.cloudservicefeign.service.impl;

import com.dreamcloudz.cloudservicefeign.service.SchedualServiceHi;
import org.springframework.stereotype.Component;

/**
 * @author dsz
 * @date 18/10/18
 */
@Component
public class SchedualServiceHiHystric implements SchedualServiceHi {
  @Override
  public String sayHiFromClientOne(String name) {
    return "sorry " + name;
  }
}
