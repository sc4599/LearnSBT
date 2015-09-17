package com.bzw.chapter9

/**
 * Created by SylarSong on 2015/9/17.
 */
class Chapter9 {

}
object Chapter9 extends App{
  import scala.io.Source
  val source=Source.fromFile("d:/test.txt","utf-8")//第一个参数类型是 java.util.File,第二个参数是 字符编码
  val lineIterator = source.getLines() //返回结果是一个迭代器 , 可以使用他逐条处理数据

  println(source.mkString)
}
