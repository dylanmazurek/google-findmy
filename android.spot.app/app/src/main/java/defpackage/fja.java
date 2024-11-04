package defpackage;

import android.os.Handler;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fja implements fim {
    final /* synthetic */ fje a;

    public fja(fje fjeVar) {
        this.a = fjeVar;
    }

    @Override // defpackage.fim
    public final void a(boolean z) {
        Handler handler = this.a.n;
        handler.sendMessage(handler.obtainMessage(1, Boolean.valueOf(z)));
    }
}
