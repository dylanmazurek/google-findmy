package defpackage;

import android.widget.CompoundButton;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class ipp implements CompoundButton.OnCheckedChangeListener {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ ipp(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0021, code lost:            if (((defpackage.irg) r2.a).b(r0) != false) goto L14;     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0030, code lost:            ((defpackage.irg) r2.a).a();     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002e, code lost:            if (r3.c(r0, r3.d) != false) goto L14;     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [iro, java.lang.Object] */
    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onCheckedChanged(android.widget.CompoundButton r6, boolean r7) {
        /*
            r5 = this;
            int r0 = r5.b
            if (r0 == 0) goto Le
            java.lang.Object r6 = r5.a
            ehg r6 = (defpackage.ehg) r6
            ehk r6 = r6.e
            r6.b(r7)
            return
        Le:
            java.lang.Object r0 = r5.a
            r1 = r0
            com.google.android.material.chip.Chip r1 = (com.google.android.material.chip.Chip) r1
            njz r2 = r1.i
            if (r2 == 0) goto L37
            if (r7 == 0) goto L24
            java.lang.Object r3 = r2.a
            irg r3 = (defpackage.irg) r3
            boolean r0 = r3.b(r0)
            if (r0 == 0) goto L37
            goto L30
        L24:
            java.lang.Object r3 = r2.a
            irg r3 = (defpackage.irg) r3
            boolean r4 = r3.d
            boolean r0 = r3.c(r0, r4)
            if (r0 == 0) goto L37
        L30:
            java.lang.Object r0 = r2.a
            irg r0 = (defpackage.irg) r0
            r0.a()
        L37:
            android.widget.CompoundButton$OnCheckedChangeListener r0 = r1.f
            if (r0 == 0) goto L3e
            r0.onCheckedChanged(r6, r7)
        L3e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ipp.onCheckedChanged(android.widget.CompoundButton, boolean):void");
    }
}
