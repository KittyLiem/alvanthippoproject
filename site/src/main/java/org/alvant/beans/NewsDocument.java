package org.alvant.beans;

import java.util.Calendar;
import org.hippoecm.hst.content.beans.Node;
import org.hippoecm.hst.content.beans.standard.HippoDocument;
import org.hippoecm.hst.content.beans.standard.HippoGalleryImageSet;
import org.hippoecm.hst.content.beans.standard.HippoHtml;
import org.onehippo.cms7.essentials.dashboard.annotations.HippoEssentialsGenerated;
import org.alvant.beans.Imageset;

@HippoEssentialsGenerated(internalName = "alvanthippoproject:newsdocument")
@Node(jcrType = "alvanthippoproject:newsdocument")
public class NewsDocument extends HippoDocument {
    /** 
     * The document type of the news document.
     */
    public static final String DOCUMENT_TYPE = "alvanthippoproject:newsdocument";
    private static final String TITLE = "alvanthippoproject:title";
    private static final String DATE = "alvanthippoproject:date";
    private static final String INTRODUCTION = "alvanthippoproject:introduction";
    private static final String IMAGE = "alvanthippoproject:image";
    private static final String CONTENT = "alvanthippoproject:content";
    private static final String LOCATION = "alvanthippoproject:location";
    private static final String AUTHOR = "alvanthippoproject:author";
    private static final String SOURCE = "alvanthippoproject:source";

    /** 
     * Get the title of the document.
     * @return the title
     */
    @HippoEssentialsGenerated(internalName = "alvanthippoproject:title")
    public String getTitle() {
        return getProperty(TITLE);
    }

    /** 
     * Get the date of the document.
     * @return the date
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
     * Get the author of the document.
     * @return the author
     */
    @HippoEssentialsGenerated(internalName = "alvanthippoproject:author")
    public String getAuthor() {
        return getProperty(AUTHOR);
    }

    /** 
     * Get the source of the document.
     * @return the source
     */
    @HippoEssentialsGenerated(internalName = "alvanthippoproject:source")
    public String getSource() {
        return getProperty(SOURCE);
    }

    @HippoEssentialsGenerated(internalName = "alvanthippoproject:image")
    public Imageset getImage() {
        return getLinkedBean("alvanthippoproject:image", Imageset.class);
    }
}
