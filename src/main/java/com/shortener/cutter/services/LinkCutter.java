package com.shortener.cutter.services;

import org.springframework.stereotype.Service;

@Service
public interface LinkCutter {

    String getShortLink (String url);

}
