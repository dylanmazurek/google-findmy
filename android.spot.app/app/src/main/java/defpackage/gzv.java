package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.drawable.Drawable;
import com.google.android.libraries.onegoogle.account.disc.DrawableBadgeViewHolder$AlphaLayerDrawable;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class gzv extends AnimatorListenerAdapter {
    final /* synthetic */ DrawableBadgeViewHolder$AlphaLayerDrawable a;
    final /* synthetic */ Drawable b;
    final /* synthetic */ gzy c;

    public gzv(gzy gzyVar, DrawableBadgeViewHolder$AlphaLayerDrawable drawableBadgeViewHolder$AlphaLayerDrawable, Drawable drawable) {
        this.a = drawableBadgeViewHolder$AlphaLayerDrawable;
        this.b = drawable;
        this.c = gzyVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.c.b.f(this.b);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.c.b.f(this.a);
    }
}
