package com.app;

import com.app.Controller.Controller;
import com.app.Model.Sample;
import org.junit.jupiter.api.Test;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Test class for the Controller class, focusing on the functionality of the REST endpoints.
 * It verifies the correct behavior of the lab1 and lab2 methods from the Controller class.
 */
public class ControllerTest {

    /**
     * Test for the lab1 method in the Controller class.
     * Verifies that a GET request to /lab1 returns the correct status code (400 Bad Request)
     * and the correct body message ("Bad Request").
     */
    @Test
    public void testLab1() {
        Controller controller = new Controller();
        ResponseEntity<String> response = controller.lab1();

        // Assert that the status code is 400 (Bad Request)
        assertEquals(HttpStatus.BAD_REQUEST, response.getStatusCode());

        // Assert that the response body contains the message "Bad Request"
        assertEquals("Bad Request", response.getBody());
    }

    /**
     * Test for the lab2 method in the Controller class.
     * Verifies that a POST request to /lab2 returns the correct status code (201 Created),
     * the correct Sample object in the response body, and the correct "Content-Length" header value.
     * 
     * @see Sample
     */
    @Test
    public void testLab2() {
        Controller controller = new Controller();
        Sample sample = new Sample();

        // Send the sample to the lab2 method and capture the response
        ResponseEntity<Sample> response = controller.lab2(sample);

        // Assert that the status code is 201 (Created)
        assertEquals(HttpStatus.CREATED, response.getStatusCode());

        // Assert that the response body contains the correct Sample object
        assertEquals(sample, response.getBody());

        // Assert that the "Content-Length" header is set to "100"
        assertEquals("100", response.getHeaders().get("content-length").get(0));
    }
}