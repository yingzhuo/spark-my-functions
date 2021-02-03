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
import org.apache.commons.lang3.time.DateUtils

import java.util.Date

object AgeFunction extends ((String, String) => Int) with NamedFunction {

  override def name: String = "age"

  override def apply(dateString: String, patternString: String): Int = {
    val now = new Date
    val date = DateUtils.parseDate(dateString, patternString)

    val timeBetween = now.getTime - date.getTime
    val yearsBetween = timeBetween / 3.15576e+10
    Math.floor(yearsBetween).toInt
  }

}
