package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.material.card.MaterialCardView;
import java.io.Closeable;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dzc extends AnimatorListenerAdapter {
    final /* synthetic */ MaterialCardView a;
    final /* synthetic */ Closeable b;

    public dzc(MaterialCardView materialCardView, Closeable closeable) {
        this.a = materialCardView;
        this.b = closeable;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        animator.getClass();
        int i = dzd.w;
        bsd.g(this.a, -2);
        this.b.close();
    }
}
