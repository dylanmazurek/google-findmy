package defpackage;

import android.content.Context;
import android.os.Debug;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hry {
    public static final /* synthetic */ int f = 0;
    public final mko a;
    public final Context b;
    public final mko c;
    public final hri d;
    public final apc e;

    static {
        hwx.H(new eft(11));
    }

    public hry(final mko mkoVar, Context context, mko mkoVar2, final mko mkoVar3, hri hriVar, apc apcVar) {
        this.d = hriVar;
        this.e = apcVar;
        mkoVar.getClass();
        final jfe H = hwx.H(new hnn(mkoVar, 6));
        this.a = new mko() { // from class: hrw
            @Override // defpackage.mko, defpackage.mkn
            public final Object a() {
                int i = hry.f;
                if (((Boolean) mko.this.a()).booleanValue()) {
                    return (hrl) H.a();
                }
                return mkoVar.a();
            }
        };
        this.b = context;
        this.c = mkoVar2;
    }

    public static /* synthetic */ jer a() {
        try {
            return jer.i(Debug.MemoryInfo.class.getDeclaredMethod("getOtherPss", Integer.TYPE));
        } catch (Error e) {
            e = e;
            ((jni) ((jni) ((jni) hmz.a.g()).i(e)).j("com/google/android/libraries/performance/primes/metrics/memory/MemoryUsageCapture", "lambda$static$0", 'g', "MemoryUsageCapture.java")).r("MemoryInfo.getOtherPss(which) failure");
            return jdl.a;
        } catch (NoSuchMethodException e2) {
            ((jni) ((jni) ((jni) hmz.a.c()).i(e2)).j("com/google/android/libraries/performance/primes/metrics/memory/MemoryUsageCapture", "lambda$static$0", 'e', "MemoryUsageCapture.java")).r("MemoryInfo.getOtherPss(which) not found");
            return jdl.a;
        } catch (Exception e3) {
            e = e3;
            ((jni) ((jni) ((jni) hmz.a.g()).i(e)).j("com/google/android/libraries/performance/primes/metrics/memory/MemoryUsageCapture", "lambda$static$0", 'g', "MemoryUsageCapture.java")).r("MemoryInfo.getOtherPss(which) failure");
            return jdl.a;
        }
    }

    public static Long b(Pattern pattern, String str) {
        Matcher matcher = pattern.matcher(str);
        try {
            if (!matcher.find()) {
                return null;
            }
            String group = matcher.group(1);
            hwx.G(group);
            return Long.valueOf(Long.parseLong(group));
        } catch (NumberFormatException unused) {
            return null;
        }
    }
}
