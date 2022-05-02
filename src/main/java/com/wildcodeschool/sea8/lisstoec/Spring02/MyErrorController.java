package com.wildcodeschool.sea8.lisstoec.Spring02;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyErrorController implements ErrorController {
    
    @RequestMapping("/error")
    @ResponseBody
    public String handleError(HttpServletRequest request) {
        return "<p>ERROR: " + request.getAttribute(RequestDispatcher.ERROR_MESSAGE).toString() + "</p>"
        + "\n<p>Error Status Code: " + request.getAttribute(RequestDispatcher.ERROR_STATUS_CODE).toString() + "</p>";
    }
}