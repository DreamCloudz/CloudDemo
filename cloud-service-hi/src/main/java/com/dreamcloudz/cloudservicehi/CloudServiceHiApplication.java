package com.dreamcloudz.cloudservicehi;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableEurekaClient
@RestController
public class CloudServiceHiApplication {

  public static void main(String[] args) {
    SpringApplication.run(CloudServiceHiApplication.class, args);

    String clzzName = Thread.currentThread().getStackTrace()[1].getClassName();
    clzzName = clzzName.substring(clzzName.lastIndexOf(".") + 1);
    System.out.println(
      "╮ (￣▽￣)╭ " + clzzName + " 启动成功  ╮ (￣▽￣)╭\n" +
        " _    _      _ _        __          __        _     _ \n" +
        "| |  | |    | | |       \\ \\        / /       | |   | |\n" +
        "| |__| | ___| | | ___    \\ \\  /\\  / /__  _ __| | __| |\n" +
        "|  __  |/ _ \\ | |/ _ \\    \\ \\/  \\/ / _ \\| '__| |/ _` |\n" +
        "| |  | |  __/ | | (_) |    \\  /\\  / (_) | |  | | (_| |\n" +
        "|_|  |_|\\___|_|_|\\___/      \\/  \\/ \\___/|_|  |_|\\__,_|");
  }

  @Value("${server.port}")
  String port;

  @RequestMapping("/hi")
  public String home(@RequestParam(value = "name", defaultValue = "forezp") String name) {
    return "hi " + name + " ,i am from port:" + port;
  }
}
