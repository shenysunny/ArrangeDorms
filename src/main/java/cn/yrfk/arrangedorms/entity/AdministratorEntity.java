package cn.yrfk.arrangedorms.entity;

public class AdministratorEntity {
    private Integer arNumber;

    private String arPassword;

    private String arName;

    private String arJurisdiction;

    private String arControlLimit;

    public Integer getArNumber() {
        return arNumber;
    }

    public void setArNumber(Integer arNumber) {
        this.arNumber = arNumber;
    }

    public String getArPassword() {
        return arPassword;
    }

    public void setArPassword(String arPassword) {
        this.arPassword = arPassword == null ? null : arPassword.trim();
    }

    public String getArName() {
        return arName;
    }

    public void setArName(String arName) {
        this.arName = arName == null ? null : arName.trim();
    }

    public String getArJurisdiction() {
        return arJurisdiction;
    }

    public void setArJurisdiction(String arJurisdiction) {
        this.arJurisdiction = arJurisdiction == null ? null : arJurisdiction.trim();
    }

    public String getArControlLimit() {
        return arControlLimit;
    }

    public void setArControlLimit(String arControlLimit) {
        this.arControlLimit = arControlLimit == null ? null : arControlLimit.trim();
    }
}