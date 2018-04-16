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

    /**
     * Controller is initializing a distributed test.
     * @param hosts list of load generators (ip:port or hostname:port)
     * @param tree test plan
     * @param remoteProps properties for load generators
     */
    void initializeDistributedTest(List<String> hosts, HashTree tree, Properties remoteProps);

    /**
     * Engine is being configured. Either single test or load gens.
     * @param host host
     * @param tree test plan
     */
    void configureEngine(String host, HashTree tree);

}
