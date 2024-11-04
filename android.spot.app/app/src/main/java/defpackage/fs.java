package defpackage;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.View;
import android.view.Window;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public class fs {
    public static void a(Window.Callback callback, List list, Menu menu, int i) {
        callback.onProvideKeyboardShortcuts(list, menu, i);
    }

    public static Object e(aqh aqhVar, int i) {
        aow aowVar;
        avj d;
        azh azhVar;
        aow aowVar2 = aqhVar.k;
        if (aowVar2.t) {
            aow aowVar3 = aowVar2.n;
            ayr f = qg.f(aqhVar);
            loop0: while (true) {
                if (f != null) {
                    if ((f.n.e.m & 1024) != 0) {
                        while (aowVar3 != null) {
                            if ((aowVar3.l & 1024) != 0) {
                                aowVar = aowVar3;
                                aiu aiuVar = null;
                                while (aowVar != null) {
                                    if (aowVar instanceof aqh) {
                                        break loop0;
                                    }
                                    if ((aowVar.l & 1024) != 0 && (aowVar instanceof axx)) {
                                        int i2 = 0;
                                        for (aow aowVar4 = ((axx) aowVar).d; aowVar4 != null; aowVar4 = aowVar4.o) {
                                            if ((aowVar4.l & 1024) != 0) {
                                                i2++;
                                                if (i2 == 1) {
                                                    aowVar = aowVar4;
                                                } else {
                                                    if (aiuVar == null) {
                                                        aiuVar = new aiu(new aow[16]);
                                                    }
                                                    if (aowVar != null) {
                                                        aiuVar.o(aowVar);
                                                    }
                                                    aiuVar.o(aowVar4);
                                                    aowVar = null;
                                                }
                                            }
                                        }
                                        if (i2 != 1) {
                                        }
                                    }
                                    aowVar = qg.d(aiuVar);
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
                } else {
                    aowVar = null;
                    break;
                }
            }
            aqh aqhVar2 = (aqh) aowVar;
            if ((aqhVar2 != null && amr.i(aqhVar2.d(), aqhVar.d())) || (d = aqhVar.d()) == null) {
                return null;
            }
            if (!a.m(i, 5) && !a.m(i, 6) && !a.m(i, 3) && !a.m(i, 4) && !a.m(i, 1) && !a.m(i, 2)) {
                throw new IllegalStateException("Unsupported direction for beyond bounds layout");
            }
            return d.a();
        }
        throw new IllegalStateException("visitAncestors called on an unattached node");
    }

    public static aox f(aox aoxVar) {
        return jw.c(aoxVar, 0.0f, 0.0f, 0.0f, true, 126975);
    }

    public void b(Rect rect, View view, RecyclerView recyclerView, me meVar) {
        ((ls) view.getLayoutParams()).cB();
        rect.set(0, 0, 0, 0);
    }

    public void d(Canvas canvas) {
    }

    public void c(Canvas canvas, RecyclerView recyclerView) {
    }
}
