package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.net.Uri;
import android.util.Log;
import j$.nio.channels.DesugarChannels;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class brv extends bsb {
    public static final Method a;
    private static final Class b;
    private static final Constructor c;
    private static final Method d;

    static {
        Class<?> cls;
        Method method;
        Method method2;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls.getConstructor(null);
            Class<?> cls2 = Integer.TYPE;
            method2 = cls.getMethod("addFontWeightStyle", ByteBuffer.class, cls2, List.class, cls2, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            Log.e("TypefaceCompatApi24Impl", e.getClass().getName(), e);
            cls = null;
            method = null;
            method2 = null;
        }
        c = constructor;
        b = cls;
        a = method2;
        d = method;
    }

    private static Typeface f(Object obj) {
        try {
            Object newInstance = Array.newInstance((Class<?>) b, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) d.invoke(null, newInstance);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    private static Object g() {
        try {
            return c.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    private static boolean h(Object obj, ByteBuffer byteBuffer, int i, int i2, boolean z) {
        try {
            return ((Boolean) a.invoke(obj, byteBuffer, Integer.valueOf(i), null, Integer.valueOf(i2), Boolean.valueOf(z))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    @Override // defpackage.bsb
    public final Typeface a(Context context, btq[] btqVarArr, int i) {
        Object g = g();
        if (g != null) {
            ta taVar = new ta();
            for (btq btqVar : btqVarArr) {
                Uri uri = btqVar.a;
                ByteBuffer byteBuffer = (ByteBuffer) taVar.get(uri);
                if (byteBuffer == null) {
                    byteBuffer = bpt.o(context, uri);
                    taVar.put(uri, byteBuffer);
                }
                if (byteBuffer == null || !h(g, byteBuffer, btqVar.b, btqVar.c, btqVar.d)) {
                    return null;
                }
            }
            Typeface f = f(g);
            if (f != null) {
                return Typeface.create(f, i);
            }
            return null;
        }
        return null;
    }

    @Override // defpackage.bsb
    public final Typeface b(Context context, bet betVar, Resources resources, int i) {
        MappedByteBuffer mappedByteBuffer;
        FileChannel convertMaybeLegacyFileChannelFromLibrary;
        Object g = g();
        if (g != null) {
            for (bre breVar : (bre[]) betVar.a) {
                int i2 = breVar.f;
                File k = bpt.k(context);
                if (k != null) {
                    try {
                        if (bpt.n(k, resources, i2)) {
                            try {
                                FileInputStream fileInputStream = new FileInputStream(k);
                                try {
                                    convertMaybeLegacyFileChannelFromLibrary = DesugarChannels.convertMaybeLegacyFileChannelFromLibrary(fileInputStream.getChannel());
                                    mappedByteBuffer = convertMaybeLegacyFileChannelFromLibrary.map(FileChannel.MapMode.READ_ONLY, 0L, convertMaybeLegacyFileChannelFromLibrary.size());
                                    fileInputStream.close();
                                } finally {
                                    break;
                                }
                            } catch (IOException unused) {
                                mappedByteBuffer = null;
                            }
                            if (mappedByteBuffer != null && h(g, mappedByteBuffer, breVar.e, breVar.b, breVar.c)) {
                            }
                        }
                    } finally {
                        k.delete();
                    }
                }
                mappedByteBuffer = null;
                if (mappedByteBuffer != null) {
                }
            }
            return f(g);
        }
        return null;
    }
}
