package defpackage;

import android.content.Intent;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class csw implements Runnable {
    private final csy a;
    private final Intent b;
    private final int c;

    public csw(csy csyVar, Intent intent, int i) {
        this.a = csyVar;
        this.b = intent;
        this.c = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.d(this.b, this.c);
    }
}
