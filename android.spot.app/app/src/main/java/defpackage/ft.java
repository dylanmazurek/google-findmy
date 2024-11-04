package defpackage;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.Window;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ft {
    public static void a(Window.Callback callback, boolean z) {
        callback.onPointerCaptureChanged(z);
    }

    public static apr d(int i) {
        if (i != 1) {
            if (i != 2) {
                if (i != 17) {
                    if (i != 33) {
                        if (i != 66) {
                            if (i != 130) {
                                return null;
                            }
                            return new apr(6);
                        }
                        return new apr(4);
                    }
                    return new apr(5);
                }
                return new apr(3);
            }
            return new apr(1);
        }
        return new apr(2);
    }

    public static aql e(View view) {
        int[] iArr = apt.a;
        view.getLocationInWindow(iArr);
        float f = iArr[0];
        return new aql(f, iArr[1], view.getWidth() + f, iArr[1] + view.getHeight());
    }

    public static bln f(int i) {
        if (i != 0) {
            if (i != 1) {
                return null;
            }
            return bln.Rtl;
        }
        return bln.Ltr;
    }

    public static Integer g(int i) {
        if (a.m(i, 5)) {
            return 33;
        }
        if (a.m(i, 6)) {
            return 130;
        }
        if (a.m(i, 3)) {
            return 17;
        }
        if (a.m(i, 4)) {
            return 66;
        }
        if (a.m(i, 1)) {
            return 2;
        }
        if (!a.m(i, 2)) {
            return null;
        }
        return 1;
    }

    public static void h(aqh aqhVar) {
        azh azhVar;
        aow aowVar = aqhVar.k;
        if (aowVar.t) {
            ayr f = qg.f(aqhVar);
            aow aowVar2 = aowVar;
            while (f != null) {
                if ((f.n.e.m & 5120) != 0) {
                    while (aowVar2 != null) {
                        int i = aowVar2.l;
                        if ((i & 5120) != 0) {
                            if (aowVar2 == aowVar || (i & 1024) == 0) {
                                if ((i & 4096) != 0) {
                                    aow aowVar3 = aowVar2;
                                    aiu aiuVar = null;
                                    while (aowVar3 != null) {
                                        if (aowVar3 instanceof axp) {
                                            axp axpVar = (axp) aowVar3;
                                            i(axpVar);
                                            axpVar.z();
                                        } else if ((aowVar3.l & 4096) != 0 && (aowVar3 instanceof axx)) {
                                            int i2 = 0;
                                            for (aow aowVar4 = ((axx) aowVar3).d; aowVar4 != null; aowVar4 = aowVar4.o) {
                                                if ((aowVar4.l & 4096) != 0) {
                                                    i2++;
                                                    if (i2 == 1) {
                                                        aowVar3 = aowVar4;
                                                    } else {
                                                        if (aiuVar == null) {
                                                            aiuVar = new aiu(new aow[16]);
                                                        }
                                                        if (aowVar3 != null) {
                                                            aiuVar.o(aowVar3);
                                                        }
                                                        aiuVar.o(aowVar4);
                                                        aowVar3 = null;
                                                    }
                                                }
                                            }
                                            if (i2 != 1) {
                                            }
                                        }
                                        aowVar3 = qg.d(aiuVar);
                                    }
                                }
                            } else {
                                return;
                            }
                        }
                        aowVar2 = aowVar2.n;
                    }
                }
                f = f.o();
                if (f != null && (azhVar = f.n) != null) {
                    aowVar2 = azhVar.d;
                } else {
                    aowVar2 = null;
                }
            }
            return;
        }
        throw new IllegalStateException("visitAncestors called on an unattached node");
    }

    /* JADX WARN: Code restructure failed: missing block: B:110:0x0072, code lost:            continue;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void i(defpackage.axp r10) {
        /*
            Method dump skipped, instructions count: 243
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ft.i(axp):void");
    }

    public void b(RecyclerView recyclerView, int i, int i2) {
        throw null;
    }

    public void c(int i) {
    }
}
