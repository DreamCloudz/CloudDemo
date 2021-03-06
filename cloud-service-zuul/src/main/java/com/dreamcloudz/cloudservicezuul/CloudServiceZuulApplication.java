package com.dreamcloudz.cloudservicezuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
@EnableEurekaClient
@EnableDiscoveryClient
public class CloudServiceZuulApplication {

  public static void main(String[] args) {
    SpringApplication.run(CloudServiceZuulApplication.class, args);

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
}
