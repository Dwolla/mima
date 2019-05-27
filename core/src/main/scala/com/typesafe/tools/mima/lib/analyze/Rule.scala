package com.typesafe.tools.mima.lib.analyze

import com.typesafe.tools.mima.core.Problem

private[analyze] trait Rule[T,S] extends Function2[T,S,Option[Problem]]