<#include "../include/imports.ftl">

<#-- @ftlvariable name="editMode" type="java.lang.Boolean"-->

<header class="block-112-1">
    <div class="container">
        <div class="row row-xs-split">
            <div class="col col-1">
                <div class="box-1">
                    <a class="media-1" href="/">
                        <img src="<@hst.webfile path="/images/logos/alva-logo-pms354.svg"/>" />
                    </a>
                </div>
            </div>
            <div class="col col-2">
                <div class="menu init">
                    <a class="control-1 handler" href="#">
                        <img src="<@hst.webfile path="/files/menu.333333.svg"/>" />
                    </a>
                    <div class="block-112-1-mobile-menu mobile-menu">
                        <div class="outer">
                            <div class="inner box-2">
                                <#if menu??>
                                    <#if menu.siteMenuItems??>
                                        <nav class="menu-1" data-levels="2">
                                            <ul>
                                                <#list menu.siteMenuItems as item>
                                                    <#if  item.selected || item.expanded>
                                                         <li><a href="<@hst.link link=item.hstLink/>" class="active">
                                                                  <span class="label-nav">${item.name?html}</span> </a></li>
                                                    <#else>
                                                         <li><a href="<@hst.link link=item.hstLink/>">
                                                                  <span class="label-nav">${item.name?html}</span></a></li>
                                                    </#if>
                                                </#list>
                                            </ul>
                                        </nav>
                                    </#if>
                                    <@hst.cmseditmenu menu=menu/>
                                </#if>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</header>

<@hst.headContribution category="htmlBodyEnd">
    <script type="text/javascript" src="<@hst.webfile path="/js/alvantscript.js"/>"></script>
</@hst.headContribution>
