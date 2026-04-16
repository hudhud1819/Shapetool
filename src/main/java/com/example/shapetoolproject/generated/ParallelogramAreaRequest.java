package com.example.shapetoolproject.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "parallelogramAreaRequest", namespace = "http://example.com/shapetool")
@XmlAccessorType(XmlAccessType.FIELD)
public class ParallelogramAreaRequest {

    @XmlElement(name = "base", namespace = "http://example.com/shapetool")
    private double base;

    @XmlElement(name = "height", namespace = "http://example.com/shapetool")
    private double height;

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}