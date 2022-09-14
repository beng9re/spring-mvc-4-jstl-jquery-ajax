<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<article>
    <c:forEach var="profile" items="${profiles}">
        <ul style="margin-bottom: 1px">
            <li><b><label>아이디:</label>${profile.id}</b></li></li>
            <li><b><label>타이틀:</label>${profile.title}</b></li>
            <li><b><label>이름:</label>${profile.name}</b></li>
            <li><b><label>나이:</label>${profile.age}</b></li>
        </ul>
    </c:forEach>
</article>