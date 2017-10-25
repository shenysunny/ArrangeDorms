package cn.yrfk.arrangedorms.entity;

public class StudentEntity {
    private Integer sdNumber;

    private String sdName;

    private String sdSex;

    private Integer sdAge;

    private String sdMajor;

    private String sdDorm;

    private String sdCharacter;

    private String sdClass;

    private String sdPapers;

    public Integer getSdNumber() {
        return sdNumber;
    }

    public void setSdNumber(Integer sdNumber) {
        this.sdNumber = sdNumber;
    }

    public String getSdName() {
        return sdName;
    }

    public void setSdName(String sdName) {
        this.sdName = sdName == null ? null : sdName.trim();
    }

    public String getSdSex() {
        return sdSex;
    }

    public void setSdSex(String sdSex) {
        this.sdSex = sdSex == null ? null : sdSex.trim();
    }

    public Integer getSdAge() {
        return sdAge;
    }

    public void setSdAge(Integer sdAge) {
        this.sdAge = sdAge;
    }

    public String getSdMajor() {
        return sdMajor;
    }

    public void setSdMajor(String sdMajor) {
        this.sdMajor = sdMajor == null ? null : sdMajor.trim();
    }

    public String getSdDorm() {
        return sdDorm;
    }

    public void setSdDorm(String sdDorm) {
        this.sdDorm = sdDorm == null ? null : sdDorm.trim();
    }

    public String getSdCharacter() {
        return sdCharacter;
    }

    public void setSdCharacter(String sdCharacter) {
        this.sdCharacter = sdCharacter == null ? null : sdCharacter.trim();
    }

    public String getSdClass() {
        return sdClass;
    }

    public void setSdClass(String sdClass) {
        this.sdClass = sdClass == null ? null : sdClass.trim();
    }

    public String getSdPapers() {
        return sdPapers;
    }

    public void setSdPapers(String sdPapers) {
        this.sdPapers = sdPapers == null ? null : sdPapers.trim();
    }
}