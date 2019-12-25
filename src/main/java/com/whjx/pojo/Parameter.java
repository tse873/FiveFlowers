package com.whjx.pojo;

import java.io.Serializable;

public class Parameter implements Serializable {
    private Integer parameterId;

    private String parameterFirstname;

    private String parameterSname;

    private String parameterThirdname;

    private String parameterFourname;

    private Integer parameterSpecification;

    private static final long serialVersionUID = 1L;

    public Integer getParameterId() {
        return parameterId;
    }

    public void setParameterId(Integer parameterId) {
        this.parameterId = parameterId;
    }

    public String getParameterFirstname() {
        return parameterFirstname;
    }

    public void setParameterFirstname(String parameterFirstname) {
        this.parameterFirstname = parameterFirstname == null ? null : parameterFirstname.trim();
    }

    public String getParameterSname() {
        return parameterSname;
    }

    public void setParameterSname(String parameterSname) {
        this.parameterSname = parameterSname == null ? null : parameterSname.trim();
    }

    public String getParameterThirdname() {
        return parameterThirdname;
    }

    public void setParameterThirdname(String parameterThirdname) {
        this.parameterThirdname = parameterThirdname == null ? null : parameterThirdname.trim();
    }

    public String getParameterFourname() {
        return parameterFourname;
    }

    public void setParameterFourname(String parameterFourname) {
        this.parameterFourname = parameterFourname == null ? null : parameterFourname.trim();
    }

    public Integer getParameterSpecification() {
        return parameterSpecification;
    }

    public void setParameterSpecification(Integer parameterSpecification) {
        this.parameterSpecification = parameterSpecification;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", parameterId=").append(parameterId);
        sb.append(", parameterFirstname=").append(parameterFirstname);
        sb.append(", parameterSname=").append(parameterSname);
        sb.append(", parameterThirdname=").append(parameterThirdname);
        sb.append(", parameterFourname=").append(parameterFourname);
        sb.append(", parameterSpecification=").append(parameterSpecification);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}