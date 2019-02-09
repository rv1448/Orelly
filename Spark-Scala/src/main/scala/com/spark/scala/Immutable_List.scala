package com.spark.scala

object Immutable_List {

  def shownames(names:List[String]):Unit = names.foreach( println(_));
  def main(args: Array[String]): Unit = {
//    val names:List[String] = List("jim","mark","scala")
    val names:List[String] = "fred"::"akhil"::"smitha"::"joe"::Nil
//    val names2:List[String] = Nil.::("joe").::("smitha").::("akhil").::("fred")
//    names.foreach(println(_))
//    names2.foreach(println(_))
    val morenames:List[String] = "alice"::"bob"::names

//    Immutable_List.shownames(names)
//    x => x.equals("smitha")
    println(s"names . head : ${names.head}")
    println(s"names . Tail : ${morenames.tail}")
  }
}