package com.example.login.controller;

import javax.persistence.*;
import java.sql.Timestamp;
@Entity
@Table(name = "tbl_sys_login")
public class Login_Table {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID")
    private long id;
    @Column(name = "EmailID",nullable = false)
    private String email_id;
    @Column(name = "Password",nullable = false)
    private String password;
    @Column(name = "KhojiId",nullable = false)
    private String khoji_id;
    @Column(name = "Otp",nullable = false)
    private String otp;
    @Column(name="DtCreatedOn",nullable = false)
    private Timestamp dt_created_on;
    @Column(name = "DtUpdatedOn",nullable = false)
    private Timestamp dt_updated_on;
    @Column(name = "DtDeletedOn",nullable = false)
    private Timestamp dt_deleted_on;
    @Column(name = "DtLastLogin",nullable = false)
    private Timestamp dt_last_login;
    @Column(name = "CreatedBy",nullable = false)
    private short created_by;
    @Column(name = "UpdatedBy",nullable = false)
    private short updated_by;
    @Column(name="DeletedBy",nullable = false)
    private short deleted_by;
    @Column(name = "IsActive",nullable = false)
    private byte is_active;
    @Column(name = "Authenticate_token",nullable = false)
    private String authenticate_token;
    

    public void setId(long id) {
		this.id = id;
	}

	public String getAuthenticate_token() {
		return authenticate_token;
	}

	public void setAuthenticate_token(String authenticate_token) {
		this.authenticate_token = authenticate_token;
	}

	public Timestamp getDt_last_login() {
        return dt_last_login;
    }

    public void setDt_last_login(Timestamp dt_last_login) {
        this.dt_last_login = dt_last_login;
    }

    public long getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail_id() {
        return email_id;
    }

    public void setEmail_id(String email_id) {
        this.email_id = email_id;
    }

    public String getKhoji_id() {
        return khoji_id;
    }

    public String getPassword() {
        return password;
    }

    public byte getIs_active() {
        return is_active;
    }

    public void setKhoji_id(String khoji_id) {
        this.khoji_id = khoji_id;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public short getCreated_by() {
        return created_by;
    }

    public short getDeleted_by() {
        return deleted_by;
    }

    public short getUpdated_by() {
        return updated_by;
    }

    public String getOtp() {
        return otp;
    }

    public Timestamp getDt_created_on() {
        return dt_created_on;
    }

    public void setOtp(String otp) {
        this.otp = otp;
    }

    public Timestamp getDt_deleted_on() {
        return dt_deleted_on;
    }

    public Timestamp getDt_updated_on() {
        return dt_updated_on;
    }

    public void setCreated_by(short created_by) {
        this.created_by = created_by;
    }

    public void setDeleted_by(short deleted_by) {
        this.deleted_by = deleted_by;
    }

    public void setDt_created_on(Timestamp dt_created_on) {
        this.dt_created_on = dt_created_on;
    }

    public void setDt_deleted_on(Timestamp dt_deleted_on) {
        this.dt_deleted_on = dt_deleted_on;
    }

    public void setDt_updated_on(Timestamp dt_updated_on) {
        this.dt_updated_on = dt_updated_on;
    }

    public void setIs_active(byte is_active) {
        this.is_active = is_active;
    }

    public void setUpdated_by(short updated_by) {
        this.updated_by = updated_by;
    }
}

