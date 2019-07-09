<%--
  Created by IntelliJ IDEA.
  User: js
  Date: 2019/6/21
  Time: 21:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>添加知识点</title>
    <meta charset="utf-8">
    <link rel="stylesheet" href="${path}/plugins/bootstrap-3.3.7-dist/css/bootstrap.min.css">
    <link rel="stylesheet" href="${path}/css/index/index.css">
    <link rel="stylesheet" href="${path}/plugins/diyUpload/css/diyUpload.css">
    <link rel="stylesheet" href="${path}/plugins/diyUpload/css/webuploader.css">
    <style>
        .ck p{
            height:300px;
            max-height: 300px;
        }
    </style>
</head>
<body>

<%@include file="../common/header.jsp"%>

<div class="container">
    <form action="${path}/knowledge/save" class="form-horizontal" role="form">
        <div class="form-group">
            <label  class="col-sm-2 control-label">知识点名称</label>
            <div class="col-sm-5">
                <input type="text" value="${kw.title}" name="title" class="form-control" id="firstname" placeholder="请输入知识点名称">
                ${errors["title"]}
            </div>
        </div>
        <div class="form-group">
            <label  class="col-sm-2 control-label">知识点详细</label>
            <div class="col-md-5">
                <textarea name="detail" id="editor">${kw.detail}</textarea>
                ${errors["detail"]}
            </div>
        </div>

        <div class="form-group">
            <label  class="col-sm-2 control-label">知识点图片上传</label>
            <div id="as">
                <input type="hidden" id="imgsAddr" name="contenturl">
            </div>
        </div>

        <br>
        <div class="form-group">
            <label  class="col-sm-2 control-label">知识点类型</label>
            <div class="col-sm-5">
                <select class="form-control" name="ktypeId">
                    <c:forEach items="${ktypeList}" var="k">
                        <option value="${k.id}" <c:if test="${param.kid==k.id}">selected</c:if>>${k.type}</option>
                    </c:forEach>
                </select>
            </div>
        </div>


        <div class="form-group">
            <div class="col-sm-offset-2 col-sm-10">
                <button type="submit" class="btn btn-default">提交</button>
            </div>
        </div>

    </form>
</div>


<script src="${path}/plugins/jquery/jquery.min.js"></script>
<script src="${path}/plugins/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
<script src="${path}/plugins/ckeditor5-build-classic/ckeditor.js"></script>
<script src="${path}/plugins/diyUpload/js/diyUpload.js"></script>
<script src="${path}/plugins/diyUpload/js/webuploader.html5only.min.js"></script>
<script>
    $(function () {
        ClassicEditor
            .create( document.querySelector( '#editor' ) )
            .catch(function (error) {
                console.log(error)
            });

        $('#as').diyUpload({
            url:'http://localhost:8085/springmvc_imgs/upload/diyupload',
            success:function( data ) {
                console.info( data+"======" );
                $("#imgsAddr").val(data._raw);
            },
            error:function( err ) {
                console.info( err );
            },
            buttonText : '选择文件',
            chunked:true,
            // 分片大小
            chunkSize:512 * 1024,
            //最大上传的文件数量, 总文件大小,单个文件大小(单位字节);
            fileNumLimit:50,
            fileSizeLimit:500000 * 1024,
            fileSingleSizeLimit:50000 * 1024,
            accept: {}
        });
    })

//    $(function(){
//        $('#as').diyUpload({
//            url:'http://localhost:8085/springmvc_imgs/upload/diyupload',
//            success:function( data ) {
//                console.info( data+"======" );
//            },
//            error:function( err ) {
//                console.info( err );
//            },
//            buttonText : '选择文件',
//            chunked:true,
//            // 分片大小
//            chunkSize:512 * 1024,
//            //最大上传的文件数量, 总文件大小,单个文件大小(单位字节);
//            fileNumLimit:50,
//            fileSizeLimit:500000 * 1024,
//            fileSingleSizeLimit:50000 * 1024,
//            accept: {}
//        });
//    })
</script>
</body>
</html>
