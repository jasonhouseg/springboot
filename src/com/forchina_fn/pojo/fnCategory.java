package com.forchina_fn.pojo;

public class FnCategory {
    private Short catid;

    private Byte site;

    private Boolean typeid;

    private Short modelid;

    private Short parentid;

    private String arrparentid;

    private Boolean child;

    private String arrchildid;

    private String catname;

    private String image;

    private String metaTitle;

    private String catdir;

    private String url;

    private String urlpath;

    private Integer items;

    private Short listorder;

    private Boolean ismenu;

    private String categorytpl;

    private String listtpl;

    private String showtpl;

    private Short pagesize;

    public Short getCatid() {
        return catid;
    }

    public void setCatid(Short catid) {
        this.catid = catid;
    }

    public Byte getSite() {
        return site;
    }

    public void setSite(Byte site) {
        this.site = site;
    }

    public Boolean getTypeid() {
        return typeid;
    }

    public void setTypeid(Boolean typeid) {
        this.typeid = typeid;
    }

    public Short getModelid() {
        return modelid;
    }

    public void setModelid(Short modelid) {
        this.modelid = modelid;
    }

    public Short getParentid() {
        return parentid;
    }

    public void setParentid(Short parentid) {
        this.parentid = parentid;
    }

    public String getArrparentid() {
        return arrparentid;
    }

    public void setArrparentid(String arrparentid) {
        this.arrparentid = arrparentid == null ? null : arrparentid.trim();
    }

    public Boolean getChild() {
        return child;
    }

    public void setChild(Boolean child) {
        this.child = child;
    }

    public String getArrchildid() {
        return arrchildid;
    }

    public void setArrchildid(String arrchildid) {
        this.arrchildid = arrchildid == null ? null : arrchildid.trim();
    }

    public String getCatname() {
        return catname;
    }

    public void setCatname(String catname) {
        this.catname = catname == null ? null : catname.trim();
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image == null ? null : image.trim();
    }

    public String getMetaTitle() {
        return metaTitle;
    }

    public void setMetaTitle(String metaTitle) {
        this.metaTitle = metaTitle == null ? null : metaTitle.trim();
    }

    public String getCatdir() {
        return catdir;
    }

    public void setCatdir(String catdir) {
        this.catdir = catdir == null ? null : catdir.trim();
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    public String getUrlpath() {
        return urlpath;
    }

    public void setUrlpath(String urlpath) {
        this.urlpath = urlpath == null ? null : urlpath.trim();
    }

    public Integer getItems() {
        return items;
    }

    public void setItems(Integer items) {
        this.items = items;
    }

    public Short getListorder() {
        return listorder;
    }

    public void setListorder(Short listorder) {
        this.listorder = listorder;
    }

    public Boolean getIsmenu() {
        return ismenu;
    }

    public void setIsmenu(Boolean ismenu) {
        this.ismenu = ismenu;
    }

    public String getCategorytpl() {
        return categorytpl;
    }

    public void setCategorytpl(String categorytpl) {
        this.categorytpl = categorytpl == null ? null : categorytpl.trim();
    }

    public String getListtpl() {
        return listtpl;
    }

    public void setListtpl(String listtpl) {
        this.listtpl = listtpl == null ? null : listtpl.trim();
    }

    public String getShowtpl() {
        return showtpl;
    }

    public void setShowtpl(String showtpl) {
        this.showtpl = showtpl == null ? null : showtpl.trim();
    }

    public Short getPagesize() {
        return pagesize;
    }

    public void setPagesize(Short pagesize) {
        this.pagesize = pagesize;
    }
}