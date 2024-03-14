package com.dennis.api.crawler;

import org.jsoup.nodes.Element;

import java.io.IOException;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class CrawlerVIew {
    public static void main(Scanner sc) throws IOException {
        CrawlerController controller = new CrawlerController();
        Iterator<Element> rank;
        Iterator<Element> artist;
        Iterator<Element> title;
        Map<String, ?> map;

        while(true){
            System.out.println("x.Exit b.Bugs! m.Melon");
            switch (sc.next()){
                case "x":
                    System.out.println("종료");return;
                case "b":
                    System.out.println("1-벅스");
                  map = controller.findBugsMusic(sc);
                  rank = (Iterator<Element>) map.get("rank");
                  artist = (Iterator<Element>) map.get("artist");
                  title = (Iterator<Element>) map.get("title");
                    System.out.println("벅스 결과: ");
                    while(rank.hasNext()){
                        System.out.println(rank.next().text() + "위 " + artist.next().text() + " - " + title.next().text());
                    }
                    break;
                case "m":
                    System.out.println("1-멜론");
                    map = controller.findMelonMusic(sc);
                    rank = (Iterator<Element>) map.get("rank");
                    artist = (Iterator<Element>) map.get("artist");
                    title = (Iterator<Element>) map.get("title");
                    System.out.println("멜론 결과: ");
                    while(rank.hasNext()){
                        System.out.println(rank.next().text() + "위 " + artist.next().text() + " - " + title.next().text());
                    }
                    break;
            }
        }
    }
}
