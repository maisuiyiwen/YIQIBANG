package cn.uc.yiqibang.bean;

public class TAdmin {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_admin.id
     *
     * @mbggenerated Mon Nov 13 14:55:36 CST 2017
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_admin.t_u_id
     *
     * @mbggenerated Mon Nov 13 14:55:36 CST 2017
     */
    private Integer tUId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_admin.u_state
     *
     * @mbggenerated Mon Nov 13 14:55:36 CST 2017
     */
    private Boolean uState;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_admin.u_level
     *
     * @mbggenerated Mon Nov 13 14:55:36 CST 2017
     */
    private Integer uLevel;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_admin.id
     *
     * @return the value of t_admin.id
     *
     * @mbggenerated Mon Nov 13 14:55:36 CST 2017
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_admin.id
     *
     * @param id the value for t_admin.id
     *
     * @mbggenerated Mon Nov 13 14:55:36 CST 2017
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_admin.t_u_id
     *
     * @return the value of t_admin.t_u_id
     *
     * @mbggenerated Mon Nov 13 14:55:36 CST 2017
     */
    public Integer gettUId() {
        return tUId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_admin.t_u_id
     *
     * @param tUId the value for t_admin.t_u_id
     *
     * @mbggenerated Mon Nov 13 14:55:36 CST 2017
     */
    public void settUId(Integer tUId) {
        this.tUId = tUId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_admin.u_state
     *
     * @return the value of t_admin.u_state
     *
     * @mbggenerated Mon Nov 13 14:55:36 CST 2017
     */
    public Boolean getuState() {
        return uState;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_admin.u_state
     *
     * @param uState the value for t_admin.u_state
     *
     * @mbggenerated Mon Nov 13 14:55:36 CST 2017
     */
    public void setuState(Boolean uState) {
        this.uState = uState;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_admin.u_level
     *
     * @return the value of t_admin.u_level
     *
     * @mbggenerated Mon Nov 13 14:55:36 CST 2017
     */
    public Integer getuLevel() {
        return uLevel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_admin.u_level
     *
     * @param uLevel the value for t_admin.u_level
     *
     * @mbggenerated Mon Nov 13 14:55:36 CST 2017
     */
    public void setuLevel(Integer uLevel) {
        this.uLevel = uLevel;
    }
}