package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.RecordingCanvas;
import android.graphics.RenderNode;
import android.os.Build;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class asu implements ass {
    private final asl a;
    private final RenderNode b;
    private long c;
    private Paint d;
    private Matrix e;
    private boolean f;
    private float g;
    private int h;
    private float i;
    private float j;
    private float k;
    private float l;
    private long m;
    private long n;
    private float o;
    private float p;
    private boolean q;
    private boolean r;
    private boolean s;
    private int t;
    private final bet u;

    public asu() {
        this(null);
    }

    private final Paint J() {
        Paint paint = this.d;
        if (paint == null) {
            Paint paint2 = new Paint();
            this.d = paint2;
            return paint2;
        }
        return paint;
    }

    private final void K() {
        boolean z;
        boolean z2 = this.q;
        boolean z3 = true;
        if (z2 && !this.f) {
            z = true;
        } else {
            z = false;
        }
        if (!z2 || !this.f) {
            z3 = false;
        }
        if (z != this.r) {
            this.r = z;
            this.b.setClipToBounds(z);
        }
        if (z3 != this.s) {
            this.s = z3;
            this.b.setClipToOutline(z3);
        }
    }

    private final void L(RenderNode renderNode, int i) {
        if (!a.m(i, 1)) {
            if (a.m(i, 2)) {
                renderNode.setUseCompositingLayer(false, this.d);
                renderNode.setHasOverlappingRendering(false);
                return;
            } else {
                renderNode.setUseCompositingLayer(false, this.d);
                renderNode.setHasOverlappingRendering(true);
                return;
            }
        }
        renderNode.setUseCompositingLayer(true, this.d);
        renderNode.setHasOverlappingRendering(true);
    }

    private final void M() {
        int i = this.t;
        if (!a.m(i, 1) && a.m(this.h, 3)) {
            L(this.b, i);
        } else {
            L(this.b, 1);
        }
    }

    @Override // defpackage.ass
    public final void A(float f) {
        this.j = f;
        this.b.setScaleY(f);
    }

    @Override // defpackage.ass
    public final void B(long j) {
        this.n = j;
        this.b.setSpotShadowColor(jw.d(j));
    }

    @Override // defpackage.ass
    public final void C(float f) {
        this.k = f;
        this.b.setTranslationX(f);
    }

    @Override // defpackage.ass
    public final void D(float f) {
        this.l = f;
        this.b.setTranslationY(f);
    }

    @Override // defpackage.ass
    public final boolean E() {
        return this.q;
    }

    @Override // defpackage.ass
    public final boolean F() {
        boolean hasDisplayList;
        hasDisplayList = this.b.hasDisplayList();
        return hasDisplayList;
    }

    @Override // defpackage.ass
    public final void G() {
        J().setColorFilter(null);
        M();
    }

    @Override // defpackage.ass
    public final void H() {
        this.h = 3;
        J().setBlendMode(aqq.b(3));
        M();
    }

    @Override // defpackage.ass
    public final void I() {
        if (Build.VERSION.SDK_INT >= 31) {
            ate.a.a(this.b, null);
        }
    }

    @Override // defpackage.ass
    public final float a() {
        return this.g;
    }

    @Override // defpackage.ass
    public final float b() {
        return this.p;
    }

    @Override // defpackage.ass
    public final float c() {
        return this.o;
    }

    @Override // defpackage.ass
    public final float d() {
        return this.i;
    }

    @Override // defpackage.ass
    public final float e() {
        return this.j;
    }

    @Override // defpackage.ass
    public final float f() {
        return this.k;
    }

    @Override // defpackage.ass
    public final float g() {
        return this.l;
    }

    @Override // defpackage.ass
    public final int h() {
        return this.h;
    }

    @Override // defpackage.ass
    public final int i() {
        return this.t;
    }

    @Override // defpackage.ass
    public final long j() {
        return this.m;
    }

    @Override // defpackage.ass
    public final long k() {
        return this.n;
    }

    @Override // defpackage.ass
    public final Matrix l() {
        Matrix matrix = this.e;
        if (matrix == null) {
            matrix = new Matrix();
            this.e = matrix;
        }
        this.b.getMatrix(matrix);
        return matrix;
    }

    @Override // defpackage.ass
    public final void m() {
        this.b.discardDisplayList();
    }

    @Override // defpackage.ass
    public final void n(aqv aqvVar) {
        aqp.a(aqvVar).drawRenderNode(this.b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [aqv, java.lang.Object] */
    @Override // defpackage.ass
    public final void p(ble bleVar, bln blnVar, asq asqVar, moh mohVar) {
        RecordingCanvas beginRecording;
        beginRecording = this.b.beginRecording();
        try {
            bet betVar = this.u;
            ?? r2 = betVar.a;
            Canvas canvas = ((aqo) r2).a;
            ((aqo) r2).a = beginRecording;
            ask askVar = this.a.b;
            askVar.f(bleVar);
            askVar.g(blnVar);
            askVar.a = asqVar;
            askVar.h(this.c);
            askVar.e(r2);
            mohVar.a(this.a);
            ((aqo) betVar.a).a = canvas;
        } finally {
            this.b.endRecording();
        }
    }

    @Override // defpackage.ass
    public final void q(float f) {
        this.g = f;
        this.b.setAlpha(f);
    }

    @Override // defpackage.ass
    public final void r(long j) {
        this.m = j;
        this.b.setAmbientShadowColor(jw.d(j));
    }

    @Override // defpackage.ass
    public final void s(float f) {
        this.p = f;
        this.b.setCameraDistance(f);
    }

    @Override // defpackage.ass
    public final void t(boolean z) {
        this.q = z;
        K();
    }

    @Override // defpackage.ass
    public final void u(int i) {
        this.t = i;
        M();
    }

    @Override // defpackage.ass
    public final void v(Outline outline) {
        boolean z;
        this.b.setOutline(outline);
        if (outline != null) {
            z = true;
        } else {
            z = false;
        }
        this.f = z;
        K();
    }

    @Override // defpackage.ass
    public final void w(long j) {
        if (iy.d(j)) {
            this.b.resetPivot();
        } else {
            this.b.setPivotX(aqk.b(j));
            this.b.setPivotY(aqk.c(j));
        }
    }

    @Override // defpackage.ass
    public final void x(int i, int i2, long j) {
        int a = blm.a(j);
        this.b.setPosition(i, i2, blm.b(j) + i, a + i2);
        this.c = bef.n(j);
    }

    @Override // defpackage.ass
    public final void y(float f) {
        this.o = f;
        this.b.setRotationZ(f);
    }

    @Override // defpackage.ass
    public final void z(float f) {
        this.i = f;
        this.b.setScaleX(f);
    }

    public /* synthetic */ asu(byte[] bArr) {
        bet betVar = new bet((byte[]) null, (char[]) null);
        asl aslVar = new asl();
        this.u = betVar;
        this.a = aslVar;
        RenderNode renderNode = new RenderNode("graphicsLayer");
        this.b = renderNode;
        this.c = 0L;
        renderNode.setClipToBounds(false);
        L(renderNode, 0);
        this.g = 1.0f;
        this.h = 3;
        this.i = 1.0f;
        this.j = 1.0f;
        long j = aqx.a;
        this.m = j;
        this.n = j;
        this.p = 8.0f;
        this.t = 0;
    }

    @Override // defpackage.ass
    public final /* synthetic */ void o() {
    }
}
