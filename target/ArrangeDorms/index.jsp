<html>
<body>
<h2>Hello World!</h2>
<!-- rest风格put 表示修改一条数据-->
<form action="studentController/student/1" method="post">
    <input type="hidden" name="_method" value="PUT"/>
    <input type="hidden" name="sdNumber" value="1"/>
    <input type="submit" value="Rest PUT"/>
</form>

<!-- rest风格delete 表示删除一条数据-->
<form action="studentController/student/1" method="post">
    <input type="hidden" name="_method" value="DELETE"/>
    <input type="hidden" name="sdNumber" value="1"/>
    <input type="submit" value="Rest DELETE"/>
</form>

<!-- rest风格POST 表示添加一条数据-->
<form action="studentController/student" method="post">
    <input type="hidden" name="_method" value="POST"/>
    <input type="hidden" name="sdNumber" value="1"/>
    <input type="submit" value="Rest POST"/>
</form>

<!-- rest风格put 表示获取一条数据-->
<form action="studentController/student/1" method="get">
    <input type="hidden" name="_method" value="GET"/>
    <input type="hidden" name="sdNumber" value="1"/>
    <input type="submit" value="Rest GET"/>
</form>
<a href="studentController/helloWord">studentController</a>
</body>
</html>
