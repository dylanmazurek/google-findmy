package defpackage;

import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.libraries.onegoogle.account.disc.AccountParticleDisc;
import com.google.android.libraries.onegoogle.accountmenu.SelectedAccountDisc;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hbv implements View.OnTouchListener {
    public final hcc a;
    public final SelectedAccountDisc b;
    public boolean c;
    final GestureDetector.SimpleOnGestureListener d;
    private final buw e;
    private final hjp f;

    public hbv(hcc hccVar, SelectedAccountDisc selectedAccountDisc) {
        hbs hbsVar = new hbs(this);
        this.d = hbsVar;
        this.a = hccVar;
        this.b = selectedAccountDisc;
        buw buwVar = new buw(selectedAccountDisc.getContext(), hbsVar);
        this.e = buwVar;
        buwVar.a(true);
        this.f = hccVar.l;
    }

    public static boolean d(int i) {
        if (i != 4 && i != 5) {
            return false;
        }
        return true;
    }

    public static boolean e(int i) {
        if (i != 3 && i != 2) {
            return false;
        }
        return true;
    }

    public static Object f(List list, Object obj, int i) {
        if (!list.isEmpty()) {
            int i2 = i - 1;
            int i3 = 1;
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new RuntimeException();
                }
            } else {
                i3 = -1;
            }
            int indexOf = list.indexOf(obj);
            if (indexOf != -1) {
                int i4 = ((jmi) list).c;
                int i5 = ((i3 + indexOf) + i4) % i4;
                if (i5 != indexOf) {
                    return list.get(i5);
                }
            }
        }
        return obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001e  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0018  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final android.animation.ObjectAnimator g(com.google.android.libraries.onegoogle.account.disc.AccountParticleDisc r4, int r5) {
        /*
            r0 = 3
            r1 = 0
            r2 = 1
            if (r5 == r0) goto Lc
            r0 = 4
            if (r5 != r0) goto La
            r5 = 4
            goto Lc
        La:
            r0 = 0
            goto Ld
        Lc:
            r0 = 1
        Ld:
            boolean r5 = e(r5)
            if (r5 == 0) goto L18
            int r3 = r4.getMeasuredHeight()
            goto L1c
        L18:
            int r3 = r4.getMeasuredWidth()
        L1c:
            if (r2 == r0) goto L22
            r0 = -1093874483(0xffffffffbecccccd, float:-0.4)
            goto L25
        L22:
            r0 = 1053609165(0x3ecccccd, float:0.4)
        L25:
            float r3 = (float) r3
            float r3 = r3 * r0
            float[] r0 = new float[r2]
            r0[r1] = r3
            if (r2 == r5) goto L31
            java.lang.String r5 = "translationX"
            goto L33
        L31:
            java.lang.String r5 = "translationY"
        L33:
            android.animation.ObjectAnimator r4 = android.animation.ObjectAnimator.ofFloat(r4, r5, r0)
            r0 = 100
            android.animation.ObjectAnimator r4 = r4.setDuration(r0)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hbv.g(com.google.android.libraries.onegoogle.account.disc.AccountParticleDisc, int):android.animation.ObjectAnimator");
    }

    public final boolean a(Object obj, Object obj2) {
        frx frxVar = this.a.o;
        return frx.aj(obj).equals(frx.aj(obj2));
    }

    public final AnimatorSet b(int i, AnimatorListenerAdapter animatorListenerAdapter, Runnable runnable) {
        AccountParticleDisc accountParticleDisc = this.b.b;
        ObjectAnimator duration = ObjectAnimator.ofFloat(accountParticleDisc, "alpha", 1.0f, 0.0f).setDuration(50L);
        duration.setStartDelay(50L);
        jis r = jis.r(g(accountParticleDisc, i), duration);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(r);
        animatorSet.addListener(new hbt(this, runnable, animatorListenerAdapter));
        return animatorSet;
    }

    public final void c(int i) {
        int i2;
        int i3 = i - 1;
        if (i3 != 1) {
            i2 = 2;
            if (i3 != 2) {
                if (i3 != 3) {
                    i2 = 3;
                }
            } else {
                i2 = 5;
            }
        } else {
            i2 = 4;
        }
        hjp hjpVar = this.f;
        bym bymVar = new bym(22);
        nqe nqeVar = gck.a;
        ljh k = gcl.c.k();
        if (!k.b.y()) {
            k.t();
        }
        gcl gclVar = (gcl) k.b;
        gclVar.b = i2 - 1;
        gclVar.a = 1 | gclVar.a;
        bymVar.o(new gbp(nqeVar, (gcl) k.q()));
        hjpVar.f(bymVar, this.b);
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z;
        if (view == this.b) {
            z = true;
        } else {
            z = false;
        }
        hwx.V(z, "View must be the selectedAccountDisc passed on the c'tor.");
        if (motionEvent.getAction() == 0) {
            this.b.requestDisallowInterceptTouchEvent(true);
        }
        return this.e.b(motionEvent);
    }
}
