package org.apache.jmeter.spi;

import org.apache.jorphan.collections.HashTree;

import java.util.List;
import java.util.Properties;

/**
 * JMeter event SPI.
 *
 * Created by VERNER Jan on 10.7.17.
 */
public interface JMeterEventListener {

    /**
     * JMeter startup.
     */
    void initialized();

    void initializeDistributedTest(List<String> addresses, HashTree tree, Properties props);

    void configureEngine(String host, HashTree tree);

}
