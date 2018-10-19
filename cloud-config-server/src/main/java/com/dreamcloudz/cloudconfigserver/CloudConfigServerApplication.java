package com.dreamcloudz.cloudconfigserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class CloudConfigServerApplication {

  public static void main(String[] args) {
    SpringApplication.run(CloudConfigServerApplication.class, args);

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
