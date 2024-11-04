package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.os.Build;
import android.view.DisplayListCanvas;
import android.view.RenderNode;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bcy implements bch {
    private static boolean a = true;
    private final baw b;
    private final RenderNode c;
    private int d;
    private int e;
    private int f;
    private int g;
    private boolean h;

    public bcy(baw bawVar) {
        this.b = bawVar;
        RenderNode create = RenderNode.create("Compose", bawVar);
        this.c = create;
        if (a) {
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
                bde bdeVar = bde.a;
                bdeVar.c(create, bdeVar.a(create));
                bde bdeVar2 = bde.a;
                bdeVar2.d(create, bdeVar2.b(create));
            }
            M();
            create.setLayerType(0);
            create.setHasOverlappingRendering(create.hasOverlappingRendering());
            a = false;
        }
    }

    private final void M() {
        if (Build.VERSION.SDK_INT >= 24) {
            bdd.a.a(this.c);
        } else {
            bdc.a.a(this.c);
        }
    }

    @Override // defpackage.bch
    public final void A(float f) {
        this.c.setTranslationY(f);
    }

    @Override // defpackage.bch
    public final boolean B() {
        return this.h;
    }

    @Override // defpackage.bch
    public final boolean C() {
        return this.c.getClipToOutline();
    }

    @Override // defpackage.bch
    public final boolean D() {
        return this.c.isValid();
    }

    @Override // defpackage.bch
    public final boolean E(int i, int i2, int i3, int i4) {
        this.d = i;
        this.e = i2;
        this.f = i3;
        this.g = i4;
        return this.c.setLeftTopRightBottom(i, i2, i3, i4);
    }

    @Override // defpackage.bch
    public final void F() {
        this.c.setHasOverlappingRendering(true);
    }

    @Override // defpackage.bch
    public final void G() {
        if (!a.m(0, 1)) {
            if (a.m(0, 2)) {
                this.c.setLayerType(0);
                this.c.setHasOverlappingRendering(false);
                return;
            } else {
                this.c.setLayerType(0);
                this.c.setHasOverlappingRendering(true);
                return;
            }
        }
        this.c.setLayerType(2);
        this.c.setHasOverlappingRendering(true);
    }

    @Override // defpackage.bch
    public final void H() {
        this.c.setElevation(0.0f);
    }

    @Override // defpackage.bch
    public final void J() {
        this.c.setRotationX(0.0f);
    }

    @Override // defpackage.bch
    public final void K() {
        this.c.setRotationY(0.0f);
    }

    @Override // defpackage.bch
    public final void L(bet betVar, arg argVar, moh mohVar) {
        Canvas start = this.c.start(h(), d());
        Object obj = betVar.a;
        aqo aqoVar = (aqo) obj;
        Canvas canvas = aqoVar.a;
        aqoVar.a = start;
        mohVar.a(obj);
        ((aqo) betVar.a).a = canvas;
        this.c.end(start);
    }

    @Override // defpackage.bch
    public final float a() {
        return this.c.getAlpha();
    }

    @Override // defpackage.bch
    public final float b() {
        return this.c.getElevation();
    }

    @Override // defpackage.bch
    public final int c() {
        return this.g;
    }

    @Override // defpackage.bch
    public final int d() {
        return this.g - this.e;
    }

    @Override // defpackage.bch
    public final int e() {
        return this.d;
    }

    @Override // defpackage.bch
    public final int f() {
        return this.f;
    }

    @Override // defpackage.bch
    public final int g() {
        return this.e;
    }

    @Override // defpackage.bch
    public final int h() {
        return this.f - this.d;
    }

    @Override // defpackage.bch
    public final void i() {
        M();
    }

    @Override // defpackage.bch
    public final void j(Canvas canvas) {
        canvas.getClass();
        ((DisplayListCanvas) canvas).drawRenderNode(this.c);
    }

    @Override // defpackage.bch
    public final void k(Matrix matrix) {
        this.c.getMatrix(matrix);
    }

    @Override // defpackage.bch
    public final void l(int i) {
        this.d += i;
        this.f += i;
        this.c.offsetLeftAndRight(i);
    }

    @Override // defpackage.bch
    public final void m(int i) {
        this.e += i;
        this.g += i;
        this.c.offsetTopAndBottom(i);
    }

    @Override // defpackage.bch
    public final void n(float f) {
        this.c.setAlpha(f);
    }

    @Override // defpackage.bch
    public final void o(int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            bde.a.c(this.c, i);
        }
    }

    @Override // defpackage.bch
    public final void p(float f) {
        this.c.setCameraDistance(-f);
    }

    @Override // defpackage.bch
    public final void q(boolean z) {
        this.h = z;
        this.c.setClipToBounds(z);
    }

    @Override // defpackage.bch
    public final void r(boolean z) {
        this.c.setClipToOutline(z);
    }

    @Override // defpackage.bch
    public final void s(Outline outline) {
        this.c.setOutline(outline);
    }

    @Override // defpackage.bch
    public final void t(float f) {
        this.c.setPivotX(f);
    }

    @Override // defpackage.bch
    public final void u(float f) {
        this.c.setPivotY(f);
    }

    @Override // defpackage.bch
    public final void v(float f) {
        this.c.setRotation(f);
    }

    @Override // defpackage.bch
    public final void w(float f) {
        this.c.setScaleX(f);
    }

    @Override // defpackage.bch
    public final void x(float f) {
        this.c.setScaleY(f);
    }

    @Override // defpackage.bch
    public final void y(int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            bde.a.d(this.c, i);
        }
    }

    @Override // defpackage.bch
    public final void z(float f) {
        this.c.setTranslationX(f);
    }

    @Override // defpackage.bch
    public final void I() {
    }
}
