package com.design.pattern.structure.adapter;

import org.json.JSONObject;

public class SmartAnalyticsLibrary {

    public void analyze(JSONObject jsonData) {
        System.out.println("📊 Analyzing stock data in SmartAnalytics:");
        System.out.println("JSON Received:\n" + jsonData.toString(2));
    }

    public void analyze(String xml) {
        System.out.println("📊 Analyzing stock data in SmartAnalytics:");
        System.out.println("xml Received:\n" + xml);
    }
}
