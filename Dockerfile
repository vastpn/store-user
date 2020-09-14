##定义镜像的起始内容 基础镜像
FROM registry.cn-hangzhou.aliyuncs.com/jvv-prod-hub/alpine-java8-utc8-chinese:0.1.1

# 工作目录
WORKDIR /home

# 将项目添加到镜像的根目录, 保持 app.js 这个文件名
ADD ./target/store-user-prod.jar app.jar

# 添加配置文件
ENV CONFIG_ENV="prod"
# EXPOSE 8080

# 数据卷
VOLUME ["/home"]
# 解决 阿里云的tomcat启动慢的问题 -Djava.security.egd=file:/dev/./urandom
# 以 application.properties 配置文件 启动项目

ENTRYPOINT ["/bin/sh","-c","java -d64 -server -XX:+AggressiveOpts -XX:+UseLargePages -Xms4g -Xmx4g -Xmn2g -Xss512k -XX:MetaspaceSize=128m -XX:MaxMetaspaceSize=128m -XX:SurvivorRatio=38 -XX:MaxDirectMemorySize=1g -XX:+UseBiasedLocking -XX:+UseFastAccessorMethods -XX:+ParallelRefProcEnabled -XX:SoftRefLRUPolicyMSPerMB=10000 -XX:TargetSurvivorRatio=80 -XX:MaxTenuringThreshold=15 -XX:-UseAdaptiveSizePolicy -XX:+UseParallelGC -XX:ParallelGCThreads=8 -XX:+UseParallelOldGC -XX:+PrintGCDetails -XX:+PrintGCDateStamps -jar app.jar -Djava.security.egd=file:/dev/./urandom --spring.profiles.active=${CONFIG_ENV}"]