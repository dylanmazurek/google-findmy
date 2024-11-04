package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bwv extends mno implements mol {
    int a;
    final /* synthetic */ View b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bwv(View view, mmx mmxVar) {
        super(mmxVar);
        this.b = view;
    }

    @Override // defpackage.mol
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((bwv) c((mrb) obj, (mmx) obj2)).b(mlh.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x004b, code lost:            if (r5 == r0) goto L18;     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0051, code lost:            return r0;     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0027, code lost:            if (r1.a(r5, r4) != r0) goto L9;     */
    @Override // defpackage.mnj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(java.lang.Object r5) {
        /*
            r4 = this;
            mne r0 = defpackage.mne.a
            int r1 = r4.a
            r2 = 1
            if (r1 == 0) goto L15
            if (r1 == r2) goto Ld
            defpackage.mjo.o(r5)
            goto L4e
        Ld:
            java.lang.Object r1 = r4.c
            mrb r1 = (defpackage.mrb) r1
            defpackage.mjo.o(r5)
            goto L29
        L15:
            defpackage.mjo.o(r5)
            java.lang.Object r5 = r4.c
            r1 = r5
            mrb r1 = (defpackage.mrb) r1
            android.view.View r5 = r4.b
            r4.c = r1
            r4.a = r2
            java.lang.Object r5 = r1.a(r5, r4)
            if (r5 == r0) goto L51
        L29:
            android.view.View r5 = r4.b
            boolean r2 = r5 instanceof android.view.ViewGroup
            if (r2 == 0) goto L4e
            android.view.ViewGroup r5 = (android.view.ViewGroup) r5
            bwu r2 = new bwu
            r3 = 0
            r2.<init>(r5, r3)
            r5 = 0
            r4.c = r5
            r5 = 2
            r4.a = r5
            java.util.Iterator r5 = r2.a()
            java.lang.Object r5 = r1.b(r5, r4)
            mne r1 = defpackage.mne.a
            if (r5 == r1) goto L4b
            mlh r5 = defpackage.mlh.a
        L4b:
            if (r5 != r0) goto L4e
            goto L51
        L4e:
            mlh r5 = defpackage.mlh.a
            return r5
        L51:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bwv.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.mnj
    public final mmx c(Object obj, mmx mmxVar) {
        bwv bwvVar = new bwv(this.b, mmxVar);
        bwvVar.c = obj;
        return bwvVar;
    }
}
