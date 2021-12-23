/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.DataKampus;

import java.util.ArrayList;
import java.util.List;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author Ican
 */
@Controller
public class DatamahasiswaLogicControllerXML {
    @CrossOrigin
    @RequestMapping(value = "/getXML", produces={MediaType.APPLICATION_XML_VALUE})
    @ResponseBody
    public List<Datamahasiswa> getdataxml(){
        DatamahasiswaJpaController controller = new DatamahasiswaJpaController();
        List<Datamahasiswa> buffer = new ArrayList<>();
        try{
            buffer = controller.findDatamahasiswaEntities();
        }catch(Exception e){
            
        }
        
        return buffer; 
        
    }
}
