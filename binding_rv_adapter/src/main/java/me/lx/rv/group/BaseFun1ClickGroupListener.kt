package me.lx.rv.group

/**
 *  author: luoXiong
 *  e-mail: 382060748@qq.com
 *  date: 2019/9/25 17:24
 *  version: 1.0
 *  desc: 分组列表的点击事件,只有1个参数
 *  */
abstract class BaseFun1ClickGroupListener<G> : ClickGroupListener {
    abstract fun clickGroup(group: G)
}