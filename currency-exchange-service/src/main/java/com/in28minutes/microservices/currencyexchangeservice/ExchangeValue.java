package com.in28minutes.microservices.currencyexchangeservice;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Transient;

@Entity
public class ExchangeValue {

    @Id
    private Long id;

    @Column(name = "currency_from")
    private String from;

    @Column(name = "currency_to")
    private String to;
    private BigDecimal conversionMultiple;

    @Transient
    private int port;

    /**
     *
     */
    public ExchangeValue() {
    }

    /**
     * @param id
     * @param from
     * @param to
     * @param conversionMultiple
     */
    public ExchangeValue(final Long id, final String from, final String to, final BigDecimal conversionMultiple) {
        this.id = id;
        this.from = from;
        this.to = to;
        this.conversionMultiple = conversionMultiple;
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
