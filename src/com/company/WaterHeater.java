package com.company;

import java.util.Date;

public class WaterHeater extends ServiceCall {

    public static int mandatoryFee = 20;

    /* An enum is a group of constants. Since the WaterHeater's type must be one of these, use
    an Enum to contain the allowed types.  */
    enum WaterHeaterType {
        Electric,
        Gas,
        Coal,
    }

    private WaterHeaterType type;

    public WaterHeater(String serviceAddress, String problemDescription, Date date, WaterHeaterType type) {

        super(serviceAddress, problemDescription, date);
        this.type = type;

    }

    @Override
    public String toString() {

        String typeString = type.toString();
        String resolvedDateString = ( resolvedDate == null) ? "Unresolved" : this.resolvedDate.toString();
        String resolutionString = ( this.resolution == null) ? "Unresolved" : this.resolution;
        String feeString = (fee == UNRESOLVED) ? "Unresolved" : "$" + Double.toString(fee);


        return "Water heater Service Call " + "\n" +
                "Service Address= " + serviceAddress + "\n" +
                "Problem Description = " + problemDescription  + "\n" +
                "Water heater Type = " + typeString + "\n" +
                "Reported Date = " + reportedDate + "\n" +
                "Resolved Date = " + resolvedDateString + "\n" +
                "Resolution = " + resolutionString + "\n" +
                "Fee = " + feeString ;

    }
}