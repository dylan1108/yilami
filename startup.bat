@echo off
echo ��ǰ�̷�Ϊ: %~d0
echo ��ǰ�̷���·��Ϊ:%~dp0
echo ��ǰ������ȫ·��: %~f0
echo ��ǰ�̷���·���Ķ��ļ�����ʽ: %~sdp0
echo ��ǰ��Ŀ¼: %cd%
echo Ŀ¼���пո�Ҳ���Լ���""�����Ҳ���·��
echo ��ǰ�̷���"%~d0"
echo ��ǰ�̷���·����"%~dp0"
echo ��ǰ������ȫ·����"%~f0"
echo ��ǰ�̷���·���Ķ��ļ�����ʽ��"%~sdp0"
set YILAMI_HOME="%~dp0"
cd %YILAMI_HOME%
echo on
"%JAVA_HOME%\bin\java" -Xms128M -Xmx512M -XX:MaxPermSize=512m -Xdebug -Xnoagent -Djava.compiler=NONE -Xrunjdwp:transport=dt_socket,server=y,suspend=n,address=5005 -jar yilami-0.0.1.jar
echo off
 
