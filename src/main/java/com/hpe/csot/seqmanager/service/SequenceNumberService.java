package com.hpe.csot.seqmanager.service;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SequenceNumberService {

    public List<Long> fetchSequenceNumbers(String seqCode){

        return new ArrayList<Long>(){{
            add(100L);
            add(101L);
            add(102L);
        }};
    }
}
