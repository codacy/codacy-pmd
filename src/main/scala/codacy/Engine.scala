package codacy

import codacy.dockerApi.DockerEngine
import codacy.pmd.PMD

object Engine extends DockerEngine(PMD)
