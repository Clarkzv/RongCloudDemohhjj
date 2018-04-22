## Q
1. 由于缺少libsqlite.so文件无法正常发送消息，RongIM.connect()无法建立连接
1. Token与userId需要保持一致，不然无法启动服务，之前公司后台给返回的Token有问题（使用测试key，对用户数量有限制，导致token为空）
1. 公司项目由于app module下面也引入了libsqlite.so文件，导致和IMLib下的libsqlite.so文件冲突，7.0以下貌似没有问题，7.0就GG了
