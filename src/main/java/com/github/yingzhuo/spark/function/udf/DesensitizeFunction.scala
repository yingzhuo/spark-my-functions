/* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
 ____                   _      __  __         _____                 _   _
/ ___| _ __   __ _ _ __| | __ |  \/  |_   _  |  ___|   _ _ __   ___| |_(_) ___  _ __  ___
\___ \| '_ \ / _` | '__| |/ / | |\/| | | | | | |_ | | | | '_ \ / __| __| |/ _ \| '_ \/ __|
 ___) | |_) | (_| | |  |   <  | |  | | |_| | |  _|| |_| | | | | (__| |_| | (_) | | | \__ \
|____/| .__/ \__,_|_|  |_|\_\ |_|  |_|\__, | |_|   \__,_|_| |_|\___|\__|_|\___/|_| |_|___/
      |_|                             |___/
 https://github.com/yingzhuo/spark-my-functions
* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * */
package com.github.yingzhuo.spark.function.udf

import com.github.yingzhuo.spark.function.support.NamedFunction

object DesensitizeFunction extends (String => String) with NamedFunction {

  override def name: String = "desensitize"

  override def apply(s: String): String = Option(s) match {
    case Some(x) => "-" * x.length
    case _ => null
  }

}
