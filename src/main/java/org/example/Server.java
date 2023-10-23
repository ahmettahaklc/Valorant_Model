package org.example;

public enum Server {

    ISTANBUL("TR"),
    FRANKFURT("DE"),
    PARIS("FR"),
    VARSOVA("PL"),
    LONDRA("UK"),
    STOKHOLM("SE"),
    MADRID("ES"),
    BAHREYN("BH"),
    CAPE_TOWN("ZA"),
    TOKYO("JP");


    private final String abbreviation;

    Server(String abbreviation){
        this.abbreviation = abbreviation;
    }

    public String getAbbreviation(){
        return this.abbreviation;
    }

}
