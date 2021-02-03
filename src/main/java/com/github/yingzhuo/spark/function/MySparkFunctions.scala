/* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
 ____                   _      __  __         _____                 _   _
/ ___| _ __   __ _ _ __| | __ |  \/  |_   _  |  ___|   _ _ __   ___| |_(_) ___  _ __  ___
\___ \| '_ \ / _` | '__| |/ / | |\/| | | | | | |_ | | | | '_ \ / __| __| |/ _ \| '_ \/ __|
 ___) | |_) | (_| | |  |   <  | |  | | |_| | |  _|| |_| | | | | (__| |_| | (_) | | | \__ \
|____/| .__/ \__,_|_|  |_|\_\ |_|  |_|\__, | |_|   \__,_|_| |_|\___|\__|_|\___/|_| |_|___/
      |_|                             |___/
 https://github.com/yingzhuo/spark-my-functions
* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * */
package com.github.yingzhuo.spark.function

import com.github.yingzhuo.spark.function.udf._
import org.apache.spark.sql.SparkSession

object MySparkFunctions {

  def registerAll(spark: SparkSession): Unit = {
    spark.udf.register(AgeFunction.name, AgeFunction)
    spark.udf.register(DesensitizeFunction.name, DesensitizeFunction)
  }

}
