package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class asl implements asn {
    public final asj a = new asj(asm.a, bln.Ltr, new aso());
    public final ask b = new ask(this);
    private aqs c;

    @Override // defpackage.ble
    public final float a() {
        return this.a.a.a();
    }

    @Override // defpackage.blj
    public final float b() {
        return this.a.a.b();
    }

    @Override // defpackage.blj
    public final /* synthetic */ float cc(long j) {
        return bbp.e(this, j);
    }

    @Override // defpackage.ble
    public final /* synthetic */ float cf(float f) {
        return bbc.b(this, f);
    }

    @Override // defpackage.ble
    public final /* synthetic */ float cg(int i) {
        return bbc.c(this, i);
    }

    @Override // defpackage.ble
    public final /* synthetic */ float ch(long j) {
        return bbc.d(this, j);
    }

    @Override // defpackage.ble
    public final /* synthetic */ float ci(float f) {
        return bbc.e(this, f);
    }

    @Override // defpackage.ble
    public final /* synthetic */ int cj(float f) {
        throw null;
    }

    @Override // defpackage.ble
    public final /* synthetic */ long ck(long j) {
        return bbc.g(this, j);
    }

    @Override // defpackage.blj
    public final /* synthetic */ long cl(float f) {
        return bbp.f(this, f);
    }

    @Override // defpackage.ble
    public final /* synthetic */ long cm(float f) {
        return bbc.h(this, f);
    }

    @Override // defpackage.asn
    public final /* synthetic */ long l() {
        return kv.e(this);
    }

    @Override // defpackage.asn
    public final bln m() {
        return this.a.b;
    }

    @Override // defpackage.asn
    public final ask n() {
        return this.b;
    }

    public final aqs o(kv kvVar) {
        if (amr.i(kvVar, asp.a)) {
            aqs aqsVar = this.c;
            if (aqsVar == null) {
                aqs aqsVar2 = new aqs();
                aqsVar2.f(0);
                this.c = aqsVar2;
                return aqsVar2;
            }
            return aqsVar;
        }
        throw new mku();
    }

    @Override // defpackage.asn
    public final void p(long j, long j2, float f, kv kvVar, ji jiVar) {
        aqv aqvVar = this.a.c;
        float b = aqk.b(0L);
        float c = aqk.c(0L);
        float b2 = aqk.b(0L) + aqn.b(j2);
        float c2 = aqk.c(0L) + aqn.a(j2);
        aqs o = o(kvVar);
        if (f != 1.0f) {
            j = jw.g(aqx.d(j), aqx.c(j), aqx.b(j), aqx.a(j) * f, aqx.f(j));
        }
        if (!a.n(o.b(), j)) {
            o.e(j);
        }
        if (!amr.i(o.c, jiVar)) {
            o.i(jiVar);
        }
        if (!a.m(o.b, 3)) {
            o.d(3);
        }
        if (!a.m(o.a(), 1)) {
            o.h();
        }
        aqvVar.h(b, c, b2, c2, o);
    }
}
