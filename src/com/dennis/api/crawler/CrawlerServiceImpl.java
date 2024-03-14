package com.dennis.api.crawler;

import java.io.IOException;
import java.util.Map;

public class CrawlerServiceImpl implements CrawlerService {
    private static CrawlerServiceImpl instance = new CrawlerServiceImpl();
    private CrawlerRepository repository;
    private CrawlerServiceImpl(){
        repository = CrawlerRepository.getInstance();
    }
    static CrawlerServiceImpl getInstance() {
        return instance;
    }
    @Override
    public Map<String, ?> finNamesFromWeb(Map<String, String> paraMap) throws IOException {
        return repository.save(paraMap);
    }

    @Override
    public Map<String, ?> findMelonMusic(Map<String, String> paraMap) throws IOException {
        return repository.find(paraMap);
    }
}
