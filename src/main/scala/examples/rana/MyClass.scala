package examples.rana

import com.typesafe.scalalogging.Logger

/**
  * Created by rana on 19/9/17.
  */
class MyClass {
  val logger = Logger(classOf[MyClass])

  logger.debug("This is a debug log!!")
  logger.trace("This is a trace log!!")
  logger.info("This is a info log!!")
  logger.warn("This is a warn log!!")
  logger.error("This is a error log!!")

  def echo(msg: String) = {
    logger.info("Received message is: " + msg)
  }
}