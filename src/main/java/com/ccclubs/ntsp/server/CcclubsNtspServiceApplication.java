package com.ccclubs.ntsp.server;

import com.ccclubs.ntsp.server.config.NTspConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Import({NTspConfig.class})
public class CcclubsNtspServiceApplication {

  public static void main(String[] args) {
    SpringApplication.run(CcclubsNtspServiceApplication.class, args);
  }
}
