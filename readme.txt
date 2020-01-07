java -jar C:\Learn\jnaerator-0.12-shaded.jar -runtime JNA -structsInLibrary -arch armeabi C:\Learn\libs\armeabi-v7a\libtestC.so C:\Learn\jni\testC.h -mode Jar -jar testC.jar

NAerator 资源下载
上面我们已经知道了JNA的基本用法，但是对于jna的api和C++代码之间的一些类型定义，我们还不是很熟练。怎么办？有没有办法一键生成相应的C++和java的对应关系，这个时候JNAerator就派上用场了。

第一步：下载jar
jnaerator.jar 下载

第二步：使用cmd命令打开JNAerator
java -jar jnaerator-0.12-shaded.jar

第三步：用JNAerator将C++代码生成对应的java代码
————————————————
版权声明：本文为CSDN博主「QQxiaoqiang1573」的原创文章，遵循 CC 4.0 BY-SA 版权协议，转载请附上原文出处链接及本声明。
原文链接：https://blog.csdn.net/QQxiaoqiang1573/article/details/79140068