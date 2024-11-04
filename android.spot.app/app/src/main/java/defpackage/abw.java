package defpackage;

import android.os.Trace;
import java.util.Arrays;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class abw implements ach, afs, aew {
    public final aaw a;
    public final Set c;
    public final afx d;
    public final agz e;
    public final agz f;
    public abw g;
    public int h;
    public final abp i;
    public boolean j;
    public final su k;
    public final su l;
    public su m;
    private final abt n;
    private boolean p;
    private mol q;
    private final sy r;
    private final sy s;
    private final su t;
    private final AtomicReference o = new AtomicReference(null);
    public final Object b = new Object();

    public /* synthetic */ abw(abt abtVar, aaw aawVar) {
        this.n = abtVar;
        this.a = aawVar;
        sq sqVar = new sq(new sy((byte[]) null));
        this.c = sqVar;
        afx afxVar = new afx();
        if (abtVar.q()) {
            afxVar.d();
        }
        if (abtVar.s()) {
            afxVar.e();
        }
        this.d = afxVar;
        this.k = new su((byte[]) null);
        this.r = new sy((byte[]) null);
        this.s = new sy((byte[]) null);
        this.l = new su((byte[]) null);
        agz agzVar = new agz();
        this.e = agzVar;
        agz agzVar2 = new agz();
        this.f = agzVar2;
        this.t = new su((byte[]) null);
        this.m = new su((byte[]) null);
        abp abpVar = new abp(aawVar, abtVar, afxVar, sqVar, agzVar, agzVar2, this);
        abtVar.l(abpVar);
        this.i = abpVar;
        this.q = abc.a;
    }

    private final void A() {
        Object andSet = this.o.getAndSet(null);
        if (!amr.i(andSet, abx.a)) {
            if (andSet instanceof Set) {
                x((Set) andSet, false);
                return;
            }
            if (andSet instanceof Object[]) {
                for (Set set : (Set[]) andSet) {
                    x(set, false);
                }
                return;
            }
            if (andSet == null) {
                abr.g("calling recordModificationsOf and applyChanges concurrently is not supported");
                throw new mks();
            }
            AtomicReference atomicReference = this.o;
            Objects.toString(atomicReference);
            abr.g("corrupt pendingModifications drain: ".concat(atomicReference.toString()));
            throw new mks();
        }
    }

    private final void B(Object obj) {
        int i;
        Object a = this.k.a(obj);
        if (a != null) {
            if (a instanceof sy) {
                sy syVar = (sy) a;
                Object[] objArr = syVar.b;
                long[] jArr = syVar.a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i2 = 0;
                    while (true) {
                        long j = jArr[i2];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i3 = i2 - length;
                            int i4 = 0;
                            while (true) {
                                i = 8 - ((~i3) >>> 31);
                                if (i4 >= i) {
                                    break;
                                }
                                if ((255 & j) < 128) {
                                    aeu aeuVar = (aeu) objArr[(i2 << 3) + i4];
                                    if (aeuVar.b(obj) == ada.IMMINENT) {
                                        aiy.a(this.t, obj, aeuVar);
                                    }
                                }
                                j >>= 8;
                                i4++;
                            }
                            if (i != 8) {
                                return;
                            }
                        }
                        if (i2 != length) {
                            i2++;
                        } else {
                            return;
                        }
                    }
                }
            } else {
                aeu aeuVar2 = (aeu) a;
                if (aeuVar2.b(obj) == ada.IMMINENT) {
                    aiy.a(this.t, obj, aeuVar2);
                }
            }
        }
    }

    private final boolean C(aeu aeuVar, Object obj) {
        if (p() && this.i.ac(aeuVar, obj)) {
            return true;
        }
        return false;
    }

    public static final void u() {
        amr.i(null, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0037, code lost:            if (r9 < r7) goto L18;     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00b5, code lost:            if (r6 != defpackage.afu.a) goto L53;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final defpackage.ada v(defpackage.aeu r22, defpackage.aav r23, java.lang.Object r24) {
        /*
            Method dump skipped, instructions count: 216
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.abw.v(aeu, aav, java.lang.Object):ada");
    }

    private final void w(Object obj, boolean z) {
        int i;
        Object a = this.k.a(obj);
        if (a != null) {
            if (a instanceof sy) {
                sy syVar = (sy) a;
                Object[] objArr = syVar.b;
                long[] jArr = syVar.a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i2 = 0;
                    while (true) {
                        long j = jArr[i2];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i3 = i2 - length;
                            int i4 = 0;
                            while (true) {
                                i = 8 - ((~i3) >>> 31);
                                if (i4 >= i) {
                                    break;
                                }
                                if ((255 & j) < 128) {
                                    aeu aeuVar = (aeu) objArr[(i2 << 3) + i4];
                                    if (!aiy.c(this.t, obj, aeuVar) && aeuVar.b(obj) != ada.IGNORED) {
                                        if (aeuVar.l() && !z) {
                                            this.s.i(aeuVar);
                                        } else {
                                            this.r.i(aeuVar);
                                        }
                                    }
                                }
                                j >>= 8;
                                i4++;
                            }
                            if (i != 8) {
                                return;
                            }
                        }
                        if (i2 != length) {
                            i2++;
                        } else {
                            return;
                        }
                    }
                }
            } else {
                aeu aeuVar2 = (aeu) a;
                if (!aiy.c(this.t, obj, aeuVar2) && aeuVar2.b(obj) != ada.IGNORED) {
                    if (aeuVar2.l() && !z) {
                        this.s.i(aeuVar2);
                    } else {
                        this.r.i(aeuVar2);
                    }
                }
            }
        }
    }

    private final void x(Set set, boolean z) {
        long[] jArr;
        int i;
        long[] jArr2;
        int i2;
        int i3;
        int i4;
        boolean a;
        long[] jArr3;
        long[] jArr4;
        int i5;
        long[] jArr5;
        int i6;
        int i7;
        int i8;
        Object[] objArr;
        Object[] objArr2;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        char c = 7;
        long j = -9187201950435737472L;
        if (set instanceof aix) {
            sy syVar = ((aix) set).a;
            Object[] objArr3 = syVar.b;
            long[] jArr6 = syVar.a;
            int length = jArr6.length - 2;
            if (length >= 0) {
                int i14 = 0;
                while (true) {
                    long j2 = jArr6[i14];
                    if ((((~j2) << c) & j2 & j) != j) {
                        int i15 = 8 - ((~(i14 - length)) >>> 31);
                        int i16 = 0;
                        while (i16 < i15) {
                            if ((j2 & 255) < 128) {
                                Object obj = objArr3[(i14 << 3) + i16];
                                if (obj instanceof aeu) {
                                    ((aeu) obj).b(null);
                                } else {
                                    w(obj, z);
                                    Object a2 = this.l.a(obj);
                                    if (a2 != null) {
                                        if (a2 instanceof sy) {
                                            sy syVar2 = (sy) a2;
                                            Object[] objArr4 = syVar2.b;
                                            long[] jArr7 = syVar2.a;
                                            int length2 = jArr7.length - 2;
                                            if (length2 >= 0) {
                                                i12 = length;
                                                i13 = i14;
                                                int i17 = 0;
                                                while (true) {
                                                    long j3 = jArr7[i17];
                                                    i10 = i15;
                                                    i11 = i16;
                                                    if ((((~j3) << c) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                        int i18 = 8 - ((~(i17 - length2)) >>> 31);
                                                        for (int i19 = 0; i19 < i18; i19++) {
                                                            if ((j3 & 255) < 128) {
                                                                w((acm) objArr4[(i17 << 3) + i19], z);
                                                            }
                                                            j3 >>= 8;
                                                        }
                                                        if (i18 != 8) {
                                                            break;
                                                        }
                                                    }
                                                    if (i17 != length2) {
                                                        i17++;
                                                        i15 = i10;
                                                        i16 = i11;
                                                        c = 7;
                                                    }
                                                }
                                            }
                                        } else {
                                            i10 = i15;
                                            i11 = i16;
                                            i12 = length;
                                            i13 = i14;
                                            w((acm) a2, z);
                                        }
                                        j2 >>= 8;
                                        i16 = i11 + 1;
                                        length = i12;
                                        i14 = i13;
                                        i15 = i10;
                                        c = 7;
                                    }
                                }
                            }
                            i10 = i15;
                            i11 = i16;
                            i12 = length;
                            i13 = i14;
                            j2 >>= 8;
                            i16 = i11 + 1;
                            length = i12;
                            i14 = i13;
                            i15 = i10;
                            c = 7;
                        }
                        int i20 = length;
                        i9 = i14;
                        if (i15 != 8) {
                            break;
                        } else {
                            length = i20;
                        }
                    } else {
                        i9 = i14;
                    }
                    if (i9 == length) {
                        break;
                    }
                    i14 = i9 + 1;
                    c = 7;
                    j = -9187201950435737472L;
                }
            }
        } else {
            for (Object obj2 : set) {
                if (obj2 instanceof aeu) {
                    ((aeu) obj2).b(null);
                } else {
                    w(obj2, z);
                    Object a3 = this.l.a(obj2);
                    if (a3 != null) {
                        if (a3 instanceof sy) {
                            sy syVar3 = (sy) a3;
                            Object[] objArr5 = syVar3.b;
                            long[] jArr8 = syVar3.a;
                            int length3 = jArr8.length - 2;
                            if (length3 >= 0) {
                                int i21 = 0;
                                while (true) {
                                    long j4 = jArr8[i21];
                                    if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i22 = 8 - ((~(i21 - length3)) >>> 31);
                                        for (int i23 = 0; i23 < i22; i23++) {
                                            if ((j4 & 255) < 128) {
                                                w((acm) objArr5[(i21 << 3) + i23], z);
                                            }
                                            j4 >>= 8;
                                        }
                                        if (i22 != 8) {
                                            break;
                                        }
                                    }
                                    if (i21 != length3) {
                                        i21++;
                                    }
                                }
                            }
                        } else {
                            w((acm) a3, z);
                        }
                    }
                }
            }
        }
        sy syVar4 = this.s;
        sy syVar5 = this.r;
        if (z && syVar4.c()) {
            su suVar = this.k;
            long[] jArr9 = suVar.a;
            int length4 = jArr9.length - 2;
            if (length4 >= 0) {
                int i24 = 0;
                while (true) {
                    long j5 = jArr9[i24];
                    if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i25 = 8 - ((~(i24 - length4)) >>> 31);
                        int i26 = 0;
                        while (i26 < i25) {
                            if ((j5 & 255) < 128) {
                                int i27 = (i24 << 3) + i26;
                                Object obj3 = suVar.b[i27];
                                Object obj4 = suVar.c[i27];
                                if (obj4 instanceof sy) {
                                    obj4.getClass();
                                    sy syVar6 = (sy) obj4;
                                    Object[] objArr6 = syVar6.b;
                                    long[] jArr10 = syVar6.a;
                                    int length5 = jArr10.length - 2;
                                    jArr5 = jArr9;
                                    i6 = length4;
                                    i7 = i24;
                                    if (length5 >= 0) {
                                        int i28 = 0;
                                        while (true) {
                                            long j6 = jArr10[i28];
                                            i8 = i25;
                                            long[] jArr11 = jArr10;
                                            if ((((~j6) << 7) & j6 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                int i29 = 8 - ((~(i28 - length5)) >>> 31);
                                                int i30 = 0;
                                                while (i30 < i29) {
                                                    if ((j6 & 255) < 128) {
                                                        int i31 = (i28 << 3) + i30;
                                                        objArr2 = objArr6;
                                                        aeu aeuVar = (aeu) objArr6[i31];
                                                        if (syVar4.a(aeuVar) || syVar5.a(aeuVar)) {
                                                            syVar6.h(i31);
                                                        }
                                                    } else {
                                                        objArr2 = objArr6;
                                                    }
                                                    j6 >>= 8;
                                                    i30++;
                                                    objArr6 = objArr2;
                                                }
                                                objArr = objArr6;
                                                if (i29 != 8) {
                                                    break;
                                                }
                                            } else {
                                                objArr = objArr6;
                                            }
                                            if (i28 == length5) {
                                                break;
                                            }
                                            i28++;
                                            i25 = i8;
                                            jArr10 = jArr11;
                                            objArr6 = objArr;
                                        }
                                    } else {
                                        i8 = i25;
                                    }
                                    if (!syVar6.b()) {
                                    }
                                    suVar.g(i27);
                                } else {
                                    jArr5 = jArr9;
                                    i6 = length4;
                                    i7 = i24;
                                    i8 = i25;
                                    obj4.getClass();
                                    aeu aeuVar2 = (aeu) obj4;
                                    if (!syVar4.a(aeuVar2) && !syVar5.a(aeuVar2)) {
                                    }
                                    suVar.g(i27);
                                }
                            } else {
                                jArr5 = jArr9;
                                i6 = length4;
                                i7 = i24;
                                i8 = i25;
                            }
                            j5 >>= 8;
                            i26++;
                            length4 = i6;
                            i24 = i7;
                            jArr9 = jArr5;
                            i25 = i8;
                        }
                        jArr4 = jArr9;
                        int i32 = length4;
                        int i33 = i24;
                        if (i25 != 8) {
                            break;
                        }
                        length4 = i32;
                        i5 = i33;
                    } else {
                        jArr4 = jArr9;
                        i5 = i24;
                    }
                    if (i5 == length4) {
                        break;
                    }
                    i24 = i5 + 1;
                    jArr9 = jArr4;
                }
            }
            syVar4.d();
            z();
            return;
        }
        if (syVar5.c()) {
            su suVar2 = this.k;
            long[] jArr12 = suVar2.a;
            int length6 = jArr12.length - 2;
            if (length6 >= 0) {
                int i34 = 0;
                while (true) {
                    long j7 = jArr12[i34];
                    if ((((~j7) << 7) & j7 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i35 = 8 - ((~(i34 - length6)) >>> 31);
                        int i36 = 0;
                        while (i36 < i35) {
                            if ((j7 & 255) < 128) {
                                int i37 = (i34 << 3) + i36;
                                Object obj5 = suVar2.b[i37];
                                Object obj6 = suVar2.c[i37];
                                if (obj6 instanceof sy) {
                                    obj6.getClass();
                                    sy syVar7 = (sy) obj6;
                                    Object[] objArr7 = syVar7.b;
                                    long[] jArr13 = syVar7.a;
                                    int length7 = jArr13.length - 2;
                                    if (length7 >= 0) {
                                        i2 = length6;
                                        i3 = i34;
                                        int i38 = 0;
                                        while (true) {
                                            long j8 = jArr13[i38];
                                            long[] jArr14 = jArr13;
                                            i4 = i35;
                                            if ((((~j8) << 7) & j8 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                int i39 = 8 - ((~(i38 - length7)) >>> 31);
                                                int i40 = 0;
                                                while (i40 < i39) {
                                                    if ((j8 & 255) < 128) {
                                                        int i41 = (i38 << 3) + i40;
                                                        jArr3 = jArr12;
                                                        if (syVar5.a((aeu) objArr7[i41])) {
                                                            syVar7.h(i41);
                                                        }
                                                    } else {
                                                        jArr3 = jArr12;
                                                    }
                                                    j8 >>= 8;
                                                    i40++;
                                                    jArr12 = jArr3;
                                                }
                                                jArr2 = jArr12;
                                                if (i39 != 8) {
                                                    break;
                                                }
                                            } else {
                                                jArr2 = jArr12;
                                            }
                                            if (i38 == length7) {
                                                break;
                                            }
                                            i38++;
                                            i35 = i4;
                                            jArr13 = jArr14;
                                            jArr12 = jArr2;
                                        }
                                    } else {
                                        jArr2 = jArr12;
                                        i2 = length6;
                                        i3 = i34;
                                        i4 = i35;
                                    }
                                    a = syVar7.b();
                                } else {
                                    jArr2 = jArr12;
                                    i2 = length6;
                                    i3 = i34;
                                    i4 = i35;
                                    obj6.getClass();
                                    a = syVar5.a((aeu) obj6);
                                }
                                if (a) {
                                    suVar2.g(i37);
                                }
                            } else {
                                jArr2 = jArr12;
                                i2 = length6;
                                i3 = i34;
                                i4 = i35;
                            }
                            j7 >>= 8;
                            i36++;
                            length6 = i2;
                            i34 = i3;
                            i35 = i4;
                            jArr12 = jArr2;
                        }
                        jArr = jArr12;
                        int i42 = length6;
                        int i43 = i34;
                        if (i35 != 8) {
                            break;
                        }
                        length6 = i42;
                        i = i43;
                    } else {
                        jArr = jArr12;
                        i = i34;
                    }
                    if (i == length6) {
                        break;
                    }
                    i34 = i + 1;
                    jArr12 = jArr;
                }
            }
            z();
            syVar5.d();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:128:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x01ac  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void y(defpackage.agz r32) {
        /*
            Method dump skipped, instructions count: 466
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.abw.y(agz):void");
    }

    private final void z() {
        long[] jArr;
        int i;
        long[] jArr2;
        int i2;
        int i3;
        int i4;
        Object[] objArr;
        int i5;
        Object[] objArr2;
        su suVar = this.l;
        long[] jArr3 = suVar.a;
        int length = jArr3.length - 2;
        long j = 255;
        char c = 7;
        long j2 = -9187201950435737472L;
        if (length >= 0) {
            int i6 = 0;
            while (true) {
                long j3 = jArr3[i6];
                if ((((~j3) << c) & j3 & j2) != j2) {
                    int i7 = 8 - ((~(i6 - length)) >>> 31);
                    int i8 = 0;
                    while (i8 < i7) {
                        if ((j3 & j) < 128) {
                            int i9 = (i6 << 3) + i8;
                            Object obj = suVar.b[i9];
                            Object obj2 = suVar.c[i9];
                            if (obj2 instanceof sy) {
                                obj2.getClass();
                                sy syVar = (sy) obj2;
                                Object[] objArr3 = syVar.b;
                                long[] jArr4 = syVar.a;
                                int length2 = jArr4.length - 2;
                                jArr2 = jArr3;
                                i2 = length;
                                if (length2 >= 0) {
                                    int i10 = 0;
                                    while (true) {
                                        long j4 = jArr4[i10];
                                        long[] jArr5 = jArr4;
                                        i4 = i6;
                                        if ((((~j4) << c) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                                            int i11 = 8 - ((~(i10 - length2)) >>> 31);
                                            int i12 = 0;
                                            while (i12 < i11) {
                                                if ((j4 & 255) < 128) {
                                                    int i13 = (i10 << 3) + i12;
                                                    objArr2 = objArr3;
                                                    i5 = i7;
                                                    if (!this.k.b((acm) objArr3[i13])) {
                                                        syVar.h(i13);
                                                    }
                                                } else {
                                                    i5 = i7;
                                                    objArr2 = objArr3;
                                                }
                                                j4 >>= 8;
                                                i12++;
                                                i7 = i5;
                                                objArr3 = objArr2;
                                            }
                                            i3 = i7;
                                            objArr = objArr3;
                                            if (i11 != 8) {
                                                break;
                                            }
                                        } else {
                                            i3 = i7;
                                            objArr = objArr3;
                                        }
                                        if (i10 == length2) {
                                            break;
                                        }
                                        i10++;
                                        i6 = i4;
                                        jArr4 = jArr5;
                                        i7 = i3;
                                        objArr3 = objArr;
                                        c = 7;
                                    }
                                } else {
                                    i3 = i7;
                                    i4 = i6;
                                }
                                if (!syVar.b()) {
                                }
                                suVar.g(i9);
                            } else {
                                jArr2 = jArr3;
                                i2 = length;
                                i3 = i7;
                                i4 = i6;
                                obj2.getClass();
                                if (this.k.b((acm) obj2)) {
                                }
                                suVar.g(i9);
                            }
                        } else {
                            jArr2 = jArr3;
                            i2 = length;
                            i3 = i7;
                            i4 = i6;
                        }
                        j3 >>= 8;
                        i8++;
                        jArr3 = jArr2;
                        length = i2;
                        i6 = i4;
                        i7 = i3;
                        j = 255;
                        c = 7;
                    }
                    jArr = jArr3;
                    int i14 = length;
                    int i15 = i6;
                    if (i7 != 8) {
                        break;
                    }
                    length = i14;
                    i = i15;
                } else {
                    jArr = jArr3;
                    i = i6;
                }
                if (i == length) {
                    break;
                }
                i6 = i + 1;
                jArr3 = jArr;
                j = 255;
                c = 7;
                j2 = -9187201950435737472L;
            }
        }
        sy syVar2 = this.s;
        if (syVar2.c()) {
            Object[] objArr4 = syVar2.b;
            long[] jArr6 = syVar2.a;
            int length3 = jArr6.length - 2;
            if (length3 >= 0) {
                int i16 = 0;
                while (true) {
                    long j5 = jArr6[i16];
                    if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i17 = 8 - ((~(i16 - length3)) >>> 31);
                        for (int i18 = 0; i18 < i17; i18++) {
                            if ((j5 & 255) < 128) {
                                int i19 = (i16 << 3) + i18;
                                if (!((aeu) objArr4[i19]).l()) {
                                    syVar2.h(i19);
                                }
                            }
                            j5 >>= 8;
                        }
                        if (i17 != 8) {
                            return;
                        }
                    }
                    if (i16 != length3) {
                        i16++;
                    } else {
                        return;
                    }
                }
            }
        }
    }

    @Override // defpackage.aew
    public final ada a(aeu aeuVar, Object obj) {
        abw abwVar;
        if ((aeuVar.a & 2) != 0) {
            aeuVar.d(true);
        }
        aav aavVar = aeuVar.c;
        if (aavVar != null && aavVar.a()) {
            if (!this.d.f(aavVar)) {
                synchronized (this.b) {
                    abwVar = this.g;
                }
                if (abwVar != null && abwVar.C(aeuVar, obj)) {
                    return ada.IMMINENT;
                }
                return ada.IGNORED;
            }
            if (aeuVar.d != null) {
                return v(aeuVar, aavVar, obj);
            }
            return ada.IGNORED;
        }
        return ada.IGNORED;
    }

    @Override // defpackage.abs
    public final void b() {
        boolean z;
        synchronized (this.b) {
            if (this.i.p) {
                ael.b("Composition is disposed while composing. If dispose is triggered by a call in @Composable function, consider wrapping it with SideEffect block.");
            }
            if (!this.j) {
                this.j = true;
                this.q = abc.b;
                agz agzVar = this.i.v;
                if (agzVar != null) {
                    y(agzVar);
                }
                if (this.d.b > 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (z || !this.c.isEmpty()) {
                    abv abvVar = new abv(this.c);
                    if (z) {
                        agb c = this.d.c();
                        try {
                            abr.k(c, abvVar);
                            c.A(true);
                            this.a.b();
                            this.a.e();
                            abvVar.b();
                        } catch (Throwable th) {
                            c.A(false);
                            throw th;
                        }
                    }
                    abvVar.a();
                }
                abp abpVar = this.i;
                Trace.beginSection("Compose:Composer.dispose");
                try {
                    abpVar.b.o(abpVar);
                    abpVar.T();
                    abpVar.a.b();
                    Trace.endSection();
                } catch (Throwable th2) {
                    Trace.endSection();
                    throw th2;
                }
            }
        }
        this.n.p(this);
    }

    @Override // defpackage.abs
    public final boolean c() {
        return this.j;
    }

    @Override // defpackage.ach
    public final void d() {
        this.o.set(null);
        this.e.a();
        this.f.a();
        Set set = this.c;
        if (!set.isEmpty()) {
            new abv(set).a();
        }
    }

    @Override // defpackage.ach
    public final void e() {
        synchronized (this.b) {
            try {
                y(this.e);
                A();
            } catch (Throwable th) {
                try {
                    Set set = this.c;
                    if (!set.isEmpty()) {
                        new abv(set).a();
                    }
                    throw th;
                } catch (Exception e) {
                    d();
                    throw e;
                }
            }
        }
    }

    @Override // defpackage.ach
    public final void f() {
        synchronized (this.b) {
            try {
                agz agzVar = this.f;
                if (agzVar.e()) {
                    y(agzVar);
                }
            } catch (Throwable th) {
                try {
                    Set set = this.c;
                    if (!set.isEmpty()) {
                        new abv(set).a();
                    }
                    throw th;
                } catch (Exception e) {
                    d();
                    throw e;
                }
            }
        }
    }

    @Override // defpackage.ach
    public final void g() {
        synchronized (this.b) {
            try {
                this.i.z = null;
                Set set = this.c;
                if (!set.isEmpty()) {
                    new abv(set).a();
                }
            } catch (Throwable th) {
                try {
                    Set set2 = this.c;
                    if (!set2.isEmpty()) {
                        new abv(set2).a();
                    }
                    throw th;
                } catch (Exception e) {
                    d();
                    throw e;
                }
            }
        }
    }

    public final void h(mol molVar) {
        if (this.j) {
            ael.b("The composition is disposed");
        }
        this.q = molVar;
        this.n.e(this, molVar);
    }

    public final void i() {
        Object andSet = this.o.getAndSet(abx.a);
        if (andSet != null) {
            if (!amr.i(andSet, abx.a)) {
                if (andSet instanceof Set) {
                    x((Set) andSet, true);
                    return;
                }
                if (andSet instanceof Object[]) {
                    for (Set set : (Set[]) andSet) {
                        x(set, true);
                    }
                    return;
                }
                AtomicReference atomicReference = this.o;
                Objects.toString(atomicReference);
                abr.g("corrupt pendingModifications drain: ".concat(atomicReference.toString()));
                throw new mks();
            }
            abr.g("pending composition has not been applied");
            throw new mks();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:176:0x01c9, code lost:            if (r10.h == defpackage.aip.h(r11.c)) goto L110;     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x017f, code lost:            if (r13 == null) goto L72;     */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0253 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // defpackage.ach
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void j(java.util.List r26) {
        /*
            Method dump skipped, instructions count: 1007
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.abw.j(java.util.List):void");
    }

    @Override // defpackage.ach
    public final void k() {
        aeu aeuVar;
        synchronized (this.b) {
            for (Object obj : this.d.c) {
                if (obj instanceof aeu) {
                    aeuVar = (aeu) obj;
                } else {
                    aeuVar = null;
                }
                if (aeuVar != null) {
                    aeuVar.a();
                }
            }
        }
    }

    @Override // defpackage.ach
    public final void l(mnw mnwVar) {
        abp abpVar = this.i;
        if (abpVar.p) {
            abr.i("Preparing a composition while composing is not supported");
        }
        abpVar.p = true;
        try {
            mnwVar.a();
        } finally {
            abpVar.p = false;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.lang.Object[], java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v13, types: [java.util.Set[]] */
    @Override // defpackage.ach
    public final void m(Set set) {
        Object obj;
        Set set2;
        do {
            obj = this.o.get();
            if (obj == null || amr.i(obj, abx.a)) {
                set2 = set;
            } else if (obj instanceof Set) {
                set2 = new Set[]{obj, set};
            } else if (obj instanceof Object[]) {
                Set[] setArr = (Set[]) obj;
                int length = setArr.length;
                ?? copyOf = Arrays.copyOf(setArr, length + 1);
                copyOf[length] = set;
                copyOf.getClass();
                set2 = copyOf;
            } else {
                AtomicReference atomicReference = this.o;
                Objects.toString(atomicReference);
                throw new IllegalStateException("corrupt pendingModifications: ".concat(atomicReference.toString()));
            }
        } while (!a.o(this.o, obj, set2));
        if (obj == null) {
            synchronized (this.b) {
                A();
            }
        }
    }

    @Override // defpackage.ach, defpackage.aew
    public final void n(Object obj) {
        aeu N;
        int i;
        abp abpVar = this.i;
        if (abpVar.n <= 0 && (N = abpVar.N()) != null) {
            N.m();
            if ((N.a & 32) == 0) {
                sr srVar = N.f;
                if (srVar == null) {
                    srVar = new sr((byte[]) null);
                    N.f = srVar;
                }
                if (srVar.d(obj, N.e) == N.e) {
                    return;
                }
            }
            if (obj instanceof aod) {
                ((aod) obj).k(1);
            }
            aiy.a(this.k, obj, N);
            if (obj instanceof acm) {
                acm acmVar = (acm) obj;
                acl c = acmVar.c();
                aiy.b(this.l, obj);
                aci aciVar = (aci) c;
                sr srVar2 = aciVar.c;
                Object[] objArr = srVar2.b;
                long[] jArr = srVar2.a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i2 = 0;
                    while (true) {
                        long j = jArr[i2];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i3 = i2 - length;
                            int i4 = 0;
                            while (true) {
                                char c2 = '\b';
                                i = 8 - ((~i3) >>> 31);
                                if (i4 >= i) {
                                    break;
                                }
                                if ((j & 255) < 128) {
                                    aoc aocVar = (aoc) objArr[(i2 << 3) + i4];
                                    if (aocVar instanceof aod) {
                                        ((aod) aocVar).k(1);
                                    }
                                    aiy.a(this.l, aocVar, obj);
                                    c2 = '\b';
                                }
                                j >>= c2;
                                i4++;
                            }
                            if (i != 8) {
                                break;
                            }
                        }
                        if (i2 == length) {
                            break;
                        } else {
                            i2++;
                        }
                    }
                }
                Object obj2 = aciVar.d;
                su suVar = N.g;
                if (suVar == null) {
                    suVar = new su((byte[]) null);
                    N.g = suVar;
                }
                suVar.e(acmVar, obj2);
            }
        }
    }

    @Override // defpackage.ach
    public final void o(Object obj) {
        int i;
        synchronized (this.b) {
            B(obj);
            Object a = this.l.a(obj);
            if (a != null) {
                if (a instanceof sy) {
                    sy syVar = (sy) a;
                    Object[] objArr = syVar.b;
                    long[] jArr = syVar.a;
                    int length = jArr.length - 2;
                    if (length >= 0) {
                        int i2 = 0;
                        while (true) {
                            long j = jArr[i2];
                            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i3 = i2 - length;
                                int i4 = 0;
                                while (true) {
                                    i = 8 - ((~i3) >>> 31);
                                    if (i4 >= i) {
                                        break;
                                    }
                                    if ((255 & j) < 128) {
                                        B((acm) objArr[(i2 << 3) + i4]);
                                    }
                                    j >>= 8;
                                    i4++;
                                }
                                if (i != 8) {
                                    break;
                                }
                            }
                            if (i2 == length) {
                                break;
                            } else {
                                i2++;
                            }
                        }
                    }
                } else {
                    B((acm) a);
                }
            }
        }
    }

    @Override // defpackage.ach
    public final boolean p() {
        return this.i.p;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0053, code lost:            return true;     */
    @Override // defpackage.ach
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean q(java.util.Set r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            boolean r2 = r1 instanceof defpackage.aix
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L5f
            aix r1 = (defpackage.aix) r1
            sy r1 = r1.a
            java.lang.Object[] r2 = r1.b
            long[] r1 = r1.a
            int r5 = r1.length
            int r5 = r5 + (-2)
            if (r5 < 0) goto L7e
            r6 = 0
        L18:
            r7 = r1[r6]
            long r9 = ~r7
            r11 = 7
            long r9 = r9 << r11
            long r9 = r9 & r7
            r11 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r9 = r9 & r11
            int r13 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r13 == 0) goto L5a
            int r9 = r6 - r5
            r10 = 0
        L2b:
            int r11 = ~r9
            int r11 = r11 >>> 31
            r12 = 8
            int r11 = 8 - r11
            if (r10 >= r11) goto L58
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r7
            r15 = 128(0x80, double:6.3E-322)
            int r11 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r11 >= 0) goto L54
            int r11 = r6 << 3
            int r11 = r11 + r10
            r11 = r2[r11]
            su r13 = r0.k
            boolean r13 = r13.b(r11)
            if (r13 != 0) goto L53
            su r13 = r0.l
            boolean r11 = r13.b(r11)
            if (r11 != 0) goto L53
            goto L54
        L53:
            return r4
        L54:
            long r7 = r7 >> r12
            int r10 = r10 + 1
            goto L2b
        L58:
            if (r11 != r12) goto L7e
        L5a:
            if (r6 == r5) goto L7e
            int r6 = r6 + 1
            goto L18
        L5f:
            java.util.Iterator r1 = r18.iterator()
        L63:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L7e
            java.lang.Object r2 = r1.next()
            su r5 = r0.k
            boolean r5 = r5.b(r2)
            if (r5 != 0) goto L7d
            su r5 = r0.l
            boolean r2 = r5.b(r2)
            if (r2 == 0) goto L63
        L7d:
            return r4
        L7e:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.abw.q(java.util.Set):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0037 A[Catch: Exception -> 0x003c, all -> 0x0040, TRY_LEAVE, TryCatch #1 {Exception -> 0x003c, blocks: (B:8:0x000a, B:10:0x0017, B:11:0x001c, B:13:0x0020, B:18:0x0037, B:23:0x002b), top: B:7:0x000a, outer: #0 }] */
    @Override // defpackage.ach
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean r() {
        /*
            r4 = this;
            java.lang.Object r0 = r4.b
            monitor-enter(r0)
            r4.i()     // Catch: java.lang.Throwable -> L57
            su r1 = r4.s()     // Catch: java.lang.Throwable -> L40
            u()     // Catch: java.lang.Exception -> L3c java.lang.Throwable -> L40
            abp r2 = r4.i     // Catch: java.lang.Exception -> L3c java.lang.Throwable -> L40
            agz r3 = r2.d     // Catch: java.lang.Exception -> L3c java.lang.Throwable -> L40
            boolean r3 = r3.d()     // Catch: java.lang.Exception -> L3c java.lang.Throwable -> L40
            if (r3 != 0) goto L1c
            java.lang.String r3 = "Expected applyChanges() to have been called"
            defpackage.abr.i(r3)     // Catch: java.lang.Exception -> L3c java.lang.Throwable -> L40
        L1c:
            int r3 = r1.e     // Catch: java.lang.Exception -> L3c java.lang.Throwable -> L40
            if (r3 > 0) goto L2b
            java.util.List r3 = r2.i     // Catch: java.lang.Exception -> L3c java.lang.Throwable -> L40
            boolean r3 = r3.isEmpty()     // Catch: java.lang.Exception -> L3c java.lang.Throwable -> L40
            if (r3 != 0) goto L29
            goto L2b
        L29:
            r2 = 0
            goto L35
        L2b:
            r3 = 0
            r2.ad(r1, r3)     // Catch: java.lang.Exception -> L3c java.lang.Throwable -> L40
            agz r2 = r2.d     // Catch: java.lang.Exception -> L3c java.lang.Throwable -> L40
            boolean r2 = r2.e()     // Catch: java.lang.Exception -> L3c java.lang.Throwable -> L40
        L35:
            if (r2 != 0) goto L3a
            r4.A()     // Catch: java.lang.Exception -> L3c java.lang.Throwable -> L40
        L3a:
            monitor-exit(r0)
            return r2
        L3c:
            r2 = move-exception
            r4.m = r1     // Catch: java.lang.Throwable -> L40
            throw r2     // Catch: java.lang.Throwable -> L40
        L40:
            r1 = move-exception
            java.util.Set r2 = r4.c     // Catch: java.lang.Exception -> L52 java.lang.Throwable -> L57
            boolean r3 = r2.isEmpty()     // Catch: java.lang.Exception -> L52 java.lang.Throwable -> L57
            if (r3 != 0) goto L51
            abv r3 = new abv     // Catch: java.lang.Exception -> L52 java.lang.Throwable -> L57
            r3.<init>(r2)     // Catch: java.lang.Exception -> L52 java.lang.Throwable -> L57
            r3.a()     // Catch: java.lang.Exception -> L52 java.lang.Throwable -> L57
        L51:
            throw r1     // Catch: java.lang.Exception -> L52 java.lang.Throwable -> L57
        L52:
            r1 = move-exception
            r4.d()     // Catch: java.lang.Throwable -> L57
            throw r1     // Catch: java.lang.Throwable -> L57
        L57:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.abw.r():boolean");
    }

    public final su s() {
        su suVar = this.m;
        this.m = new su((byte[]) null);
        return suVar;
    }

    @Override // defpackage.aew
    public final void t() {
        this.p = true;
    }
}
