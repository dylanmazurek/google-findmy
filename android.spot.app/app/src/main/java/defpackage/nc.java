package defpackage;

import android.window.OnBackInvokedCallback;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class nc implements OnBackInvokedCallback {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ nc(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r0v4, types: [mnw, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, isi] */
    @Override // android.window.OnBackInvokedCallback
    public final void onBackInvoked() {
        int i = this.b;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    this.a.B();
                    return;
                } else {
                    this.a.a();
                    return;
                }
            }
            ((dn) this.a).I();
            return;
        }
        this.a.run();
    }
}
