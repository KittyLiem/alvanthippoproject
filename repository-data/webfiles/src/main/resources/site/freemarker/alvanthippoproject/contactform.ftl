<#include "../include/imports.ftl">

<!-- Support for Spring errors object -->
<spring:bind path="contactMessage.*">
    <c:forEach var="error" items="${status.errorMessages}">
        <B><span style="color:#FF0000">
                <BR><c:out value="${error}"/>
            </span></B>
    </c:forEach>
</spring:bind>

<form method="POST" name="contactform" action="<@hst.actionURL/>">
    <table>
        <tr>
            <td>Name</td>
            <td>
                <spring:bind path="contactMessage.name">
                    <input type="text" name="${status.expression}" value="<c:out value='${status.value}'/>" />
                </spring:bind>
            </td>
        </tr>
        <tr>
            <td>Email</td>
            <td>
                <spring:bind path="contactMessage.email">
                    <input type="text" name="${status.expression}" value="<c:out value='${status.value}'/>" />
                </spring:bind>
            </td>
        </tr>
        <tr>
            <td>Message</td>
            <td>
                <spring:bind path="contactMessage.message">
                    <textarea name="${status.expression}"><c:out value='${status.value}'/></textarea>
                </spring:bind>
            </td>
        </tr>
        <td>Seal form:</td>
        <td>
            <p>
                <input type="checkbox" name="seal" value="true"> Seal form data
            </p>
        </td>
        <tr>
            <td>
                <input type="submit"  value="send"/>
            </td>
        </tr>
    </table>
</form>
