package com.test.test.test_objects;

public class ObjectsPage {
    private String name;
    private String description;
    public String getName() {
        return this.name;
    }
    public String getDesc() {
        return this.description;
    }
    private ObjectsPage(String name, String description) {
        this.name = name;
        this.description = description;
    }
    public static ObjectsPage getDynamicIdDate(){
        return new ObjectsPage("Dynamic ID", "Modern applications often generate dynamic IDs for elements. " +
                "In this case ID is not a reliable attribute for using in element selector. " +
                "By default many UI automation tools record IDs and this results in tests broken from the very beginning. " +
                "An automation tool needs a way to instruct it to skip dynamic IDs when XPath is generated for an element.");
    }
}


