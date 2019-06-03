package org.alvant.beans;

import java.util.Calendar;
import org.hippoecm.hst.content.beans.Node;
import org.hippoecm.hst.content.beans.standard.HippoDocument;
import org.hippoecm.hst.content.beans.standard.HippoGalleryImageSet;
import org.hippoecm.hst.content.beans.standard.HippoHtml;
import org.onehippo.cms7.essentials.dashboard.annotations.HippoEssentialsGenerated;
import org.alvant.beans.Imageset;

@HippoEssentialsGenerated(internalName = "alvanthippoproject:eventsdocument")
@Node(jcrType = "alvanthippoproject:eventsdocument")
public class EventsDocument extends HippoDocument {
    /** 
     * The document type of the events document.
     */
    public static final String DOCUMENT_TYPE = "alvanthippoproject:eventsdocument";
    private static final String TITLE = "alvanthippoproject:title";
    private static final String DATE = "alvanthippoproject:date";
    private static final String INTRODUCTION = "alvanthippoproject:introduction";
    private static final String IMAGE = "alvanthippoproject:image";
    private static final String CONTENT = "alvanthippoproject:content";
    private static final String LOCATION = "alvanthippoproject:location";
    private static final String END_DATE = "alvanthippoproject:enddate";

    /** 
     * Get the title of the document.
     * @return the title
     */
    @HippoEssentialsGenerated(internalName = "alvanthippoproject:title")
    public String getTitle() {
        return getProperty(TITLE);
    }

    /** 
     * Get the date of the document, i.e. the start date of the event.
     * @return the (start) date
     */
    @HippoEssentialsGenerated(internalName = "alvanthippoproject:date")
    public Calendar getDate() {
        return getProperty(DATE);
    }

    /** 
     * Get the introduction of the document.
     * @return the introduction
     */
    @HippoEssentialsGenerated(internalName = "alvanthippoproject:introduction")
    public String getIntroduction() {
        return getProperty(INTRODUCTION);
    }

    /** 
     * Get the main content of the document.
     * @return the content
     */
    @HippoEssentialsGenerated(internalName = "alvanthippoproject:content")
    public HippoHtml getContent() {
        return getHippoHtml(CONTENT);
    }

    /** 
     * Get the location of the document.
     * @return the location
     */
    @HippoEssentialsGenerated(internalName = "alvanthippoproject:location")
    public String getLocation() {
        return getProperty(LOCATION);
    }

    /** 
     * Get the end date of the document, i.e. the end date of the event.
     * @return the end date
     */
    @HippoEssentialsGenerated(internalName = "alvanthippoproject:enddate")
    public Calendar getEndDate() {
        return getProperty(END_DATE);
    }

    @HippoEssentialsGenerated(internalName = "alvanthippoproject:image")
    public Imageset getImage() {
        return getLinkedBean("alvanthippoproject:image", Imageset.class);
    }
}
