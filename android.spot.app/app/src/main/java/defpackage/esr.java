package defpackage;

import com.google.android.apps.adm.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class esr extends cgk {
    public jer a;
    public jer b;
    public cfn c;
    private final ele d;
    private final ilv e;

    public esr(ilv ilvVar, ele eleVar) {
        jdl jdlVar = jdl.a;
        this.a = jdlVar;
        this.b = jdlVar;
        this.e = ilvVar;
        this.d = eleVar;
    }

    public static esr e(cgq cgqVar) {
        esr esrVar = (esr) new ddh(cgqVar).q(esr.class);
        if (!esrVar.b.g()) {
            esrVar.b = jer.i(false);
        }
        return esrVar;
    }

    public static esr f(cgq cgqVar, boolean z) {
        esr e = e(cgqVar);
        e.b = jer.i(Boolean.valueOf(z));
        return e;
    }

    public final cfk a() {
        hwx.V(this.b.g(), "Use SpotRingingViewModel.get() to initialize the ViewModel.");
        if (this.c == null) {
            this.c = new cfn(b());
        }
        return this.c;
    }

    public final eso b() {
        return d(false);
    }

    public final eso d(boolean z) {
        jer e = this.e.e();
        boolean g = e.g();
        int i = R.string.ringing_volume_default;
        if (!g) {
            return new eso(false, false, kzl.RINGING_VOLUME_DEFAULT, R.string.ringing_volume_default);
        }
        kyf kyfVar = this.d.a((lqc) e.c()).b;
        if (kyfVar == null) {
            kyfVar = kyf.r;
        }
        kyg kygVar = kyfVar.g;
        if (kygVar == null) {
            kygVar = kyg.d;
        }
        if (!kygVar.b || (((Boolean) this.b.c()).booleanValue() && !eku.m(kyfVar))) {
            return new eso(false, false, kzl.RINGING_VOLUME_DEFAULT, R.string.ringing_volume_default);
        }
        jer jerVar = this.a;
        kyl kylVar = kyfVar.c;
        if (kylVar == null) {
            kylVar = kyl.j;
        }
        kzl b = kzl.b(kylVar.i);
        if (b == null) {
            b = kzl.UNRECOGNIZED;
        }
        kzl kzlVar = (kzl) jerVar.e(b);
        int ordinal = kzlVar.ordinal();
        if (ordinal != 1) {
            if (ordinal != 2) {
                if (ordinal == 3) {
                    i = R.string.ringing_volume_high;
                }
            } else {
                i = R.string.ringing_volume_medium;
            }
        } else {
            i = R.string.ringing_volume_low;
        }
        return new eso(true, z, kzlVar, i);
    }
}
