package com.bzw.chapter14

/**
 * Created by SylarSong on 2015/9/19.
 */
class Chapter14 {

}

object Chapter14{
  //通过匹配模式将变量绑定到列表或元组的不同部分，由于这样的绑定可以让你轻松的访问各种复杂结构的各组成部分，
  //因此这样的操作被称为“析构”
  def matchArr(arr:Array[Int]): Unit = {
    arr match {
      case Array(0) => "0" //匹配含0的数组
      case Array(x, y) => x + "  " + y //匹配任何带两个元素的数组，并将这两个元素分别绑定到变量x和y
      case Array(0, _*) => "0 ..." //匹配任何由0开始的数组
      case _ => "something else" //与default 等效
    }
  }
  def matchList(lst:List[Int]): Unit ={
    lst match{
      case 0 ::Nil=>"0"
      case x :: y:: Nil=> x + "  " + y
      case 0 ::tail =>"0 ..."
      case _ => "something else"
    }
  }


  def main(args: Array[String]) {
    val arr= Array(2,3,5,6,7)
    println(Array.unapplySeq(arr))
  }

}
