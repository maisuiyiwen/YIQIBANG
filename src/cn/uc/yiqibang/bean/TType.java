package cn.uc.yiqibang.bean;

public class TType {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_type.id
     *
     * @mbggenerated Mon Nov 13 14:55:36 CST 2017
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_type.t_name
     *
     * @mbggenerated Mon Nov 13 14:55:36 CST 2017
     */
    private String tName;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_type.id
     *
     * @return the value of t_type.id
     *
     * @mbggenerated Mon Nov 13 14:55:36 CST 2017
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_type.id
     *
     * @param id the value for t_type.id
     *
     * @mbggenerated Mon Nov 13 14:55:36 CST 2017
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_type.t_name
     *
     * @return the value of t_type.t_name
     *
     * @mbggenerated Mon Nov 13 14:55:36 CST 2017
     */
    public String gettName() {
        return tName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_type.t_name
     *
     * @param tName the value for t_type.t_name
     *
     * @mbggenerated Mon Nov 13 14:55:36 CST 2017
     */
    public void settName(String tName) {
        this.tName = tName == null ? null : tName.trim();
    }
}