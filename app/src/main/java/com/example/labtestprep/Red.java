package com.example.labtestprep;

public class Red extends Color{
    public Red(){
        super("Red");
    }
    @Override
    public String showcolor(){
        return this.name;
    }
}
