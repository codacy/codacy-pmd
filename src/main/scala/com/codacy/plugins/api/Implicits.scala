package com.codacy.plugins.api

import com.codacy.plugins.api.results.Parameter
import play.api.libs.json.JsValue

object Implicits {
  implicit def jsValueToParamValue(jsValue: JsValue): Parameter.Value = ParamValue(jsValue)
}
