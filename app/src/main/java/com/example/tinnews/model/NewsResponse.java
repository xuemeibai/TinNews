package com.example.tinnews.model;

import java.util.List;
import java.util.Objects;


public class NewsResponse {


    public List<Article> articles;
    public String code;
    public String message;
    public String status;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof NewsResponse)) return false;
        NewsResponse that = (NewsResponse) o;
        return Objects.equals(articles, that.articles) &&
                Objects.equals(code, that.code) &&
                Objects.equals(message, that.message) &&
                Objects.equals(status, that.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(articles, code, message, status);
    }

    @Override
    public String toString() {
        return "NewsResponse{" +
                "articles=" + articles +
                ", code='" + code + '\'' +
                ", message='" + message + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}

