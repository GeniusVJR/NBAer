package com.geniusvjr.nbaer.model;

import java.util.Map;

/**
 * Created by dream on 16/4/23.
 */
public class NewsDetile {

    private String author;
    private Map<String,ContentImage> articleMediaMap;
    private String content;

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Map<String, ContentImage> getArticleMediaMap() {
        return articleMediaMap;
    }

    public void setArticleMediaMap(Map<String, ContentImage> articleMediaMap) {
        this.articleMediaMap = articleMediaMap;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public static class ContentImage
    {
        String url;
        int id;

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }
    }
}
