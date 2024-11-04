package defpackage;

import android.content.res.Resources;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.widget.ThemedSpinnerAdapter;
import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class in {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(ThemedSpinnerAdapter themedSpinnerAdapter, Resources.Theme theme) {
        Resources.Theme dropDownViewTheme;
        dropDownViewTheme = themedSpinnerAdapter.getDropDownViewTheme();
        if (!Objects.equals(dropDownViewTheme, theme)) {
            themedSpinnerAdapter.setDropDownViewTheme(theme);
        }
    }

    public static void b(View view, CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 26) {
            nk.a(view, charSequence);
            return;
        }
        nm nmVar = nm.a;
        if (nmVar != null && nmVar.c == view) {
            nm.b(null);
        }
        if (TextUtils.isEmpty(charSequence)) {
            nm nmVar2 = nm.b;
            if (nmVar2 != null && nmVar2.c == view) {
                nmVar2.a();
            }
            view.setOnLongClickListener(null);
            view.setLongClickable(false);
            view.setOnHoverListener(null);
            return;
        }
        new nm(view, charSequence);
    }

    public static final boolean c(aqh aqhVar, moh mohVar) {
        int ordinal = aqhVar.c().ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal == 3) {
                        if (!j(aqhVar, mohVar) && (!((apz) aqhVar.a()).a || !((Boolean) mohVar.a(aqhVar)).booleanValue())) {
                            return false;
                        }
                    } else {
                        throw new mku();
                    }
                }
            } else {
                aqh f = f(aqhVar);
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
                        } else if (!c(f, mohVar) && !i(aqhVar, f, 2, mohVar) && (!((apz) f.a()).a || !((Boolean) mohVar.a(f)).booleanValue())) {
                            return false;
                        }
                    }
                    return i(aqhVar, f, 2, mohVar);
                }
                throw new IllegalStateException("ActiveParent must have a focusedChild");
            }
            return true;
        }
        return j(aqhVar, mohVar);
    }

    public static final boolean d(aqh aqhVar, moh mohVar) {
        int ordinal = aqhVar.c().ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal == 3) {
                        if (((apz) aqhVar.a()).a) {
                            return ((Boolean) mohVar.a(aqhVar)).booleanValue();
                        }
                        return k(aqhVar, mohVar);
                    }
                    throw new mku();
                }
            } else {
                aqh f = f(aqhVar);
                if (f != null) {
                    if (d(f, mohVar) || i(aqhVar, f, 1, mohVar)) {
                        return true;
                    }
                    return false;
                }
                throw new IllegalStateException("ActiveParent must have a focusedChild");
            }
        }
        return k(aqhVar, mohVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:69:0x0035, code lost:            continue;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final defpackage.aqh e(defpackage.aqh r8) {
        /*
            aqf r0 = r8.c()
            int r0 = r0.ordinal()
            if (r0 == 0) goto Lae
            r1 = 0
            r2 = 1
            if (r0 == r2) goto L1b
            r2 = 2
            if (r0 == r2) goto Lae
            r8 = 3
            if (r0 != r8) goto L15
            return r1
        L15:
            mku r8 = new mku
            r8.<init>()
            throw r8
        L1b:
            aow r8 = r8.k
            boolean r0 = r8.t
            if (r0 == 0) goto La6
            aiu r0 = new aiu
            r3 = 16
            aow[] r4 = new defpackage.aow[r3]
            r0.<init>(r4)
            aow r4 = r8.o
            if (r4 != 0) goto L32
            defpackage.qg.h(r0, r8)
            goto L35
        L32:
            r0.o(r4)
        L35:
            boolean r8 = r0.m()
            if (r8 == 0) goto La5
            int r8 = r0.b
            int r8 = r8 + (-1)
            java.lang.Object r8 = r0.b(r8)
            aow r8 = (defpackage.aow) r8
            int r4 = r8.m
            r4 = r4 & 1024(0x400, float:1.435E-42)
            if (r4 != 0) goto L4f
            defpackage.qg.h(r0, r8)
            goto L35
        L4f:
            if (r8 == 0) goto L35
            int r4 = r8.l
            r4 = r4 & 1024(0x400, float:1.435E-42)
            if (r4 == 0) goto La2
            r4 = r1
        L58:
            if (r8 == 0) goto L35
            boolean r5 = r8 instanceof defpackage.aqh
            if (r5 == 0) goto L68
            aqh r8 = (defpackage.aqh) r8
            aqh r8 = e(r8)
            if (r8 != 0) goto L67
            goto L9d
        L67:
            return r8
        L68:
            int r5 = r8.l
            r5 = r5 & 1024(0x400, float:1.435E-42)
            if (r5 == 0) goto L9d
            boolean r5 = r8 instanceof defpackage.axx
            if (r5 == 0) goto L9d
            r5 = r8
            axx r5 = (defpackage.axx) r5
            aow r5 = r5.d
            r6 = 0
        L78:
            if (r5 == 0) goto L9b
            int r7 = r5.l
            r7 = r7 & 1024(0x400, float:1.435E-42)
            if (r7 == 0) goto L98
            int r6 = r6 + 1
            if (r6 != r2) goto L86
            r8 = r5
            goto L98
        L86:
            if (r4 != 0) goto L8f
            aiu r4 = new aiu
            aow[] r7 = new defpackage.aow[r3]
            r4.<init>(r7)
        L8f:
            if (r8 == 0) goto L94
            r4.o(r8)
        L94:
            r4.o(r5)
            r8 = r1
        L98:
            aow r5 = r5.o
            goto L78
        L9b:
            if (r6 == r2) goto L58
        L9d:
            aow r8 = defpackage.qg.d(r4)
            goto L58
        La2:
            aow r8 = r8.o
            goto L4f
        La5:
            return r1
        La6:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "visitChildren called on an unattached node"
            r8.<init>(r0)
            throw r8
        Lae:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.in.e(aqh):aqh");
    }

    /* JADX WARN: Code restructure failed: missing block: B:65:0x001b, code lost:            continue;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final defpackage.aqh f(defpackage.aqh r8) {
        /*
            aow r8 = r8.k
            boolean r0 = r8.t
            r1 = 0
            if (r0 == 0) goto L9b
            aiu r0 = new aiu
            r2 = 16
            aow[] r3 = new defpackage.aow[r2]
            r0.<init>(r3)
            aow r3 = r8.o
            if (r3 != 0) goto L18
            defpackage.qg.h(r0, r8)
            goto L1b
        L18:
            r0.o(r3)
        L1b:
            boolean r8 = r0.m()
            if (r8 == 0) goto L9b
            int r8 = r0.b
            int r8 = r8 + (-1)
            java.lang.Object r8 = r0.b(r8)
            aow r8 = (defpackage.aow) r8
            int r3 = r8.m
            r3 = r3 & 1024(0x400, float:1.435E-42)
            if (r3 != 0) goto L35
            defpackage.qg.h(r0, r8)
            goto L1b
        L35:
            if (r8 == 0) goto L1b
            int r3 = r8.l
            r3 = r3 & 1024(0x400, float:1.435E-42)
            if (r3 == 0) goto L98
            r3 = r1
        L3e:
            if (r8 == 0) goto L1b
            boolean r4 = r8 instanceof defpackage.aqh
            r5 = 1
            if (r4 == 0) goto L5e
            aqh r8 = (defpackage.aqh) r8
            aow r4 = r8.k
            boolean r4 = r4.t
            if (r4 == 0) goto L93
            aqf r4 = r8.c()
            int r4 = r4.ordinal()
            if (r4 == 0) goto L5d
            if (r4 == r5) goto L5d
            r5 = 2
            if (r4 == r5) goto L5d
            goto L93
        L5d:
            return r8
        L5e:
            int r4 = r8.l
            r4 = r4 & 1024(0x400, float:1.435E-42)
            if (r4 == 0) goto L93
            boolean r4 = r8 instanceof defpackage.axx
            if (r4 == 0) goto L93
            r4 = r8
            axx r4 = (defpackage.axx) r4
            aow r4 = r4.d
            r6 = 0
        L6e:
            if (r4 == 0) goto L91
            int r7 = r4.l
            r7 = r7 & 1024(0x400, float:1.435E-42)
            if (r7 == 0) goto L8e
            int r6 = r6 + 1
            if (r6 != r5) goto L7c
            r8 = r4
            goto L8e
        L7c:
            if (r3 != 0) goto L85
            aiu r3 = new aiu
            aow[] r7 = new defpackage.aow[r2]
            r3.<init>(r7)
        L85:
            if (r8 == 0) goto L8a
            r3.o(r8)
        L8a:
            r3.o(r4)
            r8 = r1
        L8e:
            aow r4 = r4.o
            goto L6e
        L91:
            if (r6 == r5) goto L3e
        L93:
            aow r8 = defpackage.qg.d(r3)
            goto L3e
        L98:
            aow r8 = r8.o
            goto L35
        L9b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.in.f(aqh):aqh");
    }

    public static final aql g(aqh aqhVar) {
        azq azqVar = aqhVar.q;
        if (azqVar != null) {
            return nd.i(azqVar).h(azqVar, false);
        }
        return aql.a;
    }

    public static final boolean h(aqh aqhVar) {
        ayr ayrVar;
        azq azqVar;
        ayr ayrVar2;
        azq azqVar2 = aqhVar.q;
        if (azqVar2 != null && (ayrVar = azqVar2.q) != null && ayrVar.d() && (azqVar = aqhVar.q) != null && (ayrVar2 = azqVar.q) != null && ayrVar2.ad()) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:128:0x01a2, code lost:            if (((java.lang.Boolean) r14.a(r11)).booleanValue() == false) goto L121;     */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x01ba A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0124  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final boolean i(defpackage.aqh r11, defpackage.aqh r12, int r13, defpackage.moh r14) {
        /*
            Method dump skipped, instructions count: 467
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.in.i(aqh, aqh, int, moh):boolean");
    }

    private static final boolean j(aqh aqhVar, moh mohVar) {
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
                                    aiuVar.o((aqh) aowVar3);
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
            aiuVar.i(kg.a);
            int i2 = aiuVar.b;
            if (i2 > 0) {
                Object[] objArr = aiuVar.a;
                int i3 = i2 - 1;
                do {
                    aqh aqhVar2 = (aqh) objArr[i3];
                    if (h(aqhVar2) && c(aqhVar2, mohVar)) {
                        return true;
                    }
                    i3--;
                } while (i3 >= 0);
            }
            return false;
        }
        throw new IllegalStateException("visitChildren called on an unattached node");
    }

    private static final boolean k(aqh aqhVar, moh mohVar) {
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
                                    aiuVar.o((aqh) aowVar3);
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
            aiuVar.i(kg.a);
            int i2 = aiuVar.b;
            if (i2 <= 0) {
                return false;
            }
            Object[] objArr = aiuVar.a;
            int i3 = 0;
            do {
                aqh aqhVar2 = (aqh) objArr[i3];
                if (h(aqhVar2) && d(aqhVar2, mohVar)) {
                    return true;
                }
                i3++;
            } while (i3 < i2);
            return false;
        }
        throw new IllegalStateException("visitChildren called on an unattached node");
    }
}
