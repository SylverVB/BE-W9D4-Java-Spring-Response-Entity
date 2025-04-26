package com.app.Controller;

import com.app.Model.Sample;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Demonstrates usage of ResponseEntity for greater control over HTTP responses.
 * This includes customizing status codes (e.g., 400, 401, 201), setting response
 * headers, and defining the response body content.
 */
@RestController
public class Controller {

    /**
     * Sends a response with status code 401 (Unauthorized) and a simple string message in the body.
     *
     * @return a ResponseEntity with status 401 and a message "Unauthorized resource!"
     */
    @GetMapping("/example401")
    public ResponseEntity<String> example(){
        return ResponseEntity.status(401).body("Unauthorized resource!");
    }

    /**
     * Sends a response with status code 200 and a custom "content-type" header set to "application/zip".
     * The body of the response includes the Sample object received in the request.
     *
     * @param sample the Sample object sent in the request body
     * @return a ResponseEntity with status 200, a zip content-type header, and the Sample body
     */
    @PostMapping("/exampleHeaders")
    public ResponseEntity<Sample> headers(@RequestBody Sample sample){
        return ResponseEntity.status(200).header("content-type", "application/zip").body(sample);
    }

    /**
     * Returns a ResponseEntity with status code 400 (Bad Request) and a message in the body.
     *
     * @return a ResponseEntity with status 400 and message "Bad Request"
     */
    @GetMapping("/lab1")
    public ResponseEntity<String> lab1(){
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Bad Request");
    }

    /**
     * Returns a ResponseEntity with status code 201 (Created), sets the "Content-Length" header to 100,
     * and responds with the Sample object received in the request.
     *
     * @param sample the Sample object to include in the response body
     * @return a ResponseEntity with status 201, header "Content-Length: 100", and the Sample body
     */
    @PostMapping("/lab2")
    public ResponseEntity<Sample> lab2(@RequestBody Sample sample){
        return ResponseEntity.status(HttpStatus.CREATED)
                .header("Content-Length", "100")
                .body(sample);
    }
}