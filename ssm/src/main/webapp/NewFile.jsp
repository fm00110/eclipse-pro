<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%-- <%@ taglib prefix="f"  uri="http://java.sun.com/jsf/core"%>
<%@ taglib prefix="h"  uri="http://java.sun.com/jsf/html"%> --%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<script type="text/javascript" src="/js/jquery.min.js"></script>
<script type="text/javascript">

    $(function () {
        var name = $("#na").val();

        var password = $("#pd").val();

        $("#but").click(function(){
            var name = $("#na").val();

            var password = $("#pd").val();
            $.ajax({
                type: "GET",
                data: {"name":name,"password":password},
                url: "returnuse.do",
                dataType:"json",
                success:function(data){
                    alert(data.name+" " +data.password);
                },
                error: function (data) {
                    alert(data.name+" " +data.password);
                }

            })
        })
    })
</script>
<body>
<input type="text"  id="na"><br>
<input type="text"  id="pd"><br>
<input type="button" value="按钮" id="but"><br>
</body>
</html>