package com.dennis.api.crawler;
import java.io.IOException;
import java.util.Map;

public interface CrawlerService {
    Map<String, ?> finNamesFromWeb(Map<String, String> paraMap) throws IOException;

    Map<String,?> findMelonMusic(Map<String, String> paraMap) throws IOException;
}
