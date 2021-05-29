package com.example.login;

import java.util.HashMap;

public class StudentDetails {
    public static String getStudentID() {
        return studentID;
    }

    public static void setStudentID(String studentIDs) {
        studentID = studentIDs;
    }

    public static String getStudentName() {
        return studentName;
    }

    public static void setStudentName(String studentNames) {
        studentName = studentNames;
    }

    public static String getStudentMobile() {
        return studentMobile;
    }

    public static void setStudentMobile(String studentMobiles) {
        studentMobile = studentMobiles;
    }

    public static String getStudentRollNo() {
        return studentRollNo;
    }

    public static void setStudentRollNo(String studentRollNo) {
        StudentDetails.studentRollNo = studentRollNo;
    }

    public static HashMap<String, String> studentData_Object = new HashMap<String, String>();

    public static HashMap<String, String> getHashmap() {
        return studentData_Object;
    }

    public static void setHashmap(HashMap<String, String> studentData_Objects) {
        studentData_Object = studentData_Objects;
    }

    private static String studentName;
    private static String studentMobile;
    private static String studentID;
    private static String studentRollNo;

    public static HashMap<String, String> saveDetails(HashMap<String, String> studentData_Object) {
        setHashmap(studentData_Object);
        // hashMap_Object=studentData_Object;
        /*
         * String studentID=getStudentID(); String
         * studentAllDetails=getStudentName()+" "+getStudentMobile();
         */
        return getHashmap();

    }

}
