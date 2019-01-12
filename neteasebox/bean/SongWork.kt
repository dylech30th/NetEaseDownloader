package neteasebox.bean

class SongWork {
    var data: List<Data>? = null
    var code: Int = 0
}
class Data {
    var id: Long = 0
    var url: String? = null
    var br: Long = 0
    var size: Long = 0
    var md5: String? = null
    var code: Int = 0
    var expi: Int = 0
    var type: String? = null
    var gain: Double = 0.toDouble()
    var fee: Int = 0
    var uf: String? = null
    var payed: Int = 0
    var flag: Int = 0
    var canExtend: Boolean = false
    var freeTrialInfo: String? = null
}