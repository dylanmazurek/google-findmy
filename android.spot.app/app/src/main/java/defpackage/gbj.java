package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gbj {
    public final Context a;
    public final jzc b;
    public final mko c;
    public volatile huj d;
    ffc e;
    ffc f;

    public gbj() {
        throw null;
    }

    public final synchronized ffc a(gay gayVar) {
        int i = gayVar.b - 1;
        if (i != 0 && i != 1) {
            if (i != 2) {
                return null;
            }
            if (this.f == null) {
                this.f = ffc.i(this.a, "NOOP_LOG_SOURCE_NAME");
            }
            return this.f;
        }
        if (this.e == null) {
            this.e = new fex(this.a, "NOOP_LOG_SOURCE_NAME").a();
        }
        return this.e;
    }

    public final jyz b(gbi gbiVar, jyz jyzVar) {
        return jwb.h(jwu.h(jyzVar, new ejc(this, gbiVar, 14, null), this.b), fhn.class, new etl(3), jxv.a);
    }

    public gbj(Context context, mko mkoVar, jzc jzcVar) {
        this.a = context;
        this.c = mkoVar;
        this.b = jzcVar;
    }
}
