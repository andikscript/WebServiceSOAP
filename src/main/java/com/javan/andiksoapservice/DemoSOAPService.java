/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javan.andiksoapservice;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author akunf
 */
@WebService(serviceName = "DemoSOAPService")
public class DemoSOAPService {

    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt;
    }

    @WebMethod(operationName = "penjumlahan")
    public double penjumlahan(@WebParam(name = "firstNum") double firstNum, @WebParam(name = "secondNum") double secondNum) {
        return firstNum + secondNum;
    }

    @WebMethod(operationName = "pengurangan")
    public double pengurangan(@WebParam(name = "firstNum") double firstNum, @WebParam(name = "secondNum") double secondNum) {
        return firstNum - secondNum;
    }

    @WebMethod(operationName = "perkalian")
    public double perkalian(@WebParam(name = "firstNum") double firstNum, @WebParam(name = "secondNum") double secondNum) {
        return firstNum * secondNum;
    }

    @WebMethod(operationName = "pembagian")
    public double pembagian(@WebParam(name = "fristNum") double firstNum, @WebParam(name = "secondNum") double secondNum) {
        return firstNum / secondNum;
    }
}
