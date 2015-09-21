package com.bzw.chapter11

/**
 * Created by SylarSong on 2015/9/18.
 */
object Test {
  def main(args: Array[String]) {

    val str=
      """Table()|"Java"| "Scala"||"Gosling"|"Odersky"||"JVM"|"JVM,.NET|"
      """.stripMargin
    println(new Table()|"java")
  }
}
