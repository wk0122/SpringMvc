<%--
  Created by IntelliJ IDEA.
  User: success
  Date: 2019/6/20 0020
  Time: 16:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>驰星知识图谱</title>
    <meta charset="utf-8">
    <!--引入bootstrap-->
    <link rel="stylesheet" href="${path}/plugins/bootstrap-3.3.7-dist/css/bootstrap.min.css">
    <link rel="stylesheet" href="${path}/css/index/index.css">
</head>
<body>
    <!--引入导航-->
    <%@ include file="../common/header.jsp"%>

    <!--搜索框-->
    <div class="container">
        <div>
            <form action="${path}/ktype/search" class="bs-example bs-example-form" role="form">
                <div class="row">
                    <div class="col-md-4">
                        <div class="input-group">
                            <%--参数的自动绑定 - input的name属性的值要和方法的参数的属性的值保持一致--%>
                            <input value="${type}" name="type" type="text" class="form-control" placeholder="知识点类型模糊查询">
                            <span class="input-group-btn">
                        <button class="btn btn-default" type="submit">搜索</button>
                    </span>
                        </div><!-- /input-group -->
                    </div><!-- /.col-lg-6 -->
                </div><!-- /.row -->
            </form>
        </div>
    </div>

    <!--展示知识的类型-->
    <div class="container">
        <div class="row">
            <c:forEach items="${ktypeList}" var="item">
                <div class="col-md-6 col-md-3">
                    <div class="thumbnail">
                        <a href="${path}/knowledge/list?id=${item.id}">
                        <img src="${path}/imgs/${item.imgurl}"
                             alt="通用的占位符缩略图"></a>
                        <div class="caption">
                            <h3 style="text-align: center">${item.type}</h3>
                        </div>
                    </div>
                </div>
            </c:forEach>
        </div>
    </div>

    <script src="${path}/plugins/jquery/jquery.min.js"></script>
    <script src="${path}/plugins/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
</body>
</html>
