package net.piedevelopers.junitandretrofit.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ArticleResponse {



    @SerializedName("articles")
    @Expose
    private List<Article> articles = null;
    @SerializedName("articlesCount")
    @Expose
    private Integer articlesCount;

    public List<Article> getArticles() {
        return articles;
    }

    public void setArticles(List<Article> articles) {
        this.articles = articles;
    }

    public Integer getArticlesCount() {
        return articlesCount;
    }

    public void setArticlesCount(Integer articlesCount) {
        this.articlesCount = articlesCount;
    }

}
