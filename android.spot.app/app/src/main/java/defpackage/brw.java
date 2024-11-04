package defpackage;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import j$.util.DesugarCollections;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public class brw extends bru {
    protected final Class a;
    protected final Constructor b;
    protected final Method c;
    protected final Method d;
    protected final Method e;
    protected final Method f;
    protected final Method g;

    public brw() {
        Method method;
        Constructor<?> constructor;
        Method method2;
        Method method3;
        Method method4;
        Method method5;
        Class<?> cls = null;
        try {
            Class<?> cls2 = Class.forName("android.graphics.FontFamily");
            constructor = cls2.getConstructor(null);
            Class<?> cls3 = Integer.TYPE;
            method2 = cls2.getMethod("addFontFromAssetManager", AssetManager.class, String.class, cls3, Boolean.TYPE, cls3, cls3, cls3, FontVariationAxis[].class);
            Class<?> cls4 = Integer.TYPE;
            method3 = cls2.getMethod("addFontFromBuffer", ByteBuffer.class, cls4, FontVariationAxis[].class, cls4, cls4);
            method4 = cls2.getMethod("freeze", null);
            method5 = cls2.getMethod("abortCreation", null);
            method = e(cls2);
            cls = cls2;
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            Log.e("TypefaceCompatApi26Impl", "Unable to collect necessary methods for class ".concat(String.valueOf(e.getClass().getName())), e);
            method = null;
            constructor = null;
            method2 = null;
            method3 = null;
            method4 = null;
            method5 = null;
        }
        this.a = cls;
        this.b = constructor;
        this.c = method2;
        this.d = method3;
        this.e = method4;
        this.f = method5;
        this.g = method;
    }

    private final Object f() {
        try {
            return this.b.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    private final void g(Object obj) {
        try {
            this.f.invoke(obj, null);
        } catch (IllegalAccessException | InvocationTargetException unused) {
        }
    }

    private final boolean h(Context context, Object obj, String str, int i, int i2, int i3, FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((Boolean) this.c.invoke(obj, context.getAssets(), str, 0, false, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), fontVariationAxisArr)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    private final boolean i(Object obj) {
        try {
            return ((Boolean) this.e.invoke(obj, null)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    private final boolean j() {
        if (this.c == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        if (this.c != null) {
            return true;
        }
        return false;
    }

    @Override // defpackage.bru, defpackage.bsb
    public final Typeface a(Context context, btq[] btqVarArr, int i) {
        Typeface c;
        Typeface.Builder weight;
        Typeface.Builder italic;
        Typeface build;
        if (btqVarArr.length <= 0) {
            return null;
        }
        if (!j()) {
            btq l = l(btqVarArr, i);
            try {
                ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(l.a, "r", null);
                if (openFileDescriptor == null) {
                    return null;
                }
                try {
                    weight = new Typeface.Builder(openFileDescriptor.getFileDescriptor()).setWeight(l.c);
                    italic = weight.setItalic(l.d);
                    build = italic.build();
                    openFileDescriptor.close();
                    return build;
                } finally {
                }
            } catch (IOException unused) {
                return null;
            }
        }
        HashMap hashMap = new HashMap();
        for (btq btqVar : btqVarArr) {
            if (btqVar.e == 0) {
                Uri uri = btqVar.a;
                if (!hashMap.containsKey(uri)) {
                    hashMap.put(uri, bpt.o(context, uri));
                }
            }
        }
        Map unmodifiableMap = DesugarCollections.unmodifiableMap(hashMap);
        Object f = f();
        if (f == null) {
            return null;
        }
        boolean z = false;
        for (btq btqVar2 : btqVarArr) {
            ByteBuffer byteBuffer = (ByteBuffer) unmodifiableMap.get(btqVar2.a);
            if (byteBuffer != null) {
                if (((Boolean) this.d.invoke(f, byteBuffer, Integer.valueOf(btqVar2.b), null, Integer.valueOf(btqVar2.c), Integer.valueOf(btqVar2.d ? 1 : 0))).booleanValue()) {
                    z = true;
                } else {
                    g(f);
                    return null;
                }
            }
        }
        if (!z) {
            g(f);
            return null;
        }
        if (!i(f) || (c = c(f)) == null) {
            return null;
        }
        return Typeface.create(c, i);
    }

    @Override // defpackage.bru, defpackage.bsb
    public final Typeface b(Context context, bet betVar, Resources resources, int i) {
        FontVariationAxis[] fromFontVariationSettings;
        if (!j()) {
            return super.b(context, betVar, resources, i);
        }
        Object f = f();
        if (f != null) {
            for (bre breVar : (bre[]) betVar.a) {
                String str = breVar.a;
                int i2 = breVar.e;
                int i3 = breVar.b;
                boolean z = breVar.c;
                fromFontVariationSettings = FontVariationAxis.fromFontVariationSettings(breVar.d);
                if (!h(context, f, str, i2, i3, z ? 1 : 0, fromFontVariationSettings)) {
                    g(f);
                    return null;
                }
            }
            if (i(f)) {
                return c(f);
            }
        }
        return null;
    }

    protected Typeface c(Object obj) {
        try {
            Object newInstance = Array.newInstance((Class<?>) this.a, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) this.g.invoke(null, newInstance, -1, -1);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    @Override // defpackage.bsb
    public final Typeface d(Context context, Resources resources, int i, String str, int i2) {
        if (!j()) {
            return super.d(context, resources, i, str, i2);
        }
        Object f = f();
        if (f != null) {
            if (!h(context, f, str, 0, -1, -1, null)) {
                g(f);
                return null;
            }
            if (i(f)) {
                return c(f);
            }
        }
        return null;
    }

    protected Method e(Class cls) {
        Class cls2 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", Array.newInstance((Class<?>) cls, 1).getClass(), cls2, cls2);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }
}
