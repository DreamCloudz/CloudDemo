package com.dreamcloudz.cloudservicefeign.service;

import com.dreamcloudz.cloudservicefeign.service.impl.SchedualServiceHiHystric;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author dsz
 * @date 18/10/18
 */
@FeignClient(value = "cloud-service-hi", fallback = SchedualServiceHiHystric.class)
public interface SchedualServiceHi {
  @RequestMapping(value = "/hi", method = RequestMethod.GET)
  String sayHiFromClientOne(@RequestParam(value = "name") String name);
}
