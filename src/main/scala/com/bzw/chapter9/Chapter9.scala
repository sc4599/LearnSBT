package com.bzw.chapter9

/**
 * Created by SylarSong on 2015/9/17.
 */
class Chapter9 {

}
object Chapter9 extends App{
  import scala.io.Source
  val source=Source.fromFile("d:/test.txt","utf-8")//��һ������������ java.util.File,�ڶ��������� �ַ�����
  val lineIterator = source.getLines() //���ؽ����һ�������� , ����ʹ����������������

  println(source.mkString)
}
