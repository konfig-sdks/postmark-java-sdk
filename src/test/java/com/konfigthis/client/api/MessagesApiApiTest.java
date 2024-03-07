/*
 * Postmark API
 * Postmark makes sending and receiving email incredibly easy. 
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by Konfig (https://konfigthis.com).
 * Do not edit the class manually.
 */


package com.konfigthis.client.api;

import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.InboundSearchResponse;
import java.time.LocalDate;
import com.konfigthis.client.model.OutboundSearchResponse;
import com.konfigthis.client.model.StandardPostmarkResponse;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for MessagesApiApi
 */
@Disabled
public class MessagesApiApiTest {

    private static MessagesApiApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new MessagesApiApi(apiClient);
    }

    /**
     * Clicks for a all messages
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getAllClicksTest() throws ApiException {
        Integer count = null;
        Integer offset = null;
        String recipient = null;
        String tag = null;
        String clientName = null;
        String clientCompany = null;
        String clientFamily = null;
        String osName = null;
        String osFamily = null;
        String osCompany = null;
        String platform = null;
        String country = null;
        String region = null;
        String city = null;
        Object response = api.getAllClicks(count, offset)
                .recipient(recipient)
                .tag(tag)
                .clientName(clientName)
                .clientCompany(clientCompany)
                .clientFamily(clientFamily)
                .osName(osName)
                .osFamily(osFamily)
                .osCompany(osCompany)
                .platform(platform)
                .country(country)
                .region(region)
                .city(city)
                .execute();
        // TODO: test validations
    }

    /**
     * Inbound message details
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getInboundMessageDetailsTest() throws ApiException {
        String messageid = null;
        Object response = api.getInboundMessageDetails(messageid)
                .execute();
        // TODO: test validations
    }

    /**
     * Retrieve Message Clicks
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getMessageClicksTest() throws ApiException {
        String messageid = null;
        Integer count = null;
        Integer offset = null;
        Object response = api.getMessageClicks(messageid, count, offset)
                .execute();
        // TODO: test validations
    }

    /**
     * Outbound message dump
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getMessageDumpTest() throws ApiException {
        String messageid = null;
        Object response = api.getMessageDump(messageid)
                .execute();
        // TODO: test validations
    }

    /**
     * Retrieve Message Opens
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getMessageOpensTest() throws ApiException {
        String messageid = null;
        Integer count = null;
        Integer offset = null;
        Object response = api.getMessageOpens(messageid, count, offset)
                .execute();
        // TODO: test validations
    }

    /**
     * Outbound message details
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getOutboundMessageDetailsTest() throws ApiException {
        String messageid = null;
        Object response = api.getOutboundMessageDetails(messageid)
                .execute();
        // TODO: test validations
    }

    /**
     * Opens for all messages
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listOpensForOutboundTest() throws ApiException {
        Integer count = null;
        Integer offset = null;
        String recipient = null;
        String tag = null;
        String clientName = null;
        String clientCompany = null;
        String clientFamily = null;
        String osName = null;
        String osFamily = null;
        String osCompany = null;
        String platform = null;
        String country = null;
        String region = null;
        String city = null;
        Object response = api.listOpensForOutbound(count, offset)
                .recipient(recipient)
                .tag(tag)
                .clientName(clientName)
                .clientCompany(clientCompany)
                .clientFamily(clientFamily)
                .osName(osName)
                .osFamily(osFamily)
                .osCompany(osCompany)
                .platform(platform)
                .country(country)
                .region(region)
                .city(city)
                .execute();
        // TODO: test validations
    }

    /**
     * Retry a failed inbound message for processing
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void retryInboundMessageTest() throws ApiException {
        String messageid = null;
        StandardPostmarkResponse response = api.retryInboundMessage(messageid)
                .execute();
        // TODO: test validations
    }

    /**
     * Inbound message search
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void searchInboundMessagesTest() throws ApiException {
        Integer count = null;
        Integer offset = null;
        String recipient = null;
        String fromemail = null;
        String subject = null;
        String mailboxhash = null;
        String tag = null;
        String status = null;
        LocalDate todate = null;
        LocalDate fromdate = null;
        InboundSearchResponse response = api.searchInboundMessages(count, offset)
                .recipient(recipient)
                .fromemail(fromemail)
                .subject(subject)
                .mailboxhash(mailboxhash)
                .tag(tag)
                .status(status)
                .todate(todate)
                .fromdate(fromdate)
                .execute();
        // TODO: test validations
    }

    /**
     * Outbound message search
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void searchOutboundMessagesTest() throws ApiException {
        Integer count = null;
        Integer offset = null;
        String recipient = null;
        String fromemail = null;
        String tag = null;
        String status = null;
        LocalDate todate = null;
        LocalDate fromdate = null;
        OutboundSearchResponse response = api.searchOutboundMessages(count, offset)
                .recipient(recipient)
                .fromemail(fromemail)
                .tag(tag)
                .status(status)
                .todate(todate)
                .fromdate(fromdate)
                .execute();
        // TODO: test validations
    }

    /**
     * Bypass rules for a blocked inbound message
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateBypassRulesForInboundMessageTest() throws ApiException {
        String messageid = null;
        StandardPostmarkResponse response = api.updateBypassRulesForInboundMessage(messageid)
                .execute();
        // TODO: test validations
    }

}
