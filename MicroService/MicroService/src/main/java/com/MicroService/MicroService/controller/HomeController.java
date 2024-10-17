package com.MicroService.MicroService.controller;

import com.MicroService.MicroService.util.GeneralConstant;
import com.MicroService.MicroService.util.ServerResponse;
import com.MicroService.MicroService.util.UtilityFunction;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import jakarta.servlet.http.HttpServletRequest;
import org.apache.coyote.Response;
import org.apache.juli.logging.LogFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/microservice")
@RestController
public class HomeController {

    @Autowired
    private UtilityFunction utilityFunction;

    private static final Logger logger= LoggerFactory.getLogger(HomeController.class);

    @Operation(summary = "summary",description = "description")
    @ApiResponse(responseCode = "404", description = "foo")
    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    ResponseEntity<ServerResponse> getRequest(HttpServletRequest httpServletRequest){
        try {
            logger.info("*******  Enter into get method of microservice *******");
            logger.info("**********" + httpServletRequest.getRequestURI() + " " + httpServletRequest.getHeader("os"));
            ServerResponse serverResponse = utilityFunction.generateResponse(httpServletRequest, "hello");
            return new ResponseEntity<>(serverResponse,HttpStatus.OK);
        }
        catch (Exception ex){
            logger.info("****** "+ex.getMessage());
            logger.info("****** "+ex.getMessage());
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }


    }


    // swagger (we can hide, add lock for particular api
    // url:  http://localhost:8080/swagger-ui/index.html

}


