package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hul {
    public final String a;
    public final String b;
    public final boolean c;
    public final boolean d;
    private final hub e;
    private final hud f;
    private final huh g;

    public hul(Context context, jer jerVar, jer jerVar2, jer jerVar3, jer jerVar4, jer jerVar5) {
        String packageName = context.getPackageName();
        hub hubVar = (hub) jerVar.e(hub.a);
        hud hudVar = (hud) jerVar2.e(hud.a);
        huh huhVar = (huh) jerVar3.e(huh.a);
        boolean booleanValue = ((Boolean) jerVar4.e(false)).booleanValue();
        boolean booleanValue2 = ((Boolean) jerVar5.e(false)).booleanValue();
        this.b = "FIND_MY_DEVICE_ANDROID_PRIMES";
        this.e = hubVar;
        this.f = hudVar;
        this.g = huhVar;
        this.c = booleanValue;
        this.d = booleanValue2;
        this.a = "com.google.android.libraries.performance.primes#".concat(String.valueOf(packageName));
    }

    public final jyz a() {
        jyz a = this.e.a();
        jyz a2 = this.f.a();
        jyz a3 = this.g.a();
        return ivc.R(a, a2, a3).a(new ihh(this, a, a2, a3, 1), jxv.a);
    }
}
