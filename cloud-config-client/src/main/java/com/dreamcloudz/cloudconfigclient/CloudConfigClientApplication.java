package com.dreamcloudz.cloudconfigclient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class CloudConfigClientApplication {

  public static void main(String[] args) {
    SpringApplication.run(CloudConfigClientApplication.class, args);

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

  @Value("${foo}")
  String foo;

  @RequestMapping(value = "/hi")
  public String hi() {
    return foo;
  }
}
