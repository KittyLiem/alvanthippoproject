<!doctype html>
<#include "../include/imports.ftl">

<html lang="en">
  <head>
    <meta charset="utf-8"/>
    <link rel="stylesheet" href="<@hst.webfile path="/css/website.css"/>" type="text/css"/>
    <link rel="stylesheet" href="<@hst.webfile path="/css/page-246096.css"/>" type="text/css"/>
    <#if hstRequest.requestContext.cmsRequest>
      <link rel="stylesheet" href="<@hst.webfile path="/css/cms-request.css"/>" type="text/css"/>
    </#if>
    <@hst.headContributions categoryExcludes="htmlBodyEnd, scripts" xhtml=true/>
    <@hst.headContributions categoryIncludes="htmlHead" xhtml=true/>
  </head>
  <body>
    <div class="container" id="viewport">
      <div class="row">

        <div class="page block-112-1 box-1">
          <a class="media-1" href="/">
            <img src="<@hst.webfile path="/images/logos/alva-logo-pms354.svg"/>" />
          </a>
        </div>
        <div class="menu init col-md-6 col-md-offset-3">
          <@hst.include ref="top"/>
        </div>
      </div>
      <div class="row">
        <div class="col-md-6 col-md-offset-3">
          <@hst.include ref="menu"/>
        </div>
      </div>
      <div class="row">
        <@hst.include ref="main"/>
      </div>
      <div class="row">
        <@hst.include ref="footer"/>
      </div>
    </div>
    <@hst.headContributions categoryIncludes="htmlBodyEnd, scripts" xhtml=true/>
  </body>
</html>