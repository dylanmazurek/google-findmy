package defpackage;

import android.app.Notification;
import android.graphics.Path;
import android.os.Build;
import android.support.design.widget.R;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.workers.ConstraintTrackingWorker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bpn {
    static Notification.Builder a(Notification.Builder builder, String str) {
        return builder.addPerson(str);
    }

    public static Notification.Builder b(Notification.Builder builder, String str) {
        return builder.setCategory(str);
    }

    public static Path c(String str) {
        Path path = new Path();
        try {
            d(f(str), path);
            return path;
        } catch (RuntimeException e) {
            throw new RuntimeException("Error in parsing ".concat(String.valueOf(str)), e);
        }
    }

    public static void d(brr[] brrVarArr, Path path) {
        int i;
        int i2;
        float[] fArr;
        char c;
        int i3;
        int i4;
        brr brrVar;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        brr[] brrVarArr2 = brrVarArr;
        float[] fArr2 = new float[6];
        int length = brrVarArr2.length;
        char c2 = 0;
        char c3 = 'm';
        int i5 = 0;
        while (i5 < length) {
            brr brrVar2 = brrVarArr2[i5];
            char c4 = brrVar2.a;
            float[] fArr3 = brrVar2.b;
            float f9 = fArr2[c2];
            float f10 = fArr2[1];
            float f11 = fArr2[2];
            float f12 = fArr2[3];
            float f13 = fArr2[4];
            float f14 = fArr2[5];
            switch (c4) {
                case R.styleable.TextInputLayout_startIconContentDescription /* 65 */:
                case 'a':
                    i = 7;
                    break;
                case R.styleable.TextInputLayout_startIconMinSize /* 67 */:
                case 'c':
                    i = 6;
                    break;
                case R.styleable.TextInputLayout_suffixTextAppearance /* 72 */:
                case 'V':
                case 'h':
                case 'v':
                    i = 1;
                    break;
                case 'Q':
                case 'S':
                case 'q':
                case 's':
                    i = 4;
                    break;
                case 'Z':
                case 'z':
                    path.close();
                    path.moveTo(f13, f14);
                    f9 = f13;
                    f11 = f9;
                    f10 = f14;
                    f12 = f10;
                    break;
            }
            i = 2;
            float f15 = f13;
            float f16 = f14;
            float f17 = f9;
            float f18 = f10;
            int i6 = 0;
            while (i6 < fArr3.length) {
                if (c4 != 'A') {
                    if (c4 != 'C') {
                        if (c4 != 'H') {
                            if (c4 != 'Q') {
                                if (c4 != 'V') {
                                    if (c4 != 'a') {
                                        if (c4 != 'c') {
                                            if (c4 != 'h') {
                                                if (c4 != 'q') {
                                                    if (c4 != 'v') {
                                                        if (c4 != 'L') {
                                                            if (c4 != 'M') {
                                                                if (c4 != 'S') {
                                                                    if (c4 != 'T') {
                                                                        if (c4 != 'l') {
                                                                            if (c4 != 'm') {
                                                                                if (c4 != 's') {
                                                                                    if (c4 == 't') {
                                                                                        int i7 = i6 + 1;
                                                                                        if (c3 != 'q' && c3 != 't' && c3 != 'Q' && c3 != 'T') {
                                                                                            f7 = 0.0f;
                                                                                            f8 = 0.0f;
                                                                                        } else {
                                                                                            f7 = f18 - f12;
                                                                                            f8 = f17 - f11;
                                                                                        }
                                                                                        path.rQuadTo(f8, f7, fArr3[i6], fArr3[i7]);
                                                                                        float f19 = f8 + f17;
                                                                                        float f20 = f7 + f18;
                                                                                        f17 += fArr3[i6];
                                                                                        f18 += fArr3[i7];
                                                                                        f12 = f20;
                                                                                        f11 = f19;
                                                                                    }
                                                                                    i2 = i6;
                                                                                    fArr = fArr3;
                                                                                    c = c4;
                                                                                    i3 = i5;
                                                                                    i4 = length;
                                                                                } else {
                                                                                    int i8 = i6 + 3;
                                                                                    int i9 = i6 + 2;
                                                                                    int i10 = i6 + 1;
                                                                                    if (c3 != 'c' && c3 != 's' && c3 != 'C' && c3 != 'S') {
                                                                                        f5 = 0.0f;
                                                                                        f6 = 0.0f;
                                                                                    } else {
                                                                                        f5 = f17 - f11;
                                                                                        f6 = f18 - f12;
                                                                                    }
                                                                                    i2 = i6;
                                                                                    fArr = fArr3;
                                                                                    c = c4;
                                                                                    path.rCubicTo(f5, f6, fArr3[i6], fArr3[i10], fArr3[i9], fArr3[i8]);
                                                                                    f = fArr[i2] + f17;
                                                                                    f2 = fArr[i10] + f18;
                                                                                    f17 += fArr[i9];
                                                                                    f3 = fArr[i8];
                                                                                }
                                                                            } else {
                                                                                i2 = i6;
                                                                                fArr = fArr3;
                                                                                c = c4;
                                                                                float f21 = fArr[i2];
                                                                                f17 += f21;
                                                                                float f22 = fArr[i2 + 1];
                                                                                f18 += f22;
                                                                                if (i2 > 0) {
                                                                                    path.rLineTo(f21, f22);
                                                                                } else {
                                                                                    path.rMoveTo(f21, f22);
                                                                                    i3 = i5;
                                                                                    f15 = f17;
                                                                                    i4 = length;
                                                                                    f16 = f18;
                                                                                }
                                                                            }
                                                                        } else {
                                                                            i2 = i6;
                                                                            fArr = fArr3;
                                                                            c = c4;
                                                                            int i11 = i2 + 1;
                                                                            path.rLineTo(fArr[i2], fArr[i11]);
                                                                            f17 += fArr[i2];
                                                                            f4 = fArr[i11];
                                                                        }
                                                                    } else {
                                                                        i2 = i6;
                                                                        fArr = fArr3;
                                                                        c = c4;
                                                                        int i12 = i2 + 1;
                                                                        if (c3 == 'q' || c3 == 't' || c3 == 'Q' || c3 == 'T') {
                                                                            f18 = (f18 + f18) - f12;
                                                                            f17 = (f17 + f17) - f11;
                                                                        }
                                                                        path.quadTo(f17, f18, fArr[i2], fArr[i12]);
                                                                        i3 = i5;
                                                                        f11 = f17;
                                                                        i4 = length;
                                                                        f12 = f18;
                                                                        f17 = fArr[i2];
                                                                        f18 = fArr[i12];
                                                                    }
                                                                } else {
                                                                    i2 = i6;
                                                                    fArr = fArr3;
                                                                    c = c4;
                                                                    int i13 = i2 + 3;
                                                                    int i14 = i2 + 2;
                                                                    int i15 = i2 + 1;
                                                                    if (c3 == 'c' || c3 == 's' || c3 == 'C' || c3 == 'S') {
                                                                        f18 = (f18 + f18) - f12;
                                                                        f17 = (f17 + f17) - f11;
                                                                    }
                                                                    path.cubicTo(f17, f18, fArr[i2], fArr[i15], fArr[i14], fArr[i13]);
                                                                    f = fArr[i2];
                                                                    f2 = fArr[i15];
                                                                    f17 = fArr[i14];
                                                                    f18 = fArr[i13];
                                                                    f11 = f;
                                                                    f12 = f2;
                                                                }
                                                            } else {
                                                                i2 = i6;
                                                                fArr = fArr3;
                                                                c = c4;
                                                                f17 = fArr[i2];
                                                                f18 = fArr[i2 + 1];
                                                                if (i2 > 0) {
                                                                    path.lineTo(f17, f18);
                                                                } else {
                                                                    path.moveTo(f17, f18);
                                                                    i3 = i5;
                                                                    f15 = f17;
                                                                    i4 = length;
                                                                    f16 = f18;
                                                                }
                                                            }
                                                            brrVar = brrVar2;
                                                        } else {
                                                            i2 = i6;
                                                            fArr = fArr3;
                                                            c = c4;
                                                            int i16 = i2 + 1;
                                                            path.lineTo(fArr[i2], fArr[i16]);
                                                            f17 = fArr[i2];
                                                            f18 = fArr[i16];
                                                        }
                                                    } else {
                                                        i2 = i6;
                                                        fArr = fArr3;
                                                        c = c4;
                                                        path.rLineTo(0.0f, fArr[i2]);
                                                        f4 = fArr[i2];
                                                    }
                                                    f18 += f4;
                                                } else {
                                                    i2 = i6;
                                                    fArr = fArr3;
                                                    c = c4;
                                                    int i17 = i2 + 3;
                                                    int i18 = i2 + 2;
                                                    int i19 = i2 + 1;
                                                    path.rQuadTo(fArr[i2], fArr[i19], fArr[i18], fArr[i17]);
                                                    float f23 = fArr[i2] + f17;
                                                    float f24 = fArr[i19] + f18;
                                                    f17 += fArr[i18];
                                                    f18 += fArr[i17];
                                                    f12 = f24;
                                                    f11 = f23;
                                                }
                                            } else {
                                                i2 = i6;
                                                fArr = fArr3;
                                                c = c4;
                                                path.rLineTo(fArr[i2], 0.0f);
                                                f17 += fArr[i2];
                                            }
                                            i3 = i5;
                                            i4 = length;
                                            brrVar = brrVar2;
                                        } else {
                                            i2 = i6;
                                            fArr = fArr3;
                                            c = c4;
                                            int i20 = i2 + 5;
                                            int i21 = i2 + 4;
                                            int i22 = i2 + 3;
                                            int i23 = i2 + 2;
                                            path.rCubicTo(fArr[i2], fArr[i2 + 1], fArr[i23], fArr[i22], fArr[i21], fArr[i20]);
                                            f = fArr[i23] + f17;
                                            f2 = fArr[i22] + f18;
                                            f17 += fArr[i21];
                                            f3 = fArr[i20];
                                        }
                                        f18 += f3;
                                        f11 = f;
                                        f12 = f2;
                                        i3 = i5;
                                        i4 = length;
                                        brrVar = brrVar2;
                                    } else {
                                        i2 = i6;
                                        fArr = fArr3;
                                        c = c4;
                                        int i24 = i2 + 6;
                                        int i25 = i2 + 5;
                                        int i26 = i2 + 4;
                                        float f25 = fArr[i25] + f17;
                                        float f26 = fArr[i24] + f18;
                                        float f27 = fArr[i2];
                                        float f28 = fArr[i2 + 1];
                                        float f29 = fArr[i2 + 2];
                                        if (fArr[i2 + 3] != 0.0f) {
                                            z3 = true;
                                        } else {
                                            z3 = false;
                                        }
                                        if (fArr[i26] != 0.0f) {
                                            z4 = true;
                                        } else {
                                            z4 = false;
                                        }
                                        i3 = i5;
                                        i4 = length;
                                        brrVar = brrVar2;
                                        brr.a(path, f17, f18, f25, f26, f27, f28, f29, z3, z4);
                                        f17 += fArr[i25];
                                        f18 += fArr[i24];
                                    }
                                } else {
                                    i2 = i6;
                                    fArr = fArr3;
                                    c = c4;
                                    i3 = i5;
                                    i4 = length;
                                    brrVar = brrVar2;
                                    path.lineTo(f17, fArr[i2]);
                                    f18 = fArr[i2];
                                }
                            } else {
                                i2 = i6;
                                fArr = fArr3;
                                c = c4;
                                i3 = i5;
                                i4 = length;
                                brrVar = brrVar2;
                                int i27 = i2 + 3;
                                int i28 = i2 + 2;
                                int i29 = i2 + 1;
                                path.quadTo(fArr[i2], fArr[i29], fArr[i28], fArr[i27]);
                                float f30 = fArr[i2];
                                float f31 = fArr[i29];
                                f17 = fArr[i28];
                                f18 = fArr[i27];
                                f12 = f31;
                                f11 = f30;
                            }
                        } else {
                            i2 = i6;
                            fArr = fArr3;
                            c = c4;
                            i3 = i5;
                            i4 = length;
                            brrVar = brrVar2;
                            path.lineTo(fArr[i2], f18);
                            f17 = fArr[i2];
                        }
                    } else {
                        i2 = i6;
                        fArr = fArr3;
                        c = c4;
                        i3 = i5;
                        i4 = length;
                        brrVar = brrVar2;
                        int i30 = i2 + 5;
                        int i31 = i2 + 4;
                        int i32 = i2 + 3;
                        int i33 = i2 + 2;
                        path.cubicTo(fArr[i2], fArr[i2 + 1], fArr[i33], fArr[i32], fArr[i31], fArr[i30]);
                        f17 = fArr[i31];
                        f18 = fArr[i30];
                        f11 = fArr[i33];
                        f12 = fArr[i32];
                    }
                    i6 = i2 + i;
                    brrVar2 = brrVar;
                    i5 = i3;
                    length = i4;
                    fArr3 = fArr;
                    c3 = c;
                    c4 = c3;
                } else {
                    i2 = i6;
                    fArr = fArr3;
                    c = c4;
                    i3 = i5;
                    i4 = length;
                    brrVar = brrVar2;
                    int i34 = i2 + 6;
                    int i35 = i2 + 5;
                    int i36 = i2 + 4;
                    float f32 = fArr[i35];
                    float f33 = fArr[i34];
                    float f34 = fArr[i2];
                    float f35 = fArr[i2 + 1];
                    float f36 = fArr[i2 + 2];
                    if (fArr[i2 + 3] != 0.0f) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (fArr[i36] != 0.0f) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    brr.a(path, f17, f18, f32, f33, f34, f35, f36, z, z2);
                    f17 = fArr[i35];
                    f18 = fArr[i34];
                }
                f11 = f17;
                f12 = f18;
                i6 = i2 + i;
                brrVar2 = brrVar;
                i5 = i3;
                length = i4;
                fArr3 = fArr;
                c3 = c;
                c4 = c3;
            }
            fArr2[0] = f17;
            fArr2[1] = f18;
            fArr2[2] = f11;
            fArr2[3] = f12;
            fArr2[4] = f15;
            fArr2[5] = f16;
            c3 = brrVar2.a;
            i5++;
            brrVarArr2 = brrVarArr;
            length = length;
            c2 = 0;
        }
    }

    public static boolean e(brr[] brrVarArr, brr[] brrVarArr2) {
        if (brrVarArr != null && brrVarArr2 != null) {
            if (brrVarArr.length == brrVarArr2.length) {
                for (int i = 0; i < brrVarArr.length; i++) {
                    brr brrVar = brrVarArr[i];
                    char c = brrVar.a;
                    brr brrVar2 = brrVarArr2[i];
                    if (c != brrVar2.a || brrVar.b.length != brrVar2.b.length) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:31:0x0098. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b3 A[Catch: NumberFormatException -> 0x00d6, LOOP:3: B:25:0x0086->B:34:0x00b3, LOOP_END, TryCatch #0 {NumberFormatException -> 0x00d6, blocks: (B:22:0x0072, B:25:0x0086, B:27:0x008c, B:31:0x0098, B:34:0x00b3, B:38:0x00b9, B:43:0x00ca, B:56:0x00cf), top: B:21:0x0072 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00b2 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b9 A[Catch: NumberFormatException -> 0x00d6, TryCatch #0 {NumberFormatException -> 0x00d6, blocks: (B:22:0x0072, B:25:0x0086, B:27:0x008c, B:31:0x0098, B:34:0x00b3, B:38:0x00b9, B:43:0x00ca, B:56:0x00cf), top: B:21:0x0072 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ca A[Catch: NumberFormatException -> 0x00d6, TryCatch #0 {NumberFormatException -> 0x00d6, blocks: (B:22:0x0072, B:25:0x0086, B:27:0x008c, B:31:0x0098, B:34:0x00b3, B:38:0x00b9, B:43:0x00ca, B:56:0x00cf), top: B:21:0x0072 }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00f0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static defpackage.brr[] f(java.lang.String r17) {
        /*
            Method dump skipped, instructions count: 260
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bpn.f(java.lang.String):brr[]");
    }

    public static brr[] g(brr[] brrVarArr) {
        brr[] brrVarArr2 = new brr[brrVarArr.length];
        for (int i = 0; i < brrVarArr.length; i++) {
            brrVarArr2[i] = new brr(brrVarArr[i]);
        }
        return brrVarArr2;
    }

    public static float[] h(float[] fArr, int i) {
        if (i >= 0) {
            int min = Math.min(i, fArr.length);
            float[] fArr2 = new float[i];
            System.arraycopy(fArr, 0, fArr2, 0, min);
            return fArr2;
        }
        throw new IllegalArgumentException();
    }

    public static final cvu i(cvu cvuVar) {
        cpl cplVar = cvuVar.j;
        String str = cvuVar.c;
        if (!amr.i(str, ConstraintTrackingWorker.class.getName()) && (cplVar.e || cplVar.f)) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            box.j(cvuVar.e, linkedHashMap);
            box.m("androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME", str, linkedHashMap);
            cpn i = box.i(linkedHashMap);
            String name = ConstraintTrackingWorker.class.getName();
            name.getClass();
            return cvu.e(cvuVar, null, 0, name, i, 0, 0L, 0, 0, 0L, 0, 16777195);
        }
        return cvuVar;
    }

    public static final cvu j(List list, cvu cvuVar) {
        cvu cvuVar2;
        list.getClass();
        boolean d = cvuVar.e.d("androidx.work.multiprocess.RemoteListenableDelegatingWorker.ARGUMENT_REMOTE_LISTENABLE_WORKER_NAME", String.class);
        boolean d2 = cvuVar.e.d("androidx.work.impl.workers.RemoteListenableWorker.ARGUMENT_PACKAGE_NAME", String.class);
        boolean d3 = cvuVar.e.d("androidx.work.impl.workers.RemoteListenableWorker.ARGUMENT_CLASS_NAME", String.class);
        if (!d && d2 && d3) {
            String str = cvuVar.c;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            box.j(cvuVar.e, linkedHashMap);
            box.m("androidx.work.multiprocess.RemoteListenableDelegatingWorker.ARGUMENT_REMOTE_LISTENABLE_WORKER_NAME", str, linkedHashMap);
            cvuVar2 = cvu.e(cvuVar, null, 0, "androidx.work.multiprocess.RemoteListenableDelegatingWorker", box.i(linkedHashMap), 0, 0L, 0, 0, 0L, 0, 16777195);
        } else {
            cvuVar2 = cvuVar;
        }
        int i = Build.VERSION.SDK_INT;
        if (i >= 23 && i < 26) {
            return i(cvuVar2);
        }
        if (Build.VERSION.SDK_INT <= 22) {
            try {
                Class<?> cls = Class.forName("androidx.work.impl.background.gcm.GcmScheduler");
                if (!list.isEmpty()) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        if (cls.isAssignableFrom(((crf) it.next()).getClass())) {
                            return i(cvuVar2);
                        }
                    }
                    return cvuVar2;
                }
                return cvuVar2;
            } catch (ClassNotFoundException unused) {
                return cvuVar2;
            }
        }
        return cvuVar2;
    }

    public static final void k(csb csbVar, String str) {
        csl a;
        WorkDatabase workDatabase = csbVar.c;
        workDatabase.getClass();
        cvv B = workDatabase.B();
        cuw w = workDatabase.w();
        List Q = mkm.Q(str);
        while (!Q.isEmpty()) {
            String str2 = (String) mkm.U(Q);
            int j = B.j(str2);
            if (j != 3 && j != 4) {
                cwn cwnVar = (cwn) B;
                cwnVar.a.l();
                cks d = cwnVar.d.d();
                d.g(1, str2);
                try {
                    ((cwn) B).a.m();
                    try {
                        d.a();
                        ((cwn) B).a.p();
                    } finally {
                    }
                } finally {
                    cwnVar.d.f(d);
                }
            }
            Q.addAll(w.a(str2));
        }
        crd crdVar = csbVar.e;
        crdVar.getClass();
        synchronized (crdVar.i) {
            cqc.b();
            crdVar.g.add(str);
            a = crdVar.a(str);
        }
        crd.f(a, 1);
        Iterator it = csbVar.d.iterator();
        while (it.hasNext()) {
            ((crf) it.next()).b(str);
        }
    }

    public static final void l(String str, csb csbVar) {
        str.getClass();
        WorkDatabase workDatabase = csbVar.c;
        workDatabase.getClass();
        workDatabase.o(new ci(workDatabase, str, csbVar, 8, (char[]) null));
    }

    public static final void m(csb csbVar) {
        crh.a(csbVar.h, csbVar.c, csbVar.d);
    }

    private static void n(ArrayList arrayList, char c, float[] fArr) {
        arrayList.add(new brr(c, fArr));
    }
}
