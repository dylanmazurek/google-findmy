package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.util.Log;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Field;

/* compiled from: PG */
/* loaded from: classes.dex */
public class bsb {
    private final ConcurrentHashMap a = new ConcurrentHashMap();

    private static long f(Typeface typeface) {
        if (typeface == null) {
            return 0L;
        }
        try {
            Field declaredField = Typeface.class.getDeclaredField("native_instance");
            declaredField.setAccessible(true);
            return ((Number) declaredField.get(typeface)).longValue();
        } catch (IllegalAccessException e) {
            Log.e("TypefaceCompatBaseImpl", "Could not retrieve font from family.", e);
            return 0L;
        } catch (NoSuchFieldException e2) {
            Log.e("TypefaceCompatBaseImpl", "Could not retrieve font from family.", e2);
            return 0L;
        }
    }

    private static Object g(Object[] objArr, int i, bsa bsaVar) {
        boolean z;
        int i2;
        int i3 = Integer.MAX_VALUE;
        Object obj = null;
        for (Object obj2 : objArr) {
            int i4 = 1;
            int i5 = i & 1;
            if ((i & 2) == 0) {
                z = false;
            } else {
                z = true;
            }
            if (1 != i5) {
                i2 = 400;
            } else {
                i2 = 700;
            }
            int abs = Math.abs(bsaVar.a(obj2) - i2);
            int i6 = abs + abs;
            if (bsaVar.b(obj2) == z) {
                i4 = 0;
            }
            int i7 = i6 + i4;
            if (obj == null || i3 > i7) {
                i3 = i7;
                obj = obj2;
            }
        }
        return obj;
    }

    public Typeface a(Context context, btq[] btqVarArr, int i) {
        InputStream inputStream;
        InputStream inputStream2 = null;
        if (btqVarArr.length <= 0) {
            return null;
        }
        try {
            inputStream = context.getContentResolver().openInputStream(l(btqVarArr, i).a);
            try {
                Typeface k = k(context, inputStream);
                bpt.l(inputStream);
                return k;
            } catch (IOException unused) {
                bpt.l(inputStream);
                return null;
            } catch (Throwable th) {
                th = th;
                inputStream2 = inputStream;
                bpt.l(inputStream2);
                throw th;
            }
        } catch (IOException unused2) {
            inputStream = null;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public Typeface b(Context context, bet betVar, Resources resources, int i) {
        bre breVar = (bre) g((Object[]) betVar.a, i, new brz(0));
        if (breVar == null) {
            return null;
        }
        Typeface a = brt.a(context, resources, breVar.f, breVar.a, 0, i);
        long f = f(a);
        if (f != 0) {
            this.a.put(Long.valueOf(f), betVar);
        }
        return a;
    }

    public Typeface d(Context context, Resources resources, int i, String str, int i2) {
        File k = bpt.k(context);
        Typeface typeface = null;
        if (k == null) {
            return null;
        }
        try {
            if (bpt.n(k, resources, i)) {
                typeface = Typeface.createFromFile(k.getPath());
            }
        } catch (RuntimeException unused) {
        } catch (Throwable th) {
            k.delete();
            throw th;
        }
        k.delete();
        return typeface;
    }

    public Typeface k(Context context, InputStream inputStream) {
        File k = bpt.k(context);
        Typeface typeface = null;
        if (k == null) {
            return null;
        }
        try {
            if (bpt.m(k, inputStream)) {
                typeface = Typeface.createFromFile(k.getPath());
            }
        } catch (RuntimeException unused) {
        } catch (Throwable th) {
            k.delete();
            throw th;
        }
        k.delete();
        return typeface;
    }

    public btq l(btq[] btqVarArr, int i) {
        return (btq) g(btqVarArr, i, new brz(1));
    }
}
