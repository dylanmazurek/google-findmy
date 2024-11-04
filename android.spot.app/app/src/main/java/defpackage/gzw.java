package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.drawable.Drawable;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class gzw extends AnimatorListenerAdapter {
    final /* synthetic */ Drawable a;
    final /* synthetic */ gzy b;

    public gzw(gzy gzyVar, Drawable drawable) {
        this.a = drawable;
        this.b = gzyVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.b.b.f(this.a);
        this.b.a.setVisibility(0);
    }
}
