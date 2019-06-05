package com.joao.utils;

public class Rate{


    private final Double MAX_RATE;
    private Double rate;


    public Rate(Double rate) {
        this.MAX_RATE = rate;
    }

    public Rate(int rate){
        this.MAX_RATE = Double.valueOf(rate);
    }


    public  Double getMaxRate() {
            return MAX_RATE;
        }

    public Double getRate() {
        return rate;
    }

    public void setRate(Double rate) throws RateOutOfRangeException{

        if(rate> MAX_RATE){
            throw new RateOutOfRangeException(rate);
        }

        this.rate = rate;
    }


    @Override
    public String toString() {
        return "Rate{" +
                "MAX_RATE=" + MAX_RATE +
                ", rate=" + rate +
                '}';
    }

    public class RateOutOfRangeException extends Exception{

        Double rate;
        RateOutOfRangeException(Double rate){

        }


        @Override
        public String toString() {
            return "Avaliação fora do limite: "+rate;
        }
    }
}
