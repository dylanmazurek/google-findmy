package defpackage;

import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Picture;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class asw implements ass {
    private static final boolean a = !atf.a.a();
    private static final Canvas b;
    private final bet A;
    private final bet B;
    private final atl c;
    private final ath d;
    private final Resources e;
    private final Rect f;
    private Paint g;
    private final Picture h;
    private final asl i;
    private int j;
    private int k;
    private long l;
    private boolean m;
    private boolean n;
    private boolean o;
    private int p;
    private int q;
    private float r;
    private boolean s;
    private float t;
    private float u;
    private float v;
    private float w;
    private long x;
    private long y;
    private float z;

    static {
        Canvas canvas;
        if (Build.VERSION.SDK_INT >= 23) {
            canvas = new asv();
        } else {
            canvas = (Canvas) new atm();
        }
        b = canvas;
    }

    public /* synthetic */ asw(atl atlVar) {
        Picture picture;
        asl aslVar;
        bet betVar;
        bet betVar2 = new bet((byte[]) null, (char[]) null);
        asl aslVar2 = new asl();
        this.c = atlVar;
        this.A = betVar2;
        ath athVar = new ath(atlVar, betVar2, aslVar2);
        this.d = athVar;
        this.e = atlVar.getResources();
        this.f = new Rect();
        boolean z = a;
        if (z) {
            picture = new Picture();
        } else {
            picture = null;
        }
        this.h = picture;
        if (z) {
            aslVar = new asl();
        } else {
            aslVar = null;
        }
        this.i = aslVar;
        if (z) {
            betVar = new bet((byte[]) null, (char[]) null);
        } else {
            betVar = null;
        }
        this.B = betVar;
        atlVar.addView(athVar);
        athVar.setClipBounds(null);
        this.l = 0L;
        View.generateViewId();
        this.p = 3;
        this.q = 0;
        this.r = 1.0f;
        this.t = 1.0f;
        this.u = 1.0f;
        long j = aqx.a;
        this.x = j;
        this.y = j;
    }

    private final Paint J() {
        Paint paint = this.g;
        if (paint == null) {
            Paint paint2 = new Paint();
            this.g = paint2;
            return paint2;
        }
        return paint;
    }

    private final void K(int i) {
        boolean z = true;
        if (a.m(i, 1)) {
            this.d.setLayerType(2, this.g);
        } else if (a.m(i, 2)) {
            this.d.setLayerType(0, this.g);
            z = false;
        } else {
            this.d.setLayerType(0, this.g);
        }
        ath athVar = this.d;
        if (athVar.c != z) {
            athVar.c = z;
            athVar.invalidate();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [aqv, java.lang.Object] */
    private final void L() {
        try {
            bet betVar = this.A;
            Canvas canvas = b;
            ?? r2 = betVar.a;
            Canvas canvas2 = ((aqo) r2).a;
            ((aqo) r2).a = canvas;
            atl atlVar = this.c;
            ath athVar = this.d;
            atlVar.a(r2, athVar, athVar.getDrawingTime());
            ((aqo) betVar.a).a = canvas2;
        } catch (Throwable unused) {
        }
    }

    private final void M() {
        int i = this.q;
        if (!a.m(i, 1) && a.m(this.p, 3)) {
            K(i);
        } else {
            K(1);
        }
    }

    @Override // defpackage.ass
    public final void A(float f) {
        this.u = f;
        this.d.setScaleY(f);
    }

    @Override // defpackage.ass
    public final void B(long j) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.y = j;
            ati.a.c(this.d, jw.d(j));
        }
    }

    @Override // defpackage.ass
    public final void C(float f) {
        this.v = f;
        this.d.setTranslationX(f);
    }

    @Override // defpackage.ass
    public final void D(float f) {
        this.w = f;
        this.d.setTranslationY(f);
    }

    @Override // defpackage.ass
    public final boolean E() {
        if (!this.o && !this.d.getClipToOutline()) {
            return false;
        }
        return true;
    }

    @Override // defpackage.ass
    public final /* synthetic */ boolean F() {
        return true;
    }

    @Override // defpackage.ass
    public final void G() {
        J().setColorFilter(null);
        M();
    }

    @Override // defpackage.ass
    public final void H() {
        this.p = 3;
        J().setXfermode(new PorterDuffXfermode(aqq.c(3)));
        M();
    }

    @Override // defpackage.ass
    public final void I() {
        if (Build.VERSION.SDK_INT >= 31) {
            atj.a.a(this.d, null);
        }
    }

    @Override // defpackage.ass
    public final float a() {
        return this.r;
    }

    @Override // defpackage.ass
    public final float b() {
        return this.d.getCameraDistance() / this.e.getDisplayMetrics().densityDpi;
    }

    @Override // defpackage.ass
    public final float c() {
        return this.z;
    }

    @Override // defpackage.ass
    public final float d() {
        return this.t;
    }

    @Override // defpackage.ass
    public final float e() {
        return this.u;
    }

    @Override // defpackage.ass
    public final float f() {
        return this.v;
    }

    @Override // defpackage.ass
    public final float g() {
        return this.w;
    }

    @Override // defpackage.ass
    public final int h() {
        return this.p;
    }

    @Override // defpackage.ass
    public final int i() {
        return this.q;
    }

    @Override // defpackage.ass
    public final long j() {
        return this.x;
    }

    @Override // defpackage.ass
    public final long k() {
        return this.y;
    }

    @Override // defpackage.ass
    public final Matrix l() {
        return this.d.getMatrix();
    }

    @Override // defpackage.ass
    public final void m() {
        this.c.removeViewInLayout(this.d);
    }

    @Override // defpackage.ass
    public final void n(aqv aqvVar) {
        if (this.m) {
            ath athVar = this.d;
            Rect rect = null;
            if (E() && !this.n) {
                rect = this.f;
                rect.left = 0;
                rect.top = 0;
                rect.right = this.d.getWidth();
                rect.bottom = this.d.getHeight();
            }
            athVar.setClipBounds(rect);
        }
        Canvas a2 = aqp.a(aqvVar);
        if (a2.isHardwareAccelerated()) {
            atl atlVar = this.c;
            ath athVar2 = this.d;
            atlVar.a(aqvVar, athVar2, athVar2.getDrawingTime());
        } else {
            Picture picture = this.h;
            if (picture != null) {
                a2.drawPicture(picture);
            }
        }
    }

    @Override // defpackage.ass
    public final void o() {
        ath athVar = this.d;
        athVar.f = asr.a;
        this.c.addView(athVar);
    }

    /* JADX WARN: Type inference failed for: r7v1, types: [aqv, java.lang.Object] */
    @Override // defpackage.ass
    public final void p(ble bleVar, bln blnVar, asq asqVar, moh mohVar) {
        ath athVar = this.d;
        athVar.d = bleVar;
        athVar.e = blnVar;
        athVar.f = mohVar;
        athVar.g = asqVar;
        if (athVar.isAttachedToWindow()) {
            this.d.setVisibility(4);
            this.d.setVisibility(0);
            L();
            Picture picture = this.h;
            if (picture != null) {
                long j = this.l;
                Canvas beginRecording = picture.beginRecording(blm.b(j), blm.a(j));
                try {
                    bet betVar = this.B;
                    if (betVar != null) {
                        ?? r7 = betVar.a;
                        Canvas canvas = ((aqo) r7).a;
                        ((aqo) r7).a = beginRecording;
                        asl aslVar = this.i;
                        if (aslVar != null) {
                            long n = bef.n(this.l);
                            asj asjVar = aslVar.a;
                            ble bleVar2 = asjVar.a;
                            bln blnVar2 = asjVar.b;
                            aqv aqvVar = asjVar.c;
                            long j2 = asjVar.d;
                            asjVar.a = bleVar;
                            asjVar.b = blnVar;
                            asjVar.c = r7;
                            asjVar.d = n;
                            r7.e();
                            mohVar.a(aslVar);
                            r7.d();
                            asj asjVar2 = aslVar.a;
                            asjVar2.a = bleVar2;
                            asjVar2.b = blnVar2;
                            asjVar2.c = aqvVar;
                            asjVar2.d = j2;
                        }
                        ((aqo) betVar.a).a = canvas;
                    }
                } finally {
                    picture.endRecording();
                }
            }
        }
    }

    @Override // defpackage.ass
    public final void q(float f) {
        this.r = f;
        this.d.setAlpha(f);
    }

    @Override // defpackage.ass
    public final void r(long j) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.x = j;
            ati.a.b(this.d, jw.d(j));
        }
    }

    @Override // defpackage.ass
    public final void s(float f) {
        this.d.setCameraDistance(f * this.e.getDisplayMetrics().densityDpi);
    }

    @Override // defpackage.ass
    public final void t(boolean z) {
        boolean z2;
        boolean z3 = true;
        if (z && !this.n) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.o = z2;
        this.m = true;
        ath athVar = this.d;
        if (!z || !this.n) {
            z3 = false;
        }
        athVar.setClipToOutline(z3);
    }

    @Override // defpackage.ass
    public final void u(int i) {
        this.q = i;
        M();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.ass
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void v(android.graphics.Outline r8) {
        /*
            r7 = this;
            ath r0 = r7.d
            r0.b = r8
            ata r1 = defpackage.ata.a
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 22
            r4 = 0
            r5 = 1
            if (r2 < r3) goto L13
            r0.invalidateOutline()
        L11:
            r0 = 1
            goto L3b
        L13:
            monitor-enter(r1)     // Catch: java.lang.Throwable -> L39
            boolean r2 = defpackage.ata.c     // Catch: java.lang.Throwable -> L36
            r3 = 0
            if (r2 != 0) goto L2b
            defpackage.ata.c = r5     // Catch: java.lang.Throwable -> L36
            java.lang.Class<android.view.View> r2 = android.view.View.class
            java.lang.String r6 = "rebuildOutline"
            java.lang.reflect.Method r2 = r2.getDeclaredMethod(r6, r3)     // Catch: java.lang.Throwable -> L36
            if (r2 == 0) goto L2d
            r2.setAccessible(r5)     // Catch: java.lang.Throwable -> L36
            defpackage.ata.b = r2     // Catch: java.lang.Throwable -> L36
            goto L2d
        L2b:
            java.lang.reflect.Method r2 = defpackage.ata.b     // Catch: java.lang.Throwable -> L36
        L2d:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L39
            if (r2 == 0) goto L33
            r2.invoke(r0, r3)     // Catch: java.lang.Throwable -> L39
        L33:
            if (r2 == 0) goto L3a
            goto L11
        L36:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L39
            throw r0     // Catch: java.lang.Throwable -> L39
        L39:
        L3a:
            r0 = 0
        L3b:
            boolean r1 = r7.E()
            if (r1 == 0) goto L50
            if (r8 == 0) goto L50
            ath r1 = r7.d
            r1.setClipToOutline(r5)
            boolean r1 = r7.o
            if (r1 == 0) goto L50
            r7.o = r4
            r7.m = r5
        L50:
            if (r8 == 0) goto L53
            r4 = 1
        L53:
            r7.n = r4
            if (r0 != 0) goto L5f
            ath r8 = r7.d
            r8.invalidate()
            r7.L()
        L5f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.asw.v(android.graphics.Outline):void");
    }

    @Override // defpackage.ass
    public final void w(long j) {
        if (iy.d(j)) {
            if (Build.VERSION.SDK_INT >= 28) {
                ati.a.a(this.d);
                return;
            } else {
                this.s = true;
                this.d.setPivotX(blm.b(this.l) / 2.0f);
                this.d.setPivotY(blm.a(this.l) / 2.0f);
                return;
            }
        }
        this.s = false;
        this.d.setPivotX(aqk.b(j));
        this.d.setPivotY(aqk.c(j));
    }

    @Override // defpackage.ass
    public final void x(int i, int i2, long j) {
        if (!a.n(this.l, j)) {
            if (E()) {
                this.m = true;
            }
            this.d.layout(i, i2, blm.b(j) + i, blm.a(j) + i2);
            this.l = j;
            if (this.s) {
                this.d.setPivotX(blm.b(j) / 2.0f);
                this.d.setPivotY(blm.a(j) / 2.0f);
            }
        } else {
            int i3 = this.j;
            if (i3 != i) {
                this.d.offsetLeftAndRight(i - i3);
            }
            int i4 = this.k;
            if (i4 != i2) {
                this.d.offsetTopAndBottom(i2 - i4);
            }
        }
        this.j = i;
        this.k = i2;
    }

    @Override // defpackage.ass
    public final void y(float f) {
        this.z = f;
        this.d.setRotation(f);
    }

    @Override // defpackage.ass
    public final void z(float f) {
        this.t = f;
        this.d.setScaleX(f);
    }
}
