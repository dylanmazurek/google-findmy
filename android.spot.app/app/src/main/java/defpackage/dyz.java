package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dyz implements dyx {
    private final Map a;

    public dyz(Map map) {
        map.getClass();
        this.a = map;
    }

    @Override // defpackage.dyx
    public final boolean a(lqd lqdVar, hzc hzcVar) {
        lqdVar.getClass();
        lqf b = lqf.b(lqdVar.c);
        if (b == null) {
            b = lqf.UNRECOGNIZED;
        }
        dyx dyxVar = (dyx) this.a.get(b);
        if (dyxVar != null) {
            return dyxVar.a(lqdVar, hzcVar);
        }
        return false;
    }
}
