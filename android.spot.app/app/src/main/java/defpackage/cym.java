package defpackage;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import android.widget.ImageView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cym extends Drawable implements Drawable.Callback, Animatable {
    private Matrix A;
    private Matrix B;
    private int C;
    private lbr D;
    public cyb a;
    public final dev b;
    public boolean c;
    public boolean d;
    public dbh e;
    public String f;
    public String g;
    public boolean h;
    public dcv i;
    public int j;
    public boolean k;
    public boolean l;
    public int m;
    private final ArrayList n;
    private final ValueAnimator.AnimatorUpdateListener o;
    private boolean p;
    private final Matrix q;
    private Bitmap r;
    private Canvas s;
    private Rect t;
    private RectF u;
    private Paint v;
    private Rect w;
    private Rect x;
    private RectF y;
    private RectF z;

    public cym() {
        dev devVar = new dev();
        this.b = devVar;
        this.c = true;
        this.d = false;
        this.m = 1;
        this.n = new ArrayList();
        bwy bwyVar = new bwy(this, 2);
        this.o = bwyVar;
        this.p = true;
        this.j = 255;
        this.C = 1;
        this.k = false;
        this.q = new Matrix();
        this.l = false;
        devVar.addUpdateListener(bwyVar);
    }

    private final void u() {
        cyb cybVar = this.a;
        if (cybVar == null) {
            return;
        }
        int i = ddz.a;
        Rect rect = cybVar.h;
        dcv dcvVar = new dcv(this, new dcx(Collections.emptyList(), cybVar, "__container", -1L, 1, -1L, null, Collections.emptyList(), new dcb(null, null, null, null, null, null, null, null, null), 0, 0, 0, 0.0f, 0.0f, rect.width(), rect.height(), null, null, Collections.emptyList(), 1, null, false, null, null), cybVar.g, cybVar);
        this.i = dcvVar;
        dcvVar.j = this.p;
    }

    private final void v() {
        cyb cybVar = this.a;
        if (cybVar == null) {
            return;
        }
        int i = this.C - 1;
        int i2 = Build.VERSION.SDK_INT;
        boolean z = cybVar.l;
        int i3 = cybVar.m;
        boolean z2 = false;
        if (i != 1 && (i == 2 || ((z && i2 < 28) || i3 > 4 || i2 <= 25))) {
            z2 = true;
        }
        this.k = z2;
    }

    private final boolean w() {
        if (!this.c && !this.d) {
            return false;
        }
        return true;
    }

    private static final void x(RectF rectF, Rect rect) {
        rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
    }

    public final float a() {
        return this.b.d();
    }

    public final float b() {
        return this.b.e();
    }

    public final float c() {
        return this.b.c();
    }

    public final float d() {
        return this.b.c;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        if (this.k) {
            k(canvas, this.i);
        } else {
            dcv dcvVar = this.i;
            cyb cybVar = this.a;
            if (dcvVar != null && cybVar != null) {
                this.q.reset();
                if (!getBounds().isEmpty()) {
                    this.q.preScale(r2.width() / cybVar.h.width(), r2.height() / cybVar.h.height());
                    this.q.preTranslate(r2.left, r2.top);
                }
                dcvVar.b(canvas, this.q, this.j);
            }
        }
        this.l = false;
        cxw.a();
    }

    public final int e() {
        return this.b.getRepeatCount();
    }

    public final void f(final dbm dbmVar, final Object obj, final dfe dfeVar) {
        dcv dcvVar = this.i;
        if (dcvVar == null) {
            this.n.add(new cyl() { // from class: cyh
                @Override // defpackage.cyl
                public final void a() {
                    cym.this.f(dbmVar, obj, dfeVar);
                }
            });
            return;
        }
        if (dbmVar == dbm.a) {
            dcvVar.a(obj, dfeVar);
        } else {
            dbn dbnVar = dbmVar.b;
            if (dbnVar != null) {
                dbnVar.a(obj, dfeVar);
            } else {
                ArrayList arrayList = new ArrayList();
                this.i.e(dbmVar, 0, arrayList, new dbm(new String[0]));
                for (int i = 0; i < arrayList.size(); i++) {
                    ((dbm) arrayList.get(i)).b.a(obj, dfeVar);
                }
                if (arrayList.isEmpty()) {
                    return;
                }
            }
        }
        invalidateSelf();
        if (obj == cyq.E) {
            o(c());
        }
    }

    public final void g() {
        dev devVar = this.b;
        if (devVar.k) {
            devVar.cancel();
            if (!isVisible()) {
                this.m = 1;
            }
        }
        this.a = null;
        this.i = null;
        this.e = null;
        dev devVar2 = this.b;
        devVar2.j = null;
        devVar2.h = -2.1474836E9f;
        devVar2.i = 2.1474836E9f;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.j;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        cyb cybVar = this.a;
        if (cybVar == null) {
            return -1;
        }
        return cybVar.h.height();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        cyb cybVar = this.a;
        if (cybVar == null) {
            return -1;
        }
        return cybVar.h.width();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    public final void h(boolean z) {
        if (this.h != z) {
            this.h = z;
            if (this.a != null) {
                u();
            }
        }
    }

    public final void i() {
        this.n.clear();
        dev devVar = this.b;
        devVar.h();
        Iterator it = devVar.b.iterator();
        while (it.hasNext()) {
            ((Animator.AnimatorPauseListener) it.next()).onAnimationPause(devVar);
        }
        if (!isVisible()) {
            this.m = 1;
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.invalidateDrawable(this);
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        if (!this.l) {
            this.l = true;
            Drawable.Callback callback = getCallback();
            if (callback != null) {
                callback.invalidateDrawable(this);
            }
        }
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        return q();
    }

    public final void j() {
        float e;
        float a;
        if (this.i == null) {
            this.n.add(new cyi(this, 0));
            return;
        }
        v();
        if (w() || e() == 0) {
            if (isVisible()) {
                dev devVar = this.b;
                devVar.k = true;
                Set<Animator.AnimatorListener> set = devVar.a;
                boolean m = devVar.m();
                for (Animator.AnimatorListener animatorListener : set) {
                    if (Build.VERSION.SDK_INT >= 26) {
                        animatorListener.onAnimationStart(devVar, m);
                    } else {
                        animatorListener.onAnimationStart(devVar);
                    }
                }
                if (devVar.m()) {
                    e = devVar.d();
                } else {
                    e = devVar.e();
                }
                devVar.k((int) e);
                devVar.d = 0L;
                devVar.g = 0;
                devVar.g();
                this.m = 1;
            } else {
                this.m = 2;
            }
        }
        if (!w()) {
            if (d() < 0.0f) {
                a = b();
            } else {
                a = a();
            }
            n((int) a);
            this.b.f();
            if (!isVisible()) {
                this.m = 1;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x00e8, code lost:            if (((android.view.ViewGroup) r3).getClipChildren() == false) goto L21;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void k(android.graphics.Canvas r9, defpackage.dcv r10) {
        /*
            Method dump skipped, instructions count: 439
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cym.k(android.graphics.Canvas, dcv):void");
    }

    public final void l() {
        float a;
        if (this.i == null) {
            this.n.add(new cyi(this, 1));
            return;
        }
        v();
        if (w() || e() == 0) {
            if (isVisible()) {
                dev devVar = this.b;
                devVar.k = true;
                devVar.g();
                devVar.d = 0L;
                if (devVar.m() && devVar.f == devVar.e()) {
                    devVar.k(devVar.d());
                } else if (!devVar.m() && devVar.f == devVar.d()) {
                    devVar.k(devVar.e());
                }
                Iterator it = devVar.b.iterator();
                while (it.hasNext()) {
                    ((Animator.AnimatorPauseListener) it.next()).onAnimationResume(devVar);
                }
                this.m = 1;
            } else {
                this.m = 3;
            }
        }
        if (!w()) {
            if (d() < 0.0f) {
                a = b();
            } else {
                a = a();
            }
            n((int) a);
            this.b.f();
            if (!isVisible()) {
                this.m = 1;
            }
        }
    }

    public final void m(boolean z) {
        if (z != this.p) {
            this.p = z;
            dcv dcvVar = this.i;
            if (dcvVar != null) {
                dcvVar.j = z;
            }
            invalidateSelf();
        }
    }

    public final void n(final int i) {
        if (this.a == null) {
            this.n.add(new cyl() { // from class: cyk
                @Override // defpackage.cyl
                public final void a() {
                    cym.this.n(i);
                }
            });
        } else {
            this.b.k(i);
        }
    }

    public final void o(final float f) {
        cyb cybVar = this.a;
        if (cybVar == null) {
            this.n.add(new cyl() { // from class: cyj
                @Override // defpackage.cyl
                public final void a() {
                    cym.this.o(f);
                }
            });
            return;
        }
        dev devVar = this.b;
        float f2 = cybVar.i;
        float f3 = cybVar.j;
        PointF pointF = dew.a;
        devVar.k(f2 + (f * (f3 - f2)));
        cxw.a();
    }

    public final void p(int i) {
        this.b.setRepeatCount(i);
    }

    public final boolean q() {
        dev devVar = this.b;
        if (devVar == null) {
            return false;
        }
        return devVar.k;
    }

    public final boolean r(cyb cybVar) {
        if (this.a == cybVar) {
            return false;
        }
        this.l = true;
        g();
        this.a = cybVar;
        u();
        dev devVar = this.b;
        cyb cybVar2 = devVar.j;
        devVar.j = cybVar;
        if (cybVar2 == null) {
            devVar.l(Math.max(devVar.h, cybVar.i), Math.min(devVar.i, cybVar.j));
        } else {
            devVar.l((int) cybVar.i, (int) cybVar.j);
        }
        float f = devVar.f;
        devVar.f = 0.0f;
        devVar.e = 0.0f;
        devVar.k((int) f);
        devVar.b();
        o(this.b.getAnimatedFraction());
        Iterator it = new ArrayList(this.n).iterator();
        while (it.hasNext()) {
            cyl cylVar = (cyl) it.next();
            if (cylVar != null) {
                cylVar.a();
            }
            it.remove();
        }
        this.n.clear();
        cww cwwVar = cybVar.n;
        v();
        Drawable.Callback callback = getCallback();
        if (callback instanceof ImageView) {
            ImageView imageView = (ImageView) callback;
            imageView.setImageDrawable(null);
            imageView.setImageDrawable(this);
        }
        return true;
    }

    public final void s(int i) {
        this.C = i;
        v();
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.scheduleDrawable(this, runnable, j);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.j = i;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        deu.a("Use addColorFilter instead.");
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        boolean isVisible = isVisible();
        boolean visible = super.setVisible(z, z2);
        if (z) {
            int i = this.m;
            if (i == 2) {
                j();
            } else if (i == 3) {
                l();
            }
        } else if (this.b.k) {
            i();
            this.m = 3;
        } else if (isVisible) {
            this.m = 1;
        }
        return visible;
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        Drawable.Callback callback = getCallback();
        if ((callback instanceof View) && ((View) callback).isInEditMode()) {
            return;
        }
        j();
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        this.n.clear();
        this.b.f();
        if (!isVisible()) {
            this.m = 1;
        }
    }

    public final lbr t() {
        if (getCallback() == null) {
            return null;
        }
        if (this.D == null) {
            lbr lbrVar = new lbr(getCallback());
            this.D = lbrVar;
            String str = this.g;
            if (str != null) {
                lbrVar.d = str;
            }
        }
        return this.D;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.unscheduleDrawable(this, runnable);
    }
}
