package cn.uc.yiqibang.bean;

import java.util.Date;

public class TNews {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_news.id
     *
     * @mbggenerated Mon Nov 13 14:55:36 CST 2017
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_news.t_t_id
     *
     * @mbggenerated Mon Nov 13 14:55:36 CST 2017
     */
    private Integer tTId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_news.n_title
     *
     * @mbggenerated Mon Nov 13 14:55:36 CST 2017
     */
    private String nTitle;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_news.n_source
     *
     * @mbggenerated Mon Nov 13 14:55:36 CST 2017
     */
    private String nSource;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_news.n_createtime
     *
     * @mbggenerated Mon Nov 13 14:55:36 CST 2017
     */
    private Date nCreatetime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_news.n_commcount
     *
     * @mbggenerated Mon Nov 13 14:55:36 CST 2017
     */
    private Integer nCommcount;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_news.n_readcount
     *
     * @mbggenerated Mon Nov 13 14:55:36 CST 2017
     */
    private Integer nReadcount;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_news.n_author
     *
     * @mbggenerated Mon Nov 13 14:55:36 CST 2017
     */
    private String nAuthor;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_news.n_sharecount
     *
     * @mbggenerated Mon Nov 13 14:55:36 CST 2017
     */
    private Integer nSharecount;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_news.n_ifhot
     *
     * @mbggenerated Mon Nov 13 14:55:36 CST 2017
     */
    private Boolean nIfhot;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_news.n_ifreport
     *
     * @mbggenerated Mon Nov 13 14:55:36 CST 2017
     */
    private Boolean nIfreport;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_news.n_content
     *
     * @mbggenerated Mon Nov 13 14:55:36 CST 2017
     */
    private String nContent;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_news.id
     *
     * @return the value of t_news.id
     *
     * @mbggenerated Mon Nov 13 14:55:36 CST 2017
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_news.id
     *
     * @param id the value for t_news.id
     *
     * @mbggenerated Mon Nov 13 14:55:36 CST 2017
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_news.t_t_id
     *
     * @return the value of t_news.t_t_id
     *
     * @mbggenerated Mon Nov 13 14:55:36 CST 2017
     */
    public Integer gettTId() {
        return tTId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_news.t_t_id
     *
     * @param tTId the value for t_news.t_t_id
     *
     * @mbggenerated Mon Nov 13 14:55:36 CST 2017
     */
    public void settTId(Integer tTId) {
        this.tTId = tTId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_news.n_title
     *
     * @return the value of t_news.n_title
     *
     * @mbggenerated Mon Nov 13 14:55:36 CST 2017
     */
    public String getnTitle() {
        return nTitle;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_news.n_title
     *
     * @param nTitle the value for t_news.n_title
     *
     * @mbggenerated Mon Nov 13 14:55:36 CST 2017
     */
    public void setnTitle(String nTitle) {
        this.nTitle = nTitle == null ? null : nTitle.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_news.n_source
     *
     * @return the value of t_news.n_source
     *
     * @mbggenerated Mon Nov 13 14:55:36 CST 2017
     */
    public String getnSource() {
        return nSource;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_news.n_source
     *
     * @param nSource the value for t_news.n_source
     *
     * @mbggenerated Mon Nov 13 14:55:36 CST 2017
     */
    public void setnSource(String nSource) {
        this.nSource = nSource == null ? null : nSource.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_news.n_createtime
     *
     * @return the value of t_news.n_createtime
     *
     * @mbggenerated Mon Nov 13 14:55:36 CST 2017
     */
    public Date getnCreatetime() {
        return nCreatetime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_news.n_createtime
     *
     * @param nCreatetime the value for t_news.n_createtime
     *
     * @mbggenerated Mon Nov 13 14:55:36 CST 2017
     */
    public void setnCreatetime(Date nCreatetime) {
        this.nCreatetime = nCreatetime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_news.n_commcount
     *
     * @return the value of t_news.n_commcount
     *
     * @mbggenerated Mon Nov 13 14:55:36 CST 2017
     */
    public Integer getnCommcount() {
        return nCommcount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_news.n_commcount
     *
     * @param nCommcount the value for t_news.n_commcount
     *
     * @mbggenerated Mon Nov 13 14:55:36 CST 2017
     */
    public void setnCommcount(Integer nCommcount) {
        this.nCommcount = nCommcount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_news.n_readcount
     *
     * @return the value of t_news.n_readcount
     *
     * @mbggenerated Mon Nov 13 14:55:36 CST 2017
     */
    public Integer getnReadcount() {
        return nReadcount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_news.n_readcount
     *
     * @param nReadcount the value for t_news.n_readcount
     *
     * @mbggenerated Mon Nov 13 14:55:36 CST 2017
     */
    public void setnReadcount(Integer nReadcount) {
        this.nReadcount = nReadcount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_news.n_author
     *
     * @return the value of t_news.n_author
     *
     * @mbggenerated Mon Nov 13 14:55:36 CST 2017
     */
    public String getnAuthor() {
        return nAuthor;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_news.n_author
     *
     * @param nAuthor the value for t_news.n_author
     *
     * @mbggenerated Mon Nov 13 14:55:36 CST 2017
     */
    public void setnAuthor(String nAuthor) {
        this.nAuthor = nAuthor == null ? null : nAuthor.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_news.n_sharecount
     *
     * @return the value of t_news.n_sharecount
     *
     * @mbggenerated Mon Nov 13 14:55:36 CST 2017
     */
    public Integer getnSharecount() {
        return nSharecount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_news.n_sharecount
     *
     * @param nSharecount the value for t_news.n_sharecount
     *
     * @mbggenerated Mon Nov 13 14:55:36 CST 2017
     */
    public void setnSharecount(Integer nSharecount) {
        this.nSharecount = nSharecount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_news.n_ifhot
     *
     * @return the value of t_news.n_ifhot
     *
     * @mbggenerated Mon Nov 13 14:55:36 CST 2017
     */
    public Boolean getnIfhot() {
        return nIfhot;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_news.n_ifhot
     *
     * @param nIfhot the value for t_news.n_ifhot
     *
     * @mbggenerated Mon Nov 13 14:55:36 CST 2017
     */
    public void setnIfhot(Boolean nIfhot) {
        this.nIfhot = nIfhot;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_news.n_ifreport
     *
     * @return the value of t_news.n_ifreport
     *
     * @mbggenerated Mon Nov 13 14:55:36 CST 2017
     */
    public Boolean getnIfreport() {
        return nIfreport;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_news.n_ifreport
     *
     * @param nIfreport the value for t_news.n_ifreport
     *
     * @mbggenerated Mon Nov 13 14:55:36 CST 2017
     */
    public void setnIfreport(Boolean nIfreport) {
        this.nIfreport = nIfreport;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_news.n_content
     *
     * @return the value of t_news.n_content
     *
     * @mbggenerated Mon Nov 13 14:55:36 CST 2017
     */
    public String getnContent() {
        return nContent;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_news.n_content
     *
     * @param nContent the value for t_news.n_content
     *
     * @mbggenerated Mon Nov 13 14:55:36 CST 2017
     */
    public void setnContent(String nContent) {
        this.nContent = nContent == null ? null : nContent.trim();
    }

	@Override
	public String toString() {
		return "TNews [id=" + id + ", tTId=" + tTId + ", nTitle=" + nTitle + ", nSource=" + nSource + ", nCreatetime="
				+ nCreatetime + ", nCommcount=" + nCommcount + ", nReadcount=" + nReadcount + ", nAuthor=" + nAuthor
				+ ", nSharecount=" + nSharecount + ", nIfhot=" + nIfhot + ", nIfreport=" + nIfreport + ", nContent="
				+ nContent + "]";
	}
    
    
}