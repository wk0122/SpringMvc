<%--
  Created by IntelliJ IDEA.
  User: js
  Date: 2019/6/21
  Time: 20:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<html>
<head>
    <title>知识点</title>
    <meta charset="utf-8">
    <link rel="stylesheet" href="${path}/plugins/bootstrap-3.3.7-dist/css/bootstrap.min.css">
    <link rel="stylesheet" href="${path}/css/index/index.css">
</head>
<body>

<%@ include file="../common/header.jsp"%>

<!--搜索框-->
<div class="container">
    <div>
        <form action="" class="bs-example bs-example-form" role="form">
            <div class="row">
                <div class="col-md-4">
                    <div class="input-group">
                        <%--参数的自动绑定 - input的name属性的值要和方法的参数的属性的值保持一致--%>
                        <input value="" name="title" type="text" class="form-control" placeholder="知识点标题查询">
                        <span class="input-group-btn">
                                <button class="btn btn-default" type="submit">搜索</button>
                             </span>
                    </div><!-- /input-group -->
                </div><!-- /.col-lg-6 -->
                <div class="col-md-2">
                    <a href="${path}/ktype/list?kid=${kid}" class="btn btn-info">添加知识点</a>
                </div>
            </div><!-- /.row -->
        </form>
    </div>
</div>

<%--判断集合是否为空--%>
<c:if test="${empty knowledgeList}"><h3 style="text-align: center;color:red">该知识类型还没有记录知识点</h3></c:if>

<c:if test="${!empty knowledgeList}">
    <%--<%--%>
        <%--request.setAttribute("vEnter","\n");--%>
    <%--%>--%>
<c:forEach items="${knowledgeList}" var="k">
    <%--<c:out escapeXml="false" value="${fn:replace(k.detail,vEnter ,'<br>')}"></c:out>--%>
    ${k.detail}
</c:forEach>

</c:if>

<script src="${path}/plugins/jquery/jquery.min.js"></script>
<script src="${path}/plugins/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
</body>
</html>
