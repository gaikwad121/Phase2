package com.lesson3;

public class Colors {

	private long COLORID;
    private String name;
    
    public Colors() {
            
    }
    public Colors(String name) {
            this.COLORID = 0;
            this.name = name;
    }
    
    public long getCOLORID() {return this.COLORID; }
    public String getName() { return this.name;}
    public void setCOLORID(long id) { this.COLORID = id;}
    public void setName(String name) { this.name = name;}

}