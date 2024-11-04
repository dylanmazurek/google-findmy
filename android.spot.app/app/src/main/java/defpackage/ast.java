package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PorterDuffXfermode;
import android.os.Build;
import android.view.DisplayListCanvas;
import android.view.RenderNode;
import android.view.View;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ast implements ass {
    private static final AtomicBoolean a = new AtomicBoolean(true);
    private final asl b;
    private final RenderNode c;
    private long d;
    private Paint e;
    private Matrix f;
    private boolean g;
    private int h;
    private int i;
    private float j;
    private boolean k;
    private float l;
    private float m;
    private float n;
    private float o;
    private long p;
    private long q;
    private float r;
    private float s;
    private boolean t;
    private boolean u;
    private boolean v;
    private final bet w;

    public ast(View view, bet betVar, asl aslVar) {
        this.w = betVar;
        this.b = aslVar;
        RenderNode create = RenderNode.create("Compose", view);
        this.c = create;
        this.d = 0L;
        if (a.getAndSet(false)) {
            create.setScaleX(create.getScaleX());
            create.setScaleY(create.getScaleY());
            create.setTranslationX(create.getTranslationX());
            create.setTranslationY(create.getTranslationY());
            create.setElevation(create.getElevation());
            create.setRotation(create.getRotation());
            create.setRotationX(create.getRotationX());
            create.setRotationY(create.getRotationY());
            create.setCameraDistance(create.getCameraDistance());
            create.setPivotX(create.getPivotX());
            create.setPivotY(create.getPivotY());
            create.setClipToOutline(create.getClipToOutline());
            create.setClipToBounds(false);
            create.setAlpha(create.getAlpha());
            create.isValid();
            create.setLeftTopRightBottom(0, 0, 0, 0);
            create.offsetLeftAndRight(0);
            create.offsetTopAndBottom(0);
            if (Build.VERSION.SDK_INT >= 28) {
                atd atdVar = atd.a;
                atdVar.c(create, atdVar.a(create));
                atd atdVar2 = atd.a;
                atdVar2.d(create, atdVar2.b(create));
            }
            J();
            create.setLayerType(0);
            create.setHasOverlappingRendering(create.hasOverlappingRendering());
        }
        create.setClipToBounds(false);
        L(0);
        this.h = 0;
        this.i = 3;
        this.j = 1.0f;
        this.l = 1.0f;
        this.m = 1.0f;
        long j = aqx.a;
        this.p = j;
        this.q = j;
        this.s = 8.0f;
    }

    private final void K() {
        boolean z;
        boolean z2 = this.t;
        boolean z3 = true;
        if (z2 && !this.g) {
            z = true;
        } else {
            z = false;
        }
        if (!z2 || !this.g) {
            z3 = false;
        }
        if (z != this.u) {
            this.u = z;
            this.c.setClipToBounds(z);
        }
        if (z3 != this.v) {
            this.v = z3;
            this.c.setClipToOutline(z3);
        }
    }

    private final void L(int i) {
        RenderNode renderNode = this.c;
        if (!a.m(i, 1)) {
            if (a.m(i, 2)) {
                renderNode.setLayerType(0);
                renderNode.setLayerPaint(this.e);
                renderNode.setHasOverlappingRendering(false);
                return;
            } else {
                renderNode.setLayerType(0);
                renderNode.setLayerPaint(this.e);
                renderNode.setHasOverlappingRendering(true);
                return;
            }
        }
        renderNode.setLayerType(2);
        renderNode.setLayerPaint(this.e);
        renderNode.setHasOverlappingRendering(true);
    }

    private final void M() {
        int i = this.h;
        if (!a.m(i, 1) && a.m(this.i, 3)) {
            L(i);
        } else {
            L(1);
        }
    }

    @Override // defpackage.ass
    public final void A(float f) {
        this.m = f;
        this.c.setScaleY(f);
    }

    @Override // defpackage.ass
    public final void B(long j) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.q = j;
            atd.a.d(this.c, jw.d(j));
        }
    }

    @Override // defpackage.ass
    public final void C(float f) {
        this.n = f;
        this.c.setTranslationX(f);
    }

    @Override // defpackage.ass
    public final void D(float f) {
        this.o = f;
        this.c.setTranslationY(f);
    }

    @Override // defpackage.ass
    public final boolean E() {
        return this.t;
    }

    @Override // defpackage.ass
    public final boolean F() {
        return this.c.isValid();
    }

    @Override // defpackage.ass
    public final void G() {
        M();
    }

    @Override // defpackage.ass
    public final void H() {
        if (!a.m(this.i, 3)) {
            this.i = 3;
            Paint paint = this.e;
            if (paint == null) {
                paint = new Paint();
                this.e = paint;
            }
            paint.setXfermode(new PorterDuffXfermode(aqq.c(3)));
            M();
        }
    }

    public final void J() {
        if (Build.VERSION.SDK_INT >= 24) {
            atc.a.a(this.c);
        } else {
            atb.a.a(this.c);
        }
    }

    @Override // defpackage.ass
    public final float a() {
        return this.j;
    }

    @Override // defpackage.ass
    public final float b() {
        return this.s;
    }

    @Override // defpackage.ass
    public final float c() {
        return this.r;
    }

    @Override // defpackage.ass
    public final float d() {
        return this.l;
    }

    @Override // defpackage.ass
    public final float e() {
        return this.m;
    }

    @Override // defpackage.ass
    public final float f() {
        return this.n;
    }

    @Override // defpackage.ass
    public final float g() {
        return this.o;
    }

    @Override // defpackage.ass
    public final int h() {
        return this.i;
    }

    @Override // defpackage.ass
    public final int i() {
        return this.h;
    }

    @Override // defpackage.ass
    public final long j() {
        return this.p;
    }

    @Override // defpackage.ass
    public final long k() {
        return this.q;
    }

    @Override // defpackage.ass
    public final Matrix l() {
        Matrix matrix = this.f;
        if (matrix == null) {
            matrix = new Matrix();
            this.f = matrix;
        }
        this.c.getMatrix(matrix);
        return matrix;
    }

    @Override // defpackage.ass
    public final void m() {
        J();
    }

    @Override // defpackage.ass
    public final void n(aqv aqvVar) {
        DisplayListCanvas a2 = aqp.a(aqvVar);
        a2.getClass();
        a2.drawRenderNode(this.c);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2, types: [aqv, java.lang.Object] */
    @Override // defpackage.ass
    public final void p(ble bleVar, bln blnVar, asq asqVar, moh mohVar) {
        long j = this.d;
        Canvas start = this.c.start(blm.b(j), blm.a(j));
        try {
            bet betVar = this.w;
            ?? r3 = betVar.a;
            Canvas canvas = ((aqo) r3).a;
            ((aqo) r3).a = start;
            asl aslVar = this.b;
            long n = bef.n(this.d);
            ble c = aslVar.b.c();
            bln d = aslVar.b.d();
            aqv b = aslVar.b.b();
            long a2 = aslVar.b.a();
            ask askVar = aslVar.b;
            asq asqVar2 = askVar.a;
            askVar.f(bleVar);
            askVar.g(blnVar);
            askVar.e(r3);
            askVar.h(n);
            askVar.a = asqVar;
            r3.e();
            try {
                mohVar.a(aslVar);
                r3.d();
                ask askVar2 = aslVar.b;
                askVar2.f(c);
                askVar2.g(d);
                askVar2.e(b);
                askVar2.h(a2);
                askVar2.a = asqVar2;
                ((aqo) betVar.a).a = canvas;
            } catch (Throwable th) {
                r3.d();
                ask askVar3 = aslVar.b;
                askVar3.f(c);
                askVar3.g(d);
                askVar3.e(b);
                askVar3.h(a2);
                askVar3.a = asqVar2;
                throw th;
            }
        } finally {
            this.c.end(start);
        }
    }

    @Override // defpackage.ass
    public final void q(float f) {
        this.j = f;
        this.c.setAlpha(f);
    }

    @Override // defpackage.ass
    public final void r(long j) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.p = j;
            atd.a.c(this.c, jw.d(j));
        }
    }

    @Override // defpackage.ass
    public final void s(float f) {
        this.s = f;
        this.c.setCameraDistance(-f);
    }

    @Override // defpackage.ass
    public final void t(boolean z) {
        this.t = z;
        K();
    }

    @Override // defpackage.ass
    public final void u(int i) {
        this.h = i;
        M();
    }

    @Override // defpackage.ass
    public final void v(Outline outline) {
        boolean z;
        this.c.setOutline(outline);
        if (outline != null) {
            z = true;
        } else {
            z = false;
        }
        this.g = z;
        K();
    }

    @Override // defpackage.ass
    public final void w(long j) {
        if (iy.d(j)) {
            this.k = true;
            this.c.setPivotX(blm.b(this.d) / 2.0f);
            this.c.setPivotY(blm.a(this.d) / 2.0f);
        } else {
            this.k = false;
            this.c.setPivotX(aqk.b(j));
            this.c.setPivotY(aqk.c(j));
        }
    }

    @Override // defpackage.ass
    public final void x(int i, int i2, long j) {
        this.c.setLeftTopRightBottom(i, i2, blm.b(j) + i, blm.a(j) + i2);
        if (!a.n(this.d, j)) {
            if (this.k) {
                this.c.setPivotX(blm.b(j) / 2.0f);
                this.c.setPivotY(blm.a(j) / 2.0f);
            }
            this.d = j;
        }
    }

    @Override // defpackage.ass
    public final void y(float f) {
        this.r = f;
        this.c.setRotation(f);
    }

    @Override // defpackage.ass
    public final void z(float f) {
        this.l = f;
        this.c.setScaleX(f);
    }

    @Override // defpackage.ass
    public final void I() {
    }

    @Override // defpackage.ass
    public final /* synthetic */ void o() {
    }
}
