package com.nimbusnex.appHub.util;

public class ResponseMessagesAndCodes {

    private ResponseMessagesAndCodes() {
    }

    public static final String SUCCESS_STATUS = "SUCCESS";
    public static final Integer SUCCESS_CODE = 200;
    public static final String SUCCESS_MESSAGE = "Successful";

    public static final String CREATED_STATUS = "CREATED";
    public static final Integer CREATED_CODE = 201;
    public static final String CREATED_MESSAGE = "Resource created successfully";

    public static final String ACCEPTED_STATUS = "ACCEPTED";
    public static final Integer ACCEPTED_CODE = 202;
    public static final String ACCEPTED_MESSAGE = "Request accepted but not yet processed";

    public static final String NO_CONTENT_STATUS = "NO_CONTENT";
    public static final Integer NO_CONTENT_CODE = 204;
    public static final String NO_CONTENT_MESSAGE = "No content available";

    public static final String UNSUCCESS_STATUS = "UNSUCCESS";
    public static final Integer UNSUCCESS_CODE = 400;
    public static final String UNSUCCESS_MESSAGE = "Unsuccessful";


}
