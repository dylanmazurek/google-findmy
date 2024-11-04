package defpackage;

import j$.util.concurrent.ConcurrentHashMap;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class npe extends nou {
    private static final long serialVersionUID = -861407383323710522L;
    private static final ConcurrentHashMap I = new ConcurrentHashMap();
    public static final npe H = ai(nnw.a);

    private npe(nno nnoVar, int i) {
        super(nnoVar, i);
    }

    public static npe ai(nnw nnwVar) {
        return aj(nnwVar, 4);
    }

    public static npe aj(nnw nnwVar, int i) {
        npe npeVar;
        if (nnwVar == null) {
            nnwVar = nnw.j();
        }
        ConcurrentHashMap concurrentHashMap = I;
        npe[] npeVarArr = (npe[]) concurrentHashMap.get(nnwVar);
        if (npeVarArr == null) {
            npeVarArr = new npe[7];
            npe[] npeVarArr2 = (npe[]) concurrentHashMap.putIfAbsent(nnwVar, npeVarArr);
            if (npeVarArr2 != null) {
                npeVarArr = npeVarArr2;
            }
        }
        int i2 = i - 1;
        try {
            npe npeVar2 = npeVarArr[i2];
            if (npeVar2 == null) {
                synchronized (npeVarArr) {
                    npeVar2 = npeVarArr[i2];
                    if (npeVar2 == null) {
                        nnw nnwVar2 = nnw.a;
                        if (nnwVar == nnwVar2) {
                            npeVar = new npe(null, i);
                        } else {
                            npeVar = new npe(npk.O(aj(nnwVar2, i), nnwVar), i);
                        }
                        npeVarArr[i2] = npeVar;
                        npeVar2 = npeVar;
                    }
                }
            }
            return npeVar2;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new IllegalArgumentException(a.ae(i, "Invalid min days in first week: "));
        }
    }

    private Object readResolve() {
        int i = ((nor) this).G;
        if (i == 0) {
            i = 4;
        }
        nno nnoVar = this.a;
        if (nnoVar == null) {
            return aj(nnw.a, i);
        }
        return aj(nnoVar.z(), i);
    }

    @Override // defpackage.nor, defpackage.non
    protected final void N(nom nomVar) {
        nns r;
        if (this.a == null) {
            nomVar.a = nor.o;
            nomVar.b = nor.p;
            nomVar.c = nor.q;
            nomVar.d = nor.r;
            nomVar.e = nor.s;
            nomVar.f = nor.t;
            nomVar.g = nor.u;
            nomVar.m = nor.v;
            nomVar.n = nor.w;
            nomVar.o = nor.x;
            nomVar.p = nor.y;
            nomVar.q = nor.z;
            nomVar.r = nor.A;
            nomVar.s = nor.B;
            nomVar.u = nor.C;
            nomVar.t = nor.D;
            nomVar.v = nor.E;
            nomVar.w = nor.F;
            nomVar.E = new noy(this);
            nomVar.F = new npd(nomVar.E, this);
            nnq nnqVar = nomVar.F;
            if (nnqVar == null) {
                r = null;
            } else {
                r = nnqVar.r();
            }
            nomVar.H = new npq(new npu(nnqVar, r, 99), nns.d);
            nomVar.k = nomVar.H.s();
            npq npqVar = (npq) nomVar.H;
            nomVar.G = new npu(new npy(npqVar, npqVar.g), nns.e);
            nomVar.I = new npa(this);
            nomVar.x = new noz(this, nomVar.f);
            nomVar.y = new nos(this, nomVar.f);
            nomVar.z = new not(this, nomVar.f);
            nomVar.D = new npc(this);
            nomVar.B = new nox(this);
            nomVar.A = new now(this, nomVar.g);
            nomVar.C = new npu(new npy(nomVar.B, nomVar.k, nns.j), nns.j);
            nomVar.j = nomVar.E.s();
            nomVar.i = nomVar.D.s();
            nomVar.h = nomVar.B.s();
        }
    }

    @Override // defpackage.nno
    public final nno a() {
        return H;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x001b, code lost:            if (ah(r7) != false) goto L5;     */
    @Override // defpackage.nor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long aa(int r7) {
        /*
            r6 = this;
            int r0 = r7 / 100
            if (r7 >= 0) goto L11
            int r1 = r7 + 3
            int r1 = r1 >> 2
            int r1 = r1 - r0
            int r0 = r0 + 3
            int r0 = r0 >> 2
            int r1 = r1 + r0
        Le:
            int r1 = r1 + (-1)
            goto L1e
        L11:
            int r1 = r7 >> 2
            int r1 = r1 - r0
            int r0 = r0 >> 2
            boolean r2 = r6.ah(r7)
            int r1 = r1 + r0
            if (r2 == 0) goto L1e
            goto Le
        L1e:
            long r2 = (long) r7
            r7 = -719527(0xfffffffffff50559, float:NaN)
            int r1 = r1 + r7
            r4 = 365(0x16d, double:1.803E-321)
            long r2 = r2 * r4
            long r0 = (long) r1
            long r2 = r2 + r0
            r0 = 86400000(0x5265c00, double:4.2687272E-316)
            long r2 = r2 * r0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.npe.aa(int):long");
    }

    @Override // defpackage.nor
    public final boolean ah(int i) {
        if ((i & 3) != 0) {
            return false;
        }
        if (i % 100 == 0 && i % 400 != 0) {
            return false;
        }
        return true;
    }

    @Override // defpackage.nno
    public final nno b(nnw nnwVar) {
        if (nnwVar == z()) {
            return this;
        }
        return ai(nnwVar);
    }
}
