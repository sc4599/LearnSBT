package com.bzw.chapter13

/**
 * Created by SylarSong on 2015/9/19.
 */
class Chapter13 {

}
object Chapter13{
  //计算某个字符串中 每个字母出现的频率 方法1使用循环+映射 方法2 使用foldLeft操作。
  val s = "HolleWorldScala"
  var chatMap = collection.mutable.Map[Char,Int]();
  for(c<-s){
    chatMap(c) = chatMap.getOrElse(c,0)+1
  }
  println(chatMap.mkString(","))

  var a =(Map[Char,Int]() /: s){
    (m,c)=>m+(c -> (m.getOrElse(c,0)+1))
  }
  println(a)
  chatMap = collection.mutable.Map[Char,Int]();
  val f=s.foldLeft(chatMap)((m,c)=>m+(c -> (m.getOrElse(c,0)+1)))
  println(f)


  var b= s.foreach(print)
  println(b)

  def main(args: Array[String]) {

  }
}
