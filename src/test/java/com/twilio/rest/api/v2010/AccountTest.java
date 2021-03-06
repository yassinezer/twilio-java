/**
 * This code was generated by
 * \ / _    _  _|   _  _
 *  | (_)\/(_)(_|\/| |(/_  v1.0.0
 *       /       /       
 */

package com.twilio.rest.api.v2010;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.twilio.Twilio;
import com.twilio.converter.DateConverter;
import com.twilio.converter.Promoter;
import com.twilio.exception.TwilioException;
import com.twilio.http.HttpMethod;
import com.twilio.http.Request;
import com.twilio.http.Response;
import com.twilio.http.TwilioRestClient;
import com.twilio.rest.Domains;
import mockit.Mocked;
import mockit.NonStrictExpectations;
import org.junit.Before;
import org.junit.Test;

import java.net.URI;

import static com.twilio.TwilioTest.serialize;
import static org.junit.Assert.*;

public class AccountTest {
    @Mocked
    private TwilioRestClient twilioRestClient;

    @Before
    public void setUp() throws Exception {
        Twilio.init("AC123", "AUTH TOKEN");
    }

    @Test
    public void testCreateRequest() {
        new NonStrictExpectations() {{
            Request request = new Request(HttpMethod.POST,
                                          Domains.API.toString(),
                                          "/2010-04-01/Accounts.json");
            
            twilioRestClient.request(request);
            times = 1;
            result = new Response("", 500);
            twilioRestClient.getAccountSid();
            result = "AC123";
        }};
        
        try {
            Account.creator().create();
            fail("Expected TwilioException to be thrown for 500");
        } catch (TwilioException e) {}
    }

    @Test
    public void testCreateResponse() {
        new NonStrictExpectations() {{
            twilioRestClient.request((Request) any);
            result = new Response("{\"auth_token\": \"AUTHTOKEN\",\"date_created\": \"Sun, 15 Mar 2009 02:08:47 +0000\",\"date_updated\": \"Wed, 25 Aug 2010 01:30:09 +0000\",\"friendly_name\": \"Test Account\",\"sid\": \"ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"owner_account_sid\": \"ACbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb\",\"status\": \"active\",\"subresource_uris\": {\"available_phone_numbers\": \"/2010-04-01/Accounts/ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/AvailablePhoneNumbers.json\",\"calls\": \"/2010-04-01/Accounts/ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Calls.json\",\"conferences\": \"/2010-04-01/Accounts/ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Conferences.json\",\"incoming_phone_numbers\": \"/2010-04-01/Accounts/ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/IncomingPhoneNumbers.json\",\"notifications\": \"/2010-04-01/Accounts/ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Notifications.json\",\"outgoing_caller_ids\": \"/2010-04-01/Accounts/ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/OutgoingCallerIds.json\",\"recordings\": \"/2010-04-01/Accounts/ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Recordings.json\",\"sandbox\": \"/2010-04-01/Accounts/ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Sandbox.json\",\"sms_messages\": \"/2010-04-01/Accounts/ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/SMS/Messages.json\",\"transcriptions\": \"/2010-04-01/Accounts/ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Transcriptions.json\"},\"type\": \"Full\",\"uri\": \"/2010-04-01/Accounts/ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.json\"}", TwilioRestClient.HTTP_STATUS_CODE_CREATED);
            twilioRestClient.getObjectMapper();
            result = new ObjectMapper();
        }};
        
        Account.creator().create();
    }

    @Test
    public void testFetchRequest() {
        new NonStrictExpectations() {{
            Request request = new Request(HttpMethod.GET,
                                          Domains.API.toString(),
                                          "/2010-04-01/Accounts/ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.json");
            
            twilioRestClient.request(request);
            times = 1;
            result = new Response("", 500);
            twilioRestClient.getAccountSid();
            result = "AC123";
        }};
        
        try {
            Account.fetcher("ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa").fetch();
            fail("Expected TwilioException to be thrown for 500");
        } catch (TwilioException e) {}
    }

    @Test
    public void testFetchResponse() {
        new NonStrictExpectations() {{
            twilioRestClient.request((Request) any);
            result = new Response("{\"auth_token\": \"AUTHTOKEN\",\"date_created\": \"Sun, 15 Mar 2009 02:08:47 +0000\",\"date_updated\": \"Wed, 25 Aug 2010 01:30:09 +0000\",\"friendly_name\": \"Test Account\",\"sid\": \"ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"owner_account_sid\": \"ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"status\": \"active\",\"subresource_uris\": {\"available_phone_numbers\": \"/2010-04-01/Accounts/ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/AvailablePhoneNumbers.json\",\"calls\": \"/2010-04-01/Accounts/ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Calls.json\",\"conferences\": \"/2010-04-01/Accounts/ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Conferences.json\",\"incoming_phone_numbers\": \"/2010-04-01/Accounts/ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/IncomingPhoneNumbers.json\",\"notifications\": \"/2010-04-01/Accounts/ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Notifications.json\",\"outgoing_caller_ids\": \"/2010-04-01/Accounts/ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/OutgoingCallerIds.json\",\"recordings\": \"/2010-04-01/Accounts/ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Recordings.json\",\"sandbox\": \"/2010-04-01/Accounts/ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Sandbox.json\",\"sms_messages\": \"/2010-04-01/Accounts/ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/SMS/Messages.json\",\"transcriptions\": \"/2010-04-01/Accounts/ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Transcriptions.json\"},\"type\": \"Full\",\"uri\": \"/2010-04-01/Accounts/ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.json\"}", TwilioRestClient.HTTP_STATUS_CODE_OK);
            twilioRestClient.getObjectMapper();
            result = new ObjectMapper();
        }};
        
        assertNotNull(Account.fetcher("ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa").fetch());
    }

    @Test
    public void testReadRequest() {
        new NonStrictExpectations() {{
            Request request = new Request(HttpMethod.GET,
                                          Domains.API.toString(),
                                          "/2010-04-01/Accounts.json");
            
            twilioRestClient.request(request);
            times = 1;
            result = new Response("", 500);
            twilioRestClient.getAccountSid();
            result = "AC123";
        }};
        
        try {
            Account.reader().read();
            fail("Expected TwilioException to be thrown for 500");
        } catch (TwilioException e) {}
    }

    @Test
    public void testReadFullResponse() {
        new NonStrictExpectations() {{
            twilioRestClient.request((Request) any);
            result = new Response("{\"accounts\": [{\"auth_token\": \"foobar\",\"date_created\": \"Tue, 23 Aug 2011 20:58:45 +0000\",\"date_updated\": \"Fri, 04 Sep 2015 22:53:32 +0000\",\"friendly_name\": \"Sub account for testing requests authed with parent account\",\"owner_account_sid\": \"ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"sid\": \"ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"status\": \"active\",\"subresource_uris\": {\"applications\": \"/2010-04-01/Accounts/ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Applications.json\",\"authorized_connect_apps\": \"/2010-04-01/Accounts/ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/AuthorizedConnectApps.json\",\"available_phone_numbers\": \"/2010-04-01/Accounts/ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/AvailablePhoneNumbers.json\",\"calls\": \"/2010-04-01/Accounts/ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Calls.json\",\"conferences\": \"/2010-04-01/Accounts/ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Conferences.json\",\"connect_apps\": \"/2010-04-01/Accounts/ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/ConnectApps.json\",\"incoming_phone_numbers\": \"/2010-04-01/Accounts/ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/IncomingPhoneNumbers.json\",\"media\": \"/2010-04-01/Accounts/ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Media.json\",\"messages\": \"/2010-04-01/Accounts/ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Messages.json\",\"notifications\": \"/2010-04-01/Accounts/ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Notifications.json\",\"outgoing_caller_ids\": \"/2010-04-01/Accounts/ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/OutgoingCallerIds.json\",\"queues\": \"/2010-04-01/Accounts/ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Queues.json\",\"recordings\": \"/2010-04-01/Accounts/ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Recordings.json\",\"sandbox\": \"/2010-04-01/Accounts/ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Sandbox.json\",\"sip\": \"/2010-04-01/Accounts/ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/SIP.json\",\"sms_messages\": \"/2010-04-01/Accounts/ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/SMS/Messages.json\",\"transcriptions\": \"/2010-04-01/Accounts/ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Transcriptions.json\",\"usage\": \"/2010-04-01/Accounts/ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Usage.json\"},\"type\": \"Full\",\"uri\": \"/2010-04-01/Accounts/ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.json\"}],\"end\": 0,\"first_page_uri\": \"/2010-04-01/Accounts.json?PageSize=1&Page=0\",\"last_page_uri\": \"/2010-04-01/Accounts.json?PageSize=1&Page=4\",\"next_page_uri\": null,\"num_pages\": 5,\"page\": 0,\"page_size\": 1,\"previous_page_uri\": null,\"start\": 0,\"total\": 5,\"uri\": \"/2010-04-01/Accounts.json?PageSize=1\"}", TwilioRestClient.HTTP_STATUS_CODE_OK);
            twilioRestClient.getObjectMapper();
            result = new ObjectMapper();
        }};
        
        assertNotNull(Account.reader().read());
    }

    @Test
    public void testReadEmptyResponse() {
        new NonStrictExpectations() {{
            twilioRestClient.request((Request) any);
            result = new Response("{\"accounts\": [],\"end\": 0,\"first_page_uri\": \"/2010-04-01/Accounts.json?PageSize=1&Page=0\",\"last_page_uri\": \"/2010-04-01/Accounts.json?PageSize=1&Page=4\",\"next_page_uri\": null,\"num_pages\": 5,\"page\": 0,\"page_size\": 1,\"previous_page_uri\": null,\"start\": 0,\"total\": 5,\"uri\": \"/2010-04-01/Accounts.json?PageSize=1\"}", TwilioRestClient.HTTP_STATUS_CODE_OK);
            twilioRestClient.getObjectMapper();
            result = new ObjectMapper();
        }};
        
        assertNotNull(Account.reader().read());
    }

    @Test
    public void testUpdateRequest() {
        new NonStrictExpectations() {{
            Request request = new Request(HttpMethod.POST,
                                          Domains.API.toString(),
                                          "/2010-04-01/Accounts/ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.json");
            
            twilioRestClient.request(request);
            times = 1;
            result = new Response("", 500);
            twilioRestClient.getAccountSid();
            result = "AC123";
        }};
        
        try {
            Account.updater("ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa").update();
            fail("Expected TwilioException to be thrown for 500");
        } catch (TwilioException e) {}
    }

    @Test
    public void testUpdateResponse() {
        new NonStrictExpectations() {{
            twilioRestClient.request((Request) any);
            result = new Response("{\"auth_token\": \"AUTHTOKEN\",\"date_created\": \"Sun, 15 Mar 2009 02:08:47 +0000\",\"date_updated\": \"Wed, 25 Aug 2010 01:30:09 +0000\",\"friendly_name\": \"Test Account\",\"sid\": \"ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"owner_account_sid\": \"ACbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb\",\"status\": \"active\",\"subresource_uris\": {\"available_phone_numbers\": \"/2010-04-01/Accounts/ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/AvailablePhoneNumbers.json\",\"calls\": \"/2010-04-01/Accounts/ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Calls.json\",\"conferences\": \"/2010-04-01/Accounts/ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Conferences.json\",\"incoming_phone_numbers\": \"/2010-04-01/Accounts/ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/IncomingPhoneNumbers.json\",\"notifications\": \"/2010-04-01/Accounts/ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Notifications.json\",\"outgoing_caller_ids\": \"/2010-04-01/Accounts/ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/OutgoingCallerIds.json\",\"recordings\": \"/2010-04-01/Accounts/ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Recordings.json\",\"sandbox\": \"/2010-04-01/Accounts/ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Sandbox.json\",\"sms_messages\": \"/2010-04-01/Accounts/ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/SMS/Messages.json\",\"transcriptions\": \"/2010-04-01/Accounts/ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Transcriptions.json\"},\"type\": \"Full\",\"uri\": \"/2010-04-01/Accounts/ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.json\"}", TwilioRestClient.HTTP_STATUS_CODE_OK);
            twilioRestClient.getObjectMapper();
            result = new ObjectMapper();
        }};
        
        Account.updater("ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa").update();
    }
}