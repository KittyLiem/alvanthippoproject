package org.alvant.beans;

import org.onehippo.cms7.essentials.dashboard.annotations.HippoEssentialsGenerated;
import org.hippoecm.hst.content.beans.Node;
import org.hippoecm.hst.content.beans.standard.HippoGalleryImageSet;
import org.hippoecm.hst.content.beans.standard.HippoGalleryImageBean;

@HippoEssentialsGenerated(internalName = "alvanthippoproject:imageset")
@Node(jcrType = "alvanthippoproject:imageset")
public class Imageset extends HippoGalleryImageSet {
    @HippoEssentialsGenerated(internalName = "alvanthippoproject:small")
    public HippoGalleryImageBean getSmall() {
        return getBean("alvanthippoproject:small", HippoGalleryImageBean.class);
    }

    @HippoEssentialsGenerated(internalName = "alvanthippoproject:large")
    public HippoGalleryImageBean getLarge() {
        return getBean("alvanthippoproject:large", HippoGalleryImageBean.class);
    }

    @HippoEssentialsGenerated(internalName = "alvanthippoproject:smallsquare")
    public HippoGalleryImageBean getSmallsquare() {
        return getBean("alvanthippoproject:smallsquare",
                HippoGalleryImageBean.class);
    }

    @HippoEssentialsGenerated(internalName = "alvanthippoproject:mediumsquare")
    public HippoGalleryImageBean getMediumsquare() {
        return getBean("alvanthippoproject:mediumsquare",
                HippoGalleryImageBean.class);
    }

    @HippoEssentialsGenerated(internalName = "alvanthippoproject:largesquare")
    public HippoGalleryImageBean getLargesquare() {
        return getBean("alvanthippoproject:largesquare",
                HippoGalleryImageBean.class);
    }

    @HippoEssentialsGenerated(internalName = "alvanthippoproject:banner")
    public HippoGalleryImageBean getBanner() {
        return getBean("alvanthippoproject:banner", HippoGalleryImageBean.class);
    }
}
