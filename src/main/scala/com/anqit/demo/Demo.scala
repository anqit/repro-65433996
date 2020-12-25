package com.anqit.demo

import slick.jdbc.PostgresProfile.api._

object Demo {
    case class User(name: String, email: String, phone: String, id: Option[Int] = None)
    case class LiftedUser(name: Rep[String], email: Rep[String], phone: Rep[String], id: Rep[Option[Int]])
    implicit object UserShape extends CaseClassShape(LiftedUser.tupled, User.tupled)

}
