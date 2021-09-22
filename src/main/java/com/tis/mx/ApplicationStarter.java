package com.tis.mx;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * The Class ApplicationStarter.
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableHystrix
@EnableHystrixDashboard
public class ApplicationStarter {

  /**
   * The main method.
   *
   * @param args the arguments
   */
  public static void main(String[] args) {

    SpringApplication.run(ApplicationStarter.class, args);
  }

}
