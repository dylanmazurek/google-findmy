package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gy implements ViewTreeObserver.OnGlobalLayoutListener {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public gy(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        int i = this.b;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i != 5) {
                                ((hls) this.a).a();
                                return;
                            } else {
                                ((hia) this.a).n();
                                return;
                            }
                        }
                        ((baw) this.a).B();
                        return;
                    }
                    iu iuVar = ((ir) this.a).d;
                    if (iuVar.isAttachedToWindow() && iuVar.getGlobalVisibleRect(((ir) this.a).c)) {
                        ((ir) this.a).n();
                        ir.l((ir) this.a);
                        return;
                    } else {
                        ((ky) this.a).m();
                        return;
                    }
                }
                if (!((iu) this.a).b.x()) {
                    ((iu) this.a).b();
                }
                ViewTreeObserver viewTreeObserver = ((iu) this.a).getViewTreeObserver();
                if (viewTreeObserver != null) {
                    viewTreeObserver.removeOnGlobalLayoutListener(this);
                    return;
                }
                return;
            }
            if (((gb) this.a).x() && ((gb) this.a).b.size() > 0 && !((ky) ((hxh) ((gb) this.a).b.get(0)).b).p) {
                View view = ((gb) this.a).d;
                if (view != null && view.isShown()) {
                    Iterator it = ((gb) this.a).b.iterator();
                    while (it.hasNext()) {
                        ((ky) ((hxh) it.next()).b).v();
                    }
                    return;
                }
                ((gb) this.a).m();
                return;
            }
            return;
        }
        if (((gz) this.a).x()) {
            gz gzVar = (gz) this.a;
            if (!gzVar.a.p) {
                View view2 = gzVar.c;
                if (view2 != null && view2.isShown()) {
                    ((gz) this.a).a.v();
                } else {
                    ((gz) this.a).m();
                }
            }
        }
    }

    public /* synthetic */ gy(Object obj, int i, byte[] bArr) {
        this.b = i;
        this.a = obj;
    }
}
