package tech.aistar.entity;

import java.io.Serializable;

public class Ktype implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ktype.id
     *
     * @mbggenerated Thu Jun 20 14:46:36 CST 2019
     */
    private String id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ktype.type
     *
     * @mbggenerated Thu Jun 20 14:46:36 CST 2019
     */
    private String type;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ktype.imgUrl
     *
     * @mbggenerated Thu Jun 20 14:46:36 CST 2019
     */
    private String imgurl;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table ktype
     *
     * @mbggenerated Thu Jun 20 14:46:36 CST 2019
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ktype.id
     *
     * @return the value of ktype.id
     *
     * @mbggenerated Thu Jun 20 14:46:36 CST 2019
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ktype.id
     *
     * @param id the value for ktype.id
     *
     * @mbggenerated Thu Jun 20 14:46:36 CST 2019
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ktype.type
     *
     * @return the value of ktype.type
     *
     * @mbggenerated Thu Jun 20 14:46:36 CST 2019
     */
    public String getType() {
        return type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ktype.type
     *
     * @param type the value for ktype.type
     *
     * @mbggenerated Thu Jun 20 14:46:36 CST 2019
     */
    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ktype.imgUrl
     *
     * @return the value of ktype.imgUrl
     *
     * @mbggenerated Thu Jun 20 14:46:36 CST 2019
     */
    public String getImgurl() {
        return imgurl;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ktype.imgUrl
     *
     * @param imgurl the value for ktype.imgUrl
     *
     * @mbggenerated Thu Jun 20 14:46:36 CST 2019
     */
    public void setImgurl(String imgurl) {
        this.imgurl = imgurl == null ? null : imgurl.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ktype
     *
     * @mbggenerated Thu Jun 20 14:46:36 CST 2019
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", type=").append(type);
        sb.append(", imgurl=").append(imgurl);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}