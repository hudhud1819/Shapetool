package com.example.shapetoolproject.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "rectangleAreaRequest", namespace = "http://example.com/shapetool")
@XmlAccessorType(XmlAccessType.FIELD)
public class RectangleAreaRequest {

    @XmlElement(name = "length", namespace = "http://example.com/shapetool")
    private double length;

    @XmlElement(name = "width", namespace = "http://example.com/shapetool")
    private double width;

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
}