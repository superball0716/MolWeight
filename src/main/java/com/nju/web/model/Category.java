package com.nju.web.model;

public class Category {
    private Integer id;

    private String name;

    private Double lu;

    private Double m0;

    private Double pc;

    private Double deltahm0;

    private Double sigmae;

    private Double tm0;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Double getLu() {
        return lu;
    }

    public void setLu(Double lu) {
        this.lu = lu;
    }

    public Double getM0() {
        return m0;
    }

    public void setM0(Double m0) {
        this.m0 = m0;
    }

    public Double getPc() {
        return pc;
    }

    public void setPc(Double pc) {
        this.pc = pc;
    }

    public Double getDeltahm0() {
        return deltahm0;
    }

    public void setDeltahm0(Double deltahm0) {
        this.deltahm0 = deltahm0;
    }

    public Double getSigmae() {
        return sigmae;
    }

    public void setSigmae(Double sigmae) {
        this.sigmae = sigmae;
    }

    public Double getTm0() {
        return tm0;
    }

    public void setTm0(Double tm0) {
        this.tm0 = tm0;
    }
}