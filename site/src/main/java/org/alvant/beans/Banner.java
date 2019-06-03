package org.alvant.beans;

import org.onehippo.cms7.essentials.dashboard.annotations.HippoEssentialsGenerated;
import org.hippoecm.hst.content.beans.Node;
import org.hippoecm.hst.content.beans.standard.HippoHtml;
import org.hippoecm.hst.content.beans.standard.HippoGalleryImageSet;
import org.hippoecm.hst.content.beans.standard.HippoBean;
import org.alvant.beans.Imageset;

@HippoEssentialsGenerated(internalName = "alvanthippoproject:bannerdocument")
@Node(jcrType = "alvanthippoproject:bannerdocument")
public class Banner extends BaseDocument {
    @HippoEssentialsGenerated(internalName = "alvanthippoproject:title")
    public String getTitle() {
        return getProperty("alvanthippoproject:title");
    }

    @HippoEssentialsGenerated(internalName = "alvanthippoproject:content")
    public HippoHtml getContent() {
        return getHippoHtml("alvanthippoproject:content");
    }

    @HippoEssentialsGenerated(internalName = "alvanthippoproject:link")
    public HippoBean getLink() {
        return getLinkedBean("alvanthippoproject:link", HippoBean.class);
    }

    @HippoEssentialsGenerated(internalName = "alvanthippoproject:image")
    public Imageset getImage() {
        return getLinkedBean("alvanthippoproject:image", Imageset.class);
    }
}
