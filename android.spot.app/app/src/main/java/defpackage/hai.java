package defpackage;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.drawable.Drawable;
import com.google.android.libraries.onegoogle.account.disc.AvatarView;
import com.google.android.libraries.onegoogle.account.disc.RingFrameLayout;
import com.google.android.libraries.onegoogle.common.CirclePulseDrawable;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hai {
    public final AvatarView a;
    public final RingFrameLayout b;
    public gbm c;
    public hjp d;
    public jer e;
    public jer f;
    private AnimatorSet g = new AnimatorSet();

    public hai(AvatarView avatarView, RingFrameLayout ringFrameLayout) {
        jdl jdlVar = jdl.a;
        this.e = jdlVar;
        this.f = jdlVar;
        this.a = avatarView;
        this.b = ringFrameLayout;
        avatarView.d();
        avatarView.g = new ah(this, 16);
        avatarView.c(avatarView.d);
        ringFrameLayout.setVisibility(0);
    }

    public final void a(jer jerVar, boolean z) {
        Object obj;
        if (this.g.isRunning()) {
            this.g.cancel();
        }
        if (!this.f.g()) {
            this.e = jerVar;
            return;
        }
        int intValue = ((Integer) this.f.c()).intValue();
        gbm gbmVar = null;
        if (!jerVar.g()) {
            obj = null;
        } else {
            hae haeVar = (hae) jerVar.c();
            if (haeVar.d != null) {
                obj = new hab(new njz(new haf(this.a.getResources())));
            } else {
                miv mivVar = haeVar.c;
                if (mivVar != null) {
                    ((CirclePulseDrawable) mivVar.a).setAlpha(128);
                    Object obj2 = mivVar.c;
                    if (obj2 != null) {
                        ((AnimatorSet) obj2).cancel();
                        ((AnimatorSet) mivVar.c).removeAllListeners();
                    }
                    int i = intValue + intValue;
                    CirclePulseDrawable circlePulseDrawable = (CirclePulseDrawable) mivVar.a;
                    AnimatorSet e = miv.e(circlePulseDrawable, "firstPulseSize", i, 950L, 900L);
                    AnimatorSet e2 = miv.e(circlePulseDrawable, "secondPulseSize", i, 900L, 834L);
                    e2.setStartDelay(400L);
                    AnimatorSet animatorSet = new AnimatorSet();
                    animatorSet.playTogether(e, e2);
                    mivVar.c = animatorSet;
                    ((AnimatorSet) mivVar.c).addListener(new hfc(mivVar));
                    if (mivVar.b) {
                        ((AnimatorSet) mivVar.c).start();
                    }
                    obj = mivVar.a;
                } else {
                    throw new IllegalStateException("RingContent must have a ring drawable factory.");
                }
            }
        }
        jin jinVar = new jin();
        AvatarView avatarView = this.a;
        if (avatarView.e != null) {
            ObjectAnimator duration = ObjectAnimator.ofInt(avatarView, "currRingThickness", intValue, -1).setDuration(200L);
            duration.addListener(new hag(this));
            jinVar.h(duration);
        }
        if (obj != null) {
            ObjectAnimator duration2 = ObjectAnimator.ofInt(this.a, "currRingThickness", -1, intValue).setDuration(200L);
            duration2.addListener(new hah(this, jerVar, (Drawable) obj));
            jinVar.h(duration2);
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        animatorSet2.playSequentially(jinVar.g());
        this.g = animatorSet2;
        if (!z || this.a.e == obj) {
            this.g.setDuration(0L);
        }
        this.g.start();
        if (jerVar.g()) {
            hae haeVar2 = (hae) jerVar.c();
            if (haeVar2.b != 0) {
                nqe nqeVar = hjm.a;
                ljh k = hjo.c.k();
                ljh k2 = jus.e.k();
                ljh k3 = jur.c.k();
                int i2 = haeVar2.b;
                if (!k3.b.y()) {
                    k3.t();
                }
                jur jurVar = (jur) k3.b;
                int i3 = i2 - 1;
                if (i2 != 0) {
                    jurVar.b = i3;
                    jurVar.a |= 1;
                    if (!k2.b.y()) {
                        k2.t();
                    }
                    jus jusVar = (jus) k2.b;
                    jur jurVar2 = (jur) k3.q();
                    jurVar2.getClass();
                    jusVar.c = jurVar2;
                    jusVar.a |= 8;
                    if (!k.b.y()) {
                        k.t();
                    }
                    hjo hjoVar = (hjo) k.b;
                    jus jusVar2 = (jus) k2.q();
                    jusVar2.getClass();
                    hjoVar.b = jusVar2;
                    hjoVar.a = 1 | hjoVar.a;
                    gbmVar = new gbm(nqeVar, (hjo) k.q());
                } else {
                    throw null;
                }
            }
        }
        this.c = gbmVar;
        hjp hjpVar = this.d;
        if (hjpVar == null) {
            return;
        }
        this.b.cU(hjpVar);
        gbm gbmVar2 = this.c;
        if (gbmVar2 != null) {
            this.b.c(this.d, gbmVar2);
        } else {
            this.b.b(this.d);
        }
    }

    public final void b(jer jerVar) {
        ijs.c();
        a(jerVar, false);
    }
}
