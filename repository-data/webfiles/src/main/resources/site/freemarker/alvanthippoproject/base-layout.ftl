<!doctype html>
<#include "../include/imports.ftl">

<html lang="en">
  <head>
      <meta charset="utf-8"/>
      <title>Alvant - Home</title>
      <link rel="stylesheet" href="<@hst.webfile path="/css/website.css"/>" type="text/css"/>
      <link rel="stylesheet" href="<@hst.webfile path="/css/page-246096.css"/>" type="text/css"/>
      <link rel="stylesheet" href="<@hst.webfile path="/css/flatpickr.min.css"/>" type="text/css"/>
      <#if hstRequest.requestContext.cmsRequest>
          <link rel="stylesheet" href="<@hst.webfile path="/css/cms-request.css"/>" type="text/css"/>
      </#if>
      <style>
          @import url('https://fonts.googleapis.com/css?family=Roboto&display=swap');
      </style>

    <@hst.headContributions categoryIncludes="htmlHead" xhtml=true/>

  </head>
  <body>
  <div id="viewport">
      <div class="page" id="page-246096">
          <@hst.include ref="menu"/>

          <@hst.include ref="main"/>

          <@hst.include ref="footer"/>
      </div>
  </div>

    <script src="<@hst.webfile path="/js/jquery-2.1.0.min.js"/>" type="text/javascript"></script>
    <script src="<@hst.webfile path="/js/bootstrap.min.js"/>" type="text/javascript"></script>

    <@hst.headContributions categoryIncludes="htmlBodyEnd" xhtml=true/>

  </body>
</html>
