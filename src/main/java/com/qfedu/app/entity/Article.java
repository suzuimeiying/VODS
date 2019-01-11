package com.qfedu.app.entity;

public class Article {
    private Integer articleId;

    private String articleImg;

    private String articleName;

    private String articleAbstract;

    private String articleCreatman;

    private String articleCreattime;

    private Integer articleReadnumber;

    private String articleUrl;

    private String flag;

    public Integer getArticleId() {
        return articleId;
    }

    public void setArticleId(Integer articleId) {
        this.articleId = articleId;
    }

    public String getArticleImg() {
        return articleImg;
    }

    public void setArticleImg(String articleImg) {
        this.articleImg = articleImg == null ? null : articleImg.trim();
    }

    public String getArticleName() {
        return articleName;
    }

    public void setArticleName(String articleName) {
        this.articleName = articleName == null ? null : articleName.trim();
    }

    public String getArticleAbstract() {
        return articleAbstract;
    }

    public void setArticleAbstract(String articleAbstract) {
        this.articleAbstract = articleAbstract == null ? null : articleAbstract.trim();
    }

    public String getArticleCreatman() {
        return articleCreatman;
    }

    public void setArticleCreatman(String articleCreatman) {
        this.articleCreatman = articleCreatman == null ? null : articleCreatman.trim();
    }

    public String getArticleCreattime() {
        return articleCreattime;
    }

    public void setArticleCreattime(String articleCreattime) {
        this.articleCreattime = articleCreattime == null ? null : articleCreattime.trim();
    }

    public Integer getArticleReadnumber() {
        return articleReadnumber;
    }

    public void setArticleReadnumber(Integer articleReadnumber) {
        this.articleReadnumber = articleReadnumber;
    }

    public String getArticleUrl() {
        return articleUrl;
    }

    public void setArticleUrl(String articleUrl) {
        this.articleUrl = articleUrl == null ? null : articleUrl.trim();
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag == null ? null : flag.trim();
    }
}