package com.design.pattern.structure.adapter;

import org.json.JSONObject;

public interface JsonAnalyzer {
    void analyzeJSON(JSONObject jsonData);
    JSONObject exportAsJSON(String xmlData);
}
