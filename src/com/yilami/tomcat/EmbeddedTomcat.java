package com.yilami.tomcat;

import java.io.File;

import org.apache.catalina.Context;
import org.apache.catalina.Engine;
import org.apache.catalina.Host;
import org.apache.catalina.connector.Connector;
import org.apache.catalina.core.AprLifecycleListener;
import org.apache.catalina.startup.Embedded;

public class EmbeddedTomcat {  
    private static String CONTEXT_PATH = "/yilami";  
    private static String PROJECT_PATH = "K:\\workspace\\yilami\\trunk\\";
    		//System.getProperty("user.dir");  
    private static String WEB_APP_PATH = PROJECT_PATH + File.separatorChar + "webroot";  
    private static String TOMCAT_HOME = PROJECT_PATH + File.separatorChar + "Embedded" + File.separatorChar + "tomcat";  
    private static String ENCODING = "UTF-8";  
    private static int TOMCAT_PORT = 9080;  
  
    // 开始嵌入式Tomcat服务器  
    public static void startTomcat() throws Exception {  
        try {  
            long startTime = System.currentTimeMillis();  
            Embedded tomcat = new Embedded();  
            // 设置Tomcat的工作目录:工程根目录/Embedded/Tomcat  
            tomcat.setCatalinaHome(TOMCAT_HOME);  
            System.out.println("TOMCAT_HOME:" + TOMCAT_HOME);  
              
            // 产生Tomcat引擎  
            Engine engine = tomcat.createEngine();  
            //"localhost"对应的是work下的"Catalina"  
            engine.setName("Catalina");  
              
            //创建Host，设置Host的工作目录  
            Host host = tomcat.createHost("localhost", tomcat.getCatalinaHome());  
            host.setAutoDeploy(true);  
              
            //把Host加入Engine  
            engine.addChild(host);  
            engine.setDefaultHost(host.getName());  
              
            //创建Context，并加入Host中  
            Context context = null;  
            context = tomcat.createContext(CONTEXT_PATH, WEB_APP_PATH);  
              
            host.addChild(context);  
            host.addChild(tomcat.createContext("", ""));  
            if (!new File(WEB_APP_PATH).exists()) {  
                System.err.println("请检查应用的目录以及相关资源是否存在.");  
            }  
            tomcat.addEngine(engine);  
              
            Connector connector = tomcat.createConnector((java.net.InetAddress) null, TOMCAT_PORT, false);  
            connector.setURIEncoding(ENCODING);  
            connector.setUseBodyEncodingForURI(true);  
            tomcat.addConnector(connector);  
            AprLifecycleListener listener = new AprLifecycleListener();  
            tomcat.addLifecycleListener(listener);  
            tomcat.start();  
            //停住一个小时(3600秒)  
            Thread.sleep(3600000);  
            tomcat.stop();  
            System.err.println("Tomcat started in " + (System.currentTimeMillis() - startTime) + " ms.");  
        } catch (Exception e) {  
            e.printStackTrace();  
        }  
    }  
      
    public static void main(String[] args) {  
        try {  
            EmbeddedTomcat.startTomcat();  
        } catch (Exception e) {  
            e.printStackTrace();  
        }   
    }  
  
  
}