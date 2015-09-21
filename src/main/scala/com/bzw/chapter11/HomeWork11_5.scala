package com.bzw.chapter11

/**
 * Created by SylarSong on 2015/9/18.
 */
class Table {
  var s:String=""

  override def toString: String ={
    "<Table><tr>"+s+"</tr></Table>"
  }
  def |(str:String):Table={
    val t = Table()
    t.s = this.s + "<td>" + str + "</td>"
    t
  }
  def ||(str:String): Table ={
    val t=Table()
    t.s = this.s+"</tr><td>"+str+"</td>"
    t
  }
}
object Table{
  def apply(): Table ={
    new Table()
  }

  def main(args: Array[String]) {
    val html = Table()|"java"|"Scala"||"javaScript"|".net"||"HTML5"
    print(html)
  }

}
