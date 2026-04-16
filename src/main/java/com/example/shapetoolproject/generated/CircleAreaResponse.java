package com.example.shapetoolproject.generated;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "circleAreaResponse", namespace = "http://example.com/shapetool")
@XmlType(propOrder = {"area"})
public class CircleAreaResponse {
    private double area;

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }
}