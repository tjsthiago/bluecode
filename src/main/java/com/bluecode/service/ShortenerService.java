package com.bluecode.service;

import com.bluecode.entity.ShortenerRequest;
import com.bluecode.repository.ShortenerRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShortenerService {

    private final ShortenerRepository repository;

    public ShortenerService(ShortenerRepository repository){
        this.repository = repository;
    }

    public ShortenerRequest applyShortener(ShortenerRequest shortenerRequest){
        // select database and get the highest ID
        // update the in memory shortenerRequest with id + 1
        // then insert

        shortenerRequest.setShortenedUrl(encode(shortenerRequest.getUrl()));

        return repository.save(shortenerRequest);
    }

    private String encode(String url){
        return "http://shortner/encripted";
    }

    public List<ShortenerRequest> findAll(){
        return this.repository.findAll();
    }

}
