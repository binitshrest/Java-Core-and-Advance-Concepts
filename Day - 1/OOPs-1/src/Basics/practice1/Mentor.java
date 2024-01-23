package Basics.practice1;

import Basics.practice1.User;
public class Mentor extends User{
    int assistedHrs;
    String expertArea;

    public void totalMentoring(int assistedHrs, String expertArea){
        this.assistedHrs = assistedHrs;
        this.expertArea = expertArea;
    }
}
