package com.example.shapetoolproject.endpoint;

import com.example.shapetoolproject.generated.*;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class ShapeToolEndpoint {

    private static final String NAMESPACE = "http://example.com/shapetool";

    @PayloadRoot(namespace = NAMESPACE, localPart = "circleAreaRequest")
    @ResponsePayload
    public CircleAreaResponse getCircleArea(@RequestPayload CircleAreaRequest request) {
        System.out.println("=== Circle Area Request ===");
        System.out.println("Received radius: " + request.getRadius());

        CircleAreaResponse response = new CircleAreaResponse();
        double area = Math.PI * request.getRadius() * request.getRadius();
        response.setArea(area);

        System.out.println("Calculated area: " + area);
        System.out.println("==========================");
        return response;
    }

    @PayloadRoot(namespace = NAMESPACE, localPart = "squareAreaRequest")
    @ResponsePayload
    public SquareAreaResponse getSquareArea(@RequestPayload SquareAreaRequest request) {
        System.out.println("=== Square Area Request ===");
        System.out.println("Received side: " + request.getSide());

        SquareAreaResponse response = new SquareAreaResponse();
        double area = request.getSide() * request.getSide();
        response.setArea(area);

        System.out.println("Calculated area: " + area);
        System.out.println("=========================");
        return response;
    }

    @PayloadRoot(namespace = NAMESPACE, localPart = "rectangleAreaRequest")
    @ResponsePayload
    public RectangleAreaResponse getRectangleArea(@RequestPayload RectangleAreaRequest request) {
        System.out.println("=== Rectangle Area Request ===");
        System.out.println("Received length: " + request.getLength());
        System.out.println("Received width: " + request.getWidth());

        RectangleAreaResponse response = new RectangleAreaResponse();
        double area = request.getLength() * request.getWidth();
        response.setArea(area);

        System.out.println("Calculated area: " + area);
        System.out.println("============================");
        return response;
    }

    @PayloadRoot(namespace = NAMESPACE, localPart = "parallelogramAreaRequest")
    @ResponsePayload
    public ParallelogramAreaResponse getParallelogramArea(@RequestPayload ParallelogramAreaRequest request) {
        System.out.println("=== Parallelogram Area Request ===");
        System.out.println("Received base: " + request.getBase());
        System.out.println("Received height: " + request.getHeight());

        ParallelogramAreaResponse response = new ParallelogramAreaResponse();
        double area = request.getBase() * request.getHeight();
        response.setArea(area);

        System.out.println("Calculated area: " + area);
        System.out.println("=================================");
        return response;
    }

    @PayloadRoot(namespace = NAMESPACE, localPart = "triangleAreaRequest")
    @ResponsePayload
    public TriangleAreaResponse getTriangleArea(@RequestPayload TriangleAreaRequest request) {
        System.out.println("=== Triangle Area Request ===");
        System.out.println("Received base: " + request.getBase());
        System.out.println("Received height: " + request.getHeight());

        TriangleAreaResponse response = new TriangleAreaResponse();
        double area = 0.5 * request.getBase() * request.getHeight();
        response.setArea(area);

        System.out.println("Calculated area: " + area);
        System.out.println("============================");
        return response;
    }
}