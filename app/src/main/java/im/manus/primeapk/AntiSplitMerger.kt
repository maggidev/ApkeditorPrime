package im.manus.primeapk

import java.io.File
import java.util.zip.ZipFile
import java.util.zip.ZipOutputStream
import java.io.FileOutputStream

/**
 * Merges multiple .apks (Split APKs) into a single standalone APK.
 */
class AntiSplitMerger {
    fun merge(baseApk: File, splits: List<File>, outputApk: File) {
        ZipOutputStream(FileOutputStream(outputApk)).use { out ->
            copyZipContents(baseApk, out)
            splits.forEach { split ->
                copyZipContents(split, out, excludeManifest = true)
            }
        }
    }

    private fun copyZipContents(source: File, target: ZipOutputStream, excludeManifest: Boolean = false) {
        ZipFile(source).use { zip ->
            zip.entries().asSequence().forEach { entry ->
                if (excludeManifest && entry.name == "AndroidManifest.xml") return@forEach
                target.putNextEntry(entry)
                zip.getInputStream(entry).use { it.copyTo(target) }
                target.closeEntry()
            }
        }
    }
}
