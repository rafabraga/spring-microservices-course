package com.in28minutes.microservices.limitsservice;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("limits-service")
public class Configuration {

    private int minimum;
    private int maximum;

    /**
     * @return the minimum
     */
    public int getMinimum() {
        return this.minimum;
    }

    /**
     * @param minimum the minimum to set
     */
    public void setMinimum(final int minimum) {
        this.minimum = minimum;
    }

    /**
     * @return the maximum
     */
    public int getMaximum() {
        return this.maximum;
    }

    /**
     * @param maximum the maximum to set
     */
    public void setMaximum(final int maximum) {
        this.maximum = maximum;
    }

}
