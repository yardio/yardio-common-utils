package io.yard.common.utils

import play.api.Logger
import play.api.libs.json._

trait Log {
  def logger: Logger

  def initLogger(name: String): Logger = Logger(name)

  def trace(msg: String) = logger.trace(msg)
  def trace(errors: Seq[(JsPath, Seq[play.api.data.validation.ValidationError])]) =
    logger.trace(Json.prettyPrint(JsError.toFlatJson(errors)))

  def debugStart(sectionName: String) = logger.debug(s"-------------------- ${sectionName} -----------------------")
  def debugEnd = logger.debug("------------------------------------------------------")
  def debug(msg: String) = logger.debug(msg)
  def debug(errors: Seq[(JsPath, Seq[play.api.data.validation.ValidationError])]) =
    logger.debug(Json.prettyPrint(JsError.toFlatJson(errors)))

  def info(msg: String) = logger.info(msg)
  def warn(msg: String) = logger.warn(msg)
}
