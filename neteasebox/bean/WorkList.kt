@file:Suppress("unused", "SpellCheckingInspection")

package neteasebox.bean

import java.util.*

class WorkList {
    var result: Result? = null
    var code: Int = 0
}
class Ar {
    var id: Long = 0
    var name: String? = null
    var tns: List<String>? = null
    var alias: List<String>? = null
}
class Al {
    var id: Long = 0
    var name: Date? = null
    var picUrl: String? = null
    var tns: List<String>? = null
    var pic: Long = 0
}
class H {
    var br: Long = 0
    var fid: Int = 0
    var size: Long = 0
    var vd: Double = 0.toDouble()
}
class M {
    var br: Long = 0
    var fid: Int = 0
    var size: Long = 0
    var vd: Double = 0.toDouble()
}
class L {
    var br: Long = 0
    var fid: Int = 0
    var size: Long = 0
    var vd: Double = 0.toDouble()
}
class Privilege {
    var id: Long = 0
    var fee: Int = 0
    var payed: Int = 0
    var st: Int = 0
    var pl: Long = 0
    var dl: Long = 0
    var sp: Int = 0
    var cp: Int = 0
    var subp: Int = 0
    var cs: Boolean = false
    var maxbr: Long = 0
    var fl: Long = 0
    var toast: Boolean = false
    var flag: Int = 0
}
class Songs {
    var name: String? = null
    var id: Long = 0
    var pst: Int = 0
    var t: Int = 0
    var ar: List<Ar>? = null
    var alia: List<String>? = null
    var pop: Int = 0
    var st: Int = 0
    var rt: String? = null
    var fee: Int = 0
    var v: Int = 0
    var crbt: String? = null
    var cf: String? = null
    var al: Al? = null
    var dt: Long = 0
    var h: H? = null
    var m: M? = null
    var l: L? = null
    var a: String? = null
    var cd: String? = null
    var no: Int = 0
    var rtUrl: String? = null
    var ftype: Int = 0
    var rtUrls: List<String>? = null
    var djId: Int = 0
    var copyright: Int = 0
    @Suppress("PropertyName")
    var s_id: Int = 0
    var rtype: Int = 0
    var rurl: String? = null
    var mst: Int = 0
    var cp: Int = 0
    var mv: Long = 0
    var publishTime: Long = 0
    var privilege: Privilege? = null
}
class Result {
    var songs: List<Songs>? = null
    var songCount: Int = 0
}