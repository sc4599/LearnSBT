package com.bzw.chapter9

import java.io.{PrintWriter, File, FileInputStream}

import com.sun.xml.internal.ws.developer.Serialization

import scala.collection.mutable.ArrayBuffer

/**
 * Created by SylarSong on 2015/9/17.
 */
@SerialVersionUID(42L) class Chapter9 extends Serializable{

}
object Chapter9 extends App{
  import scala.io.Source
  val source=Source.fromFile("d:/test.txt","UTF-8")//第一个参数类型是 java.util.File,第二个参数是 字符编码
  val lineIterator = source.getLines() //返回结果是一个迭代器 , 可以使用他逐条处理数据

  for(l<-lineIterator) l // 此处 l 就是每一行的数据

  //也可以使用 toArray 或者 toBuffer 将他们转化成数组,或数组缓冲
  lineIterator.toArray
  lineIterator.toBuffer

  //或者 想把整个文件读取成一个字符串
  val contents =source.mkString

  //这里有一个快而脏的方法来读取源文件中所有以空格隔开的词法单元:
  val tokens =source.mkString.split("\\s+")

  source.close()// Source 使用完毕后需要关闭, 中java中的流一样

  //*************9.4 从URL或其他源读取
  //Source对象有读取非文件源的方法:
  val source1 = Source.fromURL("http://www.bzw.cn/","UTF-8")//从 URL 读取
  val source2 = Source.fromString("hello world")//从给定的字符串读取
  val source3 =Source.stdin //从标准输入读取

  source1.close();source2.close();source3.close();

  //scala 自身并没有读取二进制的方法
  val file = new File("d:/test.txt")
  val in = new FileInputStream(file)
  val bytes = new Array[Byte](file.length.toInt)
  in.read(bytes)
  in.close()

  //写入文本文件
  val out = new PrintWriter("e:/baa.txt")
  for(i<- 101 to 111)out.append(i.toString)
  out.close();

  //9.8 序列化
  //@SerialVersionUID(42L) class Chapter9 extends Serializable{...}
  //scala 的集合类 都是可序列化的,因此你可以把 他们用作可序列化成员


//  println(source.mkString)


}