package neteasebox

const val getWorksListUrl = "http://music.163.com/weapi/cloudsearch/get/web?csrf_token="
const val getWorkUrl = "http://music.163.com/weapi/song/enhance/player/url?csrf_token="
val getWorkList = { workName: String, pageCount: Int ->
    """
        {"hlpretag":"<span class=\"s-fc7\">","hlposttag":"</span>","s":"$workName","type":"1","offset":"$pageCount","total":"true","limit":"30","csrf_token":""}
    """.trimIndent()
}
val getWork = { workId: String ->
    """
        {"ids":"[$workId]","br":128000,"csrf_token":""}
    """.trimIndent()
}