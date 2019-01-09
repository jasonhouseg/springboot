package com.forchina_fn.pojo;

public class Fnblock {
    private Short id;

    private Byte site;

    private Boolean type;

    private String name;

    private String content;

    public Short getId() {
        return id;
    }

    public void setId(Short id) {
        this.id = id;
    }

    public Byte getSite() {
        return site;
    }

    public void setSite(Byte site) {
        this.site = site;
    }

    public Boolean getType() {
        return type;
    }

    public void setType(Boolean type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }
}