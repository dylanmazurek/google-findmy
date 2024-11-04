package defpackage;

import android.graphics.Rect;
import android.os.CancellationSignal;
import android.view.ScrollCaptureCallback;
import android.view.ScrollCaptureSession;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class beo implements ScrollCaptureCallback {
    public final bfh a = null;
    public final bes b;
    public final bet c;
    private final bll d;
    private final msw e;

    public beo(bll bllVar, msw mswVar, bet betVar) {
        this.d = bllVar;
        this.c = betVar;
        this.e = msz.n(mswVar, beq.b);
        this.b = new bes(bllVar.e - bllVar.c, new cav(this, (mmx) null, 1));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(android.view.ScrollCaptureSession r11, defpackage.bll r12, defpackage.mmx r13) {
        /*
            Method dump skipped, instructions count: 239
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.beo.a(android.view.ScrollCaptureSession, bll, mmx):java.lang.Object");
    }

    @Override // android.view.ScrollCaptureCallback
    public final void onScrollCaptureEnd(Runnable runnable) {
        mpp.q(this.e, mut.a, 0, new bdu(this, runnable, (mmx) null, 2), 2);
    }

    @Override // android.view.ScrollCaptureCallback
    public final void onScrollCaptureImageRequest(ScrollCaptureSession scrollCaptureSession, CancellationSignal cancellationSignal, Rect rect, Consumer consumer) {
        final muf q = mpp.q(this.e, null, 0, new bem(this, scrollCaptureSession, rect, consumer, (mmx) null, 0), 3);
        q.w(new bco(cancellationSignal, 4));
        cancellationSignal.setOnCancelListener(new CancellationSignal.OnCancelListener() { // from class: bep
            @Override // android.os.CancellationSignal.OnCancelListener
            public final void onCancel() {
                muf.this.s(null);
            }
        });
    }

    @Override // android.view.ScrollCaptureCallback
    public final void onScrollCaptureSearch(CancellationSignal cancellationSignal, Consumer consumer) {
        consumer.accept(arj.b(this.d));
    }

    @Override // android.view.ScrollCaptureCallback
    public final void onScrollCaptureStart(ScrollCaptureSession scrollCaptureSession, CancellationSignal cancellationSignal, Runnable runnable) {
        this.b.b = 0.0f;
        this.c.b(true);
        runnable.run();
    }
}
