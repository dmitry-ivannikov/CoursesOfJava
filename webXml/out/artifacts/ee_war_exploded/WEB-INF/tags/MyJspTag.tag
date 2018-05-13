<%@ attribute name="name" required="false" %>
<br>Lets write this in english</br>
<%= name%><br/>
<b>
    <% getJspBody().invoke(null);%>
</b>