package io.yard.common.utils

object Numbers {
  def isAllDigits(value: String) = value forall Character.isDigit
}
