package com.hpe.csot.seqmanager.controller;

import com.hpe.csot.seqmanager.service.SequenceNumberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SequenceManagerController {

    @Autowired
    SequenceNumberService sequenceNumberService;

    @RequestMapping("/")
    public String home(){
        return "hello , this is spring boot";
    }

    @RequestMapping("/fetchSequenceNos/{code}")
    public List<Long> fetchSequenceNumbers(@PathVariable String code){
        return sequenceNumberService.fetchSequenceNumbers(code);
    }
}
