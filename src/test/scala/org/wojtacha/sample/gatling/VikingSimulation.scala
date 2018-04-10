package org.wojtacha.sample.gatling

import io.gatling.core.Predef._
import io.gatling.core.session.Session
import io.gatling.http.Predef._


class VikingSimulation extends Simulation {

  private val domainUrl = "https://pff.yggdrasilgaming.com"
  val httpProtocol = http
    .baseURL(domainUrl)

  val scenarioForTest = scenario("Yggdrasil test - Vikings go wild")
    .exec(Actions.authenticate, Actions.play)

  setUp(scenarioForTest inject atOnceUsers(1) protocols httpProtocol)

}
