# jdbc-mybatis-jdbc性能对比

##测试环境
阿里云最低配置
1G RAM
2.5 CPU，单核

## 测试说明
获取全部数据，mybatis为200ms以上
jdbc为50毫秒以下。有5倍的性能差距。

## 结论，还是原生的快
