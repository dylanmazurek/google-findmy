package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mzv extends mnl implements mww, mnm {
    public final mww a;
    public final mnb b;
    public final int c;
    private mnb d;
    private mmx e;

    public mzv(mww mwwVar, mnb mnbVar) {
        super(mzs.a, mnc.a);
        this.a = mwwVar;
        this.b = mnbVar;
        this.c = ((Number) mnbVar.fold(0, cbj.h)).intValue();
    }

    @Override // defpackage.mnj
    public final Object b(Object obj) {
        Throwable a = mky.a(obj);
        if (a != null) {
            this.d = new mzp(a, o());
        }
        mmx mmxVar = this.e;
        if (mmxVar != null) {
            mmxVar.p(obj);
        }
        return mne.a;
    }

    @Override // defpackage.mnj, defpackage.mnm
    public final mnm bO() {
        mmx mmxVar = this.e;
        if (mmxVar instanceof mnm) {
            return (mnm) mmxVar;
        }
        return null;
    }

    @Override // defpackage.mww
    public final Object dt(Object obj, mmx mmxVar) {
        try {
            mnb o = mmxVar.o();
            mkm.aB(o);
            mnb mnbVar = this.d;
            if (mnbVar != o) {
                if (!(mnbVar instanceof mzp)) {
                    if (((Number) o.fold(0, new yj(this, 11))).intValue() == this.c) {
                        this.d = o;
                    } else {
                        throw new IllegalStateException("Flow invariant is violated:\n\t\tFlow was collected in " + this.b + ",\n\t\tbut emission happened in " + o + ".\n\t\tPlease refer to 'flow' documentation or use 'flowOn' instead");
                    }
                } else {
                    throw new IllegalStateException(moz.d("\n            Flow exception transparency is violated:\n                Previous 'emit' call has thrown exception " + ((mzp) mnbVar).a + ", but then emission attempt of value '" + obj + "' has been detected.\n                Emissions from 'catch' blocks are prohibited in order to avoid unspecified behaviour, 'Flow.catch' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            "));
                }
            }
            this.e = mmxVar;
            mom momVar = mzx.a;
            mww mwwVar = this.a;
            mwwVar.getClass();
            Object a = momVar.a(mwwVar, obj, this);
            if (!amr.i(a, mne.a)) {
                this.e = null;
            }
            if (a == mne.a) {
                return a;
            }
            return mlh.a;
        } catch (Throwable th) {
            this.d = new mzp(th, mmxVar.o());
            throw th;
        }
    }

    @Override // defpackage.mnl, defpackage.mnj
    public final void f() {
        super.f();
    }

    @Override // defpackage.mnl, defpackage.mmx
    public final mnb o() {
        mnb mnbVar = this.d;
        if (mnbVar == null) {
            return mnc.a;
        }
        return mnbVar;
    }

    @Override // defpackage.mnj, defpackage.mnm
    public final void bP() {
    }
}
