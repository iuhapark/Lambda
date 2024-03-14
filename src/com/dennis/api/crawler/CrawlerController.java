package com.dennis.api.crawler;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CrawlerController {
    private CrawlerServiceImpl service = CrawlerServiceImpl.getInstance();
    public Map<String,?> findBugsMusic(Scanner sc) throws IOException {
        System.out.println("크롤링 할 주소를 입력하시오.");
        String url = sc.next();
        Map<String,String> paraMap = new HashMap();
        paraMap.put("URL",url);

        return service.finNamesFromWeb(paraMap);
    }
    public Map<String,?> findMelonMusic(Scanner sc) throws IOException{
        System.out.println("크롤링 할 주소를 입력하시오.");
        String url = sc.next();
        Map<String,String> paraMap = new HashMap();
        paraMap.put("URL",url);

        return service.findMelonMusic(paraMap);
    }
}
