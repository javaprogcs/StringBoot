package com.csw.SpringBootTodo.entity;


import javax.persistence.*;

@Entity
@Table(catalog = "luntan")
public class Luntan {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column luntan.id
     *
     * @mbg.generated
     */

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column luntan.title
     *
     * @mbg.generated
     */
    private String title;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column luntan.body
     *
     * @mbg.generated
     */
    private String body;

    public Luntan() {
    }

    public Luntan(String title, String body) {
        this.title = title;
        this.body = body;
    }

    public Luntan(Integer id, String title, String body) {
        this.id = id;
        this.title = title;
        this.body = body;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column luntan.id
     *
     * @return the value of luntan.id
     *
     * @mbg.generated
     */
    public long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column luntan.id
     *
     * @param id the value for luntan.id
     *
     * @mbg.generated
     */
    public void setId(long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column luntan.title
     *
     * @return the value of luntan.title
     *
     * @mbg.generated
     */
    public String getTitle() {
        return title;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column luntan.title
     *
     * @param title the value for luntan.title
     *
     * @mbg.generated
     */
    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column luntan.body
     *
     * @return the value of luntan.body
     *
     * @mbg.generated
     */
    public String getBody() {
        return body;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column luntan.body
     *
     * @param body the value for luntan.body
     *
     * @mbg.generated
     */
    public void setBody(String body) {
        this.body = body == null ? null : body.trim();
    }
}
