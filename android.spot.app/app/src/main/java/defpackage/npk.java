package defpackage;

import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class npk extends non {
    private static final long serialVersionUID = -1079258847191166848L;

    private npk(nno nnoVar, nnw nnwVar) {
        super(nnoVar, nnwVar);
    }

    public static npk O(nno nnoVar, nnw nnwVar) {
        if (nnoVar != null) {
            nno a = nnoVar.a();
            if (a != null) {
                return new npk(a, nnwVar);
            }
            throw new IllegalArgumentException("UTC chronology must not be null");
        }
        throw new IllegalArgumentException("Must supply a chronology");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean P(nnx nnxVar) {
        if (nnxVar != null && nnxVar.c() < 43200000) {
            return true;
        }
        return false;
    }

    private final nnq Q(nnq nnqVar, HashMap hashMap) {
        if (nnqVar != null && nnqVar.w()) {
            if (hashMap.containsKey(nnqVar)) {
                return (nnq) hashMap.get(nnqVar);
            }
            npi npiVar = new npi(nnqVar, (nnw) this.b, R(nnqVar.s(), hashMap), R(nnqVar.u(), hashMap), R(nnqVar.t(), hashMap));
            hashMap.put(nnqVar, npiVar);
            return npiVar;
        }
        return nnqVar;
    }

    private final nnx R(nnx nnxVar, HashMap hashMap) {
        if (nnxVar != null && nnxVar.f()) {
            if (hashMap.containsKey(nnxVar)) {
                return (nnx) hashMap.get(nnxVar);
            }
            npj npjVar = new npj(nnxVar, (nnw) this.b);
            hashMap.put(nnxVar, npjVar);
            return npjVar;
        }
        return nnxVar;
    }

    @Override // defpackage.non
    protected final void N(nom nomVar) {
        HashMap hashMap = new HashMap();
        nomVar.l = R(nomVar.l, hashMap);
        nomVar.k = R(nomVar.k, hashMap);
        nomVar.j = R(nomVar.j, hashMap);
        nomVar.i = R(nomVar.i, hashMap);
        nomVar.h = R(nomVar.h, hashMap);
        nomVar.g = R(nomVar.g, hashMap);
        nomVar.f = R(nomVar.f, hashMap);
        nomVar.e = R(nomVar.e, hashMap);
        nomVar.d = R(nomVar.d, hashMap);
        nomVar.c = R(nomVar.c, hashMap);
        nomVar.b = R(nomVar.b, hashMap);
        nomVar.a = R(nomVar.a, hashMap);
        nomVar.E = Q(nomVar.E, hashMap);
        nomVar.F = Q(nomVar.F, hashMap);
        nomVar.G = Q(nomVar.G, hashMap);
        nomVar.H = Q(nomVar.H, hashMap);
        nomVar.I = Q(nomVar.I, hashMap);
        nomVar.x = Q(nomVar.x, hashMap);
        nomVar.y = Q(nomVar.y, hashMap);
        nomVar.z = Q(nomVar.z, hashMap);
        nomVar.D = Q(nomVar.D, hashMap);
        nomVar.A = Q(nomVar.A, hashMap);
        nomVar.B = Q(nomVar.B, hashMap);
        nomVar.C = Q(nomVar.C, hashMap);
        nomVar.m = Q(nomVar.m, hashMap);
        nomVar.n = Q(nomVar.n, hashMap);
        nomVar.o = Q(nomVar.o, hashMap);
        nomVar.p = Q(nomVar.p, hashMap);
        nomVar.q = Q(nomVar.q, hashMap);
        nomVar.r = Q(nomVar.r, hashMap);
        nomVar.s = Q(nomVar.s, hashMap);
        nomVar.u = Q(nomVar.u, hashMap);
        nomVar.t = Q(nomVar.t, hashMap);
        nomVar.v = Q(nomVar.v, hashMap);
        nomVar.w = Q(nomVar.w, hashMap);
    }

    @Override // defpackage.nno
    public final nno a() {
        return this.a;
    }

    @Override // defpackage.nno
    public final nno b(nnw nnwVar) {
        if (nnwVar == this.b) {
            return this;
        }
        if (nnwVar == nnw.a) {
            return this.a;
        }
        return new npk(this.a, nnwVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof npk)) {
            return false;
        }
        npk npkVar = (npk) obj;
        if (this.a.equals(npkVar.a)) {
            if (((nnw) this.b).equals(npkVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((nnw) this.b).hashCode() * 11) + 326565 + (this.a.hashCode() * 7);
    }

    public final String toString() {
        Object obj = this.b;
        return "ZonedChronology[" + String.valueOf(this.a) + ", " + ((nnw) obj).c + "]";
    }

    @Override // defpackage.non, defpackage.nno
    public final nnw z() {
        return (nnw) this.b;
    }
}
