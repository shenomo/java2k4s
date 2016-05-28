package main.connection;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.ObjectMapper;
import main.entities.FlightEntity;
import main.entities.PlaneEntity;
import main.entities.StaffEntity;
import main.entities.enums.Role;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class ServerConnection {
    private final String SERVER_URL = "http://localhost:8080/rest/api/";

    public Role getRole() throws Exception {
        return mapper().readValue(getResponse("role"), Role.class);
    }

    public List<FlightEntity> getFlights() {
        try {
            return Arrays.asList(mapper().readValue(getResponse("flights"), FlightEntity[].class));
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public List<PlaneEntity> getPlanes() {
        try {
            return Arrays.asList(mapper().readValue(getResponse("planes"), PlaneEntity[].class));
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public List<StaffEntity> getStaffs() {
        try {
            return Arrays.asList(mapper().readValue(getResponse("staffs"), StaffEntity[].class));
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public FlightEntity getOneFlight() {
        try {
            return mapper().readValue(getResponse("oneFlight"), FlightEntity.class);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public void doPost(String path, Object object) {
        String url = SERVER_URL + path;
        try {
            new RestTemplate().exchange(url, HttpMethod.POST, request(object), object.getClass());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private ObjectMapper mapper() {
        ObjectMapper mapper = new ObjectMapper();
        mapper.configure(JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES, true);
        return mapper;
    }

    private String getResponse(String path) throws Exception {
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.setErrorHandler(new ErrorHundler());
        String url = SERVER_URL + path;
        ResponseEntity resp = restTemplate.exchange(url, HttpMethod.GET, request(), String.class);
        return resp.getBody().toString();
    }

    private HttpEntity<String> request() throws IOException {
        return request(null);
    }

    private HttpEntity request(Object payload) throws IOException {
        HttpHeaders headers = new HttpHeaders();
        headers.add("Authorization", ServerAuth.getLoginPass());
        return new HttpEntity(payload, headers);
    }
}
