package com.bzw.chapter12

/**
 * Created by SylarSong on 2015/9/18.
 */
class Chapter12 {

}

object Chapter12 {
  def main(args: Array[String]) {

  }

  //闭包****************************************************************
  //在scala中, 你可以在任何作用域内定义函数:包,类设置另一个函数或方法. 在函数体内,你可以访问到相应作用与内的任何变量.
  //注意: 你的函数可以在变量不在作用域内时被调用
  //例如:
  def mulBy(factor: Double) = (x: Double) => factor * x

  //考虑到如下调用:
  val triple = mulBy(3)
  val half = mulBy(0.5)
  println(triple(5) + " " + half(5))

  //慢动作回放:
  //1 . mulBy首次调用将参数变量factor设为3 .该变量在(x:Double)=>factor*x 函数的函数体内被引用,
  //改函数被引入 triple . 然后参数变量factor从运行时的栈上被弹出
  //2 . 接下来,mulBy再次被调用,这次factor 被设为0.5. 该变量在(x:Double)=>factor*x函数的体内被引用,之后有被存入 half
  //每一个返回的函数都有自己 factor 这样的函数被称做 闭包(closure).


  //柯里化 :currying, 指的是将原来接受两个参数的函数变成新的接受一个参数的函数的过程.
  // 新的函数返回一个以原有第二个参数 作为参数的函数
  //例如:
  def mul(x: Int, y: Int) = x * y

  //以下函数接受一个参数,生成另一个接受单参数的函数
  def mulOnePre(x: Int) = (y: Int) => x * y
  //要计算两个数的乘积 调用:
  mulOnePre(5)(6)
  //慢动作回放: mulOnePre(5)的结果是函数 (y:Int)=>5*y ,而这个函数的y=6 最终得到了 30
  //以下是简写方法
  def mulOnePer(x: Int)(y: Int) = x*y
  
}
