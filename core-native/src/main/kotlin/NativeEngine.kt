package im.manus.primeapk.core

class NativeEngine {
    companion object {
        init {
            System.loadLibrary("core-native")
        }
    }

    /**
     * Parses binary XML from an APK using mmap for zero-copy.
     * @param apkPath Path to the .apk file.
     * @param fileInsideApk Path to the file within the APK (e.g., "AndroidManifest.xml").
     */
    external fun parseAXML(apkPath: String, fileInsideApk: String): String

    /**
     * Directly patches a byte in a DEX file at a given offset.
     * @param dexPath Path to the .dex file.
     * @param offset Offset in the file to patch.
     * @param newValue New byte value to write.
     */
    external fun quickPatchDEX(dexPath: String, offset: Long, newValue: Byte): String
}
