package com.wildcodeschool.sea8.lisstoec.Spring02;

import java.util.HashMap;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.server.ResponseStatusException;

@Controller
public class DoctorController {
    @RequestMapping("/doctor/{id}")
    @ResponseBody
	public HashMap<String, String> doctors(@PathVariable int id) {
        if (id >=9 && id <= 13){
            if (id == 9){
                HashMap<String, String> incarnation = new HashMap<String, String>();
                incarnation.put("number", "9");
                incarnation.put("name", "Christopher Eccleston");
                return incarnation;
            }
            else if (id == 10){
                HashMap<String, String> incarnation = new HashMap<String, String>();
                incarnation.put("number", "10");
                incarnation.put("name", "David Tennant");
                return incarnation;
            }
            else if (id == 11){
                HashMap<String, String> incarnation = new HashMap<String, String>();
                incarnation.put("number", "11");
                incarnation.put("name", "Matt Smith");
                return incarnation;
            }
            else if (id == 12){
                HashMap<String, String> incarnation = new HashMap<String, String>();
                incarnation.put("number", "12");
                incarnation.put("name", "Peter Capaldi");
                return incarnation;
            }
            else {
                HashMap<String, String> incarnation = new HashMap<String, String>();
                incarnation.put("number", "13");
                incarnation.put("name", "Jodie Whittaker");
                return incarnation;
            }
        }else if (id >= 1 && id <= 8){
            throw new ResponseStatusException(HttpStatus.SEE_OTHER);
        }else {
            String reason = "Impossible to retrieve the incarnation " + id;
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, reason);
        }
    }
}