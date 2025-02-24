package com.nimbusnex.appHub.util;

public class ExceptionMessagesAndCodes {

    private ExceptionMessagesAndCodes() {}

    public static final String BAD_REQUEST_STATUS = "BAD_REQUEST";
    public static final Integer BAD_REQUEST_CODE = 400;
    public static final String BAD_REQUEST_MESSAGE = "Bad request";

    public static final String UNAUTHORIZED_STATUS = "UNAUTHORIZED";
    public static final Integer UNAUTHORIZED_CODE = 401;
    public static final String UNAUTHORIZED_MESSAGE = "Unauthorized access";

    public static final String FORBIDDEN_STATUS = "FORBIDDEN";
    public static final Integer FORBIDDEN_CODE = 403;
    public static final String FORBIDDEN_MESSAGE = "Forbidden request";

    public static final String NOT_FOUND_STATUS = "NOT_FOUND";
    public static final Integer NOT_FOUND_CODE = 404;
    public static final String NOT_FOUND_MESSAGE = "Resource not found";

    public static final String METHOD_NOT_ALLOWED_STATUS = "METHOD_NOT_ALLOWED";
    public static final Integer METHOD_NOT_ALLOWED_CODE = 405;
    public static final String METHOD_NOT_ALLOWED_MESSAGE = "HTTP method not allowed";

    public static final String CONFLICT_STATUS = "CONFLICT";
    public static final Integer CONFLICT_CODE = 409;
    public static final String CONFLICT_MESSAGE = "Resource conflict";

    public static final String UNSUPPORTED_MEDIA_TYPE_STATUS = "UNSUPPORTED_MEDIA_TYPE";
    public static final Integer UNSUPPORTED_MEDIA_TYPE_CODE = 415;
    public static final String UNSUPPORTED_MEDIA_TYPE_MESSAGE = "Unsupported media type";

    public static final String INTERNAL_SERVER_ERROR_STATUS = "INTERNAL_SERVER_ERROR";
    public static final Integer INTERNAL_SERVER_ERROR_CODE = 500;
    public static final String INTERNAL_SERVER_ERROR_MESSAGE = "Internal server error";

    public static final String NOT_IMPLEMENTED_STATUS = "NOT_IMPLEMENTED";
    public static final Integer NOT_IMPLEMENTED_CODE = 501;
    public static final String NOT_IMPLEMENTED_MESSAGE = "Not implemented";

    public static final String BAD_GATEWAY_STATUS = "BAD_GATEWAY";
    public static final Integer BAD_GATEWAY_CODE = 502;
    public static final String BAD_GATEWAY_MESSAGE = "Bad gateway";

    public static final String SERVICE_UNAVAILABLE_STATUS = "SERVICE_UNAVAILABLE";
    public static final Integer SERVICE_UNAVAILABLE_CODE = 503;
    public static final String SERVICE_UNAVAILABLE_MESSAGE = "Service unavailable";

    public static final String GATEWAY_TIMEOUT_STATUS = "GATEWAY_TIMEOUT";
    public static final Integer GATEWAY_TIMEOUT_CODE = 504;
    public static final String GATEWAY_TIMEOUT_MESSAGE = "Gateway timeout";

}
