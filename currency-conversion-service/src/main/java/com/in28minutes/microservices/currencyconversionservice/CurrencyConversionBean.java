package com.in28minutes.microservices.currencyconversionservice;

import java.math.BigDecimal;

public class CurrencyConversionBean {

    private Long id;
    private String from;
    private String to;
    private BigDecimal conversionMultiple;
    private BigDecimal quantity;
    private BigDecimal totalCalculatedAmount;
    private int port;

    /**
     *
     */
    public CurrencyConversionBean() {
    }

    /**
     * @param id
     * @param from
     * @param to
     * @param conversionMultiple
     * @param quantity
     * @param totalCalculatedAmount
     * @param port
     */
    public CurrencyConversionBean(final Long id, final String from, final String to, final BigDecimal conversionMultiple,
            final BigDecimal quantity, final BigDecimal totalCalculatedAmount, final int port) {
        this.id = id;
        this.from = from;
        this.to = to;
        this.conversionMultiple = conversionMultiple;
        this.quantity = quantity;
        this.totalCalculatedAmount = totalCalculatedAmount;
        this.port = port;
    }

    /**
     * @return the id
     */
    public Long getId() {
        return this.id;
    }

    /**
     * @param id the id to set
     */
    public void setId(final Long id) {
        this.id = id;
    }

    /**
     * @return the from
     */
    public String getFrom() {
        return this.from;
    }

    /**
     * @param from the from to set
     */
    public void setFrom(final String from) {
        this.from = from;
    }

    /**
     * @return the to
     */
    public String getTo() {
        return this.to;
    }

    /**
     * @param to the to to set
     */
    public void setTo(final String to) {
        this.to = to;
    }

    /**
     * @return the conversionMultiple
     */
    public BigDecimal getConversionMultiple() {
        return this.conversionMultiple;
    }

    /**
     * @param conversionMultiple the conversionMultiple to set
     */
    public void setConversionMultiple(final BigDecimal conversionMultiple) {
        this.conversionMultiple = conversionMultiple;
    }

    /**
     * @return the quantity
     */
    public BigDecimal getQuantity() {
        return this.quantity;
    }

    /**
     * @param quantity the quantity to set
     */
    public void setQuantity(final BigDecimal quantity) {
        this.quantity = quantity;
    }

    /**
     * @return the totalCalculatedAmount
     */
    public BigDecimal getTotalCalculatedAmount() {
        return this.totalCalculatedAmount;
    }

    /**
     * @param totalCalculatedAmount the totalCalculatedAmount to set
     */
    public void setTotalCalculatedAmount(final BigDecimal totalCalculatedAmount) {
        this.totalCalculatedAmount = totalCalculatedAmount;
    }

    /**
     * @return the port
     */
    public int getPort() {
        return this.port;
    }

    /**
     * @param port the port to set
     */
    public void setPort(final int port) {
        this.port = port;
    }

}
