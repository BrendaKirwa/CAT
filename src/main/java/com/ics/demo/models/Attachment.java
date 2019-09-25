package com.ics.demo.models;

public class Attachment {

    private long studentId;
    private int companyId;

    public Attachment(long studentId, int companyId) {
        this.studentId = studentId;
        this.companyId = companyId;
    }

    public long getStudentId() {
        return studentId;
    }

    public void setStudentId(long studentId) {
        this.studentId = studentId;
    }

    public long getCompanyId() {
        return companyId;
    }

    public void setCompanyId(int companyId) {
        this.companyId = companyId;
    }
}