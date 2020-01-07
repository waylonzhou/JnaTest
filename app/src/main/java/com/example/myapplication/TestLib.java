package com.example.myapplication;

import com.sun.jna.Library;
import com.sun.jna.Native;
import com.sun.jna.NativeLibrary;
import com.sun.jna.Pointer;

import java.nio.ByteBuffer;

public interface TestLib extends Library {
    String JNA_LIBRARY_NAME = "test";
    NativeLibrary JNA_NATIVE_LIB = NativeLibrary.getInstance("test");
    TestLib INSTANCE = (TestLib) Native.loadLibrary("test", TestLib.class);

    /** @deprecated */
    @Deprecated
    void getStr(Pointer var1);

    void getStr(ByteBuffer var1);

    int add(int var1, int var2);
}
