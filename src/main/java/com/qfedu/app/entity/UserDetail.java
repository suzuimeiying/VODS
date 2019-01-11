package com.qfedu.app.entity;

import java.io.Serializable;

public class UserDetail implements Serializable {
    private Integer detailId;

    private Integer detailUid;

    private String detailImgurl;

    private String detailFocus;

    private String detailFans;

    private Integer flag;

    private static final long serialVersionUID = 1L;

    public Integer getDetailId() {
        return detailId;
    }

    public void setDetailId(Integer detailId) {
        this.detailId = detailId;
    }

    public Integer getDetailUid() {
        return detailUid;
    }

    public void setDetailUid(Integer detailUid) {
        this.detailUid = detailUid;
    }

    public String getDetailImgurl() {
        return detailImgurl;
    }

    public void setDetailImgurl(String detailImgurl) {
        this.detailImgurl = detailImgurl == null ? null : detailImgurl.trim();
    }

    public String getDetailFocus() {
        return detailFocus;
    }

    public void setDetailFocus(String detailFocus) {
        this.detailFocus = detailFocus == null ? null : detailFocus.trim();
    }

    public String getDetailFans() {
        return detailFans;
    }

    public void setDetailFans(String detailFans) {
        this.detailFans = detailFans == null ? null : detailFans.trim();
    }

    public Integer getFlag() {
        return flag;
    }

    public void setFlag(Integer flag) {
        this.flag = flag;
    }

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
        UserDetail other = (UserDetail) that;
        return (this.getDetailId() == null ? other.getDetailId() == null : this.getDetailId().equals(other.getDetailId()))
            && (this.getDetailUid() == null ? other.getDetailUid() == null : this.getDetailUid().equals(other.getDetailUid()))
            && (this.getDetailImgurl() == null ? other.getDetailImgurl() == null : this.getDetailImgurl().equals(other.getDetailImgurl()))
            && (this.getDetailFocus() == null ? other.getDetailFocus() == null : this.getDetailFocus().equals(other.getDetailFocus()))
            && (this.getDetailFans() == null ? other.getDetailFans() == null : this.getDetailFans().equals(other.getDetailFans()))
            && (this.getFlag() == null ? other.getFlag() == null : this.getFlag().equals(other.getFlag()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getDetailId() == null) ? 0 : getDetailId().hashCode());
        result = prime * result + ((getDetailUid() == null) ? 0 : getDetailUid().hashCode());
        result = prime * result + ((getDetailImgurl() == null) ? 0 : getDetailImgurl().hashCode());
        result = prime * result + ((getDetailFocus() == null) ? 0 : getDetailFocus().hashCode());
        result = prime * result + ((getDetailFans() == null) ? 0 : getDetailFans().hashCode());
        result = prime * result + ((getFlag() == null) ? 0 : getFlag().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", detailId=").append(detailId);
        sb.append(", detailUid=").append(detailUid);
        sb.append(", detailImgurl=").append(detailImgurl);
        sb.append(", detailFocus=").append(detailFocus);
        sb.append(", detailFans=").append(detailFans);
        sb.append(", flag=").append(flag);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}