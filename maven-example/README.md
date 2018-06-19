一定要把setting.xml放到.m2下面，不是在项目的根目录，是在maven的根目录，不然会一直401....

like this.

```
SENRSL_MAC:~ XXX$ ls .m2/
repository	settings.xml
SENRSL_MAC:~ XXX$ 
```

eclipse 上的配置部署，新建一个Run config,执行命令clean deploy，运行就ok....
![eclipse config](https://github.com/senRsl/bintray-examples/raw/master/doc/deploy.png)

终于看到了成功

```
[INFO] Scanning for projects...
[INFO] ------------------------------------------------------------------------
[INFO] Reactor Build Order:
[INFO] 
[INFO] Multi Modules Build Using Bintray.com
[INFO] Multi 1
[INFO] Multi 2
[INFO] Multi 3
[INFO]                                                                         
[INFO] ------------------------------------------------------------------------
[INFO] Building Multi Modules Build Using Bintray.com 1.0
[INFO] ------------------------------------------------------------------------
[INFO] 
[INFO] --- maven-clean-plugin:2.5:clean (default-clean) @ multi ---
[INFO] 
[INFO] --- maven-install-plugin:2.4:install (default-install) @ multi ---
[INFO] Installing /Users/zhaoyuming/android/eclipse-workspace/bintray-examples/maven-example/pom.xml to /Users/zhaoyuming/.m2/repository/org/jfrog/example/bintray/maven/multi/1.0/multi-1.0.pom
[INFO] 
[INFO] --- maven-deploy-plugin:2.7:deploy (default-deploy) @ multi ---
[INFO] Uploading: https://api.bintray.com/maven/senrsl/tt/tttttt/;publish=1/org/jfrog/example/bintray/maven/multi/1.0/multi-1.0.pom
[INFO] Uploaded: https://api.bintray.com/maven/senrsl/tt/tttttt/;publish=1/org/jfrog/example/bintray/maven/multi/1.0/multi-1.0.pom (4 KB at 1.2 KB/sec)
[INFO] Downloading: https://api.bintray.com/maven/senrsl/tt/tttttt/;publish=1/org/jfrog/example/bintray/maven/multi/maven-metadata.xml
[INFO] Uploading: https://api.bintray.com/maven/senrsl/tt/tttttt/;publish=1/org/jfrog/example/bintray/maven/multi/maven-metadata.xml
[INFO] Uploaded: https://api.bintray.com/maven/senrsl/tt/tttttt/;publish=1/org/jfrog/example/bintray/maven/multi/maven-metadata.xml (312 B at 0.3 KB/sec)
[INFO]                                                                         
[INFO] ------------------------------------------------------------------------
[INFO] Building Multi 1 1.0
[INFO] ------------------------------------------------------------------------
[INFO] 
[INFO] --- maven-clean-plugin:2.5:clean (default-clean) @ multi1 ---
[INFO] Deleting /Users/zhaoyuming/android/eclipse-workspace/bintray-examples/maven-example/multi1/target
[INFO] 
[INFO] --- maven-resources-plugin:2.6:resources (default-resources) @ multi1 ---
[INFO] Using 'UTF-8' encoding to copy filtered resources.
[INFO] skip non existing resourceDirectory /Users/zhaoyuming/android/eclipse-workspace/bintray-examples/maven-example/multi1/src/main/resources
[INFO] 
[INFO] --- maven-compiler-plugin:3.1:compile (default-compile) @ multi1 ---
[INFO] Changes detected - recompiling the module!
[INFO] Compiling 1 source file to /Users/zhaoyuming/android/eclipse-workspace/bintray-examples/maven-example/multi1/target/classes
[WARNING] 读取/Users/zhaoyuming/.m2/repository/org/springframework/spring-beans/2.5.6/spring-beans-2.5.6.jar时出错; invalid LOC header (bad signature)
[INFO] 
[INFO] --- maven-resources-plugin:2.6:testResources (default-testResources) @ multi1 ---
[INFO] Using 'UTF-8' encoding to copy filtered resources.
[INFO] skip non existing resourceDirectory /Users/zhaoyuming/android/eclipse-workspace/bintray-examples/maven-example/multi1/src/test/resources
[INFO] 
[INFO] --- maven-compiler-plugin:3.1:testCompile (default-testCompile) @ multi1 ---
[INFO] Changes detected - recompiling the module!
[INFO] Compiling 1 source file to /Users/zhaoyuming/android/eclipse-workspace/bintray-examples/maven-example/multi1/target/test-classes
[WARNING] 读取/Users/zhaoyuming/.m2/repository/org/springframework/spring-beans/2.5.6/spring-beans-2.5.6.jar时出错; invalid LOC header (bad signature)
[INFO] 
[INFO] --- maven-surefire-plugin:2.12.4:test (default-test) @ multi1 ---
[INFO] Surefire report directory: /Users/zhaoyuming/android/eclipse-workspace/bintray-examples/maven-example/multi1/target/surefire-reports

-------------------------------------------------------
 T E S T S
-------------------------------------------------------
Running artifactory.test.AppTest
Configuring TestNG with: org.apache.maven.surefire.testng.conf.TestNGMapConfigurator@25f38edc
Tests run: 0, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.288 sec

Results :

Tests run: 0, Failures: 0, Errors: 0, Skipped: 0

[INFO] 
[INFO] --- maven-jar-plugin:2.3.2:jar (default-jar) @ multi1 ---
[INFO] Building jar: /Users/zhaoyuming/android/eclipse-workspace/bintray-examples/maven-example/multi1/target/multi1-1.0.jar
[INFO] 
[INFO] >>> maven-source-plugin:2.1.2:jar (attach-sources) > generate-sources @ multi1 >>>
[INFO] 
[INFO] <<< maven-source-plugin:2.1.2:jar (attach-sources) < generate-sources @ multi1 <<<
[INFO] 
[INFO] --- maven-source-plugin:2.1.2:jar (attach-sources) @ multi1 ---
[INFO] Building jar: /Users/zhaoyuming/android/eclipse-workspace/bintray-examples/maven-example/multi1/target/multi1-1.0-sources.jar
[INFO] 
[INFO] --- maven-jar-plugin:2.3.2:test-jar (default) @ multi1 ---
[INFO] Building jar: /Users/zhaoyuming/android/eclipse-workspace/bintray-examples/maven-example/multi1/target/multi1-1.0-tests.jar
[INFO] 
[INFO] --- maven-install-plugin:2.4:install (default-install) @ multi1 ---
[INFO] Installing /Users/zhaoyuming/android/eclipse-workspace/bintray-examples/maven-example/multi1/target/multi1-1.0.jar to /Users/zhaoyuming/.m2/repository/org/jfrog/example/bintray/maven/multi1/1.0/multi1-1.0.jar
[INFO] Installing /Users/zhaoyuming/android/eclipse-workspace/bintray-examples/maven-example/multi1/pom.xml to /Users/zhaoyuming/.m2/repository/org/jfrog/example/bintray/maven/multi1/1.0/multi1-1.0.pom
[INFO] Installing /Users/zhaoyuming/android/eclipse-workspace/bintray-examples/maven-example/multi1/target/multi1-1.0-sources.jar to /Users/zhaoyuming/.m2/repository/org/jfrog/example/bintray/maven/multi1/1.0/multi1-1.0-sources.jar
[INFO] Installing /Users/zhaoyuming/android/eclipse-workspace/bintray-examples/maven-example/multi1/target/multi1-1.0-tests.jar to /Users/zhaoyuming/.m2/repository/org/jfrog/example/bintray/maven/multi1/1.0/multi1-1.0-tests.jar
[INFO] 
[INFO] --- maven-deploy-plugin:2.7:deploy (default-deploy) @ multi1 ---
[INFO] Uploading: https://api.bintray.com/maven/senrsl/tt/tttttt/;publish=1/org/jfrog/example/bintray/maven/multi1/1.0/multi1-1.0.jar
[INFO] Uploaded: https://api.bintray.com/maven/senrsl/tt/tttttt/;publish=1/org/jfrog/example/bintray/maven/multi1/1.0/multi1-1.0.jar (3 KB at 2.9 KB/sec)
[INFO] Uploading: https://api.bintray.com/maven/senrsl/tt/tttttt/;publish=1/org/jfrog/example/bintray/maven/multi1/1.0/multi1-1.0.pom
[INFO] Uploaded: https://api.bintray.com/maven/senrsl/tt/tttttt/;publish=1/org/jfrog/example/bintray/maven/multi1/1.0/multi1-1.0.pom (3 KB at 2.6 KB/sec)
[INFO] Downloading: https://api.bintray.com/maven/senrsl/tt/tttttt/;publish=1/org/jfrog/example/bintray/maven/multi1/maven-metadata.xml
[INFO] Uploading: https://api.bintray.com/maven/senrsl/tt/tttttt/;publish=1/org/jfrog/example/bintray/maven/multi1/maven-metadata.xml
[INFO] Uploaded: https://api.bintray.com/maven/senrsl/tt/tttttt/;publish=1/org/jfrog/example/bintray/maven/multi1/maven-metadata.xml (313 B at 0.3 KB/sec)
[INFO] Uploading: https://api.bintray.com/maven/senrsl/tt/tttttt/;publish=1/org/jfrog/example/bintray/maven/multi1/1.0/multi1-1.0-sources.jar
[INFO] Uploaded: https://api.bintray.com/maven/senrsl/tt/tttttt/;publish=1/org/jfrog/example/bintray/maven/multi1/1.0/multi1-1.0-sources.jar (819 B at 0.8 KB/sec)
[INFO] Uploading: https://api.bintray.com/maven/senrsl/tt/tttttt/;publish=1/org/jfrog/example/bintray/maven/multi1/1.0/multi1-1.0-tests.jar
[INFO] Uploaded: https://api.bintray.com/maven/senrsl/tt/tttttt/;publish=1/org/jfrog/example/bintray/maven/multi1/1.0/multi1-1.0-tests.jar (3 KB at 2.6 KB/sec)
[INFO]                                                                         
[INFO] ------------------------------------------------------------------------
[INFO] Building Multi 2 1.0
[INFO] ------------------------------------------------------------------------
[INFO] 
[INFO] --- maven-clean-plugin:2.5:clean (default-clean) @ multi2 ---
[INFO] Deleting /Users/zhaoyuming/android/eclipse-workspace/bintray-examples/maven-example/multi2/target
[INFO] 
[INFO] --- maven-resources-plugin:2.6:resources (default-resources) @ multi2 ---
[INFO] Using 'UTF-8' encoding to copy filtered resources.
[INFO] skip non existing resourceDirectory /Users/zhaoyuming/android/eclipse-workspace/bintray-examples/maven-example/multi2/src/main/resources
[INFO] 
[INFO] --- maven-compiler-plugin:3.1:compile (default-compile) @ multi2 ---
[INFO] Changes detected - recompiling the module!
[INFO] Compiling 1 source file to /Users/zhaoyuming/android/eclipse-workspace/bintray-examples/maven-example/multi2/target/classes
[INFO] 
[INFO] --- maven-resources-plugin:2.6:testResources (default-testResources) @ multi2 ---
[INFO] Using 'UTF-8' encoding to copy filtered resources.
[INFO] skip non existing resourceDirectory /Users/zhaoyuming/android/eclipse-workspace/bintray-examples/maven-example/multi2/src/test/resources
[INFO] 
[INFO] --- maven-compiler-plugin:3.1:testCompile (default-testCompile) @ multi2 ---
[INFO] Changes detected - recompiling the module!
[INFO] Compiling 1 source file to /Users/zhaoyuming/android/eclipse-workspace/bintray-examples/maven-example/multi2/target/test-classes
[INFO] 
[INFO] --- maven-surefire-plugin:2.12.4:test (default-test) @ multi2 ---
[INFO] Surefire report directory: /Users/zhaoyuming/android/eclipse-workspace/bintray-examples/maven-example/multi2/target/surefire-reports

-------------------------------------------------------
 T E S T S
-------------------------------------------------------
Running artifactory.test.AppTest
Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.053 sec

Results :

Tests run: 1, Failures: 0, Errors: 0, Skipped: 0

[INFO] 
[INFO] --- maven-jar-plugin:2.3.2:jar (default-jar) @ multi2 ---
[INFO] Building jar: /Users/zhaoyuming/android/eclipse-workspace/bintray-examples/maven-example/multi2/target/multi2-1.0.jar
[INFO] 
[INFO] --- maven-install-plugin:2.4:install (default-install) @ multi2 ---
[INFO] Installing /Users/zhaoyuming/android/eclipse-workspace/bintray-examples/maven-example/multi2/target/multi2-1.0.jar to /Users/zhaoyuming/.m2/repository/org/jfrog/example/bintray/maven/multi2/1.0/multi2-1.0.jar
[INFO] Installing /Users/zhaoyuming/android/eclipse-workspace/bintray-examples/maven-example/multi2/pom.xml to /Users/zhaoyuming/.m2/repository/org/jfrog/example/bintray/maven/multi2/1.0/multi2-1.0.pom
[INFO] 
[INFO] --- maven-deploy-plugin:2.7:deploy (default-deploy) @ multi2 ---
[INFO] Uploading: https://api.bintray.com/maven/senrsl/tt/tttttt/;publish=1/org/jfrog/example/bintray/maven/multi2/1.0/multi2-1.0.jar
[INFO] Uploaded: https://api.bintray.com/maven/senrsl/tt/tttttt/;publish=1/org/jfrog/example/bintray/maven/multi2/1.0/multi2-1.0.jar (3 KB at 2.2 KB/sec)
[INFO] Uploading: https://api.bintray.com/maven/senrsl/tt/tttttt/;publish=1/org/jfrog/example/bintray/maven/multi2/1.0/multi2-1.0.pom
[INFO] Uploaded: https://api.bintray.com/maven/senrsl/tt/tttttt/;publish=1/org/jfrog/example/bintray/maven/multi2/1.0/multi2-1.0.pom (966 B at 0.9 KB/sec)
[INFO] Downloading: https://api.bintray.com/maven/senrsl/tt/tttttt/;publish=1/org/jfrog/example/bintray/maven/multi2/maven-metadata.xml
[INFO] Uploading: https://api.bintray.com/maven/senrsl/tt/tttttt/;publish=1/org/jfrog/example/bintray/maven/multi2/maven-metadata.xml
[INFO] Uploaded: https://api.bintray.com/maven/senrsl/tt/tttttt/;publish=1/org/jfrog/example/bintray/maven/multi2/maven-metadata.xml (313 B at 0.2 KB/sec)
[INFO]                                                                         
[INFO] ------------------------------------------------------------------------
[INFO] Building Multi 3 1.0
[INFO] ------------------------------------------------------------------------
[INFO] 
[INFO] --- maven-clean-plugin:2.5:clean (default-clean) @ multi3 ---
[INFO] Deleting /Users/zhaoyuming/android/eclipse-workspace/bintray-examples/maven-example/multi3/target
[INFO] 
[INFO] --- maven-resources-plugin:2.6:resources (default-resources) @ multi3 ---
[INFO] Using 'UTF-8' encoding to copy filtered resources.
[INFO] skip non existing resourceDirectory /Users/zhaoyuming/android/eclipse-workspace/bintray-examples/maven-example/multi3/src/main/resources
[INFO] 
[INFO] --- maven-compiler-plugin:3.1:compile (default-compile) @ multi3 ---
[INFO] Changes detected - recompiling the module!
[INFO] Compiling 1 source file to /Users/zhaoyuming/android/eclipse-workspace/bintray-examples/maven-example/multi3/target/classes
[WARNING] 读取/Users/zhaoyuming/.m2/repository/org/springframework/spring-beans/2.5.6/spring-beans-2.5.6.jar时出错; invalid LOC header (bad signature)
[INFO] 
[INFO] --- maven-resources-plugin:2.6:testResources (default-testResources) @ multi3 ---
[INFO] Using 'UTF-8' encoding to copy filtered resources.
[INFO] skip non existing resourceDirectory /Users/zhaoyuming/android/eclipse-workspace/bintray-examples/maven-example/multi3/src/test/resources
[INFO] 
[INFO] --- maven-compiler-plugin:3.1:testCompile (default-testCompile) @ multi3 ---
[INFO] Changes detected - recompiling the module!
[INFO] Compiling 1 source file to /Users/zhaoyuming/android/eclipse-workspace/bintray-examples/maven-example/multi3/target/test-classes
[WARNING] 读取/Users/zhaoyuming/.m2/repository/org/springframework/spring-beans/2.5.6/spring-beans-2.5.6.jar时出错; invalid LOC header (bad signature)
[INFO] 
[INFO] --- maven-surefire-plugin:2.12.4:test (default-test) @ multi3 ---
[INFO] Surefire report directory: /Users/zhaoyuming/android/eclipse-workspace/bintray-examples/maven-example/multi3/target/surefire-reports

-------------------------------------------------------
 T E S T S
-------------------------------------------------------
Running artifactory.test.AppTest
Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.04 sec

Results :

Tests run: 1, Failures: 0, Errors: 0, Skipped: 0

[INFO] 
[INFO] --- maven-war-plugin:2.2:war (default-war) @ multi3 ---
[INFO] Packaging webapp
[INFO] Assembling webapp [multi3] in [/Users/zhaoyuming/android/eclipse-workspace/bintray-examples/maven-example/multi3/target/multi3-1.0]
[INFO] Processing war project
[INFO] Copying webapp resources [/Users/zhaoyuming/android/eclipse-workspace/bintray-examples/maven-example/multi3/src/main/webapp]
[INFO] Webapp assembled in [98 msecs]
[INFO] Building war: /Users/zhaoyuming/android/eclipse-workspace/bintray-examples/maven-example/multi3/target/multi3-1.0.war
[INFO] WEB-INF/web.xml already added, skipping
[INFO] 
[INFO] --- maven-install-plugin:2.4:install (default-install) @ multi3 ---
[INFO] Installing /Users/zhaoyuming/android/eclipse-workspace/bintray-examples/maven-example/multi3/target/multi3-1.0.war to /Users/zhaoyuming/.m2/repository/org/jfrog/example/bintray/maven/multi3/1.0/multi3-1.0.war
[INFO] Installing /Users/zhaoyuming/android/eclipse-workspace/bintray-examples/maven-example/multi3/pom.xml to /Users/zhaoyuming/.m2/repository/org/jfrog/example/bintray/maven/multi3/1.0/multi3-1.0.pom
[INFO] 
[INFO] --- maven-deploy-plugin:2.7:deploy (default-deploy) @ multi3 ---
[INFO] Uploading: https://api.bintray.com/maven/senrsl/tt/tttttt/;publish=1/org/jfrog/example/bintray/maven/multi3/1.0/multi3-1.0.war
[INFO] Uploaded: https://api.bintray.com/maven/senrsl/tt/tttttt/;publish=1/org/jfrog/example/bintray/maven/multi3/1.0/multi3-1.0.war (2511 KB at 516.6 KB/sec)
[INFO] Uploading: https://api.bintray.com/maven/senrsl/tt/tttttt/;publish=1/org/jfrog/example/bintray/maven/multi3/1.0/multi3-1.0.pom
[INFO] Uploaded: https://api.bintray.com/maven/senrsl/tt/tttttt/;publish=1/org/jfrog/example/bintray/maven/multi3/1.0/multi3-1.0.pom (3 KB at 2.2 KB/sec)
[INFO] Downloading: https://api.bintray.com/maven/senrsl/tt/tttttt/;publish=1/org/jfrog/example/bintray/maven/multi3/maven-metadata.xml
[INFO] Uploading: https://api.bintray.com/maven/senrsl/tt/tttttt/;publish=1/org/jfrog/example/bintray/maven/multi3/maven-metadata.xml
[INFO] Uploaded: https://api.bintray.com/maven/senrsl/tt/tttttt/;publish=1/org/jfrog/example/bintray/maven/multi3/maven-metadata.xml (313 B at 0.3 KB/sec)
[INFO] ------------------------------------------------------------------------
[INFO] Reactor Summary:
[INFO] 
[INFO] Multi Modules Build Using Bintray.com .............. SUCCESS [  9.952 s]
[INFO] Multi 1 ............................................ SUCCESS [ 18.854 s]
[INFO] Multi 2 ............................................ SUCCESS [ 10.137 s]
[INFO] Multi 3 ............................................ SUCCESS [ 14.132 s]
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time: 53.245 s
[INFO] Finished at: 2018-06-19T10:21:25+08:00
[INFO] Final Memory: 27M/297M
[INFO] ------------------------------------------------------------------------
```

这标签真难用。。。。
