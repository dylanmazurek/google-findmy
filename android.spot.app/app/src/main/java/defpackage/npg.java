package defpackage;

import j$.util.concurrent.ConcurrentHashMap;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class npg extends non {
    public static final npg o;
    private static final ConcurrentHashMap p;
    private static final long serialVersionUID = -6212696554273812441L;

    static {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        p = concurrentHashMap;
        npg npgVar = new npg(npe.H);
        o = npgVar;
        concurrentHashMap.put(nnw.a, npgVar);
    }

    private npg(nno nnoVar) {
        super(nnoVar, null);
    }

    public static npg O() {
        return P(nnw.j());
    }

    public static npg P(nnw nnwVar) {
        if (nnwVar == null) {
            nnwVar = nnw.j();
        }
        ConcurrentHashMap concurrentHashMap = p;
        npg npgVar = (npg) concurrentHashMap.get(nnwVar);
        if (npgVar == null) {
            npgVar = new npg(npk.O(o, nnwVar));
            npg npgVar2 = (npg) concurrentHashMap.putIfAbsent(nnwVar, npgVar);
            if (npgVar2 != null) {
                return npgVar2;
            }
        }
        return npgVar;
    }

    private Object writeReplace() {
        return new npf(z());
    }

    @Override // defpackage.non
    protected final void N(nom nomVar) {
        if (this.a.z() == nnw.a) {
            nomVar.H = new npq(nph.a, nns.d);
            nomVar.k = nomVar.H.s();
            nomVar.G = new npy((npq) nomVar.H, nns.e);
            nomVar.C = new npy((npq) nomVar.H, nomVar.h, nns.j);
        }
    }

    @Override // defpackage.nno
    public final nno a() {
        return o;
    }

    @Override // defpackage.nno
    public final nno b(nnw nnwVar) {
        if (nnwVar == z()) {
            return this;
        }
        return P(nnwVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof npg) {
            return z().equals(((npg) obj).z());
        }
        return false;
    }

    public final int hashCode() {
        return z().hashCode() + 800855;
    }

    public final String toString() {
        nnw z = z();
        if (z != null) {
            return "ISOChronology[" + z.c + "]";
        }
        return "ISOChronology";
    }
}
