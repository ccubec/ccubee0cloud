package com.example.cloud.model.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 
 * @TableName book
 */
@TableName(value ="book")
@Data
public class Book implements Serializable {
    /**
     * 
     */
    @TableId
    private Integer id;

    /**
     * 
     */
    private String bookName;

    /**
     * 
     */
    private String author;

    /**
     * 
     */
    private String category;

    /**
     * 
     */
    private Date createTime;

    /**
     * 
     */
    private String status;

    /**
     * 
     */
    private String bookStatus;

    /**
     * 
     */
    private String url;

    /**
     * 
     */
    private String lender;

    /**
     * 
     */
    private String lenderId;

    /**
     * 
     */
    private String key;

    /**
     * 
     */
    private Date updateTime;

    /**
     * 
     */
    private Integer saleNum;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Book other = (Book) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getBookName() == null ? other.getBookName() == null : this.getBookName().equals(other.getBookName()))
            && (this.getAuthor() == null ? other.getAuthor() == null : this.getAuthor().equals(other.getAuthor()))
            && (this.getCategory() == null ? other.getCategory() == null : this.getCategory().equals(other.getCategory()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getBookStatus() == null ? other.getBookStatus() == null : this.getBookStatus().equals(other.getBookStatus()))
            && (this.getUrl() == null ? other.getUrl() == null : this.getUrl().equals(other.getUrl()))
            && (this.getLender() == null ? other.getLender() == null : this.getLender().equals(other.getLender()))
            && (this.getLenderId() == null ? other.getLenderId() == null : this.getLenderId().equals(other.getLenderId()))
            && (this.getKey() == null ? other.getKey() == null : this.getKey().equals(other.getKey()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()))
            && (this.getSaleNum() == null ? other.getSaleNum() == null : this.getSaleNum().equals(other.getSaleNum()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getBookName() == null) ? 0 : getBookName().hashCode());
        result = prime * result + ((getAuthor() == null) ? 0 : getAuthor().hashCode());
        result = prime * result + ((getCategory() == null) ? 0 : getCategory().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getBookStatus() == null) ? 0 : getBookStatus().hashCode());
        result = prime * result + ((getUrl() == null) ? 0 : getUrl().hashCode());
        result = prime * result + ((getLender() == null) ? 0 : getLender().hashCode());
        result = prime * result + ((getLenderId() == null) ? 0 : getLenderId().hashCode());
        result = prime * result + ((getKey() == null) ? 0 : getKey().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        result = prime * result + ((getSaleNum() == null) ? 0 : getSaleNum().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", bookName=").append(bookName);
        sb.append(", author=").append(author);
        sb.append(", category=").append(category);
        sb.append(", createTime=").append(createTime);
        sb.append(", status=").append(status);
        sb.append(", bookStatus=").append(bookStatus);
        sb.append(", url=").append(url);
        sb.append(", lender=").append(lender);
        sb.append(", lenderId=").append(lenderId);
        sb.append(", key=").append(key);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", saleNum=").append(saleNum);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}