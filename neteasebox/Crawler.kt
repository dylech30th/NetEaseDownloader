@file:Suppress("SpellCheckingInspection", "unused")

package neteasebox

import deserializeAs
import downloadFile
import encodeToUTF8
import neteasebox.bean.Data
import neteasebox.bean.Result
import neteasebox.bean.SongWork
import neteasebox.bean.WorkList
import request

private val header = mutableMapOf(
    "User-Agent" to "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/70.0.3538.110 Safari/537.36",
    "Referer" to "http://music.163.com",
    "Content-Type" to "application/x-www-form-urlencoded"
)
fun getWorkListPerPage(keyWord: String, pageOffset: Int): Result? {
    val postData = "params=${generatePostData(getWorkList(keyWord, pageOffset))}&encSecKey=${encSecKey.encodeToUTF8()}"
    return request(getWorksListUrl, postData ,header)
        .entity
        .deserializeAs<WorkList>()
        .result
}
fun getSongWork(id: String): Data? {
    val postData = "params=${generatePostData(getWork(id))}&encSecKey=${encSecKey.encodeToUTF8()}"
    return request(getWorkUrl, postData, header)
        .entity
        .deserializeAs<SongWork>()
        .data?.get(0)
}
fun download(id: String, location: String = "NetEase\\$id.mp3") {
    downloadFile(getSongWork(id)?.url!!, location)
}

fun main() {
    download("28661564")
}