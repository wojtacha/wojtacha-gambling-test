package org.wojtacha.sample.gatling

import io.gatling.core.Predef._
import io.gatling.core.filter._
import io.gatling.http.Predef._


class VikingSimulation extends Simulation {

  private val vikingsGameUrl = "/vikings-go-wild/"
  val host = "https://yggdrasilgaming.com"
  //  val host = "https://pff.yggdrasilgaming.com"
  //val uri1My = "https://pff.yggdrasilgaming.com/game.web/service"

  val requiredHeaders = Map(
    "accept-encoding" -> "gzip, deflate, br",
    "accept-language" -> "en-US,en;q=0.9",
    "user-agent" -> "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/65.0.3325.181 Safari/537.36")


  val healthChechScenario = scenario("HealthCheck").
    exec(http("healthCheck")
      .get("/games")
      .check(status.is(200)))


  private val blackList: BlackList = BlackList(""".*\.css.*""",""".*\.js.*""", """.*\.gif""", """.*\.jpeg""", """.*\.jpg""", """.*\.ico""", """.*\.woff""", """.*\.(t|o)tf""", """.*\.png""")
  val httpProtocol = http
    .baseURL(host)
    .inferHtmlResources(blackList, WhiteList())

  // """.*\.js""", """.*\.css""",

  val scnMu = exec(http("play this game")
      .get("/game.web/service?fn=play&currency=EUR&gameid=7316&sessid=18040309444100200351A6EE0FF17BC23339AD498CC2EB95EC72B95C56A3D90D2898ACF90C811D0678A&log=&gameHistorySessionId=seesion&gameHistoryTicketId=ticket&amount=1.25&lines=1111111111111111111111111&coin=0.05&clientinfo=1510201247470900004&channelID=&crid=ae3364d0-602e-49e5-8af5-58b5605c95b0&csid=3b557e1a-62a7-4fdc-abfa-d0c354b79bf2")
      .headers(requiredHeaders))




  setUp(healthChechScenario inject atOnceUsers(1) protocols httpProtocol)

}