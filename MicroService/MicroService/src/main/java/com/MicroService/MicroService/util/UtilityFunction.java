package com.MicroService.MicroService.util;

import com.MicroService.MicroService.controller.HomeController;
import com.MicroService.MicroService.exception.TestingException;
import jakarta.servlet.http.HttpServletRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.stereotype.Component;

@Component
public class UtilityFunction {
    private static final Logger logger= LoggerFactory.getLogger(UtilityFunction.class);
    public ServerResponse generateResponse(HttpServletRequest httpServletRequest, String response){

        try{
//            System.out.println(10/0);
            logger.info("** Enter into generateResponse Function **");
            ServerResponse serverResponse=new ServerResponse();
            serverResponse.setMessage(response);
            serverResponse.setStatusCode(GeneralConstant.OK);
            return serverResponse;
        }
        catch (Exception e){
            throw new TestingException("Error in utility function");
        }

    }
}
