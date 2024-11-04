package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class eia extends cgk {
    private final eib a;

    public eia(Map map, cfz cfzVar) {
        lqf b = lqf.b(eyf.h(cfzVar).c);
        this.a = (eib) map.get(b == null ? lqf.UNRECOGNIZED : b);
    }

    public final cfk a() {
        eib eibVar = this.a;
        eibVar.getClass();
        return eibVar.a();
    }
}
