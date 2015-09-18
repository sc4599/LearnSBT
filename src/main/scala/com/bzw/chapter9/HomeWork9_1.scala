package com.bzw.chapter9

import java.io.PrintWriter

/**
 * Created by SylarSong on 2015/9/17.
 */
class HomeWork9_1 {


}
object HomeWork9_1 extends App{
  import io.Source
  val source = Source.fromFile("e:/baa.txt","UTF-8")
  val ls=source.getLines().toArray
  for(l<-ls reverse)println(l.mkString(","))
  source.close()
  //3.编写 scala代码,从test.txt文件读取内容,并将所有字符大于等于11的单词打印到控制台,(要求单行代码完成)
  for(s<-Source.fromFile("d:/test.txt","UTF-8").mkString.split("\\s+") if s.length>=11)println(s)

  //4 编写Scala程序，从包含浮点数的文本文件读取内容，打印出文件中所有浮点数之和，平均值，最大值和最小值
  val source4 = Source.fromFile("test.txt","UTF-8")
  val elems = source4.mkString.split("\\s+")
  val nums = for(e<-elems if e.matches("""^\d+\.\d+$"""))yield e.toFloat
  if (!nums.isEmpty){
    println("max="+nums.max)
    println("min="+nums.min)
    println("sum="+nums.sum)
    println("avg="+nums.sum/nums.length)
  }else{
    println("文件中没有浮点数")
  }
  source4.close()
  //5 编写Scala程序，向文件中写入2的n次方及其倒数，指数n从0到20。对齐各列:
  val out= new PrintWriter("num.txt")
  for(i<-0 to 20 ) {
    out.print(math.pow(2,i))
    out.print(" "*(math.pow(2,20).toString.length-math.pow(2,i).toString.length)+"\t")
    out.println(1/math.pow(2,i))
  }
  out.close()

  //6  编写正则表达式,匹配Java或C++程序代码中类似"like this,maybe with \" or\\"这样的带引号的字符串。编写Scala程序将某个源文件中所有类似的字符串打印出来
  import io.Source

  val source6 = Source.fromFile("test.txt").mkString

  val pattern = "\\w+\\s+\"".r

  pattern.findAllIn(source6).foreach(println)

  //8
  val source8 = Source.fromURL("http://www.bzw.cn/","UTF-8").mkString//从 URL 读取
  val pattern8 = """/<img[^>]*\>/""".r

  for (pattern(str) <- pattern8.findAllIn(source8)) println(str)


  //9
  //10
}
