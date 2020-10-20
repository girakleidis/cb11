/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.fffffffff;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author g.irakleidis
 */
@RestController
public class endpoints {
    
    @RequestMapping("/hello")
    public String nameDoesntMatter(){
    return "Hello world";}
    
    @RequestMapping("/std")
    public student wedontcare(){
    student result =new student();
    result.setName("george");
    result.setAge(30);
    return result;
    }
}
