package com.example.shapetoolproject.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "circleAreaRequest", namespace = "http://example.com/shapetool")
@XmlAccessorType(XmlAccessType.FIELD)
public class CircleAreaRequest {

    @XmlElement(name = "radius", namespace = "http://example.com/shapetool")
    private double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}