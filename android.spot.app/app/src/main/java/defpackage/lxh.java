package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lxh implements lxg {
    public static final hxo a;
    public static final hxo b;
    public static final hxo c;

    static {
        jmo jmoVar = jmo.a;
        jms jmsVar = new jms("CLIENT_LOGGING_PROD");
        a = hxs.e("45408304", false, "com.google.android.libraries.performance.primes", jmsVar, true, true, false);
        b = hxs.f("40", new hxp(16), "Ci1jb20uZ29vZ2xlLmFuZHJvaWQucHJpbWVzLWphbmstJVBBQ0tBR0VfTkFNRSUSIwgCEh9KPCVFVkVOVF9OQU1FJT4jbWlzc2VkQXBwRnJhbWVzEh8IAxIbSjwlRVZFTlRfTkFNRSU+I3RvdGFsRnJhbWVzEiYIBRIiSjwlRVZFTlRfTkFNRSU+I21heEZyYW1lVGltZU1pbGxpcw", "com.google.android.libraries.performance.primes", jmsVar, true, true, false);
        c = hxs.f("13", new hxp(17), "EAAYAg", "com.google.android.libraries.performance.primes", jmsVar, true, true, false);
    }

    @Override // defpackage.lxg
    public final hrg a(Context context) {
        return (hrg) b.b(context);
    }

    @Override // defpackage.lxg
    public final nfd b(Context context) {
        return (nfd) c.b(context);
    }

    @Override // defpackage.lxg
    public final boolean c(Context context) {
        return ((Boolean) a.b(context)).booleanValue();
    }
}
