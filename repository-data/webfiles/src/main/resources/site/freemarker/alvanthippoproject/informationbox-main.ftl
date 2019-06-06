<#include "../include/imports.ftl">

<#-- @ftlvariable name="document" type="org.alvant.beans.Informationbox" -->
<article class="col col-md-3">
    <div class="box">
        <#if document??>
            <article>
                <#if document.iconimagelink??>
                    <@hst.link var="img" hippobean=document.iconimagelink />
                    <img src="${img}" />
                </#if>
                <@hst.manageContent hippobean=document />
                <div class="heading-4">${document.title?html}</div>

                <#if document.content??>
                     <@hst.html hippohtml=document.content/>
                </#if>

            </article>

        <#-- @ftlvariable name="editMode" type="java.lang.Boolean"-->
        <#elseif editMode>
            <div class="has-edit-button">
                <img src="<@hst.link path="/images/essentials/catalog-component-icons/simple-content.png" />"> Click to edit Simple Content
                <@hst.manageContent documentTemplateQuery="new-informationbox-document" parameterName="document" rootPath="content"/>
            </div>
        </#if>
<#--        <div class="heading-4">-->
<#--            <span style="font-size: 24px;"><span style="font-family: Capriola; font-weight: 400;">samen&nbsp;-->
<#--                </span><span style="font-family: Capriola; font-weight: 400;">cre&euml;ren</span></span></div>-->
<#--        <div class="text-4">-->
<#--            <p><span style="font-size: 18px; font-family: Cairo; font-weight: 300;">Bij Alvant geloven we in teamwork. Samen kom je sneller tot resultaat en cre&euml;er je meer. Wij sparren graag met u en met elkaar om digitale oplossingen te cre&euml;ren.</span></p>-->
<#--        </div>-->
    </div>
</article>
