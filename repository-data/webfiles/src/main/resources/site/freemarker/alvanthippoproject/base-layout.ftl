<!doctype html>
<#include "../include/imports.ftl">

<html lang="en">
  <head>
    <meta charset="utf-8"/>
    <link rel="stylesheet" href="<@hst.webfile path="/css/website.css"/>" type="text/css"/>
    <link rel="stylesheet" href="<@hst.webfile path="/css/page-246096.css"/>" type="text/css"/>
    <link rel="stylesheet" href="<@hst.webfile path="/css/flatpickr.min.css"/>" type="text/css"/>
    <#if hstRequest.requestContext.cmsRequest>
      <link rel="stylesheet" href="<@hst.webfile path="/css/cms-request.css"/>" type="text/css"/>
    </#if>
      <style>
          @import url('https://fonts.googleapis.com/css?family=Roboto&display=swap');
      </style>
      <@hst.headContributions categoryExcludes="htmlBodyEnd, scripts" xhtml=true/>
    <@hst.headContributions categoryIncludes="htmlHead" xhtml=true/>
  </head>
  <body>
  <div id="viewport"
      <div class="page" id="page-246096">
          <div class="container" id="viewport">
              <div class="row">
                  <div class="menu init col-md-6 col-md-offset-3">
                      <@hst.include ref="top"/>
                  </div>
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
      </div>
  </div>
    <@hst.headContributions categoryIncludes="htmlBodyEnd, scripts" xhtml=true/>
  </body>
</html>