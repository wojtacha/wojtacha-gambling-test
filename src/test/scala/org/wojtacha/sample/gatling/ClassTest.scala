package org.wojtacha.sample.gatling

import scala.concurrent.duration._

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._


class ClassTest extends Simulation{


  val httpProtocol = http
    .baseURL("https://gatling.io")
    .inferHtmlResources(BlackList(""".*\.js""", """.*\.css""", """.*\.gif""", """.*\.jpeg""", """.*\.jpg""", """.*\.ico""", """.*\.woff""", """.*\.(t|o)tf""", """.*\.png"""), WhiteList())

  val headers_0 = Map(
    "Accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,image/apng,*/*;q=0.8",
    "Accept-Encoding" -> "gzip, deflate, br",
    "Accept-Language" -> "en-US,en;q=0.9",
    "Connection" -> "keep-alive",
    "Upgrade-Insecure-Requests" -> "1",
    "User-Agent" -> "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/65.0.3325.181 Safari/537.36")

  val headers_1 = Map("User-Agent" -> "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/65.0.3325.181 Safari/537.36")

  val headers_9 = Map(
    "Accept" -> "text/css,*/*;q=0.1",
    "Accept-Encoding" -> "gzip, deflate, br",
    "Accept-Language" -> "en-US,en;q=0.9",
    "Connection" -> "keep-alive",
    "If-Modified-Since" -> "Tue, 03 Apr 2018 10:39:36 GMT",
    "If-None-Match" -> "5ac359e8-389",
    "User-Agent" -> "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/65.0.3325.181 Safari/537.36")

  val headers_11 = Map(
    "Accept" -> "text/css,*/*;q=0.1",
    "Accept-Encoding" -> "gzip, deflate, br",
    "Accept-Language" -> "en-US,en;q=0.9",
    "Connection" -> "keep-alive",
    "If-Modified-Since" -> "Tue, 03 Apr 2018 10:39:36 GMT",
    "If-None-Match" -> "5ac359e8-a2c",
    "User-Agent" -> "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/65.0.3325.181 Safari/537.36")

  val headers_12 = Map(
    "Accept" -> "text/css,*/*;q=0.1",
    "Accept-Encoding" -> "gzip, deflate, br",
    "Accept-Language" -> "en-US,en;q=0.9",
    "Connection" -> "keep-alive",
    "If-Modified-Since" -> "Tue, 03 Apr 2018 10:39:36 GMT",
    "If-None-Match" -> "5ac359e8-a21",
    "User-Agent" -> "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/65.0.3325.181 Safari/537.36")

  val headers_41 = Map(
    "Origin" -> "https://gatling.io",
    "User-Agent" -> "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/65.0.3325.181 Safari/537.36")

  val headers_45 = Map(
    "accept" -> "image/webp,image/apng,image/*,*/*;q=0.8",
    "accept-encoding" -> "gzip, deflate, br",
    "accept-language" -> "en-US,en;q=0.9",
    "referer" -> "https://gatling.io/documentation/",
    "user-agent" -> "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/65.0.3325.181 Safari/537.36")

  val headers_53 = Map(
    "accept" -> "image/webp,image/apng,image/*,*/*;q=0.8",
    "accept-encoding" -> "gzip, deflate, br",
    "accept-language" -> "en-US,en;q=0.9",
    "referer" -> "https://gatling.io/docs/current/advanced_tutorial/",
    "user-agent" -> "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/65.0.3325.181 Safari/537.36")

  val uri2 = "https://fonts.gstatic.com/s"
  val uri3 = "https://www.google-analytics.com/collect"
  val uri4 = "https://fonts.googleapis.com/css"

  val scn = scenario("RecordedSimulation")
    .exec(http("request_0")
      .get("/documentation/")
      .headers(headers_0)
      .resources(http("request_1")
        .get("/wp-content/plugins/contact-form-7/includes/css/styles.css?ver=5.0")
        .headers(headers_1),
        http("request_2")
          .get("/wp-content/plugins/siteorigin-panels/css/front-flex.css?ver=2.6.2")
          .headers(headers_1),
        http("request_3")
          .get("/wp-content/plugins/so-widgets-bundle/widgets/post-carousel/css/style.css?ver=1.11.4")
          .headers(headers_1),
        http("request_4")
          .get("/wp-content/plugins/so-widgets-bundle/widgets/image-grid/css/image-grid.css?ver=1.11.4")
          .headers(headers_1),
        http("request_5")
          .get("/wp-content/uploads/siteorigin-widgets/sow-image-grid-default-6468ccbc8eaa.css?ver=4.9.4")
          .headers(headers_1),
        http("request_6")
          .get("/wp-content/plugins/so-widgets-bundle/widgets/button/css/style.css?ver=1.11.4")
          .headers(headers_1),
        http("request_7")
          .get("/wp-content/uploads/siteorigin-widgets/sow-button-flat-0339184cbb39.css?ver=4.9.4")
          .headers(headers_1),
        http("request_8")
          .get("/wp-content/uploads/siteorigin-widgets/sow-button-flat-14de007ea4b6.css?ver=4.9.4")
          .headers(headers_1),
        http("request_9")
          .get("/wp-content/uploads/siteorigin-widgets/sow-headline-default-17ad595dbecd.css?ver=4.9.4")
          .headers(headers_9),
        http("request_10")
          .get("/wp-content/plugins/so-widgets-bundle/css/slider/slider.css?ver=1.11.4")
          .headers(headers_1),
        http("request_11")
          .get("/wp-content/uploads/siteorigin-widgets/sow-hero-default-de6a4c423eb1.css?ver=4.9.4")
          .headers(headers_11),
        http("request_12")
          .get("/wp-content/uploads/siteorigin-widgets/sow-hero-default-4a5a44c68948.css?ver=4.9.4")
          .headers(headers_12),
        http("request_13")
          .get(uri4 + "?family=Lato%3A300%2C400%2C700%2C400italic%7CMontserrat%3A700%7CHomemade+Apple&ver=4.9.4")
          .headers(headers_1),
        http("request_14")
          .get(uri4 + "?family=Open+Sans%3A400%2C300%2C300italic%2C400italic%2C600italic%2C600%2C700%2C700italic%2C800%2C800italic&ver=4.9.4")
          .headers(headers_1),
        http("request_15")
          .get("/wp-content/themes/zerif-pro/css/bootstrap.min.css?ver=4.9.4")
          .headers(headers_1),
        http("request_16")
          .get("/wp-content/themes/zerif-pro/assets/css/font-awesome.min.css?ver=v1")
          .headers(headers_1),
        http("request_17")
          .get("/wp-content/themes/gatling/style.css?ver=v1")
          .headers(headers_1),
        http("request_18")
          .get("/wp-content/plugins/add-to-any/addtoany.min.css?ver=1.14")
          .headers(headers_1),
        http("request_19")
          .get("/wp-content/plugins/enlighter/resources/EnlighterJS.min.css?ver=3.5")
          .headers(headers_1),
        http("request_20")
          .get("/wp-content/themes/zerif-pro/style.css?ver=4.9.4")
          .headers(headers_1),
        http("request_21")
          .get("/wp-content/themes/gatling/style.css?ver=4.9.4")
          .headers(headers_1),
        http("request_22")
          .get("/wp-includes/js/jquery/jquery.js?ver=1.12.4")
          .headers(headers_1),
        http("request_23")
          .get("/wp-includes/js/jquery/jquery-migrate.min.js?ver=1.4.1")
          .headers(headers_1),
        http("request_24")
          .get("/wp-content/plugins/add-to-any/addtoany.min.js?ver=1.0")
          .headers(headers_1),
        http("request_25")
          .get("/wp-content/plugins/so-widgets-bundle/js/jquery.touchSwipe.min.js?ver=1.6.6")
          .headers(headers_1),
        http("request_26")
          .get("/wp-content/plugins/so-widgets-bundle/js/jquery.cycle.min.js?ver=1.11.4")
          .headers(headers_1),
        http("request_27")
          .get("/wp-content/plugins/so-widgets-bundle/js/slider/jquery.slider.min.js?ver=1.11.4")
          .headers(headers_1),
        http("request_28")
          .get("/wp-content/plugins/leaflet-map/scripts/construct-leaflet-map.min.js?ver=2.10.1")
          .headers(headers_1),
        http("request_29")
          .get("/wp-includes/js/wp-emoji-release.min.js?ver=4.9.4")
          .headers(headers_1),
        http("request_30")
          .get("/wp-content/plugins/contact-form-7/includes/js/scripts.js?ver=5.0")
          .headers(headers_1),
        http("request_31")
          .get("/wp-content/plugins/so-widgets-bundle/widgets/post-carousel/js/carousel.min.js?ver=1.11.4")
          .headers(headers_1),
        http("request_32")
          .get("/wp-content/plugins/so-widgets-bundle/js/lib/imagesloaded.pkgd.min.js?ver=3.2.0")
          .headers(headers_1),
        http("request_33")
          .get("/wp-content/plugins/so-widgets-bundle/widgets/image-grid/js/image-grid.min.js?ver=1.11.4")
          .headers(headers_1),
        http("request_34")
          .get("/wp-content/themes/zerif-pro/js/bootstrap.min.js?ver=20120206")
          .headers(headers_1),
        http("request_35")
          .get("/wp-content/themes/zerif-pro/js/scrollReveal.min.js?ver=20120206")
          .headers(headers_1),
        http("request_36")
          .get("/wp-content/themes/zerif-pro/js/zerif.js?ver=20120206")
          .headers(headers_1),
        http("request_37")
          .get("/wp-content/plugins/enlighter/resources/mootools-core-yc.js?ver=3.5")
          .headers(headers_1),
        http("request_38")
          .get("/wp-content/plugins/enlighter/resources/EnlighterJS.min.js?ver=3.5")
          .headers(headers_1),
        http("request_39")
          .get("/wp-content/plugins/so-widgets-bundle/js/sow.jquery.fittext.min.js?ver=1.2")
          .headers(headers_1),
        http("request_40")
          .get("/wp-includes/js/wp-embed.min.js?ver=4.9.4")
          .headers(headers_1),
        http("request_41")
          .get("/wp-content/themes/zerif-pro/assets/fonts/fontawesome-webfont.woff2?v=4.6.3")
          .headers(headers_41),
        http("request_42")
          .get(uri2 + "/lato/v14/S6uyw4BMUTPHjx4wXg.woff2")
          .headers(headers_41),
        http("request_43")
          .get(uri2 + "/montserrat/v12/JTURjIg1_i6t8kCHKm45_dJE3gnD_g.woff2")
          .headers(headers_41),
        http("request_44")
          .get("/wp-content/plugins/so-widgets-bundle/css/slider/fonts/slider.woff?8p86w5")
          .headers(headers_41),
        http("request_45")
          .get(uri3 + "?v=1&_v=j66&a=1897960906&t=pageview&_s=1&dl=https%3A%2F%2Fgatling.io%2Fdocumentation%2F&ul=en-us&de=UTF-8&dt=Documentation%20-%20Gatling%20Load%20and%20Performance%20testing&sd=24-bit&sr=1920x1080&vp=1905x535&je=0&_u=SCCAAEAj~&jid=&gjid=&cid=1301775964.1522270614&tid=UA-53375088-1&_gid=1597123579.1522672107&linkid=menu-item-255&z=635081629")
          .headers(headers_45)
          .check(bodyBytes.is(RawFileBody("RecordedSimulation_0045_response.txt")))))
    .pause(3)
    .exec(http("request_46")
      .get("/docs/current/advanced_tutorial/")
      .headers(headers_0)
      .resources(http("request_47")
        .get("/wp-includes/js/wp-emoji-release.min.js?ver=4.9.4")
        .headers(headers_1)
        .check(bodyBytes.is(RawFileBody("RecordedSimulation_0047_response.txt"))),
        http("request_48")
          .get(uri2 + "/lato/v14/S6uyw4BMUTPHjx4wXg.woff2")
          .check(bodyBytes.is(RawFileBody("RecordedSimulation_0048_response.txt"))),
        http("request_49")
          .get(uri2 + "/montserrat/v12/JTURjIg1_i6t8kCHKm45_dJE3gnD_g.woff2")
          .check(bodyBytes.is(RawFileBody("RecordedSimulation_0049_response.txt"))),
        http("request_50")
          .get("/wp-content/themes/zerif-pro/assets/fonts/fontawesome-webfont.woff2?v=4.6.3")
          .check(bodyBytes.is(RawFileBody("RecordedSimulation_0050_response.txt"))),
        http("request_51")
          .get(uri2 + "/lato/v14/S6u9w4BMUTPHh6UVSwiPGQ.woff2")
          .headers(headers_41)
          .check(bodyBytes.is(RawFileBody("RecordedSimulation_0051_response.txt"))),
        http("request_52")
          .get(uri2 + "/lato/v14/S6u8w4BMUTPHjxsAXC-q.woff2")
          .headers(headers_41)
          .check(bodyBytes.is(RawFileBody("RecordedSimulation_0052_response.txt"))),
        http("request_53")
          .get(uri3 + "?v=1&_v=j66&a=489552621&t=pageview&_s=1&dl=https%3A%2F%2Fgatling.io%2Fdocs%2Fcurrent%2Fadvanced_tutorial%2F&ul=en-us&de=UTF-8&dt=Gatling%20Load%20and%20Performance%20testing%20-%20Open-source%20load%20and%20performance%20testing&sd=24-bit&sr=1920x1080&vp=1905x535&je=0&_u=CCCAAEAj~&jid=&gjid=&cid=1301775964.1522270614&tid=UA-53375088-1&_gid=1597123579.1522672107&z=346632099")
          .headers(headers_53)
          .check(bodyBytes.is(RawFileBody("RecordedSimulation_0053_response.txt"))))
      .check(bodyBytes.is(RawFileBody("RecordedSimulation_0046_response.txt"))))

  setUp(scn.inject(atOnceUsers(1))).protocols(httpProtocol)


}
