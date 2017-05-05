package org.lumi.springbootloggingtest.model;

/**
 * Created by John Tsantilis
 * (i [dot] tsantilis [at] yahoo [dot] com A.K.A lumi) on 5/5/2017.
 */

public class Greeting {
    //=================================================================================================================
    //Setters & Getters
    //=================================================================================================================
    public long getId() {
        return id;

    }

    public String getContent() {
        return content;

    }

    //=================================================================================================================
    //Class Constructors
    //=================================================================================================================
    /*
    * Default Constructor
    * */
    public Greeting(long id, String content) {
        this.id = id;
        this.content = content;

    }

    //=================================================================================================================
    //Class variables
    //=================================================================================================================
    private final long id;
    private final String content;

}
