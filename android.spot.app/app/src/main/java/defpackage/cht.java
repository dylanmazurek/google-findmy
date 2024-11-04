package defpackage;

import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cht {
    public final cih a;
    public final String[] b;
    public final ciz c;
    public final mnw d;
    public final mnw e;
    public chr f;
    public final Object g;
    public bwc h;
    private final Map i;
    private final Map j;

    public cht(cih cihVar, Map map, Map map2, String... strArr) {
        this.a = cihVar;
        this.i = map;
        this.j = map2;
        this.b = strArr;
        ciz cizVar = new ciz(cihVar, map, map2, strArr);
        this.c = cizVar;
        this.d = new bcf(13);
        this.e = new bcf(12);
        Collections.newSetFromMap(new IdentityHashMap()).getClass();
        this.g = new Object();
        cizVar.d = new azp(this, 17);
    }

    public final Object a(mmx mmxVar) {
        Object g;
        if ((!this.a.q() || this.a.s()) && (g = this.c.g(mmxVar)) == mne.a) {
            return g;
        }
        return mlh.a;
    }

    public final Object b(chs chsVar, mmx mmxVar) {
        Object d = this.c.d(chsVar, mmxVar);
        if (d == mne.a) {
            return d;
        }
        return mlh.a;
    }
}
