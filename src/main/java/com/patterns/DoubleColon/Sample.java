package com.patterns.DoubleColon;

public class Sample {
    private String string;

    public Sample(String string) {
        this.string = string;
    }

    public Sample()
    {
        System.out.println("Sample Constructor");
    }
    public void info()
    {
        System.out.println("Sample class method ");
    }
}
