package com.example.myapplication;

public class CV {


    private String cvName;
    private int cvAge;
    private String cvJob;
    private int cvPhone;
    private  String cvEmail;


    // // // // // // // // // // // // // // //


    public CV(String cvName, int cvAge, String cvJob, int cvPhone, String cvEmail) {
        this.cvName = cvName;
        this.cvAge = cvAge;
        this.cvJob = cvJob;
        this.cvPhone = cvPhone;
        this.cvEmail = cvEmail;
    }


    // // // // // // // // // // // // // // //


    public String getCvName() {
        return cvName;
    }

    public void setCvName(String cvName) {
        this.cvName = cvName;
    }


    // // // // //


    public int getCvAge() {
        return cvAge;
    }

    public void setCvAge(int cvAge) {
        this.cvAge = cvAge;
    }


    // // // // //


    public String getCvJob() {
        return cvJob;
    }

    public void setCvJob(String cvJob) {
        this.cvJob = cvJob;
    }


    // // // // //


    public int getCvPhone() {
        return cvPhone;
    }

    public void setCvPhone(int cvPhone) {
        this.cvPhone = cvPhone;
    }


    // // // // //


    public String getCvEmail() {
        return cvEmail;
    }

    public void setCvEmail(String cvEmail) {
        this.cvEmail = cvEmail;
    }





}
