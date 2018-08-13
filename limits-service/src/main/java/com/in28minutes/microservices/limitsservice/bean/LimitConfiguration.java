package com.in28minutes.microservices.limitsservice.bean;

public class LimitConfiguration {

    private int maximum;
    private int minimum;

    /**
     *
     */
    public LimitConfiguration() {
    }

    /**
     * @param maximum
     * @param minimum
     */
    public LimitConfiguration(final int maximum, final int minimum) {
        this.maximum = maximum;
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

}
