<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/8/25
  Time: 22:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script src="http://code.jquery.com/jquery-3.11.min.js"></script>
    <script>
        function send() {
            //ajax取数据
            $.ajax(
                {
                    type:"get",
                    ansyv:true,
                    url:"/hello",
                    success:function (data) {
                  alert("data")
                    },
                    error:function (data2) {
                        alert("ajax failed");

                    }
                }
            )

        }
        function check() {
//ajax传数据
            var name = document.getElementById("user").value;
            var psw = document.getElementById("psw").value;
            var params={
                "username":name,
                "password":psw
            };
            $.ajax(
                {
                    type: "post",
                    ansyv: false,
                    data:params,
                    url: "/check",
                    success:function (data)
                    {
                     if (data=="sucess"){
                         alert("成功")
                     }else
                     {
                         alert("错误")
                     }
                    },
                    error:function (data2) {
                        alert("ajax failed")
                    }
                }
            )
        }
    </script>
</head>
<body>

<input type="text" id="user" maxlength="10">
<br>
<input type="password" id="psw">
<br>
<button onclick="check()">sign</button>
</body>
</html>
