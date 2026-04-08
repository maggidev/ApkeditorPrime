package im.manus.primeapk.core

class NativeEngine {
    companion object {
        init {
            System.loadLibrary("core-native")
        }
    }

    /**
     * Parses binary XML from an APK.
     */
    external fun parseAXML(apkPath: String, fileInsideApk: String): String

    /**
     * Directly patches a byte in a DEX file.
     */
    external fun quickPatchDEX(dexPath: String, offset: Long, newValue: Byte): String
}
