# mybatis-screw

    a screw of mybatis。In fact, my original intention very easy。because old mybatis plus create table is verry-
    head. It makes me sick. Inconvenient to use.so I do mybatis-screw.实现自动建表。

## First

    其实在很早之前，我用过mybatis。但是因为很多CRUD的操作都需要重复的创建语句，占地方不说，还有很多无用且没有意义的操作。
    工作量大的时候，浪费的大量的时间。又不能让你提升自我，这是一件没有意义的事情。
    当然这件事，也有很多人想到了。市面上也有很多，什么通用mapper，mybatis逆向工程。这两个东西我都用过。说实话，很好用。
    但是他们都有一个问题。不能自动建表....
    这无疑让数据库与java程序之间的字段沟通难上加难。且让人头大。有的时候甚至忘记了，为什么创建它，有什么用。
    创建的时候的SQL是啥来着。等等一系列的问题。 之后也用过很多第三方插件。但是吧.... 说实话，体感不是很好。
    因为有时候可能会涉及到更改环境，变更服务器等操作。数据迁移还好说，就怕从头来过。这个是真的伤。
    我之前用过几款比较有意思的应用。nutz、flyway。这两个东西启发了我。一个是基于注解实现自动建表的功能。
    但是他是一个轻量级的持久层组件。我真的很喜欢mybatis。还有flyway。真的蛮好用的，但是对SQL的要求。。。真的。。
    所以基于这两个的启发，我打算自己写一个自动建表的工具，即能使用基于注解的方式创建数据库的表，同时还生成对用的SQL文件。
    并且做到可以自主执行SQL语句，但是又不是一个持久层组件，这样就很好。
    说干就干

## Then
    因为基于MySql适配，所以尽量采用mysql.

## 注解描述
|序号|注解|描述|
| ---- | ---- | ---- |
|1|@column|使用在字段上，用来定义字段及规范|
|      |      ||
|      |      ||

## 注解参数描述

| 大类序号 | 参数      |                                                              |
| -------- | --------- | ------------------------------------------------------------ |
| 1        | name      | 默认值、字段名。可填写可不填写。填写后优先级最后，不填写规则如下。 |
| 1        | establish | 是否创建此字段，默认true。对添加大类注解的字段默认创建库，写为false，不创建。 |
| 1        | hump      | 驼峰，默认true。根据大小写默认匹配驼峰创建，驼峰转移下划线。 |

