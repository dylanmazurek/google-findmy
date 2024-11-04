package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class xa {
    public static final Map a;

    static {
        atk atkVar = wp.b;
        Float valueOf = Float.valueOf(1.0f);
        mkw mkwVar = new mkw(atkVar, valueOf);
        atk atkVar2 = wp.i;
        Float valueOf2 = Float.valueOf(0.5f);
        atk atkVar3 = wp.c;
        Float valueOf3 = Float.valueOf(0.1f);
        mkw[] mkwVarArr = {mkwVar, new mkw(wp.h, valueOf), new mkw(wp.g, valueOf), new mkw(wp.a, Float.valueOf(0.01f)), new mkw(atkVar2, valueOf2), new mkw(wp.e, valueOf2), new mkw(wp.f, valueOf2), new mkw(atkVar3, valueOf3), new mkw(wp.d, valueOf3)};
        LinkedHashMap linkedHashMap = new LinkedHashMap(mkm.H(9));
        for (int i = 0; i < 9; i++) {
            mkw mkwVar2 = mkwVarArr[i];
            linkedHashMap.put(mkwVar2.a, mkwVar2.b);
        }
        a = linkedHashMap;
    }

    public static final long a() {
        return bef.m(1, 1);
    }
}
