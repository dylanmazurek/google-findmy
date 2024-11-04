package defpackage;

import java.util.ArrayList;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class mzd implements mzr {
    public final mnb a;
    public final int b;
    public final int c;

    public mzd(mnb mnbVar, int i, int i2) {
        this.a = mnbVar;
        this.b = i;
        this.c = i2;
        boolean z = msy.a;
    }

    public static /* synthetic */ Object e(mzd mzdVar, mww mwwVar, mmx mmxVar) {
        Object l = msz.l(new mzi(mwwVar, mzdVar, (mmx) null, 1), mmxVar);
        if (l == mne.a) {
            return l;
        }
        return mlh.a;
    }

    @Override // defpackage.mwv
    public Object a(mww mwwVar, mmx mmxVar) {
        return e(this, mwwVar, mmxVar);
    }

    public abstract Object b(mwi mwiVar, mmx mmxVar);

    protected abstract mzd c(mnb mnbVar, int i, int i2);

    @Override // defpackage.mzr
    public final mwv ds(mnb mnbVar, int i) {
        boolean z = msy.a;
        int i2 = 0;
        if (i == 1) {
            int i3 = this.b;
            if (i3 != -2) {
                if (i3 < 0) {
                    i2 = Integer.MAX_VALUE;
                } else {
                    i2 = i3;
                }
            }
            i = this.c;
        }
        mnb mnbVar2 = this.a;
        if (amr.i(mnbVar2, mnbVar2) && i2 == this.b && i == this.c) {
            return this;
        }
        return c(mnbVar2, i2, i);
    }

    public mwv f() {
        return null;
    }

    public String toString() {
        ArrayList arrayList = new ArrayList(4);
        mnb mnbVar = this.a;
        if (mnbVar != mnc.a) {
            Objects.toString(mnbVar);
            arrayList.add("context=".concat("EmptyCoroutineContext"));
        }
        arrayList.add("capacity=" + this.b);
        if (this.c != 1) {
            Objects.toString(mkm.av(2));
            arrayList.add("onBufferOverflow=".concat(mkm.av(2)));
        }
        return msz.a(this) + "[" + mkm.ar(arrayList, ", ", null, null, null, 62) + "]";
    }
}
