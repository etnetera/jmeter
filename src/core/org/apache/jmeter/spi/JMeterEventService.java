package org.apache.jmeter.spi;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ServiceLoader;

/**
 * Created by VERNER Jan on 10.7.17.
 */
public class JMeterEventService {

    private static final Logger log = LoggerFactory.getLogger(JMeterEventService.class);


    private static final ServiceLoader<JMeterEventListener> serviceLoader;
    static {
        serviceLoader = ServiceLoader.load(JMeterEventListener.class);
        serviceLoader.forEach(service -> log.info("discovered service: " + service));
    }


    public static void initialized() {
        serviceLoader.forEach(JMeterEventListener::initialized);
    }

}
