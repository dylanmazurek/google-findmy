package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fex {
    public final Context a;
    public final String b;
    public final jfe c = new eft(4);
    public ffm d = ffm.a;
    public String e;
    public fff f;

    public fex(Context context, String str) {
        fma.aR(context);
        this.a = context;
        fma.aP(str);
        this.b = str;
    }

    public final ffc a() {
        return new ffc(this.a, this.b, this.e, this.d, null, null, this.c, this.f);
    }

    public final void b(ffm ffmVar) {
        fma.aR(ffmVar);
        this.d = ffmVar;
        fey.d(ffmVar);
    }
}
