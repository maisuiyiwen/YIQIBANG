package cn.uc.yiqibang.bean;

public class Cities {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cities.id
     *
     * @mbggenerated Mon Nov 13 14:55:36 CST 2017
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cities.cityid
     *
     * @mbggenerated Mon Nov 13 14:55:36 CST 2017
     */
    private String cityid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cities.city
     *
     * @mbggenerated Mon Nov 13 14:55:36 CST 2017
     */
    private String city;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cities.provinceid
     *
     * @mbggenerated Mon Nov 13 14:55:36 CST 2017
     */
    private String provinceid;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cities.id
     *
     * @return the value of cities.id
     *
     * @mbggenerated Mon Nov 13 14:55:36 CST 2017
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cities.id
     *
     * @param id the value for cities.id
     *
     * @mbggenerated Mon Nov 13 14:55:36 CST 2017
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cities.cityid
     *
     * @return the value of cities.cityid
     *
     * @mbggenerated Mon Nov 13 14:55:36 CST 2017
     */
    public String getCityid() {
        return cityid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cities.cityid
     *
     * @param cityid the value for cities.cityid
     *
     * @mbggenerated Mon Nov 13 14:55:36 CST 2017
     */
    public void setCityid(String cityid) {
        this.cityid = cityid == null ? null : cityid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cities.city
     *
     * @return the value of cities.city
     *
     * @mbggenerated Mon Nov 13 14:55:36 CST 2017
     */
    public String getCity() {
        return city;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cities.city
     *
     * @param city the value for cities.city
     *
     * @mbggenerated Mon Nov 13 14:55:36 CST 2017
     */
    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cities.provinceid
     *
     * @return the value of cities.provinceid
     *
     * @mbggenerated Mon Nov 13 14:55:36 CST 2017
     */
    public String getProvinceid() {
        return provinceid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cities.provinceid
     *
     * @param provinceid the value for cities.provinceid
     *
     * @mbggenerated Mon Nov 13 14:55:36 CST 2017
     */
    public void setProvinceid(String provinceid) {
        this.provinceid = provinceid == null ? null : provinceid.trim();
    }
}