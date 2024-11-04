package defpackage;

import android.window.BackEvent;
import android.window.OnBackAnimationCallback;

/* compiled from: PG */
/* loaded from: classes.dex */
final class isk implements OnBackAnimationCallback {
    final /* synthetic */ isi a;
    final /* synthetic */ isl b;

    public isk(isl islVar, isi isiVar) {
        this.a = isiVar;
        this.b = islVar;
    }

    @Override // android.window.OnBackAnimationCallback
    public final void onBackCancelled() {
        if (!this.b.d()) {
            return;
        }
        this.a.z();
    }

    @Override // android.window.OnBackInvokedCallback
    public final void onBackInvoked() {
        this.a.B();
    }

    @Override // android.window.OnBackAnimationCallback
    public final void onBackProgressed(BackEvent backEvent) {
        if (!this.b.d()) {
            return;
        }
        this.a.L(new nu(backEvent));
    }

    @Override // android.window.OnBackAnimationCallback
    public final void onBackStarted(BackEvent backEvent) {
        if (!this.b.d()) {
            return;
        }
        this.a.J(new nu(backEvent));
    }
}
