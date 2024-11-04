package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class grh implements lsh {
    private final mko a;
    private final mko b;

    public grh(mko mkoVar, mko mkoVar2) {
        this.a = mkoVar;
        this.b = mkoVar2;
    }

    @Override // defpackage.mko, defpackage.mkn
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final gri a() {
        gri griVar;
        gnv gnvVar = (gnv) this.a.a();
        gwc gwcVar = new gwc();
        Context b = ((lry) this.b).b();
        int i = grg.a;
        gnvVar.getClass();
        gwcVar.a(b);
        String a = lur.a.a().a();
        a.getClass();
        if (a.length() > 0) {
            try {
                griVar = (gri) Enum.valueOf(gri.class, a);
            } catch (IllegalArgumentException e) {
                jol jolVar = (jol) ((jol) grf.a.g()).i(e);
                if (gnvVar.k != 0) {
                    jolVar.y("Invalid environment_override value %s, falling back to %s", a, fzo.s(1).name());
                } else {
                    throw null;
                }
            }
            griVar.getClass();
            return griVar;
        }
        if (gnvVar.k != 0) {
            griVar = fzo.s(1);
            griVar.getClass();
            return griVar;
        }
        throw null;
    }
}
