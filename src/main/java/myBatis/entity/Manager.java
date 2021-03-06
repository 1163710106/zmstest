package myBatis.entity;

/**
 * 数据表{manager}的实体类
 *
 * 此类是由MyBatis Generator生成的。
 * 此类对应于数据库表 manager
 */
public class Manager {
    /**
     * 数据表{manager}中的{id}字段
     *
     * 该字段由MyBatis Generator生成。
     * 该字段对应于数据库列。 manager.id
     *
     * @mbg.generated Thu Oct 17 15:47:09 CST 2019
     */
    private Integer id;

    /**
     * 数据表{manager}中的{name}字段
     *
     * 该字段由MyBatis Generator生成。
     * 该字段对应于数据库列。 manager.name
     *
     * @mbg.generated Thu Oct 17 15:47:09 CST 2019
     */
    private String name;

    /**
     * 数据表{manager}中的{password}字段
     *
     * 该字段由MyBatis Generator生成。
     * 该字段对应于数据库列。 manager.password
     *
     * @mbg.generated Thu Oct 17 15:47:09 CST 2019
     */
    private String password;

    /**
     * 数据表{manager}中的{deptid}字段
     *
     * 该字段由MyBatis Generator生成。
     * 该字段对应于数据库列。 manager.deptid
     *
     * @mbg.generated Thu Oct 17 15:47:09 CST 2019
     */
    private Integer deptid;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column manager.id
     *
     * @return the value of manager.id
     *
     * @mbg.generated Thu Oct 17 15:47:09 CST 2019
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column manager.id
     *
     * @param id the value for manager.id
     *
     * @mbg.generated Thu Oct 17 15:47:09 CST 2019
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column manager.name
     *
     * @return the value of manager.name
     *
     * @mbg.generated Thu Oct 17 15:47:09 CST 2019
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column manager.name
     *
     * @param name the value for manager.name
     *
     * @mbg.generated Thu Oct 17 15:47:09 CST 2019
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column manager.password
     *
     * @return the value of manager.password
     *
     * @mbg.generated Thu Oct 17 15:47:09 CST 2019
     */
    public String getPassword() {
        return password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column manager.password
     *
     * @param password the value for manager.password
     *
     * @mbg.generated Thu Oct 17 15:47:09 CST 2019
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column manager.deptid
     *
     * @return the value of manager.deptid
     *
     * @mbg.generated Thu Oct 17 15:47:09 CST 2019
     */
    public Integer getDeptid() {
        return deptid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column manager.deptid
     *
     * @param deptid the value for manager.deptid
     *
     * @mbg.generated Thu Oct 17 15:47:09 CST 2019
     */
    public void setDeptid(Integer deptid) {
        this.deptid = deptid;
    }
}