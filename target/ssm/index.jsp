<%@ page language="java"  pageEncoding="UTF-8"%>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <script src="/js/jquery-2.2.4.min.js"></script>
    <script type="application/javascript">
        $(function () {
            $('#btn').click(function () {
                getData();
            });

            function  getData() {

                $.ajax({
                    url: "http://localhost:8081/user/findABC",
                    type: 'POST',
                    dataType: "json",
                    data:JSON.stringify({id:1111}) ,
                    contentType: 'application/json',
                    success: function (data) {
                        alert(data);
                    },
                    error: function (a, b, c) {

                    }
                });
            }

        });
    </script>
</head>
<body>
<h2>Hello World!</h2>
<input id="btn" type="button" value="调用接口" />
</body>
</html>
