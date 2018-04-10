package org.wojtacha.sample.gatling

import io.gatling.core.Predef._
import io.gatling.core.structure.ChainBuilder
import io.gatling.http.Predef._
import io.gatling.http.request.builder.HttpRequestBuilder

import scala.util.Random

object Actions {

  private val gameService = "/game.web/service"

  private val gameId = "7316"


  def randomSeconds(oscilation: Int): String = {
    val amount = Random.nextInt(oscilation) + 0.25 * oscilation
    amount toString
  }

  private val requiredHeaders = Map(
    "accept-encoding" -> "gzip, deflate, br",
    "accept-language" -> "en-US,en;q=0.9",
    "user-agent" -> "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/65.0.3325.181 Safari/537.36")


  private val authenticateRequets: HttpRequestBuilder = http("authenticate")
    .get(gameService)
    .queryParam("fn", "authenticate")
    .queryParam("org", "Demo")
    .queryParam("lang", "en")
    .queryParam("gameid", gameId)
    .queryParam("channel", "pc")
    .queryParam("currency", "EUR")
    .queryParam("userName", "")
    .headers(requiredHeaders)


  private val playRequest = http("play untill win occurs")
    .get(gameService)
    .queryParam("fn", "play")
    .queryParam("currency", "EUR")
    .queryParam("gameid", gameId)
    .queryParam("sessid", "${session}")
    .queryParam("amount", "1.25")
    .queryParam("coin", "0.05")
    .headers(requiredHeaders)

  val authenticate = exec(authenticateRequets
    .check(jsonPath("$..sessid")
      .exists
      .saveAs("session"))).pause(5)


  private val roll: ChainBuilder = exec(playRequest
    .check(jsonPath("$.data.wager.bets[0].wonamount")
      .exists
      .saveAs("wonAmount")))

  val play = roll.asLongAs(session => session("wonAmount").as[String] != "0.00")(roll)

}
