package defpackage;

import android.graphics.Bitmap;
import android.os.Handler;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dqs extends dss {
    final int a;
    public Bitmap b;
    private final Handler c;
    private final long d;

    public dqs(Handler handler, int i, long j) {
        this.c = handler;
        this.a = i;
        this.d = j;
    }

    @Override // defpackage.dsw
    public final /* bridge */ /* synthetic */ void g(Object obj) {
        this.b = (Bitmap) obj;
        Handler handler = this.c;
        handler.sendMessageAtTime(handler.obtainMessage(1, this), this.d);
    }

    @Override // defpackage.dsw
    public final void k() {
        this.b = null;
    }
}
