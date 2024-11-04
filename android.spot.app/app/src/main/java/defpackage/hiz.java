package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.widget.CheckedTextView;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hiz {
    public boolean a;
    public final Object b;

    public hiz(CheckedTextView checkedTextView) {
        this.b = checkedTextView;
    }

    public final synchronized void a(dlf dlfVar, boolean z) {
        if (!this.a && !z) {
            this.a = true;
            dlfVar.e();
            this.a = false;
            return;
        }
        ((Handler) this.b).obtainMessage(1, dlfVar).sendToTarget();
    }

    public final void b() {
        ((CheckedTextView) this.b).getCheckMarkDrawable();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0072 A[Catch: all -> 0x0099, TryCatch #1 {all -> 0x0099, blocks: (B:3:0x002e, B:5:0x0034, B:8:0x003a, B:9:0x006b, B:11:0x0072, B:12:0x007d, B:14:0x0084, B:21:0x004d, B:23:0x0053, B:25:0x0059), top: B:2:0x002e }] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0084 A[Catch: all -> 0x0099, TRY_LEAVE, TryCatch #1 {all -> 0x0099, blocks: (B:3:0x002e, B:5:0x0034, B:8:0x003a, B:9:0x006b, B:11:0x0072, B:12:0x007d, B:14:0x0084, B:21:0x004d, B:23:0x0053, B:25:0x0059), top: B:2:0x002e }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(android.util.AttributeSet r13) {
        /*
            r12 = this;
            java.lang.Object r0 = r12.b
            android.widget.CheckedTextView r0 = (android.widget.CheckedTextView) r0
            android.content.Context r0 = r0.getContext()
            int[] r1 = defpackage.eb.l
            r2 = 2130968852(0x7f040114, float:1.754637E38)
            r3 = 0
            ksr r0 = defpackage.ksr.F(r0, r13, r1, r2, r3)
            java.lang.Object r1 = r0.b
            java.lang.Object r2 = r12.b
            r4 = r2
            android.widget.CheckedTextView r4 = (android.widget.CheckedTextView) r4
            android.content.Context r6 = r4.getContext()
            int[] r7 = defpackage.eb.l
            r5 = r2
            android.view.View r5 = (android.view.View) r5
            r9 = r1
            android.content.res.TypedArray r9 = (android.content.res.TypedArray) r9
            r10 = 2130968852(0x7f040114, float:1.754637E38)
            r11 = 0
            r8 = r13
            defpackage.bwn.p(r5, r6, r7, r8, r9, r10, r11)
            r13 = 1
            boolean r1 = r0.A(r13)     // Catch: java.lang.Throwable -> L99
            if (r1 == 0) goto L4d
            int r13 = r0.s(r13, r3)     // Catch: java.lang.Throwable -> L99
            if (r13 == 0) goto L4d
            java.lang.Object r1 = r12.b     // Catch: android.content.res.Resources.NotFoundException -> L4d java.lang.Throwable -> L99
            r2 = r1
            android.widget.CheckedTextView r2 = (android.widget.CheckedTextView) r2     // Catch: android.content.res.Resources.NotFoundException -> L4d java.lang.Throwable -> L99
            android.content.Context r2 = r2.getContext()     // Catch: android.content.res.Resources.NotFoundException -> L4d java.lang.Throwable -> L99
            android.graphics.drawable.Drawable r13 = defpackage.cu.c(r2, r13)     // Catch: android.content.res.Resources.NotFoundException -> L4d java.lang.Throwable -> L99
            android.widget.CheckedTextView r1 = (android.widget.CheckedTextView) r1     // Catch: android.content.res.Resources.NotFoundException -> L4d java.lang.Throwable -> L99
            r1.setCheckMarkDrawable(r13)     // Catch: android.content.res.Resources.NotFoundException -> L4d java.lang.Throwable -> L99
            goto L6b
        L4d:
            boolean r13 = r0.A(r3)     // Catch: java.lang.Throwable -> L99
            if (r13 == 0) goto L6b
            int r13 = r0.s(r3, r3)     // Catch: java.lang.Throwable -> L99
            if (r13 == 0) goto L6b
            java.lang.Object r1 = r12.b     // Catch: java.lang.Throwable -> L99
            r2 = r1
            android.widget.CheckedTextView r2 = (android.widget.CheckedTextView) r2     // Catch: java.lang.Throwable -> L99
            android.content.Context r2 = r2.getContext()     // Catch: java.lang.Throwable -> L99
            android.graphics.drawable.Drawable r13 = defpackage.cu.c(r2, r13)     // Catch: java.lang.Throwable -> L99
            android.widget.CheckedTextView r1 = (android.widget.CheckedTextView) r1     // Catch: java.lang.Throwable -> L99
            r1.setCheckMarkDrawable(r13)     // Catch: java.lang.Throwable -> L99
        L6b:
            r13 = 2
            boolean r1 = r0.A(r13)     // Catch: java.lang.Throwable -> L99
            if (r1 == 0) goto L7d
            java.lang.Object r1 = r12.b     // Catch: java.lang.Throwable -> L99
            android.content.res.ColorStateList r13 = r0.t(r13)     // Catch: java.lang.Throwable -> L99
            android.widget.CheckedTextView r1 = (android.widget.CheckedTextView) r1     // Catch: java.lang.Throwable -> L99
            r1.setCheckMarkTintList(r13)     // Catch: java.lang.Throwable -> L99
        L7d:
            r13 = 3
            boolean r1 = r0.A(r13)     // Catch: java.lang.Throwable -> L99
            if (r1 == 0) goto L95
            java.lang.Object r1 = r12.b     // Catch: java.lang.Throwable -> L99
            r2 = -1
            int r13 = r0.p(r13, r2)     // Catch: java.lang.Throwable -> L99
            r2 = 0
            android.graphics.PorterDuff$Mode r13 = defpackage.a.h(r13, r2)     // Catch: java.lang.Throwable -> L99
            android.widget.CheckedTextView r1 = (android.widget.CheckedTextView) r1     // Catch: java.lang.Throwable -> L99
            r1.setCheckMarkTintMode(r13)     // Catch: java.lang.Throwable -> L99
        L95:
            r0.y()
            return
        L99:
            r13 = move-exception
            r0.y()
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hiz.c(android.util.AttributeSet):void");
    }

    public hiz(ScheduledExecutorService scheduledExecutorService) {
        this.b = scheduledExecutorService;
        this.a = true;
    }

    public hiz(byte[] bArr) {
        this.b = new Handler(Looper.getMainLooper(), new dli());
    }

    public hiz() {
        this.b = new cfn(false);
    }
}
