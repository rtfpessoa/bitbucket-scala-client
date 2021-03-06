package com.codacy.client.bitbucket.v1

import play.api.libs.functional.syntax._
import play.api.libs.json._

case class SshKey(pk: Long, key: String, label: String)

object SshKey {
  implicit val reader: Reads[SshKey] = (
    (__ \ "pk").read[Long] and
      (__ \ "key").read[String] and
      (__ \ "label").read[String]
    )(SshKey.apply _)
}
