package defpackage;

import android.os.Bundle;
import android.view.ViewStructure;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bek {
    public static Bundle a(ViewStructure viewStructure) {
        Bundle extras;
        extras = viewStructure.getExtras();
        return extras;
    }

    public static void b(ViewStructure viewStructure, String str) {
        viewStructure.setClassName(str);
    }

    public static void c(ViewStructure viewStructure, CharSequence charSequence) {
        viewStructure.setContentDescription(charSequence);
    }

    public static void d(ViewStructure viewStructure, int i, int i2, int i3, int i4, int i5, int i6) {
        viewStructure.setDimens(i, i2, i3, i4, i5, i6);
    }

    public static void e(ViewStructure viewStructure, CharSequence charSequence) {
        viewStructure.setText(charSequence);
    }

    public static void f(ViewStructure viewStructure, float f, int i, int i2, int i3) {
        viewStructure.setTextStyle(f, i, i2, i3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10, types: [aow] */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8, types: [aow] */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3, types: [aiu] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6, types: [aiu] */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    public static final bfh g(ayr ayrVar, boolean z) {
        azh azhVar = ayrVar.n;
        baa baaVar = null;
        if ((azhVar.a() & 8) != 0) {
            aow aowVar = azhVar.e;
            loop0: while (true) {
                if (aowVar != null) {
                    if ((aowVar.l & 8) != 0) {
                        axx axxVar = aowVar;
                        ?? r3 = 0;
                        while (axxVar != 0) {
                            if (axxVar instanceof baa) {
                                baaVar = axxVar;
                                break loop0;
                            }
                            if ((axxVar.l & 8) != 0 && (axxVar instanceof axx)) {
                                aow aowVar2 = axxVar.d;
                                int i = 0;
                                axxVar = axxVar;
                                r3 = r3;
                                while (aowVar2 != null) {
                                    if ((aowVar2.l & 8) != 0) {
                                        i++;
                                        r3 = r3;
                                        if (i == 1) {
                                            axxVar = aowVar2;
                                        } else {
                                            if (r3 == 0) {
                                                r3 = new aiu(new aow[16]);
                                            }
                                            if (axxVar != 0) {
                                                r3.o(axxVar);
                                            }
                                            r3.o(aowVar2);
                                            axxVar = 0;
                                        }
                                    }
                                    aowVar2 = aowVar2.o;
                                    axxVar = axxVar;
                                    r3 = r3;
                                }
                                if (i != 1) {
                                }
                            }
                            axxVar = qg.d(r3);
                        }
                    }
                    if ((aowVar.m & 8) == 0) {
                        break;
                    }
                    aowVar = aowVar.o;
                } else {
                    break;
                }
            }
        }
        baaVar.getClass();
        aow bX = baaVar.bX();
        bfe u = ayrVar.u();
        u.getClass();
        return new bfh(bX, z, ayrVar, u);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [aow] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4, types: [aow] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3, types: [aiu] */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6, types: [aiu] */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    public static final void h(ayr ayrVar) {
        azh azhVar = ayrVar.n;
        if ((azhVar.a() & 8) != 0) {
            for (aow aowVar = azhVar.e; aowVar != null; aowVar = aowVar.o) {
                if ((aowVar.l & 8) != 0) {
                    axx axxVar = aowVar;
                    ?? r2 = 0;
                    while (axxVar != 0) {
                        if (axxVar instanceof baa) {
                        } else if ((axxVar.l & 8) != 0 && (axxVar instanceof axx)) {
                            aow aowVar2 = axxVar.d;
                            int i = 0;
                            axxVar = axxVar;
                            r2 = r2;
                            while (aowVar2 != null) {
                                if ((aowVar2.l & 8) != 0) {
                                    i++;
                                    r2 = r2;
                                    if (i == 1) {
                                        axxVar = aowVar2;
                                    } else {
                                        if (r2 == 0) {
                                            r2 = new aiu(new aow[16]);
                                        }
                                        if (axxVar != 0) {
                                            r2.o(axxVar);
                                        }
                                        r2.o(aowVar2);
                                        axxVar = 0;
                                    }
                                }
                                aowVar2 = aowVar2.o;
                                axxVar = axxVar;
                                r2 = r2;
                            }
                            if (i != 1) {
                            }
                        }
                        axxVar = qg.d(r2);
                    }
                }
                if ((aowVar.m & 8) == 0) {
                    return;
                }
            }
        }
    }
}
