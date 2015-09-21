package com.bzw.chapter11

/**
 * Created by SylarSong on 2015/9/18.
 */
class Money(var doller:Int,var cent:Int) {
  var mDoller:Int=doller
  var mCent:Int=cent

  def +(other:Money): Money ={
    mDoller+=other.doller
    mCent+=other.cent
    if(mCent >= 100){ mDoller+=1;mCent-=100;}  else mCent
    new Money(mDoller,mCent)
  }
  def -(other:Money): Money={
    mDoller-=other.doller
    mCent-=other.cent
    if(mCent<0){mDoller-=1;mCent+=100}else mCent
    new Money(mDoller,mCent)
  }
  def ==(other:Money):Boolean={
    if(other.doller==mDoller&&other.cent==mCent)true
    else false
  }
  def <(other:Money): Boolean ={
    if (mDoller<other.doller)true
    else if (mDoller==other.doller&&mCent<other.cent)true
    else false
  }
  override def toString(): String ={
    "$"+mDoller+"."+mCent
  }

}

object Money extends  App{

  def apply(doller:Int, cent:Int): Money ={
    new Money(doller,cent);
  }

  val b =(Money(1,75)+Money(0,50))==Money(2,25)
  print(b)
}
