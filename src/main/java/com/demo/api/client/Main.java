package com.demo.api.client;

public class Main {
    public static void main(String[] args) {

        String accessKey = "fzf";
        String secretKey = "secret";

        ApiClient apiClient = new ApiClient(accessKey, secretKey);
        String result1 = apiClient.getNameByGet("yupi");
        String result2 = apiClient.getNameByPost("yupi");

    }
}
