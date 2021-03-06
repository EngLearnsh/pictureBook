package eg.haoyue.util

import android.content.Context
import android.os.Build

class HWInfoUtil private constructor(private val context: Context) {
    /**     * 获取主板名字     */
    val boardName: String
        get() = Build.BOARD
    /**     * 获取主板版本号     */
    val phoneInfo: String get() = Build.BOOTLOADER
    /**     * 获取手机出厂商品牌     */
    val brand: String get() = Build.BRAND
    /**     * 获取Cpu指令集1     */
    val cpuAbi1: String get() = Build.CPU_ABI
    /**     * 获取Cpu指令集2     */
    val cpuAbi2: String get() = Build.CPU_ABI2
    /**     * 获取当前手机SDK     */
    val sdkVersion: Int get() = Build.VERSION.SDK_INT
    /**     * 获取手机系统版本     */
    val systemVersion: String get() = Build.VERSION.RELEASE
    /**     * 获取设备显示的版本     */
    val display: String get() = Build.DISPLAY
    /**     * 获取手机型号名称     */
    val phoneVersionName: String get() = Build.PRODUCT
    /**     * 获取制造商     */
    val manufacturer: String get() = Build.MANUFACTURER
    /**     * 获取驱动名     */
    val deviceName: String get() = Build.DEVICE
    /**     * 获取设备唯一标识符     */
    val fingerprint: String get() = Build.FINGERPRINT
    /**     * 获取串口序列号     */
    val serial: String get() = Build.SERIAL
    /**     * 获取主机地址     */
    val host: String get() = Build.HOST
    /**     * 获取系统当前开发版本号     */
    val codeName: String get() = Build.ID
        companion object {
            private var hardwareInformationUtil: HWInfoUtil? = null
            fun getHardwareInformationUtil(context: Context): HWInfoUtil {
                if (hardwareInformationUtil == null) {
                    synchronized(HWInfoUtil::class.java) { hardwareInformationUtil = HWInfoUtil(context) }
                }
                return hardwareInformationUtil!!
            }
        }
}