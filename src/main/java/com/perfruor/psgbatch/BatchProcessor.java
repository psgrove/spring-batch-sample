package com.perfruor.psgbatch;

import org.springframework.batch.item.ItemProcessor;

public class BatchProcessor implements ItemProcessor<String, String> {

    @Override
    public String process(String data) throws Exception {
        return data.toUpperCase();
    }

}

