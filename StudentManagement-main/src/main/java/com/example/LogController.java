package com.example;

import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ch.qos.logback.classic.Logger;

@RestController
public class LogController {

	Logger logger = (Logger) LoggerFactory.getLogger(LogController.class);

@RequestMapping("/log") public String log()
{
    // Logging various log level messages
    logger.trace("Log level: TRACE");
    logger.info("Log level: INFO");
    logger.debug("Log level: DEBUG");
    logger.error("Log level: ERROR");
    logger.warn("Log level: WARN");

    return "logger success";
}
}
