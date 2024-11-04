package defpackage;

import android.content.Context;
import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gsf implements gsb {
    public static final joo a = joo.m("GnpSdk");
    public final Context b;
    public final Class c;
    public final gvg d;
    private final mnb e;

    public gsf(Context context, mnb mnbVar, Class cls, gvg gvgVar) {
        cls.getClass();
        gvgVar.getClass();
        this.b = context;
        this.e = mnbVar;
        this.c = cls;
        this.d = gvgVar;
    }

    @Override // defpackage.gsb
    public final Object a(int i, gwf gwfVar, mmx mmxVar) {
        Object l = mpp.l(this.e, new gsd(this, gwfVar, i, (mmx) null, 0), mmxVar);
        if (l == mne.a) {
            return l;
        }
        return mlh.a;
    }

    @Override // defpackage.gsb
    public final Object b(gry gryVar, gwf gwfVar, Bundle bundle, Long l, mmx mmxVar) {
        return mpp.l(this.e, new gse(gryVar, this, gwfVar, bundle, l, null), mmxVar);
    }
}
