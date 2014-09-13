package com.scala.common

trait MineMessage
case class StartMining() extends MineMessage
case class Mine(k:Int,gatorId: String, start: Int, batchSize: Int) extends MineMessage
case class FoundCoin(value: String) extends MineMessage
case class Done(value: Int) extends MineMessage
//Server client
case class StartMiningRemotely(ip:String) extends MineMessage
case class Ready() extends MineMessage
