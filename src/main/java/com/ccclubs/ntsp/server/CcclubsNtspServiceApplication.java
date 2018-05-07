package com.ccclubs.ntsp.server;

import com.ccclubs.ntsp.server.core.config.NTspAppConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Import({NTspAppConfig.class})
public class CcclubsNtspServiceApplication {

  public static void main(String[] args) {
    SpringApplication.run(CcclubsNtspServiceApplication.class, args);
  }
}
