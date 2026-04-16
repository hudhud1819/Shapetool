package com.example.shapetoolproject.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "squareAreaRequest", namespace = "http://example.com/shapetool")
@XmlAccessorType(XmlAccessType.FIELD)
public class SquareAreaRequest {

    @XmlElement(name = "side", namespace = "http://example.com/shapetool")
    private double side;

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }
}