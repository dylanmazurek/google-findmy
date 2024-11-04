package defpackage;

import android.app.Activity;
import android.content.ClipData;
import android.os.Build;
import android.text.Selection;
import android.text.Spannable;
import android.view.DragEvent;
import android.view.View;
import android.widget.TextView;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ij {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean a(DragEvent dragEvent, TextView textView, Activity activity) {
        bum bunVar;
        activity.requestDragAndDropPermissions(dragEvent);
        int offsetForPosition = textView.getOffsetForPosition(dragEvent.getX(), dragEvent.getY());
        textView.beginBatchEdit();
        try {
            Selection.setSelection((Spannable) textView.getText(), offsetForPosition);
            ClipData clipData = dragEvent.getClipData();
            if (Build.VERSION.SDK_INT >= 31) {
                bunVar = new bul(clipData, 3);
            } else {
                bunVar = new bun(clipData, 3);
            }
            bwn.c(textView, bqk.e(bunVar));
            textView.endBatchEdit();
            return true;
        } catch (Throwable th) {
            textView.endBatchEdit();
            throw th;
        }
    }

    static boolean b(DragEvent dragEvent, View view, Activity activity) {
        bum bunVar;
        activity.requestDragAndDropPermissions(dragEvent);
        ClipData clipData = dragEvent.getClipData();
        if (Build.VERSION.SDK_INT >= 31) {
            bunVar = new bul(clipData, 3);
        } else {
            bunVar = new bun(clipData, 3);
        }
        bwn.c(view, bqk.e(bunVar));
        return true;
    }

    public static int c(me meVar, lg lgVar, View view, View view2, lr lrVar, boolean z) {
        if (lrVar.an() != 0 && meVar.a() != 0 && view != null && view2 != null) {
            if (!z) {
                return Math.abs(lr.be(view) - lr.be(view2)) + 1;
            }
            return Math.min(lgVar.k(), lgVar.a(view2) - lgVar.d(view));
        }
        return 0;
    }

    public static int d(me meVar, lg lgVar, View view, View view2, lr lrVar, boolean z, boolean z2) {
        int max;
        if (lrVar.an() == 0 || meVar.a() == 0 || view == null || view2 == null) {
            return 0;
        }
        int min = Math.min(lr.be(view), lr.be(view2));
        int max2 = Math.max(lr.be(view), lr.be(view2));
        if (z2) {
            max = Math.max(0, (meVar.a() - max2) - 1);
        } else {
            max = Math.max(0, min);
        }
        if (!z) {
            return max;
        }
        return Math.round((max * (Math.abs(lgVar.a(view2) - lgVar.d(view)) / (Math.abs(lr.be(view) - lr.be(view2)) + 1))) + (lgVar.j() - lgVar.d(view)));
    }

    public static int e(me meVar, lg lgVar, View view, View view2, lr lrVar, boolean z) {
        if (lrVar.an() != 0 && meVar.a() != 0 && view != null && view2 != null) {
            if (!z) {
                return meVar.a();
            }
            return (int) (((lgVar.a(view2) - lgVar.d(view)) / (Math.abs(lr.be(view) - lr.be(view2)) + 1)) * meVar.a());
        }
        return 0;
    }

    public static final Boolean f(aqh aqhVar, int i) {
        azh azhVar;
        drz l = l(aqhVar);
        try {
            if (l.a) {
                l.i();
            }
            l.h();
            int h = h(aqhVar, i);
            int i2 = h - 1;
            aow aowVar = null;
            r2 = null;
            Boolean valueOf = null;
            if (h != 0) {
                boolean z = true;
                if (i2 != 0) {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            if (i2 != 3) {
                                throw new mku();
                            }
                        } else {
                            valueOf = true;
                        }
                    }
                } else {
                    int ordinal = aqhVar.c().ordinal();
                    if (ordinal != 0) {
                        if (ordinal != 1) {
                            if (ordinal != 2) {
                                if (ordinal == 3) {
                                    aow aowVar2 = aqhVar.k;
                                    if (aowVar2.t) {
                                        aow aowVar3 = aowVar2.n;
                                        ayr f = qg.f(aqhVar);
                                        loop0: while (true) {
                                            if (f == null) {
                                                break;
                                            }
                                            if ((f.n.e.m & 1024) != 0) {
                                                while (aowVar3 != null) {
                                                    if ((aowVar3.l & 1024) != 0) {
                                                        aow aowVar4 = aowVar3;
                                                        aiu aiuVar = null;
                                                        while (aowVar4 != null) {
                                                            if (aowVar4 instanceof aqh) {
                                                                aowVar = aowVar4;
                                                                break loop0;
                                                            }
                                                            if ((aowVar4.l & 1024) != 0 && (aowVar4 instanceof axx)) {
                                                                int i3 = 0;
                                                                for (aow aowVar5 = ((axx) aowVar4).d; aowVar5 != null; aowVar5 = aowVar5.o) {
                                                                    if ((aowVar5.l & 1024) != 0) {
                                                                        i3++;
                                                                        if (i3 == 1) {
                                                                            aowVar4 = aowVar5;
                                                                        } else {
                                                                            if (aiuVar == null) {
                                                                                aiuVar = new aiu(new aow[16]);
                                                                            }
                                                                            if (aowVar4 != null) {
                                                                                aiuVar.o(aowVar4);
                                                                            }
                                                                            aiuVar.o(aowVar5);
                                                                            aowVar4 = null;
                                                                        }
                                                                    }
                                                                }
                                                                if (i3 != 1) {
                                                                }
                                                            }
                                                            aowVar4 = qg.d(aiuVar);
                                                        }
                                                    }
                                                    aowVar3 = aowVar3.n;
                                                }
                                            }
                                            f = f.o();
                                            if (f != null && (azhVar = f.n) != null) {
                                                aowVar3 = azhVar.d;
                                            } else {
                                                aowVar3 = null;
                                            }
                                        }
                                        aqh aqhVar2 = (aqh) aowVar;
                                        if (aqhVar2 != null) {
                                            aqf c = aqhVar2.c();
                                            z = n(aqhVar2, aqhVar);
                                            if (z && c != aqhVar2.c()) {
                                                ft.h(aqhVar2);
                                            }
                                        } else {
                                            if (o(aqhVar)) {
                                                r(aqhVar);
                                            }
                                            z = false;
                                        }
                                    } else {
                                        throw new IllegalStateException("visitAncestors called on an unattached node");
                                    }
                                } else {
                                    throw new mku();
                                }
                            }
                        } else {
                            if (q(aqhVar, false)) {
                                r(aqhVar);
                            }
                            z = false;
                        }
                    }
                    if (z) {
                        ft.h(aqhVar);
                    }
                    valueOf = Boolean.valueOf(z);
                }
                return valueOf;
            }
            throw null;
        } finally {
            l.j();
        }
    }

    public static final int g(aqh aqhVar, int i) {
        int ordinal = aqhVar.c().ordinal();
        int i2 = 1;
        if (ordinal == 0) {
            return 1;
        }
        if (ordinal != 1) {
            if (ordinal == 2) {
                return 2;
            }
            if (ordinal == 3) {
                return 1;
            }
            throw new mku();
        }
        int g = g(m(aqhVar), i);
        if (g == 1) {
            g = 0;
        }
        if (g == 0) {
            if (aqhVar.a) {
                return 1;
            }
            aqhVar.a = true;
            try {
                Object a = ((apz) aqhVar.a()).k.a(new apr(i));
                if (a != aqd.a) {
                    if (a == aqd.b) {
                        aqhVar.a = false;
                        return 2;
                    }
                    if (true != ((aqd) a).b()) {
                        i2 = 4;
                    } else {
                        i2 = 3;
                    }
                }
                return i2;
            } finally {
                aqhVar.a = false;
            }
        }
        return g;
    }

    public static final int h(aqh aqhVar, int i) {
        aow aowVar;
        azh azhVar;
        int ordinal = aqhVar.c().ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                int i2 = 2;
                if (ordinal != 2) {
                    if (ordinal == 3) {
                        aow aowVar2 = aqhVar.k;
                        if (aowVar2.t) {
                            aow aowVar3 = aowVar2.n;
                            ayr f = qg.f(aqhVar);
                            loop0: while (true) {
                                aowVar = null;
                                if (f == null) {
                                    break;
                                }
                                if ((f.n.e.m & 1024) != 0) {
                                    while (aowVar3 != null) {
                                        if ((aowVar3.l & 1024) != 0) {
                                            aow aowVar4 = aowVar3;
                                            aiu aiuVar = null;
                                            while (aowVar4 != null) {
                                                if (aowVar4 instanceof aqh) {
                                                    aowVar = aowVar4;
                                                    break loop0;
                                                }
                                                if ((aowVar4.l & 1024) != 0 && (aowVar4 instanceof axx)) {
                                                    int i3 = 0;
                                                    for (aow aowVar5 = ((axx) aowVar4).d; aowVar5 != null; aowVar5 = aowVar5.o) {
                                                        if ((aowVar5.l & 1024) != 0) {
                                                            i3++;
                                                            if (i3 == 1) {
                                                                aowVar4 = aowVar5;
                                                            } else {
                                                                if (aiuVar == null) {
                                                                    aiuVar = new aiu(new aow[16]);
                                                                }
                                                                if (aowVar4 != null) {
                                                                    aiuVar.o(aowVar4);
                                                                }
                                                                aiuVar.o(aowVar5);
                                                                aowVar4 = null;
                                                            }
                                                        }
                                                    }
                                                    if (i3 != 1) {
                                                    }
                                                }
                                                aowVar4 = qg.d(aiuVar);
                                            }
                                        }
                                        aowVar3 = aowVar3.n;
                                    }
                                }
                                f = f.o();
                                if (f != null && (azhVar = f.n) != null) {
                                    aowVar3 = azhVar.d;
                                } else {
                                    aowVar3 = null;
                                }
                            }
                            aqh aqhVar2 = (aqh) aowVar;
                            if (aqhVar2 == null) {
                                return 1;
                            }
                            int ordinal2 = aqhVar2.c().ordinal();
                            if (ordinal2 != 0) {
                                if (ordinal2 != 1) {
                                    if (ordinal2 != 2) {
                                        if (ordinal2 == 3) {
                                            int h = h(aqhVar2, i);
                                            if (h == 1) {
                                                i2 = 0;
                                            } else {
                                                i2 = h;
                                            }
                                            if (i2 == 0) {
                                                return p(aqhVar2, i);
                                            }
                                        } else {
                                            throw new mku();
                                        }
                                    }
                                    return i2;
                                }
                                return h(aqhVar2, i);
                            }
                            return p(aqhVar2, i);
                        }
                        throw new IllegalStateException("visitAncestors called on an unattached node");
                    }
                    throw new mku();
                }
            } else {
                return g(m(aqhVar), i);
            }
        }
        return 1;
    }

    public static final boolean j(aqh aqhVar, boolean z) {
        int ordinal = aqhVar.c().ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal == 3) {
                        return true;
                    }
                    throw new mku();
                }
                if (z) {
                    aqhVar.g(aqf.Inactive);
                    ft.h(aqhVar);
                    return true;
                }
                return z;
            }
            if (!q(aqhVar, z)) {
                return false;
            }
            aqhVar.g(aqf.Inactive);
            ft.h(aqhVar);
            return true;
        }
        aqhVar.g(aqf.Inactive);
        ft.h(aqhVar);
        return true;
    }

    public static final void k(aqh aqhVar) {
        apv apvVar = qg.i(aqhVar).A.d;
        apvVar.b((sy) apvVar.c, aqhVar);
    }

    public static final drz l(aqh aqhVar) {
        return qg.i(aqhVar).A.f;
    }

    private static final aqh m(aqh aqhVar) {
        aqh f = in.f(aqhVar);
        if (f != null) {
            return f;
        }
        throw new IllegalArgumentException("ActiveParent with no focused child");
    }

    private static final boolean n(aqh aqhVar, aqh aqhVar2) {
        boolean z;
        aow aowVar;
        aow aowVar2;
        azh azhVar;
        azh azhVar2;
        aow aowVar3 = aqhVar2.k;
        if (aowVar3.t) {
            aow aowVar4 = aowVar3.n;
            ayr f = qg.f(aqhVar2);
            loop0: while (true) {
                z = false;
                aowVar = null;
                if (f != null) {
                    if ((f.n.e.m & 1024) != 0) {
                        while (aowVar4 != null) {
                            if ((aowVar4.l & 1024) != 0) {
                                aowVar2 = aowVar4;
                                aiu aiuVar = null;
                                while (aowVar2 != null) {
                                    if (aowVar2 instanceof aqh) {
                                        break loop0;
                                    }
                                    if ((aowVar2.l & 1024) != 0 && (aowVar2 instanceof axx)) {
                                        int i = 0;
                                        for (aow aowVar5 = ((axx) aowVar2).d; aowVar5 != null; aowVar5 = aowVar5.o) {
                                            if ((aowVar5.l & 1024) != 0) {
                                                i++;
                                                if (i == 1) {
                                                    aowVar2 = aowVar5;
                                                } else {
                                                    if (aiuVar == null) {
                                                        aiuVar = new aiu(new aow[16]);
                                                    }
                                                    if (aowVar2 != null) {
                                                        aiuVar.o(aowVar2);
                                                    }
                                                    aiuVar.o(aowVar5);
                                                    aowVar2 = null;
                                                }
                                            }
                                        }
                                        if (i != 1) {
                                        }
                                    }
                                    aowVar2 = qg.d(aiuVar);
                                }
                            }
                            aowVar4 = aowVar4.n;
                        }
                    }
                    f = f.o();
                    if (f != null && (azhVar2 = f.n) != null) {
                        aowVar4 = azhVar2.d;
                    } else {
                        aowVar4 = null;
                    }
                } else {
                    aowVar2 = null;
                    break;
                }
            }
            if (amr.i(aowVar2, aqhVar)) {
                int ordinal = aqhVar.c().ordinal();
                if (ordinal != 0) {
                    if (ordinal != 1) {
                        if (ordinal != 2) {
                            if (ordinal == 3) {
                                aow aowVar6 = aqhVar.k;
                                if (aowVar6.t) {
                                    aow aowVar7 = aowVar6.n;
                                    ayr f2 = qg.f(aqhVar);
                                    loop4: while (true) {
                                        if (f2 == null) {
                                            break;
                                        }
                                        if ((f2.n.e.m & 1024) != 0) {
                                            while (aowVar7 != null) {
                                                if ((aowVar7.l & 1024) != 0) {
                                                    aow aowVar8 = aowVar7;
                                                    aiu aiuVar2 = null;
                                                    while (aowVar8 != null) {
                                                        if (aowVar8 instanceof aqh) {
                                                            aowVar = aowVar8;
                                                            break loop4;
                                                        }
                                                        if ((aowVar8.l & 1024) != 0 && (aowVar8 instanceof axx)) {
                                                            int i2 = 0;
                                                            for (aow aowVar9 = ((axx) aowVar8).d; aowVar9 != null; aowVar9 = aowVar9.o) {
                                                                if ((aowVar9.l & 1024) != 0) {
                                                                    i2++;
                                                                    if (i2 == 1) {
                                                                        aowVar8 = aowVar9;
                                                                    } else {
                                                                        if (aiuVar2 == null) {
                                                                            aiuVar2 = new aiu(new aow[16]);
                                                                        }
                                                                        if (aowVar8 != null) {
                                                                            aiuVar2.o(aowVar8);
                                                                        }
                                                                        aiuVar2.o(aowVar9);
                                                                        aowVar8 = null;
                                                                    }
                                                                }
                                                            }
                                                            if (i2 != 1) {
                                                            }
                                                        }
                                                        aowVar8 = qg.d(aiuVar2);
                                                    }
                                                }
                                                aowVar7 = aowVar7.n;
                                            }
                                        }
                                        f2 = f2.o();
                                        if (f2 != null && (azhVar = f2.n) != null) {
                                            aowVar7 = azhVar.d;
                                        } else {
                                            aowVar7 = null;
                                        }
                                    }
                                    aqh aqhVar3 = (aqh) aowVar;
                                    if (aqhVar3 == null && o(aqhVar)) {
                                        r(aqhVar2);
                                        aqhVar.g(aqf.ActiveParent);
                                        return true;
                                    }
                                    if (aqhVar3 != null && n(aqhVar3, aqhVar)) {
                                        z = n(aqhVar, aqhVar2);
                                        if (aqhVar.c() == aqf.ActiveParent) {
                                            if (z) {
                                                ft.h(aqhVar3);
                                                return true;
                                            }
                                        } else {
                                            throw new IllegalStateException("Deactivated node is focused");
                                        }
                                    }
                                } else {
                                    throw new IllegalStateException("visitAncestors called on an unattached node");
                                }
                            } else {
                                throw new mku();
                            }
                        }
                    } else {
                        m(aqhVar);
                        if (q(aqhVar, false)) {
                            r(aqhVar2);
                            return true;
                        }
                    }
                    return z;
                }
                r(aqhVar2);
                aqhVar.g(aqf.ActiveParent);
                return true;
            }
            throw new IllegalStateException("Non child node cannot request focus.");
        }
        throw new IllegalStateException("visitAncestors called on an unattached node");
    }

    private static final boolean o(aqh aqhVar) {
        return ((Boolean) qg.i(aqhVar).A.a.a(null, null)).booleanValue();
    }

    private static final int p(aqh aqhVar, int i) {
        int i2;
        if (!aqhVar.b) {
            aqhVar.b = true;
            try {
                Object a = ((apz) aqhVar.a()).j.a(new apr(i));
                if (a != aqd.a) {
                    if (a == aqd.b) {
                        i2 = 2;
                    } else if (((aqd) a).b()) {
                        i2 = 3;
                    } else {
                        i2 = 4;
                    }
                    return i2;
                }
            } finally {
                aqhVar.b = false;
            }
        }
        return 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean q(aqh aqhVar, boolean z) {
        aqh f = in.f(aqhVar);
        if (f != null) {
            return j(f, z);
        }
        return true;
    }

    private static final void r(aqh aqhVar) {
        qn.d(aqhVar, new ob(aqhVar, 13));
        int ordinal = aqhVar.c().ordinal();
        if (ordinal != 1 && ordinal != 3) {
            return;
        }
        aqhVar.g(aqf.Active);
    }
}
