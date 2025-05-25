package com.design.pattern.structure.adapter;

import org.json.JSONObject;

public interface XmlAnalyzer {
    void analyzeXML(String xmlData);
    String exportAsXML(JSONObject jsonData);
}
