package com.producer.database.entity;


import org.springframework.data.mongodb.core.mapping.Document;



@Document(collection = "wikimedia_recent_change")
public class WikimediaData {


    private String id;

    private String wikiEventData;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getWikiEventData() {
        return wikiEventData;
    }

    public void setWikiEventData(String wikiEventData) {
        this.wikiEventData = wikiEventData;
    }
}
