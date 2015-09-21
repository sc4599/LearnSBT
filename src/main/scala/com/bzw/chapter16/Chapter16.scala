package com.bzw.chapter16

/**
 * Created by SylarSong on 2015/9/21.
 */
class Chapter16 {
  //16.3 元素属性
  var a = <ul>{for(i<-0 to 10 )yield <li>{i}</li>}</ul>
//  val elem = <a href="http://www.baidu.com/">this is baidu</a>
//  println(elem)
  println(a)
}

object Chapter16{


  def main(args: Array[String]) {

  }
}
