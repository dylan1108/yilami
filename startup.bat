@echo off
echo 当前盘符为: %~d0
echo 当前盘符和路径为:%~dp0
echo 当前批处理全路径: %~f0
echo 当前盘符和路径的短文件名格式: %~sdp0
echo 当前的目录: %cd%
echo 目录中有空格也可以加入""避免找不到路径
echo 当前盘符："%~d0"
echo 当前盘符和路径："%~dp0"
echo 当前批处理全路径："%~f0"
echo 当前盘符和路径的短文件名格式："%~sdp0"
set YILAMI_HOME="%~dp0"
cd %YILAMI_HOME%
echo on
"%JAVA_HOME%\bin\java" -Xms128M -Xmx512M -XX:MaxPermSize=512m -Xdebug -Xnoagent -Djava.compiler=NONE -Xrunjdwp:transport=dt_socket,server=y,suspend=n,address=5005 -jar yilami-0.0.1.jar
echo off
 
