package defpackage;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.view.animation.AccelerateInterpolator;
import com.google.android.apps.adm.R;
import com.google.android.libraries.onegoogle.account.disc.AvatarView;
import com.google.android.libraries.onegoogle.account.disc.BadgeFrameLayout;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gzy {
    public final BadgeFrameLayout a;
    public final AvatarView b;
    public hjp c;
    public Animator d = null;
    public gbm e;
    private gzn f;

    public gzy(BadgeFrameLayout badgeFrameLayout, AvatarView avatarView) {
        this.a = badgeFrameLayout;
        avatarView.d();
        this.b = avatarView;
    }

    private static Drawable b(gzn gznVar) {
        if (gznVar == null) {
            return null;
        }
        return gznVar.a;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, com.google.android.libraries.onegoogle.account.disc.DrawableBadgeViewHolder$AlphaLayerDrawable] */
    public final void a(gzn gznVar, boolean z) {
        ObjectAnimator ofInt;
        long j;
        ijs.c();
        if (amr.g(this.f, gznVar)) {
            return;
        }
        final Drawable b = b(this.f);
        this.f = gznVar;
        final Drawable b2 = b(gznVar);
        if (b == null) {
            ofInt = ObjectAnimator.ofFloat(this.b, "badgeScale", 0.0f, 1.0f);
            ofInt.addListener(new gzw(this, b2));
        } else if (gznVar == null) {
            ofInt = ObjectAnimator.ofFloat(this.b, "badgeScale", 1.0f, 0.0f);
            ofInt.addListener(new gzx(this));
        } else {
            ?? r2 = new LayerDrawable(b, b2) { // from class: com.google.android.libraries.onegoogle.account.disc.DrawableBadgeViewHolder$AlphaLayerDrawable
                private final Drawable a;
                private final Drawable b;

                {
                    super(new Drawable[]{b, b2});
                    this.a = b;
                    this.b = b2;
                    b2.setCallback(this);
                }

                @Override // android.graphics.drawable.LayerDrawable, android.graphics.drawable.Drawable
                public int getAlpha() {
                    return this.b.getAlpha();
                }

                @Override // android.graphics.drawable.LayerDrawable, android.graphics.drawable.Drawable
                public final int getOpacity() {
                    return this.a.getOpacity();
                }

                @Override // android.graphics.drawable.LayerDrawable, android.graphics.drawable.Drawable.Callback
                public final void invalidateDrawable(Drawable drawable) {
                    invalidateSelf();
                }

                @Override // android.graphics.drawable.LayerDrawable, android.graphics.drawable.Drawable.Callback
                public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j2) {
                    scheduleSelf(runnable, j2);
                }

                @Override // android.graphics.drawable.LayerDrawable, android.graphics.drawable.Drawable
                public void setAlpha(int i) {
                    this.b.setAlpha(i);
                    this.b.invalidateSelf();
                }

                @Override // android.graphics.drawable.LayerDrawable, android.graphics.drawable.Drawable
                public final void setColorFilter(ColorFilter colorFilter) {
                    this.a.setColorFilter(colorFilter);
                }

                @Override // android.graphics.drawable.LayerDrawable, android.graphics.drawable.Drawable.Callback
                public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
                    unscheduleSelf(runnable);
                }
            };
            ofInt = ObjectAnimator.ofInt((Object) r2, "alpha", 0, 255);
            ofInt.addListener(new gzv(this, r2, b2));
        }
        if (z) {
            j = this.b.getResources().getInteger(R.integer.og_decoration_transition_duration);
        } else {
            j = 0;
        }
        ofInt.setDuration(j);
        ofInt.setInterpolator(new AccelerateInterpolator());
        ofInt.addListener(new gzu(this, gznVar));
        Animator animator = this.d;
        if (animator != null) {
            animator.end();
        }
        this.d = ofInt;
        ofInt.start();
    }
}
