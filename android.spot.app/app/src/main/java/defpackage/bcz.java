package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.RecordingCanvas;
import android.graphics.RenderNode;
import android.os.Build;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bcz implements bch {
    private final RenderNode a = new RenderNode("Compose");

    @Override // defpackage.bch
    public final void A(float f) {
        this.a.setTranslationY(f);
    }

    @Override // defpackage.bch
    public final boolean B() {
        boolean clipToBounds;
        clipToBounds = this.a.getClipToBounds();
        return clipToBounds;
    }

    @Override // defpackage.bch
    public final boolean C() {
        boolean clipToOutline;
        clipToOutline = this.a.getClipToOutline();
        return clipToOutline;
    }

    @Override // defpackage.bch
    public final boolean D() {
        boolean hasDisplayList;
        hasDisplayList = this.a.hasDisplayList();
        return hasDisplayList;
    }

    @Override // defpackage.bch
    public final boolean E(int i, int i2, int i3, int i4) {
        boolean position;
        position = this.a.setPosition(i, i2, i3, i4);
        return position;
    }

    @Override // defpackage.bch
    public final void F() {
        this.a.setHasOverlappingRendering(true);
    }

    @Override // defpackage.bch
    public final void G() {
        RenderNode renderNode = this.a;
        if (!a.m(0, 1)) {
            if (a.m(0, 2)) {
                renderNode.setUseCompositingLayer(false, null);
                renderNode.setHasOverlappingRendering(false);
                return;
            } else {
                renderNode.setUseCompositingLayer(false, null);
                renderNode.setHasOverlappingRendering(true);
                return;
            }
        }
        renderNode.setUseCompositingLayer(true, null);
        renderNode.setHasOverlappingRendering(true);
    }

    @Override // defpackage.bch
    public final void H() {
        this.a.setElevation(0.0f);
    }

    @Override // defpackage.bch
    public final void I() {
        if (Build.VERSION.SDK_INT >= 31) {
            bda.a.a(this.a, null);
        }
    }

    @Override // defpackage.bch
    public final void J() {
        this.a.setRotationX(0.0f);
    }

    @Override // defpackage.bch
    public final void K() {
        this.a.setRotationY(0.0f);
    }

    @Override // defpackage.bch
    public final void L(bet betVar, arg argVar, moh mohVar) {
        RecordingCanvas beginRecording;
        beginRecording = this.a.beginRecording();
        Object obj = betVar.a;
        aqo aqoVar = (aqo) obj;
        Canvas canvas = aqoVar.a;
        aqoVar.a = beginRecording;
        mohVar.a(obj);
        ((aqo) betVar.a).a = canvas;
        this.a.endRecording();
    }

    @Override // defpackage.bch
    public final float a() {
        float alpha;
        alpha = this.a.getAlpha();
        return alpha;
    }

    @Override // defpackage.bch
    public final float b() {
        float elevation;
        elevation = this.a.getElevation();
        return elevation;
    }

    @Override // defpackage.bch
    public final int c() {
        int bottom;
        bottom = this.a.getBottom();
        return bottom;
    }

    @Override // defpackage.bch
    public final int d() {
        int height;
        height = this.a.getHeight();
        return height;
    }

    @Override // defpackage.bch
    public final int e() {
        int left;
        left = this.a.getLeft();
        return left;
    }

    @Override // defpackage.bch
    public final int f() {
        int right;
        right = this.a.getRight();
        return right;
    }

    @Override // defpackage.bch
    public final int g() {
        int top;
        top = this.a.getTop();
        return top;
    }

    @Override // defpackage.bch
    public final int h() {
        int width;
        width = this.a.getWidth();
        return width;
    }

    @Override // defpackage.bch
    public final void i() {
        this.a.discardDisplayList();
    }

    @Override // defpackage.bch
    public final void j(Canvas canvas) {
        canvas.drawRenderNode(this.a);
    }

    @Override // defpackage.bch
    public final void k(Matrix matrix) {
        this.a.getMatrix(matrix);
    }

    @Override // defpackage.bch
    public final void l(int i) {
        this.a.offsetLeftAndRight(i);
    }

    @Override // defpackage.bch
    public final void m(int i) {
        this.a.offsetTopAndBottom(i);
    }

    @Override // defpackage.bch
    public final void n(float f) {
        this.a.setAlpha(f);
    }

    @Override // defpackage.bch
    public final void o(int i) {
        this.a.setAmbientShadowColor(i);
    }

    @Override // defpackage.bch
    public final void p(float f) {
        this.a.setCameraDistance(f);
    }

    @Override // defpackage.bch
    public final void q(boolean z) {
        this.a.setClipToBounds(z);
    }

    @Override // defpackage.bch
    public final void r(boolean z) {
        this.a.setClipToOutline(z);
    }

    @Override // defpackage.bch
    public final void s(Outline outline) {
        this.a.setOutline(outline);
    }

    @Override // defpackage.bch
    public final void t(float f) {
        this.a.setPivotX(f);
    }

    @Override // defpackage.bch
    public final void u(float f) {
        this.a.setPivotY(f);
    }

    @Override // defpackage.bch
    public final void v(float f) {
        this.a.setRotationZ(f);
    }

    @Override // defpackage.bch
    public final void w(float f) {
        this.a.setScaleX(f);
    }

    @Override // defpackage.bch
    public final void x(float f) {
        this.a.setScaleY(f);
    }

    @Override // defpackage.bch
    public final void y(int i) {
        this.a.setSpotShadowColor(i);
    }

    @Override // defpackage.bch
    public final void z(float f) {
        this.a.setTranslationX(f);
    }
}
