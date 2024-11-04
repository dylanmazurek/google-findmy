package defpackage;

import j$.util.Objects;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dhb extends dsf implements Cloneable {
    private dhb A;
    private Float B;
    private boolean C = true;
    private boolean D;
    private boolean E;
    public final dhd a;
    private final Class u;
    private final dgr v;
    private dhe w;
    private Object x;
    private List y;
    private dhb z;

    static {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public dhb(dgo dgoVar, dhd dhdVar, Class cls) {
        this.a = dhdVar;
        this.u = cls;
        dgr dgrVar = dhdVar.a.b;
        dhe dheVar = (dhe) dgrVar.c.get(cls);
        if (dheVar == null) {
            for (Map.Entry entry : dgrVar.c.entrySet()) {
                if (((Class) entry.getKey()).isAssignableFrom(cls)) {
                    dheVar = (dhe) entry.getValue();
                }
            }
        }
        this.w = dheVar == null ? dgr.a : dheVar;
        this.v = dgoVar.b;
        Iterator it = dhdVar.d.iterator();
        while (it.hasNext()) {
            a((dsm) it.next());
        }
        f(dhdVar.e());
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final dsi E(Object obj, dsw dswVar, dsm dsmVar, dsk dskVar, dhe dheVar, dgs dgsVar, int i, int i2, dsf dsfVar, Executor executor) {
        dsg dsgVar;
        dsk dskVar2;
        dsi F;
        int i3;
        int i4;
        dhe dheVar2;
        dgs dgsVar2;
        int i5;
        int i6;
        if (this.A != null) {
            dskVar2 = new dsg(obj, dskVar);
            dsgVar = dskVar2;
        } else {
            dsgVar = 0;
            dskVar2 = dskVar;
        }
        dhb dhbVar = this.z;
        if (dhbVar != null) {
            if (!this.E) {
                dhe dheVar3 = dhbVar.w;
                if (true == dhbVar.C) {
                    dheVar2 = dheVar;
                } else {
                    dheVar2 = dheVar3;
                }
                if (super.x(8)) {
                    dgsVar2 = dhbVar.d;
                } else {
                    int i7 = dha.b[dgsVar.ordinal()];
                    if (i7 != 1) {
                        if (i7 != 2) {
                            if (i7 != 3 && i7 != 4) {
                                throw new IllegalArgumentException("unknown priority: ".concat(String.valueOf(String.valueOf(this.d))));
                            }
                            dgsVar2 = dgs.IMMEDIATE;
                        } else {
                            dgsVar2 = dgs.HIGH;
                        }
                    } else {
                        dgsVar2 = dgs.NORMAL;
                    }
                }
                dgs dgsVar3 = dgsVar2;
                dhb dhbVar2 = this.z;
                int i8 = dhbVar2.k;
                int i9 = dhbVar2.j;
                if (dtq.l(i, i2) && !this.z.y()) {
                    i6 = dsfVar.k;
                    i5 = dsfVar.j;
                } else {
                    i5 = i9;
                    i6 = i8;
                }
                dsp dspVar = new dsp(obj, dskVar2);
                dsi F2 = F(obj, dswVar, dsmVar, dsfVar, dspVar, dheVar, dgsVar, i, i2, executor);
                this.E = true;
                dhb dhbVar3 = this.z;
                dsi E = dhbVar3.E(obj, dswVar, dsmVar, dspVar, dheVar2, dgsVar3, i6, i5, dhbVar3, executor);
                this.E = false;
                dspVar.a = F2;
                dspVar.b = E;
                F = dspVar;
            } else {
                throw new IllegalStateException("You cannot use a request as both the main request and a thumbnail, consider using clone() on the request(s) passed to thumbnail()");
            }
        } else {
            F = F(obj, dswVar, dsmVar, dsfVar, dskVar2, dheVar, dgsVar, i, i2, executor);
        }
        if (dsgVar == 0) {
            return F;
        }
        dhb dhbVar4 = this.A;
        int i10 = dhbVar4.k;
        int i11 = dhbVar4.j;
        if (dtq.l(i, i2) && !this.A.y()) {
            i4 = dsfVar.k;
            i3 = dsfVar.j;
        } else {
            i3 = i11;
            i4 = i10;
        }
        dhb dhbVar5 = this.A;
        dsi E2 = dhbVar5.E(obj, dswVar, dsmVar, dsgVar, dhbVar5.w, dhbVar5.d, i4, i3, dhbVar5, executor);
        dsgVar.a = F;
        dsgVar.b = E2;
        return dsgVar;
    }

    private final dsi F(Object obj, dsw dswVar, dsm dsmVar, dsf dsfVar, dsk dskVar, dhe dheVar, dgs dgsVar, int i, int i2, Executor executor) {
        Object obj2 = this.x;
        List list = this.y;
        bqd bqdVar = dheVar.a;
        Class cls = this.u;
        dgr dgrVar = this.v;
        return new dso(dgrVar, obj, obj2, cls, dsfVar, i, i2, dgsVar, dswVar, dsmVar, list, dskVar, dgrVar.d, executor);
    }

    public final dhb a(dsm dsmVar) {
        if (this.r) {
            return clone().a(dsmVar);
        }
        if (dsmVar != null) {
            if (this.y == null) {
                this.y = new ArrayList();
            }
            this.y.add(dsmVar);
        }
        B();
        return this;
    }

    @Override // defpackage.dsf
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final dhb f(dsf dsfVar) {
        bsc.q(dsfVar);
        return (dhb) super.f(dsfVar);
    }

    @Override // defpackage.dsf
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final dhb clone() {
        dhb dhbVar = (dhb) super.clone();
        dhbVar.w = dhbVar.w.clone();
        List list = dhbVar.y;
        if (list != null) {
            dhbVar.y = new ArrayList(list);
        }
        dhb dhbVar2 = dhbVar.z;
        if (dhbVar2 != null) {
            dhbVar.z = dhbVar2.clone();
        }
        dhb dhbVar3 = dhbVar.A;
        if (dhbVar3 != null) {
            dhbVar.A = dhbVar3.clone();
        }
        return dhbVar;
    }

    public final dhb d(byte[] bArr) {
        dhb e = e(bArr);
        if (!super.x(4)) {
            e = e.f(dsn.b(dkp.b));
        }
        if (!super.x(256)) {
            if (dsn.a == null) {
                dsn dsnVar = (dsn) new dsn().C();
                dsnVar.D();
                dsn.a = dsnVar;
            }
            return e.f(dsn.a);
        }
        return e;
    }

    public final dhb e(Object obj) {
        if (this.r) {
            return clone().e(obj);
        }
        this.x = obj;
        this.D = true;
        B();
        return this;
    }

    @Override // defpackage.dsf
    public final boolean equals(Object obj) {
        if (obj instanceof dhb) {
            dhb dhbVar = (dhb) obj;
            if (super.equals(dhbVar) && Objects.equals(this.u, dhbVar.u) && this.w.equals(dhbVar.w) && Objects.equals(this.x, dhbVar.x) && Objects.equals(this.y, dhbVar.y) && Objects.equals(this.z, dhbVar.z) && Objects.equals(this.A, dhbVar.A)) {
                Float f = dhbVar.B;
                if (Objects.equals(null, null) && this.C == dhbVar.C && this.D == dhbVar.D) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0068  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void h(android.widget.ImageView r4) {
        /*
            r3 = this;
            defpackage.dtq.g()
            defpackage.bsc.q(r4)
            r0 = 2048(0x800, float:2.87E-42)
            boolean r0 = super.x(r0)
            if (r0 != 0) goto L53
            boolean r0 = r3.n
            if (r0 == 0) goto L53
            android.widget.ImageView$ScaleType r0 = r4.getScaleType()
            if (r0 == 0) goto L53
            int[] r0 = defpackage.dha.a
            android.widget.ImageView$ScaleType r1 = r4.getScaleType()
            int r1 = r1.ordinal()
            r0 = r0[r1]
            switch(r0) {
                case 1: goto L4a;
                case 2: goto L41;
                case 3: goto L31;
                case 4: goto L31;
                case 5: goto L31;
                case 6: goto L28;
                default: goto L27;
            }
        L27:
            goto L53
        L28:
            dhb r0 = r3.clone()
            dsf r0 = r0.n()
            goto L54
        L31:
            dhb r0 = r3.clone()
            dpc r1 = defpackage.dpc.a
            dpk r2 = new dpk
            r2.<init>()
            dsf r0 = super.o(r1, r2)
            goto L54
        L41:
            dhb r0 = r3.clone()
            dsf r0 = r0.n()
            goto L54
        L4a:
            dhb r0 = r3.clone()
            dsf r0 = r0.m()
            goto L54
        L53:
            r0 = r3
        L54:
            dgr r1 = r3.v
            java.lang.Class r2 = r3.u
            dsc r1 = r1.g
            java.lang.Class<android.graphics.Bitmap> r1 = android.graphics.Bitmap.class
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L68
            dsr r1 = new dsr
            r1.<init>(r4)
            goto L75
        L68:
            java.lang.Class<android.graphics.drawable.Drawable> r1 = android.graphics.drawable.Drawable.class
            boolean r1 = r1.isAssignableFrom(r2)
            if (r1 == 0) goto L7c
            dsu r1 = new dsu
            r1.<init>(r4)
        L75:
            r4 = 0
            java.util.concurrent.Executor r2 = defpackage.dti.a
            r3.j(r1, r4, r0, r2)
            return
        L7c:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Unhandled class: "
            java.lang.String r1 = ", try .as*(Class).transcode(ResourceTranscoder)"
            java.lang.String r0 = defpackage.der.c(r2, r0, r1)
            r4.<init>(r0)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dhb.h(android.widget.ImageView):void");
    }

    @Override // defpackage.dsf
    public final int hashCode() {
        return dtq.c(this.D ? 1 : 0, dtq.c(this.C ? 1 : 0, dtq.d(null, dtq.d(this.A, dtq.d(this.z, dtq.d(this.y, dtq.d(this.x, dtq.d(this.w, dtq.d(this.u, super.hashCode())))))))));
    }

    public final void i(dsw dswVar) {
        j(dswVar, null, this, dti.a);
    }

    public final void j(dsw dswVar, dsm dsmVar, dsf dsfVar, Executor executor) {
        bsc.q(dswVar);
        if (this.D) {
            dsi E = E(new Object(), dswVar, dsmVar, null, this.w, dsfVar.d, dsfVar.k, dsfVar.j, dsfVar, executor);
            dsi c = dswVar.c();
            if (E.m(c) && (dsfVar.i || !c.l())) {
                bsc.q(c);
                if (!c.n()) {
                    c.b();
                    return;
                }
                return;
            }
            this.a.g(dswVar);
            dswVar.d(E);
            this.a.n(dswVar, E);
            return;
        }
        throw new IllegalArgumentException("You must call #load() before calling #into()");
    }
}
