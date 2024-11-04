package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class so extends mno implements mol {
    Object a;
    Object b;
    Object c;
    int d;
    int e;
    int f;
    int g;
    long h;
    int i;
    final /* synthetic */ sp j;
    final /* synthetic */ sy k;
    private /* synthetic */ Object l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public so(sy syVar, sp spVar, mmx mmxVar) {
        super(mmxVar);
        this.k = syVar;
        this.j = spVar;
    }

    @Override // defpackage.mol
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((so) c((mrb) obj, (mmx) obj2)).b(mlh.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0063  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0049 -> B:14:0x00a5). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x004b -> B:5:0x0061). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:7:0x006a -> B:4:0x0097). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:9:0x0093 -> B:4:0x0097). Please report as a decompilation issue!!! */
    @Override // defpackage.mnj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(java.lang.Object r24) {
        /*
            r23 = this;
            r0 = r23
            mne r1 = defpackage.mne.a
            int r2 = r0.i
            r4 = 1
            r5 = 8
            if (r2 == 0) goto L24
            int r2 = r0.g
            int r6 = r0.f
            long r7 = r0.h
            int r9 = r0.e
            int r10 = r0.d
            java.lang.Object r11 = r0.c
            java.lang.Object r12 = r0.b
            java.lang.Object r13 = r0.a
            java.lang.Object r14 = r0.l
            mrb r14 = (defpackage.mrb) r14
            defpackage.mjo.o(r24)
            goto L97
        L24:
            defpackage.mjo.o(r24)
            java.lang.Object r2 = r0.l
            mrb r2 = (defpackage.mrb) r2
            sy r6 = r0.k
            sp r7 = r0.j
            long[] r8 = r6.a
            int r9 = r8.length
            int r9 = r9 + (-2)
            if (r9 < 0) goto Laa
            r10 = 0
        L37:
            r11 = r8
            long[] r11 = (long[]) r11
            r12 = r11[r10]
            long r14 = ~r12
            r11 = 7
            long r14 = r14 << r11
            long r14 = r14 & r12
            r16 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r14 = r14 & r16
            int r11 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r11 == 0) goto La5
            int r11 = r10 - r9
            int r11 = ~r11
            int r11 = r11 >>> 31
            int r11 = 8 - r11
            r14 = r2
            r2 = 0
            r20 = r12
            r12 = r6
            r13 = r7
            r6 = r11
            r11 = r8
            r7 = r20
            r22 = r10
            r10 = r9
            r9 = r22
        L61:
            if (r2 >= r6) goto L9a
            r15 = 255(0xff, double:1.26E-321)
            long r15 = r15 & r7
            r17 = 128(0x80, double:6.3E-322)
            int r19 = (r15 > r17 ? 1 : (r15 == r17 ? 0 : -1))
            if (r19 >= 0) goto L97
            int r15 = r9 << 3
            int r15 = r15 + r2
            r3 = r13
            sp r3 = (defpackage.sp) r3
            r3.a = r15
            r3 = r12
            sy r3 = (defpackage.sy) r3
            java.lang.Object[] r3 = r3.b
            r3 = r3[r15]
            r0.l = r14
            r0.a = r13
            r0.b = r12
            r0.c = r11
            r0.d = r10
            r0.e = r9
            r0.h = r7
            r0.f = r6
            r0.g = r2
            r0.i = r4
            java.lang.Object r3 = r14.a(r3, r0)
            if (r3 == r1) goto L96
            goto L97
        L96:
            return r1
        L97:
            long r7 = r7 >> r5
            int r2 = r2 + r4
            goto L61
        L9a:
            if (r6 != r5) goto Laa
            r8 = r11
            r6 = r12
            r7 = r13
            r2 = r14
            r20 = r10
            r10 = r9
            r9 = r20
        La5:
            if (r10 == r9) goto Laa
            int r10 = r10 + 1
            goto L37
        Laa:
            mlh r1 = defpackage.mlh.a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.so.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.mnj
    public final mmx c(Object obj, mmx mmxVar) {
        so soVar = new so(this.k, this.j, mmxVar);
        soVar.l = obj;
        return soVar;
    }
}
