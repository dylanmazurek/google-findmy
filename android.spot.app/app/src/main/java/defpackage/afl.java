package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class afl extends mnp implements mom {
    Object a;
    Object b;
    Object c;
    Object d;
    Object e;
    Object f;
    Object g;
    Object h;
    int i;
    /* synthetic */ Object j;
    final /* synthetic */ afn k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public afl(afn afnVar, mmx mmxVar) {
        super(3, mmxVar);
        this.k = afnVar;
    }

    public static final void d(List list, afn afnVar) {
        list.clear();
        synchronized (afnVar.c) {
            List list2 = afnVar.g;
            int size = list2.size();
            for (int i = 0; i < size; i++) {
                list.add((ado) list2.get(i));
            }
            afnVar.g.clear();
        }
    }

    public static final void e(afn afnVar, List list, List list2, List list3, sy syVar, sy syVar2, sy syVar3, sy syVar4) {
        synchronized (afnVar.c) {
            list.clear();
            list2.clear();
            int size = list3.size();
            for (int i = 0; i < size; i++) {
                ach achVar = (ach) list3.get(i);
                achVar.d();
                afnVar.w(achVar);
            }
            list3.clear();
            Object[] objArr = syVar.b;
            long[] jArr = syVar.a;
            int length = jArr.length - 2;
            long j = -9187201950435737472L;
            if (length >= 0) {
                int i2 = 0;
                while (true) {
                    long j2 = jArr[i2];
                    long[] jArr2 = jArr;
                    if ((((~j2) << 7) & j2 & j) != j) {
                        int i3 = 8 - ((~(i2 - length)) >>> 31);
                        for (int i4 = 0; i4 < i3; i4++) {
                            if ((j2 & 255) < 128) {
                                ach achVar2 = (ach) objArr[(i2 << 3) + i4];
                                achVar2.d();
                                afnVar.w(achVar2);
                            }
                            j2 >>= 8;
                        }
                        if (i3 != 8) {
                            break;
                        }
                    }
                    if (i2 == length) {
                        break;
                    }
                    i2++;
                    jArr = jArr2;
                    j = -9187201950435737472L;
                }
            }
            syVar.d();
            Object[] objArr2 = syVar2.b;
            long[] jArr3 = syVar2.a;
            int length2 = jArr3.length - 2;
            if (length2 >= 0) {
                int i5 = 0;
                while (true) {
                    long j3 = jArr3[i5];
                    if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i6 = 8 - ((~(i5 - length2)) >>> 31);
                        for (int i7 = 0; i7 < i6; i7++) {
                            if ((j3 & 255) < 128) {
                                ((ach) objArr2[(i5 << 3) + i7]).g();
                            }
                            j3 >>= 8;
                        }
                        if (i6 != 8) {
                            break;
                        }
                    }
                    if (i5 == length2) {
                        break;
                    } else {
                        i5++;
                    }
                }
            }
            syVar2.d();
            syVar3.d();
            Object[] objArr3 = syVar4.b;
            long[] jArr4 = syVar4.a;
            int length3 = jArr4.length - 2;
            if (length3 >= 0) {
                int i8 = 0;
                while (true) {
                    long j4 = jArr4[i8];
                    if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i9 = 8 - ((~(i8 - length3)) >>> 31);
                        for (int i10 = 0; i10 < i9; i10++) {
                            if ((j4 & 255) < 128) {
                                ach achVar3 = (ach) objArr3[(i8 << 3) + i10];
                                achVar3.d();
                                afnVar.w(achVar3);
                            }
                            j4 >>= 8;
                        }
                        if (i9 != 8) {
                            break;
                        }
                    }
                    if (i8 == length3) {
                        break;
                    } else {
                        i8++;
                    }
                }
            }
            syVar4.d();
        }
    }

    @Override // defpackage.mom
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        afl aflVar = new afl(this.k, (mmx) obj3);
        aflVar.j = (adk) obj2;
        return aflVar.b(mlh.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:42:0x008f A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0168 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r10v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v8, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v8, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v16, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v2, types: [adk, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v24 */
    /* JADX WARN: Type inference failed for: r5v15, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v16, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v8, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v13, types: [java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:59:0x0157 -> B:5:0x0161). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:60:0x0231 -> B:35:0x0088). Please report as a decompilation issue!!! */
    @Override // defpackage.mnj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(java.lang.Object r27) {
        /*
            Method dump skipped, instructions count: 588
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.afl.b(java.lang.Object):java.lang.Object");
    }
}
