package tech.aistar.entity;

import org.hibernate.validator.constraints.NotBlank;

import java.io.Serializable;
import java.util.Date;

public class Knowledge implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column knowledge.id
     *
     * @mbggenerated Fri Jun 21 19:55:40 CST 2019
     */
    private String id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column knowledge.title
     *
     * @mbggenerated Fri Jun 21 19:55:40 CST 2019
     */
    @NotBlank(message = "{knowledge.title.isnull}",groups = {Group1.class})
    private String title;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column knowledge.ctime
     *
     * @mbggenerated Fri Jun 21 19:55:40 CST 2019
     */
    private Date ctime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column knowledge.contentUrl
     *
     * @mbggenerated Fri Jun 21 19:55:40 CST 2019
     */
    private String contenturl;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column knowledge.islike
     *
     * @mbggenerated Fri Jun 21 19:55:40 CST 2019
     */
    private Integer islike;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column knowledge.ktype_id
     *
     * @mbggenerated Fri Jun 21 19:55:40 CST 2019
     */
    private String ktypeId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column knowledge.detail
     *
     * @mbggenerated Fri Jun 21 19:55:40 CST 2019
     */
    @NotBlank(message = "细节太少了",groups = {Group2.class})
    private String detail;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table knowledge
     *
     * @mbggenerated Fri Jun 21 19:55:40 CST 2019
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column knowledge.id
     *
     * @return the value of knowledge.id
     *
     * @mbggenerated Fri Jun 21 19:55:40 CST 2019
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column knowledge.id
     *
     * @param id the value for knowledge.id
     *
     * @mbggenerated Fri Jun 21 19:55:40 CST 2019
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column knowledge.title
     *
     * @return the value of knowledge.title
     *
     * @mbggenerated Fri Jun 21 19:55:40 CST 2019
     */
    public String getTitle() {
        return title;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column knowledge.title
     *
     * @param title the value for knowledge.title
     *
     * @mbggenerated Fri Jun 21 19:55:40 CST 2019
     */
    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column knowledge.ctime
     *
     * @return the value of knowledge.ctime
     *
     * @mbggenerated Fri Jun 21 19:55:40 CST 2019
     */
    public Date getCtime() {
        return ctime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column knowledge.ctime
     *
     * @param ctime the value for knowledge.ctime
     *
     * @mbggenerated Fri Jun 21 19:55:40 CST 2019
     */
    public void setCtime(Date ctime) {
        this.ctime = ctime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column knowledge.contentUrl
     *
     * @return the value of knowledge.contentUrl
     *
     * @mbggenerated Fri Jun 21 19:55:40 CST 2019
     */
    public String getContenturl() {
        return contenturl;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column knowledge.contentUrl
     *
     * @param contenturl the value for knowledge.contentUrl
     *
     * @mbggenerated Fri Jun 21 19:55:40 CST 2019
     */
    public void setContenturl(String contenturl) {
        this.contenturl = contenturl == null ? null : contenturl.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column knowledge.islike
     *
     * @return the value of knowledge.islike
     *
     * @mbggenerated Fri Jun 21 19:55:40 CST 2019
     */
    public Integer getIslike() {
        return islike;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column knowledge.islike
     *
     * @param islike the value for knowledge.islike
     *
     * @mbggenerated Fri Jun 21 19:55:40 CST 2019
     */
    public void setIslike(Integer islike) {
        this.islike = islike;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column knowledge.ktype_id
     *
     * @return the value of knowledge.ktype_id
     *
     * @mbggenerated Fri Jun 21 19:55:40 CST 2019
     */
    public String getKtypeId() {
        return ktypeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column knowledge.ktype_id
     *
     * @param ktypeId the value for knowledge.ktype_id
     *
     * @mbggenerated Fri Jun 21 19:55:40 CST 2019
     */
    public void setKtypeId(String ktypeId) {
        this.ktypeId = ktypeId == null ? null : ktypeId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column knowledge.detail
     *
     * @return the value of knowledge.detail
     *
     * @mbggenerated Fri Jun 21 19:55:40 CST 2019
     */
    public String getDetail() {
        return detail;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column knowledge.detail
     *
     * @param detail the value for knowledge.detail
     *
     * @mbggenerated Fri Jun 21 19:55:40 CST 2019
     */
    public void setDetail(String detail) {
        this.detail = detail == null ? null : detail.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table knowledge
     *
     * @mbggenerated Fri Jun 21 19:55:40 CST 2019
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", title=").append(title);
        sb.append(", ctime=").append(ctime);
        sb.append(", contenturl=").append(contenturl);
        sb.append(", islike=").append(islike);
        sb.append(", ktypeId=").append(ktypeId);
        sb.append(", detail=").append(detail);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}