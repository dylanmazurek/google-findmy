package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class low extends Enum {
    public static final low a;
    public static final low b;
    public static final low c;
    public static final /* synthetic */ mnq d;
    private static final /* synthetic */ low[] e;
    private final jis f;
    private final jis g;
    private final jis h;

    static {
        jis r = jis.r("https", "http");
        r.getClass();
        jis r2 = jis.r("www.google.com", "google.com");
        r2.getClass();
        jis r3 = jis.r("android", "find");
        r3.getClass();
        low lowVar = new low("GOOGLE", 0, r, r2, r3);
        a = lowVar;
        jis r4 = jis.r("https", "http");
        r4.getClass();
        jis r5 = jis.r("www.android.com", "android.com");
        r5.getClass();
        jis q = jis.q("find");
        q.getClass();
        low lowVar2 = new low("ANDROID", 1, r4, r5, q);
        b = lowVar2;
        jis q2 = jis.q("android");
        q2.getClass();
        jis q3 = jis.q("find");
        q3.getClass();
        jis jisVar = jmi.a;
        jisVar.getClass();
        low lowVar3 = new low("ANDROID_NATIVE", 2, q2, q3, jisVar);
        c = lowVar3;
        low[] lowVarArr = {lowVar, lowVar2, lowVar3};
        e = lowVarArr;
        d = mjo.t(lowVarArr);
    }

    private low(String str, int i, jis jisVar, jis jisVar2, jis jisVar3) {
        super(str, i);
        this.f = jisVar;
        this.g = jisVar2;
        this.h = jisVar3;
    }

    public static low[] values() {
        return (low[]) e.clone();
    }

    public final List a(jvt jvtVar) {
        List c2 = jvtVar.c();
        List subList = c2.subList(((jmi) this.h).c, c2.size());
        ArrayList arrayList = new ArrayList();
        for (Object obj : subList) {
            if (((String) obj).length() != 0) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public final boolean b(jvt jvtVar) {
        if (!mkm.al(this.f, jvtVar.a) || !mkm.al(this.g, jvtVar.b) || !amr.i(jvtVar.c().subList(0, ((jmi) this.h).c), this.h)) {
            return false;
        }
        return true;
    }
}
