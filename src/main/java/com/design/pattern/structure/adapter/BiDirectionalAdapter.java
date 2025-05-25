package com.design.pattern.structure.adapter;

import org.json.JSONObject;
import org.json.XML;

public class BiDirectionalAdapter implements XmlAnalyzer, JsonAnalyzer{

    private final SmartAnalyticsLibrary smartLibrary;

    public BiDirectionalAdapter(SmartAnalyticsLibrary smartLibrary) {

        this.smartLibrary = smartLibrary;
    }

    // XML → JSON → 분석
    @Override
    public void analyzeXML(String xmlData) {
        JSONObject json = XML.toJSONObject(xmlData);
        smartLibrary.analyze(json);
    }

    // JSON → 분석
    @Override
    public void analyzeJSON(JSONObject jsonData) {
        smartLibrary.analyze(jsonData);
    }

    // JSON → XML
    @Override
    public String exportAsXML(JSONObject jsonData) {
        return XML.toString(jsonData);
    }

    // XML → JSON
    @Override
    public JSONObject exportAsJSON(String xmlData) {
        return XML.toJSONObject(xmlData);
    }
}
