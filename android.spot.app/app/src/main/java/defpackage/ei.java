package defpackage;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ei extends eo implements bsi {
    public static final /* synthetic */ int b = 0;
    public ed a;
    private eh f;
    private int g;
    private int h;
    private boolean i;

    public ei() {
        this(null, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // defpackage.eo
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final ed b() {
        return new ed(this.a, this, null);
    }

    @Override // defpackage.eo, defpackage.el
    public final void d(ek ekVar) {
        super.d(ekVar);
        if (ekVar instanceof ed) {
            this.a = (ed) ekVar;
        }
    }

    @Override // defpackage.eo, defpackage.el, android.graphics.drawable.Drawable
    public final boolean isStateful() {
        return true;
    }

    @Override // defpackage.el, android.graphics.drawable.Drawable
    public final void jumpToCurrentState() {
        super.jumpToCurrentState();
        eh ehVar = this.f;
        if (ehVar != null) {
            ehVar.b();
            this.f = null;
            g(this.g);
            this.g = -1;
            this.h = -1;
        }
    }

    @Override // defpackage.eo, defpackage.el, android.graphics.drawable.Drawable
    public final Drawable mutate() {
        if (!this.i) {
            super.mutate();
            this.a.d();
            this.i = true;
        }
        return this;
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x00d4, code lost:            if (g(r2) != false) goto L8;     */
    @Override // defpackage.eo, defpackage.el, android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onStateChange(int[] r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            ed r2 = r0.a
            int r2 = r2.b(r1)
            int r3 = r0.e
            r4 = 0
            if (r2 == r3) goto Ld8
            eh r5 = r0.f
            r6 = 1
            if (r5 == 0) goto L32
            int r3 = r0.g
            if (r2 != r3) goto L1b
        L18:
            r4 = 1
            goto Ld8
        L1b:
            int r7 = r0.h
            if (r2 != r7) goto L2f
            boolean r7 = r5.d()
            if (r7 == 0) goto L2f
            r5.c()
            int r3 = r0.h
            r0.g = r3
            r0.h = r2
            goto L18
        L2f:
            r5.b()
        L32:
            r5 = 0
            r0.f = r5
            r5 = -1
            r0.h = r5
            r0.g = r5
            ed r5 = r0.a
            int r7 = r5.a(r3)
            int r8 = r5.a(r2)
            if (r8 == 0) goto Ld0
            if (r7 != 0) goto L4a
            goto Ld0
        L4a:
            long r9 = defpackage.ed.c(r7, r8)
            sl r11 = r5.a
            r12 = -1
            java.lang.Long r12 = java.lang.Long.valueOf(r12)
            java.lang.Object r9 = r11.f(r9, r12)
            java.lang.Long r9 = (java.lang.Long) r9
            long r9 = r9.longValue()
            int r10 = (int) r9
            if (r10 < 0) goto Ld0
            long r13 = defpackage.ed.c(r7, r8)
            sl r9 = r5.a
            java.lang.Object r9 = r9.f(r13, r12)
            java.lang.Long r9 = (java.lang.Long) r9
            long r13 = r9.longValue()
            r15 = 8589934592(0x200000000, double:4.243991582E-314)
            long r13 = r13 & r15
            r15 = 0
            int r9 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r9 == 0) goto L81
            r9 = 1
            goto L82
        L81:
            r9 = 0
        L82:
            r0.g(r10)
            android.graphics.drawable.Drawable r10 = r0.d
            boolean r11 = r10 instanceof android.graphics.drawable.AnimationDrawable
            if (r11 == 0) goto Lae
            long r7 = defpackage.ed.c(r7, r8)
            sl r5 = r5.a
            java.lang.Object r5 = r5.f(r7, r12)
            java.lang.Long r5 = (java.lang.Long) r5
            long r7 = r5.longValue()
            r11 = 4294967296(0x100000000, double:2.121995791E-314)
            long r7 = r7 & r11
            int r5 = (r7 > r15 ? 1 : (r7 == r15 ? 0 : -1))
            if (r5 == 0) goto La6
            r4 = 1
        La6:
            ef r5 = new ef
            android.graphics.drawable.AnimationDrawable r10 = (android.graphics.drawable.AnimationDrawable) r10
            r5.<init>(r10, r4, r9)
            goto Lc5
        Lae:
            boolean r5 = r10 instanceof defpackage.cnn
            if (r5 == 0) goto Lba
            ee r5 = new ee
            cnn r10 = (defpackage.cnn) r10
            r5.<init>(r10)
            goto Lc5
        Lba:
            boolean r5 = r10 instanceof android.graphics.drawable.Animatable
            if (r5 == 0) goto Ld0
            ec r5 = new ec
            android.graphics.drawable.Animatable r10 = (android.graphics.drawable.Animatable) r10
            r5.<init>(r10)
        Lc5:
            r5.a()
            r0.f = r5
            r0.h = r3
            r0.g = r2
            goto L18
        Ld0:
            boolean r2 = r0.g(r2)
            if (r2 == 0) goto Ld8
            goto L18
        Ld8:
            android.graphics.drawable.Drawable r2 = r0.d
            if (r2 == 0) goto Le2
            boolean r1 = r2.setState(r1)
            r1 = r1 | r4
            return r1
        Le2:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ei.onStateChange(int[]):boolean");
    }

    @Override // defpackage.el, android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        eh ehVar = this.f;
        if (ehVar != null && (visible || z2)) {
            if (z) {
                ehVar.a();
            } else {
                jumpToCurrentState();
            }
        }
        return visible;
    }

    public ei(ed edVar, Resources resources) {
        super(null);
        this.g = -1;
        this.h = -1;
        d(new ed(edVar, this, resources));
        onStateChange(getState());
        jumpToCurrentState();
    }
}
