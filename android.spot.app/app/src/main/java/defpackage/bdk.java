package defpackage;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.ViewOutlineProvider;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bdk extends View implements azt {
    public static Method a;
    public static Field b;
    public static boolean c;
    public static boolean d;
    private static final mol g = tu.l;
    private static final ViewOutlineProvider h = new bdj();
    public final bcx e;
    public boolean f;
    private final baw i;
    private final bcm j;
    private mol k;
    private mnw l;
    private boolean m;
    private Rect n;
    private boolean o;
    private final bcu p;
    private long q;
    private boolean r;
    private int s;
    private final bet t;

    public bdk(baw bawVar, bcm bcmVar, mol molVar, mnw mnwVar) {
        super(bawVar.getContext());
        this.i = bawVar;
        this.j = bcmVar;
        this.k = molVar;
        this.l = mnwVar;
        this.e = new bcx();
        this.t = new bet((byte[]) null, (char[]) null);
        this.p = new bcu(g);
        this.q = aro.a;
        this.r = true;
        setWillNotDraw(false);
        bcmVar.addView(this);
        View.generateViewId();
    }

    private final arg k() {
        if (getClipToOutline() && !this.e.d()) {
            this.e.b();
        }
        return null;
    }

    private final void l() {
        Rect rect;
        if (this.m) {
            Rect rect2 = this.n;
            if (rect2 == null) {
                this.n = new Rect(0, 0, getWidth(), getHeight());
            } else {
                rect2.set(0, 0, getWidth(), getHeight());
            }
            rect = this.n;
        } else {
            rect = null;
        }
        setClipBounds(rect);
    }

    private final void m(boolean z) {
        if (z != this.f) {
            this.f = z;
            this.i.p(this, z);
        }
    }

    private final void n() {
        ViewOutlineProvider viewOutlineProvider;
        if (this.e.a() != null) {
            viewOutlineProvider = h;
        } else {
            viewOutlineProvider = null;
        }
        setOutlineProvider(viewOutlineProvider);
    }

    @Override // defpackage.azt
    public final long a(long j, boolean z) {
        if (z) {
            float[] b2 = this.p.b(this);
            if (b2 != null) {
                return arb.a(b2, j);
            }
            return 9187343241974906880L;
        }
        return arb.a(this.p.c(this), j);
    }

    @Override // defpackage.azt
    public final void b() {
        m(false);
        this.i.y();
        this.k = null;
        this.l = null;
        boolean E = this.i.E(this);
        if (Build.VERSION.SDK_INT < 23 && !d && E) {
            setVisibility(8);
        } else {
            this.j.removeViewInLayout(this);
        }
    }

    @Override // defpackage.azt
    public final void c(aqv aqvVar, asq asqVar) {
        boolean z;
        if (getElevation() > 0.0f) {
            z = true;
        } else {
            z = false;
        }
        this.o = z;
        if (z) {
            aqvVar.c();
        }
        this.j.a(aqvVar, this, getDrawingTime());
        if (this.o) {
            aqvVar.b();
        }
    }

    @Override // defpackage.azt
    public final void d(aqj aqjVar, boolean z) {
        if (z) {
            float[] b2 = this.p.b(this);
            if (b2 != null) {
                arb.b(b2, aqjVar);
                return;
            } else {
                aqjVar.c();
                return;
            }
        }
        arb.b(this.p.c(this), aqjVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [aqv, java.lang.Object] */
    @Override // android.view.View
    protected final void dispatchDraw(Canvas canvas) {
        boolean z;
        bet betVar = this.t;
        ?? r1 = betVar.a;
        aqo aqoVar = (aqo) r1;
        Canvas canvas2 = aqoVar.a;
        aqoVar.a = canvas;
        k();
        if (!canvas.isHardwareAccelerated()) {
            r1.e();
            this.e.c(r1);
            z = true;
        } else {
            z = false;
        }
        mol molVar = this.k;
        if (molVar != 0) {
            molVar.a(r1, null);
        }
        if (z) {
            r1.d();
        }
        ((aqo) betVar.a).a = canvas2;
        m(false);
    }

    @Override // defpackage.azt
    public final void e(long j) {
        int a2 = blk.a(j);
        if (a2 != getLeft()) {
            offsetLeftAndRight(a2 - getLeft());
            this.p.a();
        }
        int b2 = blk.b(j);
        if (b2 != getTop()) {
            offsetTopAndBottom(b2 - getTop());
            this.p.a();
        }
    }

    @Override // defpackage.azt
    public final void f(long j) {
        int a2 = blm.a(j);
        int b2 = blm.b(j);
        if (b2 == getWidth() && a2 == getHeight()) {
            return;
        }
        setPivotX(aro.a(this.q) * b2);
        setPivotY(aro.b(this.q) * a2);
        n();
        layout(getLeft(), getTop(), getLeft() + b2, getTop() + a2);
        l();
        this.p.a();
    }

    @Override // defpackage.azt
    public final void g(mol molVar, mnw mnwVar) {
        if (Build.VERSION.SDK_INT < 23 && !d) {
            setVisibility(0);
        } else {
            this.j.addView(this);
        }
        this.m = false;
        this.o = false;
        this.q = aro.a;
        this.k = molVar;
        this.l = mnwVar;
    }

    @Override // defpackage.azt
    public final void h() {
        if (this.f && !d) {
            rf.e(this);
            m(false);
        }
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        return this.r;
    }

    @Override // defpackage.azt
    public final void i(ark arkVar) {
        boolean z;
        mnw mnwVar;
        boolean z2;
        int i = arkVar.a | this.s;
        if ((i & 4096) != 0) {
            long j = arkVar.k;
            this.q = j;
            setPivotX(aro.a(j) * getWidth());
            setPivotY(aro.b(this.q) * getHeight());
        }
        if ((i & 1) != 0) {
            setScaleX(arkVar.b);
        }
        if ((i & 2) != 0) {
            setScaleY(arkVar.c);
        }
        if ((i & 4) != 0) {
            setAlpha(arkVar.d);
        }
        if ((i & 8) != 0) {
            setTranslationX(arkVar.e);
        }
        if ((i & 16) != 0) {
            setTranslationY(arkVar.f);
        }
        if ((i & 32) != 0) {
            setElevation(0.0f);
        }
        if ((i & 1024) != 0) {
            setRotation(arkVar.i);
        }
        if ((i & 256) != 0) {
            setRotationX(0.0f);
        }
        if ((i & 512) != 0) {
            setRotationY(0.0f);
        }
        if ((i & 2048) != 0) {
            setCameraDistance(arkVar.j * getResources().getDisplayMetrics().densityDpi);
        }
        k();
        boolean z3 = arkVar.m;
        boolean z4 = true;
        if (z3 && arkVar.l != ari.a) {
            z = true;
        } else {
            z = false;
        }
        if ((i & 24576) != 0) {
            if (z3 && arkVar.l == ari.a) {
                z2 = true;
            } else {
                z2 = false;
            }
            this.m = z2;
            l();
            setClipToOutline(z);
        }
        this.e.f(arkVar.r, arkVar.d, z, arkVar.o);
        if (this.e.a) {
            n();
        }
        k();
        if (!this.o && getElevation() > 0.0f && (mnwVar = this.l) != null) {
            mnwVar.a();
        }
        if ((i & 7963) != 0) {
            this.p.a();
        }
        if (Build.VERSION.SDK_INT >= 28) {
            if ((i & 64) != 0) {
                bdm.a.a(this, jw.d(arkVar.g));
            }
            if ((i & 128) != 0) {
                bdm.a.b(this, jw.d(arkVar.h));
            }
        }
        if (Build.VERSION.SDK_INT >= 31 && (131072 & i) != 0) {
            bdn.a.a(this, null);
        }
        if ((i & 32768) != 0) {
            int i2 = arkVar.n;
            if (a.m(0, 1)) {
                setLayerType(2, null);
            } else if (a.m(0, 2)) {
                setLayerType(0, null);
                z4 = false;
            } else {
                setLayerType(0, null);
            }
            this.r = z4;
        }
        this.s = arkVar.a;
    }

    @Override // android.view.View, defpackage.azt
    public final void invalidate() {
        if (!this.f) {
            m(true);
            super.invalidate();
            this.i.invalidate();
        }
    }

    @Override // defpackage.azt
    public final boolean j(long j) {
        float b2 = aqk.b(j);
        float c2 = aqk.c(j);
        if (this.m) {
            if (b2 >= 0.0f && b2 < getWidth() && c2 >= 0.0f && c2 < getHeight()) {
                return true;
            }
            return false;
        }
        if (!getClipToOutline()) {
            return true;
        }
        return this.e.e(j);
    }

    @Override // android.view.View
    public final void forceLayout() {
    }

    @Override // android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }
}
