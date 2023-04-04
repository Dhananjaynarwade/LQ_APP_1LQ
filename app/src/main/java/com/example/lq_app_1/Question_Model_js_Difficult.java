package com.example.lq_app_1;

public class Question_Model_js_Difficult {
    private String questionC,optc1,optc2,optc3,optc4;
    private int correctAnsNo_js_Difficult;

    public Question_Model_js_Difficult(String questionC, String optc1, String optc2, String optc3, String optc4, int correctAnsNo_js_Difficult) {

        this.questionC = questionC;
        this.optc1 = optc1;
        this.optc2 = optc2;
        this.optc3 = optc3;
        this.optc4 = optc4;
        this.correctAnsNo_js_Difficult = correctAnsNo_js_Difficult;
    }

    public String getQuestionC() {
        return questionC;
    }

    public void setQuestionC(String questionC) {
        this.questionC = questionC;
    }

    public String getOptc1() {
        return optc1;
    }

    public void setOptc1(String optc1) {
        this.optc1 = optc1;
    }

    public String getOptc2() {
        return optc2;
    }

    public void setOptc2(String optc2) {
        this.optc2 = optc2;
    }

    public String getOptc3() {
        return optc3;
    }

    public void setOptc3(String optc3) {
        this.optc3 = optc3;
    }

    public String getOptc4() {
        return optc4;
    }

    public void setOptc4(String optc4) {
        this.optc4 = optc4;
    }

    public int getCorrectAnsNo_js_Difficult() {
        return correctAnsNo_js_Difficult;
    }

    public void setCorrectAnsNo_js_Difficult(int correctAnsNo_js_Difficult) {
        this.correctAnsNo_js_Difficult = correctAnsNo_js_Difficult;
    }
}
