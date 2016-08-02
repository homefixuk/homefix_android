package com.homefix.tradesman.model;

import com.samdroid.string.Strings;

/**
 * Created by samuel on 7/27/2016.
 */

public class Payment {

    private String id;
    private ServiceSet serviceSet;
    private double amount;
    private String type; // cash/cheque/bank_transfer/card/stripe/etc.

    public Payment() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ServiceSet getServiceSet() {
        return serviceSet;
    }

    public void setServiceSet(ServiceSet serviceSet) {
        this.serviceSet = serviceSet;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getType() {
        return Strings.returnSafely(type);
    }

    public void setType(String type) {
        this.type = type;
    }
}
