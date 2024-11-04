package defpackage;

import android.window.BackEvent;
import android.window.OnBackAnimationCallback;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class os implements OnBackAnimationCallback {
    final /* synthetic */ moh a;
    final /* synthetic */ moh b;
    final /* synthetic */ mnw c;
    final /* synthetic */ mnw d;

    public os(moh mohVar, moh mohVar2, mnw mnwVar, mnw mnwVar2) {
        this.a = mohVar;
        this.b = mohVar2;
        this.c = mnwVar;
        this.d = mnwVar2;
    }

    @Override // android.window.OnBackAnimationCallback
    public final void onBackCancelled() {
        this.d.a();
    }

    @Override // android.window.OnBackInvokedCallback
    public final void onBackInvoked() {
        this.c.a();
    }

    @Override // android.window.OnBackAnimationCallback
    public final void onBackProgressed(BackEvent backEvent) {
        backEvent.getClass();
        this.b.a(new nu(backEvent));
    }

    @Override // android.window.OnBackAnimationCallback
    public final void onBackStarted(BackEvent backEvent) {
        backEvent.getClass();
        this.a.a(new nu(backEvent));
    }
}
