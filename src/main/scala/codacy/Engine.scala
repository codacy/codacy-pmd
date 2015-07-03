package codacy

import codacy.dockerApi.DockerEngine
import codacy.jshint.Jshint

object Engine extends DockerEngine(Jshint)