package org.alvant.beans;

import org.onehippo.cms7.essentials.dashboard.annotations.HippoEssentialsGenerated;
import org.hippoecm.hst.content.beans.Node;
import org.alvant.beans.Imageset;

@HippoEssentialsGenerated(internalName = "alvanthippoproject:informationbox")
@Node(jcrType = "alvanthippoproject:informationbox")
public class Informationbox extends ContentDocument {
    @HippoEssentialsGenerated(internalName = "alvanthippoproject:iconimagelink")
    public Imageset getIconimagelink() {
        return getLinkedBean("alvanthippoproject:iconimagelink", Imageset.class);
    }}
