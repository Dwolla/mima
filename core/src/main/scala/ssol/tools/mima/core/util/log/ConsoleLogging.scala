package ssol.tools.mima.core.util.log

import ssol.tools.mima.core.Config

object ConsoleLogging extends Logging {
  def info(str: String) = if (Config.verbose) println(str)
  def debugLog(str: String) = if (Config.debug) println(str)
}