package services

import javax.inject.Inject


import models.{Login}
import play.api.cache.CacheApi

class CacheService @Inject()(cache: CacheApi)  {



   def write(user: Login): String = {
     Console.println("Write data to cache")
    cache.set(user.id, user)
    cache.get[List[String]]("userList").fold{
      cache.set("userList",List(user.id))
      user.id
    }{ list =>

      val output: List[String] = readAll().map(x=>x.id)
      val updatedList =  user.id :: output
      cache.remove("userList")
      cache.set("userList", updatedList)
      Console.println("Write cache User created " + updatedList);
      user.id
    }
  }


  def readAll(): List[Login] = {
    val output: Option[List[String]] = cache.get[List[String]]("userList")
    Console.println("List Data : "+output)
    output match {
      case None => throw new Exception("No user")
      case Some(userData) => userData.distinct.map(x => read(x))
    }
  }

  def read(key: String): Login = {
    val output: Option[Login] = cache.get[Login](key)
    output match {
      case None => throw new Exception("no User")
      case Some(user) => user
    }
  }
   def remove(key:String):String={
    cache.remove(key)
    key+"removed"
  }

   def update(updatedUser:Login):String={
    val user:Login=read(updatedUser.id)
    remove(user.id)
    write(updatedUser)
    updatedUser.id
  }
  def contains(key:String):Boolean ={
    val output: Option[Login] = cache.get[Login](key)
    output match {
      case Some(x) =>true
      case None => false
    }
  }
}
