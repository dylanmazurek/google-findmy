package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nah {
    public static final nbj a = new nbj("CLOSED");

    public static final Object a(nai naiVar, long j, mol molVar) {
        while (true) {
            if (naiVar.b >= j && !naiVar.u()) {
                return naiVar;
            }
            Object m = naiVar.m();
            nbj nbjVar = a;
            if (m == nbjVar) {
                return nbjVar;
            }
            nai naiVar2 = (nai) m;
            if (naiVar2 == null) {
                naiVar2 = (nai) molVar.a(Long.valueOf(naiVar.b + 1), naiVar);
                if (naiVar.a.d(null, naiVar2)) {
                    if (naiVar.u()) {
                        naiVar.q();
                    }
                }
            }
            naiVar = naiVar2;
        }
    }
}
