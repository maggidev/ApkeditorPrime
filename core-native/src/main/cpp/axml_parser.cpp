#include <jni.h>
#include <string>
#include <android/log.h>

#define LOG_TAG "PrimeAPK_AXML"
#define LOGI(...) __android_log_print(ANDROID_LOG_INFO, LOG_TAG, __VA_ARGS__)

extern "C" JNIEXPORT jstring JNICALL
Java_im_manus_primeapk_core_NativeEngine_parseAXML(JNIEnv* env, jobject thiz, jstring apk_path, jstring file_inside_apk) {
    return env->NewStringUTF("<?xml version=\"1.0\" encoding=\"utf-8\"?>\n<manifest xmlns:android=\"http://schemas.android.com/apk/res/android\">\n</manifest>");
}
