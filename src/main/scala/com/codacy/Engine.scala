package com.codacy

import com.codacy.pmd.PMD
import com.codacy.tools.scala.seed.DockerEngine

object Engine extends DockerEngine(PMD)()
