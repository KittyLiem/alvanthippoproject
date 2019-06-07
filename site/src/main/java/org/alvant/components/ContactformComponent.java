package org.alvant.components;

import javax.jcr.Session;

import org.hippoecm.hst.component.support.bean.BaseHstComponent;
import org.hippoecm.hst.component.support.forms.FormField;
import org.hippoecm.hst.component.support.forms.FormMap;
import org.hippoecm.hst.component.support.forms.FormUtils;
import org.hippoecm.hst.content.annotations.Persistable;
import org.hippoecm.hst.core.component.GenericHstComponent;
import org.hippoecm.hst.core.component.HstComponentException;
import org.hippoecm.hst.core.component.HstRequest;
import org.hippoecm.hst.core.component.HstResponse;
import org.hippoecm.hst.core.request.HstRequestContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ContactformComponent extends BaseHstComponent  {

    public static final Logger log = LoggerFactory.getLogger(ContactformComponent.class);

    private static final String[] DEFINED_FORM_FIELDS = {"name", "email", "message"};



    @Persistable
    @Override
    public void doAction(HstRequest request, HstResponse response) throws HstComponentException {
        super.doAction(request, response);
        FormMap formMap = new FormMap(request, DEFINED_FORM_FIELDS);
        if (request.getParameterValues("seal") != null) {
            log.info("Sealing data. this data cannot be read within doBefore anymore");
            formMap.setSealed(true);
        }
        FormUtils.persistFormMap(request, response, formMap, null);
    }

    @Override
    public void doBeforeRender(final HstRequest request, final HstResponse response) throws HstComponentException {
        super.doBeforeRender(request, response);
        FormMap formMap = new FormMap();
        FormUtils.populate(request, formMap);
        request.setAttribute("form", formMap);
    }

}
