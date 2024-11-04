package defpackage;

import android.view.View;
import android.view.Window;
import android.view.textclassifier.TextClassificationManager;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;

/* compiled from: PG */
/* loaded from: classes.dex */
public class iv {
    public static TextClassifier a(TextView textView) {
        Object systemService;
        TextClassifier textClassifier;
        TextClassifier textClassifier2;
        systemService = textView.getContext().getSystemService((Class<Object>) p$$ExternalSyntheticApiModelOutline0.m217m$1());
        TextClassificationManager m210m = p$$ExternalSyntheticApiModelOutline0.m210m(systemService);
        if (m210m == null) {
            textClassifier = TextClassifier.NO_OP;
            return textClassifier;
        }
        textClassifier2 = m210m.getTextClassifier();
        return textClassifier2;
    }

    public static long d(float f, float f2) {
        long floatToRawIntBits = Float.floatToRawIntBits(f);
        long floatToRawIntBits2 = Float.floatToRawIntBits(f2);
        long j = aqi.a;
        return (floatToRawIntBits2 & 4294967295L) | (floatToRawIntBits << 32);
    }

    public static Boolean e(aqh aqhVar, int i, aql aqlVar, moh mohVar) {
        Object valueOf;
        int ordinal = aqhVar.c().ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal == 3) {
                        if (((apz) aqhVar.a()).a) {
                            valueOf = mohVar.a(aqhVar);
                        } else if (aqlVar == null) {
                            valueOf = Boolean.valueOf(f(aqhVar, i, mohVar));
                        } else {
                            valueOf = Boolean.valueOf(g(aqhVar, aqlVar, i, mohVar));
                        }
                        return (Boolean) valueOf;
                    }
                    throw new mku();
                }
            } else {
                aqh f = in.f(aqhVar);
                if (f != null) {
                    int ordinal2 = f.c().ordinal();
                    if (ordinal2 != 0) {
                        if (ordinal2 != 1) {
                            if (ordinal2 != 2) {
                                if (ordinal2 != 3) {
                                    throw new mku();
                                }
                                throw new IllegalStateException("ActiveParent must have a focusedChild");
                            }
                        } else {
                            Boolean e = e(f, i, aqlVar, mohVar);
                            if (!amr.i(e, false)) {
                                return e;
                            }
                            if (aqlVar == null) {
                                if (f.c() == aqf.ActiveParent) {
                                    aqh e2 = in.e(f);
                                    if (e2 != null) {
                                        aqlVar = in.g(e2);
                                    } else {
                                        throw new IllegalStateException("ActiveParent must have a focusedChild");
                                    }
                                } else {
                                    throw new IllegalStateException("Searching for active node in inactive hierarchy");
                                }
                            }
                            return Boolean.valueOf(m(aqhVar, aqlVar, i, mohVar));
                        }
                    }
                    if (aqlVar == null) {
                        aqlVar = in.g(f);
                    }
                    return Boolean.valueOf(m(aqhVar, aqlVar, i, mohVar));
                }
                throw new IllegalStateException("ActiveParent must have a focusedChild");
            }
        }
        return Boolean.valueOf(f(aqhVar, i, mohVar));
    }

    public static boolean f(aqh aqhVar, int i, moh mohVar) {
        aql aqlVar;
        Object obj;
        aiu aiuVar = new aiu(new aqh[16]);
        j(aqhVar, aiuVar);
        if (aiuVar.b <= 1) {
            if (aiuVar.l()) {
                obj = null;
            } else {
                obj = aiuVar.a[0];
            }
            aqh aqhVar2 = (aqh) obj;
            if (aqhVar2 != null) {
                return ((Boolean) mohVar.a(aqhVar2)).booleanValue();
            }
        } else {
            if (true == a.m(i, 7)) {
                i = 4;
            }
            if (!a.m(i, 4) && !a.m(i, 6)) {
                if (a.m(i, 3) || a.m(i, 5)) {
                    aql g = in.g(aqhVar);
                    float f = g.d;
                    float f2 = g.e;
                    aqlVar = new aql(f, f2, f, f2);
                } else {
                    throw new IllegalStateException("This function should only be used for 2-D focus search");
                }
            } else {
                aql g2 = in.g(aqhVar);
                float f3 = g2.b;
                float f4 = g2.c;
                aqlVar = new aql(f3, f4, f3, f4);
            }
            aqh i2 = i(aiuVar, aqlVar, i);
            if (i2 != null) {
                return ((Boolean) mohVar.a(i2)).booleanValue();
            }
        }
        return false;
    }

    public static boolean g(aqh aqhVar, aql aqlVar, int i, moh mohVar) {
        aqh i2;
        aiu aiuVar = new aiu(new aqh[16]);
        aow aowVar = aqhVar.k;
        if (aowVar.t) {
            aiu aiuVar2 = new aiu(new aow[16]);
            aow aowVar2 = aowVar.o;
            if (aowVar2 == null) {
                qg.h(aiuVar2, aowVar);
            } else {
                aiuVar2.o(aowVar2);
            }
            while (aiuVar2.m()) {
                aow aowVar3 = (aow) aiuVar2.b(aiuVar2.b - 1);
                if ((aowVar3.m & 1024) == 0) {
                    qg.h(aiuVar2, aowVar3);
                } else {
                    while (true) {
                        if (aowVar3 == null) {
                            break;
                        }
                        if ((aowVar3.l & 1024) != 0) {
                            aiu aiuVar3 = null;
                            while (aowVar3 != null) {
                                if (aowVar3 instanceof aqh) {
                                    aqh aqhVar2 = (aqh) aowVar3;
                                    if (aqhVar2.t) {
                                        aiuVar.o(aqhVar2);
                                    }
                                } else if ((aowVar3.l & 1024) != 0 && (aowVar3 instanceof axx)) {
                                    int i3 = 0;
                                    for (aow aowVar4 = ((axx) aowVar3).d; aowVar4 != null; aowVar4 = aowVar4.o) {
                                        if ((aowVar4.l & 1024) != 0) {
                                            i3++;
                                            if (i3 == 1) {
                                                aowVar3 = aowVar4;
                                            } else {
                                                if (aiuVar3 == null) {
                                                    aiuVar3 = new aiu(new aow[16]);
                                                }
                                                if (aowVar3 != null) {
                                                    aiuVar3.o(aowVar3);
                                                }
                                                aiuVar3.o(aowVar4);
                                                aowVar3 = null;
                                            }
                                        }
                                    }
                                    if (i3 != 1) {
                                    }
                                }
                                aowVar3 = qg.d(aiuVar3);
                            }
                        } else {
                            aowVar3 = aowVar3.o;
                        }
                    }
                }
            }
            while (aiuVar.m() && (i2 = i(aiuVar, aqlVar, i)) != null) {
                if (((apz) i2.a()).a) {
                    return ((Boolean) mohVar.a(i2)).booleanValue();
                }
                if (m(i2, aqlVar, i, mohVar)) {
                    return true;
                }
                aiuVar.n(i2);
            }
            return false;
        }
        throw new IllegalStateException("visitChildren called on an unattached node");
    }

    private static long h(int i, aql aqlVar, aql aqlVar2) {
        float f;
        float a;
        float f2;
        float a2;
        long abs = Math.abs(o(aqlVar2, i, aqlVar));
        if (!a.m(i, 3) && !a.m(i, 4)) {
            if (a.m(i, 5) || a.m(i, 6)) {
                f = aqlVar.b;
                a = aqlVar.b() / 2.0f;
                f2 = aqlVar2.b;
                a2 = aqlVar2.b();
            } else {
                throw new IllegalStateException("This function should only be used for 2-D focus search");
            }
        } else {
            f = aqlVar.c;
            a = aqlVar.a() / 2.0f;
            f2 = aqlVar2.c;
            a2 = aqlVar2.a();
        }
        long abs2 = Math.abs((f + a) - (f2 + (a2 / 2.0f)));
        return (13 * abs * abs) + (abs2 * abs2);
    }

    private static aqh i(aiu aiuVar, aql aqlVar, int i) {
        aql d;
        if (a.m(i, 3)) {
            d = aqlVar.d(aqlVar.b() + 1.0f, 0.0f);
        } else if (a.m(i, 4)) {
            d = aqlVar.d(-(aqlVar.b() + 1.0f), 0.0f);
        } else if (a.m(i, 5)) {
            d = aqlVar.d(0.0f, aqlVar.a() + 1.0f);
        } else if (a.m(i, 6)) {
            d = aqlVar.d(0.0f, -(aqlVar.a() + 1.0f));
        } else {
            throw new IllegalStateException("This function should only be used for 2-D focus search");
        }
        int i2 = aiuVar.b;
        aqh aqhVar = null;
        if (i2 > 0) {
            Object[] objArr = aiuVar.a;
            int i3 = 0;
            do {
                aqh aqhVar2 = (aqh) objArr[i3];
                if (in.h(aqhVar2)) {
                    aql g = in.g(aqhVar2);
                    if (n(g, i, aqlVar) && (!n(d, i, aqlVar) || k(aqlVar, g, d, i) || (!k(aqlVar, d, g, i) && h(i, aqlVar, g) < h(i, aqlVar, d)))) {
                        aqhVar = aqhVar2;
                        d = g;
                    }
                }
                i3++;
            } while (i3 < i2);
        }
        return aqhVar;
    }

    private static void j(axw axwVar, aiu aiuVar) {
        aow aowVar = ((aow) axwVar).k;
        if (aowVar.t) {
            aiu aiuVar2 = new aiu(new aow[16]);
            aow aowVar2 = aowVar.o;
            if (aowVar2 == null) {
                qg.h(aiuVar2, aowVar);
            } else {
                aiuVar2.o(aowVar2);
            }
            while (aiuVar2.m()) {
                aow aowVar3 = (aow) aiuVar2.b(aiuVar2.b - 1);
                if ((aowVar3.m & 1024) == 0) {
                    qg.h(aiuVar2, aowVar3);
                } else {
                    while (true) {
                        if (aowVar3 == null) {
                            break;
                        }
                        if ((aowVar3.l & 1024) != 0) {
                            aiu aiuVar3 = null;
                            while (aowVar3 != null) {
                                if (aowVar3 instanceof aqh) {
                                    aqh aqhVar = (aqh) aowVar3;
                                    if (aqhVar.t && !qg.f(aqhVar).r) {
                                        if (((apz) aqhVar.a()).a) {
                                            aiuVar.o(aqhVar);
                                        } else {
                                            j(aqhVar, aiuVar);
                                        }
                                    }
                                } else if ((aowVar3.l & 1024) != 0 && (aowVar3 instanceof axx)) {
                                    int i = 0;
                                    for (aow aowVar4 = ((axx) aowVar3).d; aowVar4 != null; aowVar4 = aowVar4.o) {
                                        if ((aowVar4.l & 1024) != 0) {
                                            i++;
                                            if (i == 1) {
                                                aowVar3 = aowVar4;
                                            } else {
                                                if (aiuVar3 == null) {
                                                    aiuVar3 = new aiu(new aow[16]);
                                                }
                                                if (aowVar3 != null) {
                                                    aiuVar3.o(aowVar3);
                                                }
                                                aiuVar3.o(aowVar4);
                                                aowVar3 = null;
                                            }
                                        }
                                    }
                                    if (i != 1) {
                                    }
                                }
                                aowVar3 = qg.d(aiuVar3);
                            }
                        } else {
                            aowVar3 = aowVar3.o;
                        }
                    }
                }
            }
            return;
        }
        throw new IllegalStateException("visitChildren called on an unattached node");
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0059, code lost:            if (defpackage.a.m(r12, 3) != false) goto L71;     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x005f, code lost:            if (defpackage.a.m(r12, 4) == false) goto L92;     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0062, code lost:            r10 = o(r10, r12, r9);     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x006a, code lost:            if (defpackage.a.m(r12, 3) == false) goto L96;     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x006c, code lost:            r9 = r9.b;        r11 = r11.b;     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0070, code lost:            r9 = r9 - r11;     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x009d, code lost:            if (r10 < java.lang.Math.max(1.0f, r9)) goto L109;     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00a0, code lost:            return true;     */
    /* JADX WARN: Code restructure failed: missing block: B:22:?, code lost:            return false;     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0076, code lost:            if (defpackage.a.m(r12, 4) == false) goto L100;     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0078, code lost:            r11 = r11.d;        r9 = r9.d;     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x007c, code lost:            r9 = r11 - r9;     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0083, code lost:            if (defpackage.a.m(r12, 5) == false) goto L103;     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0085, code lost:            r9 = r9.c;        r11 = r11.c;     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x008e, code lost:            if (defpackage.a.m(r12, 6) == false) goto L110;     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0090, code lost:            r11 = r11.e;        r9 = r9.e;     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00a6, code lost:            throw new java.lang.IllegalStateException("This function should only be used for 2-D focus search");     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0034, code lost:            if (r9.d > r11.b) goto L71;     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0043, code lost:            if (r9.c < r11.e) goto L71;     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0052, code lost:            if (r9.e > r11.c) goto L71;     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0022, code lost:            if (r9.b >= r11.d) goto L87;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static boolean k(defpackage.aql r9, defpackage.aql r10, defpackage.aql r11, int r12) {
        /*
            boolean r0 = l(r11, r12, r9)
            r1 = 0
            if (r0 != 0) goto Lad
            boolean r0 = l(r10, r12, r9)
            if (r0 != 0) goto Lf
            goto Lad
        Lf:
            r0 = 3
            boolean r2 = defpackage.a.m(r12, r0)
            java.lang.String r3 = "This function should only be used for 2-D focus search"
            r4 = 6
            r5 = 5
            r6 = 4
            r7 = 1
            if (r2 == 0) goto L28
            float r2 = r9.b
            float r8 = r11.d
            int r2 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r2 < 0) goto L25
            goto L55
        L25:
            r1 = 1
            goto Lad
        L28:
            boolean r2 = defpackage.a.m(r12, r6)
            if (r2 == 0) goto L37
            float r2 = r9.d
            float r8 = r11.b
            int r2 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r2 <= 0) goto L55
            goto L25
        L37:
            boolean r2 = defpackage.a.m(r12, r5)
            if (r2 == 0) goto L46
            float r2 = r9.c
            float r8 = r11.e
            int r2 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r2 >= 0) goto L55
            goto L25
        L46:
            boolean r2 = defpackage.a.m(r12, r4)
            if (r2 == 0) goto La7
            float r2 = r9.e
            float r8 = r11.c
            int r2 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r2 <= 0) goto L55
            goto L25
        L55:
            boolean r2 = defpackage.a.m(r12, r0)
            if (r2 != 0) goto L25
            boolean r2 = defpackage.a.m(r12, r6)
            if (r2 == 0) goto L62
            goto L25
        L62:
            float r10 = o(r10, r12, r9)
            boolean r0 = defpackage.a.m(r12, r0)
            if (r0 == 0) goto L72
            float r9 = r9.b
            float r11 = r11.b
        L70:
            float r9 = r9 - r11
            goto L95
        L72:
            boolean r0 = defpackage.a.m(r12, r6)
            if (r0 == 0) goto L7f
            float r11 = r11.d
            float r9 = r9.d
        L7c:
            float r9 = r11 - r9
            goto L95
        L7f:
            boolean r0 = defpackage.a.m(r12, r5)
            if (r0 == 0) goto L8a
            float r9 = r9.c
            float r11 = r11.c
            goto L70
        L8a:
            boolean r12 = defpackage.a.m(r12, r4)
            if (r12 == 0) goto La1
            float r11 = r11.e
            float r9 = r9.e
            goto L7c
        L95:
            r11 = 1065353216(0x3f800000, float:1.0)
            float r9 = java.lang.Math.max(r11, r9)
            int r9 = (r10 > r9 ? 1 : (r10 == r9 ? 0 : -1))
            if (r9 < 0) goto La0
            goto Lad
        La0:
            return r7
        La1:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            r9.<init>(r3)
            throw r9
        La7:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            r9.<init>(r3)
            throw r9
        Lad:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iv.k(aql, aql, aql, int):boolean");
    }

    private static boolean l(aql aqlVar, int i, aql aqlVar2) {
        if (!a.m(i, 3) && !a.m(i, 4)) {
            if (a.m(i, 5) || a.m(i, 6)) {
                if (aqlVar.d > aqlVar2.b && aqlVar.b < aqlVar2.d) {
                    return true;
                }
                return false;
            }
            throw new IllegalStateException("This function should only be used for 2-D focus search");
        }
        if (aqlVar.e > aqlVar2.c && aqlVar.c < aqlVar2.e) {
            return true;
        }
        return false;
    }

    private static boolean m(aqh aqhVar, aql aqlVar, int i, moh mohVar) {
        if (g(aqhVar, aqlVar, i, mohVar)) {
            return true;
        }
        Boolean bool = (Boolean) fs.e(aqhVar, i);
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    private static boolean n(aql aqlVar, int i, aql aqlVar2) {
        if (a.m(i, 3)) {
            float f = aqlVar2.d;
            float f2 = aqlVar.d;
            if ((f > f2 || aqlVar2.b >= f2) && aqlVar2.b > aqlVar.b) {
                return true;
            }
            return false;
        }
        if (a.m(i, 4)) {
            float f3 = aqlVar2.b;
            float f4 = aqlVar.b;
            if ((f3 < f4 || aqlVar2.d <= f4) && aqlVar2.d < aqlVar.d) {
                return true;
            }
            return false;
        }
        if (a.m(i, 5)) {
            float f5 = aqlVar2.e;
            float f6 = aqlVar.e;
            if ((f5 > f6 || aqlVar2.c >= f6) && aqlVar2.c > aqlVar.c) {
                return true;
            }
            return false;
        }
        if (a.m(i, 6)) {
            float f7 = aqlVar2.c;
            float f8 = aqlVar.c;
            if ((f7 < f8 || aqlVar2.e <= f8) && aqlVar2.e < aqlVar.e) {
                return true;
            }
            return false;
        }
        throw new IllegalStateException("This function should only be used for 2-D focus search");
    }

    private static /* synthetic */ float o(aql aqlVar, int i, aql aqlVar2) {
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        if (a.m(i, 3)) {
            f3 = aqlVar2.b;
            f4 = aqlVar.d;
        } else {
            if (a.m(i, 4)) {
                f = aqlVar.b;
                f2 = aqlVar2.d;
            } else if (a.m(i, 5)) {
                f3 = aqlVar2.c;
                f4 = aqlVar.e;
            } else if (a.m(i, 6)) {
                f = aqlVar.c;
                f2 = aqlVar2.e;
            } else {
                throw new IllegalStateException("This function should only be used for 2-D focus search");
            }
            f5 = f - f2;
            return Math.max(0.0f, f5);
        }
        f5 = f3 - f4;
        return Math.max(0.0f, f5);
    }

    public void b(Window window) {
    }

    public void c(oz ozVar, oz ozVar2, Window window, View view, boolean z, boolean z2) {
    }
}
