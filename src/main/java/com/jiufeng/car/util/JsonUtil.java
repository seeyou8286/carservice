/**
 * JsonUtil.java
 * <p>
 * Copyright 2015 Expedia, Inc. All rights reserved.
 * EXPEDIA PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */

package com.jiufeng.car.util;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.joda.JodaModule;

import java.io.IOException;

/**
 * Json util class - marshal/unmarshal json format request and response etc.
 *
 * @author <a href="mailto:mixie@expedia.com">Ming Xie</a>
 */
public class JsonUtil
{
    private static ObjectMapper objectMapper = new ObjectMapper();

    static
    {
        objectMapper.registerModule(new JodaModule());
    }

    private JsonUtil()
    {
    }

    public static <T> T fromJson(String request, Class<T> clazz)
            throws IOException
    {
        if (request == null)
        {
            return null;
        }

        return objectMapper.readValue(request, clazz);
    }

    public static String toJson(Object response)
            throws JsonProcessingException
    {
        return objectMapper.writeValueAsString(response);
    }

    public static String toJsonWithoutException(Object object)
    {
        String jsonString;
        try
        {
            jsonString = toJson(object);
        }
        catch (JsonProcessingException e)
        {
            jsonString = "Failed to get pretty printed JSON string. " + e.getMessage();
        }
        return jsonString;
    }

    public static String getHTTPContextString(String endpoint, Object request, Object response)
    {
        return System.lineSeparator() + "Endpoint:" +
                System.lineSeparator() + endpoint +
                System.lineSeparator() + "Request:" +
                System.lineSeparator() + toJsonWithoutException(request) +
                System.lineSeparator() + "Response:" +
                System.lineSeparator() + toJsonWithoutException(response);
    }
}
