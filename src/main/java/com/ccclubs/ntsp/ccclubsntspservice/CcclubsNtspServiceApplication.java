package com.ccclubs.ntsp.ccclubsntspservice;

import com.ccclubs.ntsp.ccclubsntspservice.config.NewTspConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Import({NewTspConfig.class})
public class CcclubsNtspServiceApplication {

  public static void main(String[] args) {
    SpringApplication.run(CcclubsNtspServiceApplication.class, args);
  }
}
