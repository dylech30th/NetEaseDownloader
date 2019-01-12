package neteasebox

import encodeToUTF8
import java.util.*
import javax.crypto.Cipher
import javax.crypto.spec.IvParameterSpec
import javax.crypto.spec.SecretKeySpec

private const val iv = "0102030405060708"
const val encryptKey = "0CoJUm6Qyw8W8jud"
const val encryptKey2 = "a8LWv2uAtXjzSfkQ"
const val encSecKey = "2d48fd9fb8e58bc9c1f14a7bda1b8e49a3520a67a2300a1f73766caee29f2411c5350bceb15ed196ca963d6a6d0b61f3734f0a0f4a172ad853f16dd06018bc5ca8fb640eaa8decd1cd41f66e166cea7a3023bd63960e656ec97751cfc7ce08d943928e9db9b35400ff3d138bda1ab511a06fbee75585191cabe0e6e63f7350d6"
fun generatePostData(data: String): String = data.encryptAes(encryptKey).encryptAes(encryptKey2).encodeToUTF8()
/**
 * @see <a href="https://www.lovemurasame.me/2018/12/21/%E7%BD%91%E6%98%93%E4%BA%91%E9%9F%B3%E4%B9%90api%E8%A7%A3%E6%9E%90/#more">网易云api解析</a>
 */
fun String.encryptAes(key: String): String {
    val cipher = Cipher.getInstance("AES/CBC/PKCS5Padding")
    val bytes = key.toByteArray()
    val sKey = SecretKeySpec(bytes, "AES")
    val sIv = IvParameterSpec(iv.toByteArray())
    cipher.init(Cipher.ENCRYPT_MODE, sKey, sIv)
    val encryptedData = cipher.doFinal(this.toByteArray())
    return String(Base64.getEncoder().encode(encryptedData))
}
