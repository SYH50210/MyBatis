package com.newcapec.entity;

/**
 * 分页类
 */
public class Page {

    //当前页码
    private Integer pageNum = 1;
    //每页条数
    private Integer pageSize = 3;
    //总页数: 总记录数/每页条数,除不尽+1
    private Integer pages;
    //总记录数
    private Integer total;

    /**
     * mysql
     * 起始偏移量：（当前页码-1）*每页条数
     */
    private Integer offset;

    /**
     * oracle
     * 起始条数:（当前页码-1）*每页条数+1
     * 结束条数: 当前页码*每页条数
     */
    private Integer start;
    private Integer end;

    public Integer getPageNum() {
        return pageNum;
    }

    public void setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Integer getPages() {
        return getTotal()%getPageSize()==0 ? getTotal()/getPageSize() : getTotal()/getPageSize()+1;
    }

    public void setPages(Integer pages) {
        this.pages = pages;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public Integer getOffset() {
        return (getPageNum() - 1) * getPageSize();
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public Integer getStart() {
        return (getPageNum() - 1) * getPageSize() + 1;
    }

    public void setStart(Integer start) {
        this.start = start;
    }

    public Integer getEnd() {
        return getPageNum() * getPageSize();
    }

    public void setEnd(Integer end) {
        this.end = end;
    }

    @Override
    public String toString() {
        return "Page{" +
                "pageNum=" + pageNum +
                ", pageSize=" + pageSize +
                ", pages=" + pages +
                ", total=" + total +
                ", offset=" + offset +
                ", start=" + start +
                ", end=" + end +
                '}';
    }
}