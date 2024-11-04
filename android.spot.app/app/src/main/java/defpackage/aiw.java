package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class aiw extends mno implements mol {
    Object a;
    Object b;
    int c;
    int d;
    int e;
    int f;
    long g;
    int h;
    final /* synthetic */ aix i;
    private /* synthetic */ Object j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aiw(aix aixVar, mmx mmxVar) {
        super(mmxVar);
        this.i = aixVar;
    }

    @Override // defpackage.mol
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((aiw) c((mrb) obj, (mmx) obj2)).b(mlh.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x005d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0048 -> B:14:0x0091). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x004a -> B:5:0x005b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:7:0x0064 -> B:4:0x0088). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:9:0x0084 -> B:4:0x0088). Please report as a decompilation issue!!! */
    @Override // defpackage.mnj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(java.lang.Object r22) {
        /*
            r21 = this;
            r0 = r21
            mne r1 = defpackage.mne.a
            int r2 = r0.h
            r3 = 0
            r4 = 1
            r5 = 8
            if (r2 == 0) goto L22
            int r2 = r0.f
            int r6 = r0.e
            long r7 = r0.g
            int r9 = r0.d
            int r10 = r0.c
            java.lang.Object r11 = r0.b
            java.lang.Object r12 = r0.a
            java.lang.Object r13 = r0.j
            mrb r13 = (defpackage.mrb) r13
            defpackage.mjo.o(r22)
            goto L88
        L22:
            defpackage.mjo.o(r22)
            java.lang.Object r2 = r0.j
            mrb r2 = (defpackage.mrb) r2
            aix r6 = r0.i
            sy r6 = r6.a
            java.lang.Object[] r7 = r6.b
            long[] r6 = r6.a
            int r8 = r6.length
            int r8 = r8 + (-2)
            if (r8 < 0) goto L96
            r9 = 0
        L37:
            r10 = r6
            long[] r10 = (long[]) r10
            r11 = r10[r9]
            long r13 = ~r11
            r10 = 7
            long r13 = r13 << r10
            long r13 = r13 & r11
            r15 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r13 = r13 & r15
            int r10 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r10 == 0) goto L91
            int r10 = r9 - r8
            int r10 = ~r10
            int r10 = r10 >>> 31
            int r10 = 8 - r10
            r13 = r2
            r2 = 0
            r19 = r11
            r11 = r6
            r12 = r7
            r6 = r10
            r10 = r8
            r7 = r19
        L5b:
            if (r2 >= r6) goto L8b
            r14 = 255(0xff, double:1.26E-321)
            long r14 = r14 & r7
            r16 = 128(0x80, double:6.3E-322)
            int r18 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r18 >= 0) goto L88
            int r14 = r9 << 3
            int r14 = r14 + r2
            r15 = r12
            java.lang.Object[] r15 = (java.lang.Object[]) r15
            r14 = r15[r14]
            r0.j = r13
            r0.a = r12
            r0.b = r11
            r0.c = r10
            r0.d = r9
            r0.g = r7
            r0.e = r6
            r0.f = r2
            r0.h = r4
            java.lang.Object r14 = r13.a(r14, r0)
            if (r14 == r1) goto L87
            goto L88
        L87:
            return r1
        L88:
            long r7 = r7 >> r5
            int r2 = r2 + r4
            goto L5b
        L8b:
            if (r6 != r5) goto L96
            r8 = r10
            r6 = r11
            r7 = r12
            r2 = r13
        L91:
            if (r9 == r8) goto L96
            int r9 = r9 + 1
            goto L37
        L96:
            mlh r1 = defpackage.mlh.a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aiw.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.mnj
    public final mmx c(Object obj, mmx mmxVar) {
        aiw aiwVar = new aiw(this.i, mmxVar);
        aiwVar.j = obj;
        return aiwVar;
    }
}
