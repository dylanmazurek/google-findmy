package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.os.Handler;
import android.os.Parcelable;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.ListView;
import android.widget.PopupWindow;
import com.google.android.apps.adm.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gb extends gp implements View.OnKeyListener, PopupWindow.OnDismissListener, gt {
    public final Handler a;
    View d;
    ViewTreeObserver e;
    public boolean f;
    private final Context h;
    private final int i;
    private final int j;
    private final boolean k;
    private View q;
    private boolean s;
    private boolean t;
    private int u;
    private int v;
    private boolean x;
    private gs y;
    private PopupWindow.OnDismissListener z;
    private final List l = new ArrayList();
    public final List b = new ArrayList();
    final ViewTreeObserver.OnGlobalLayoutListener c = new gy(this, 1);
    private final View.OnAttachStateChangeListener m = new fz(this, 0);
    private final kz n = new ga(this);
    private int o = 0;
    private int p = 0;
    private boolean w = false;
    private int r = B();

    public gb(Context context, View view, int i, boolean z) {
        this.h = context;
        this.q = view;
        this.j = i;
        this.k = z;
        Resources resources = context.getResources();
        this.i = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.a = new Handler();
    }

    private final int B() {
        if (this.q.getLayoutDirection() != 1) {
            return 1;
        }
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01a6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void C(defpackage.gh r17) {
        /*
            Method dump skipped, instructions count: 508
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gb.C(gh):void");
    }

    @Override // defpackage.gt
    public final Parcelable bL() {
        return null;
    }

    @Override // defpackage.gx
    public final ListView bM() {
        if (this.b.isEmpty()) {
            return null;
        }
        return ((hxh) this.b.get(r0.size() - 1)).b();
    }

    @Override // defpackage.gt
    public final void d(gh ghVar, boolean z) {
        int size = this.b.size();
        int i = 0;
        while (true) {
            if (i < size) {
                if (ghVar == ((hxh) this.b.get(i)).c) {
                    break;
                } else {
                    i++;
                }
            } else {
                i = -1;
                break;
            }
        }
        if (i >= 0) {
            int i2 = i + 1;
            if (i2 < this.b.size()) {
                ((gh) ((hxh) this.b.get(i2)).c).i(false);
            }
            hxh hxhVar = (hxh) this.b.remove(i);
            ((gh) hxhVar.c).m(this);
            if (this.f) {
                Object obj = hxhVar.b;
                if (Build.VERSION.SDK_INT >= 23) {
                    la.b(((ld) obj).q, null);
                }
                ((ky) hxhVar.b).q.setAnimationStyle(0);
            }
            ((ky) hxhVar.b).m();
            int size2 = this.b.size();
            if (size2 > 0) {
                this.r = ((hxh) this.b.get(size2 - 1)).a;
            } else {
                this.r = B();
            }
            if (size2 == 0) {
                m();
                gs gsVar = this.y;
                if (gsVar != null) {
                    gsVar.a(ghVar, true);
                }
                ViewTreeObserver viewTreeObserver = this.e;
                if (viewTreeObserver != null) {
                    if (viewTreeObserver.isAlive()) {
                        this.e.removeGlobalOnLayoutListener(this.c);
                    }
                    this.e = null;
                }
                this.d.removeOnAttachStateChangeListener(this.m);
                this.z.onDismiss();
                return;
            }
            if (z) {
                ((gh) ((hxh) this.b.get(0)).c).i(false);
            }
        }
    }

    @Override // defpackage.gt
    public final void e(gs gsVar) {
        this.y = gsVar;
    }

    @Override // defpackage.gt
    public final void f(boolean z) {
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            y(((hxh) it.next()).b().getAdapter()).notifyDataSetChanged();
        }
    }

    @Override // defpackage.gt
    public final boolean g() {
        return false;
    }

    @Override // defpackage.gt
    public final boolean h(ha haVar) {
        for (hxh hxhVar : this.b) {
            if (haVar == hxhVar.c) {
                hxhVar.b().requestFocus();
                return true;
            }
        }
        if (haVar.hasVisibleItems()) {
            l(haVar);
            gs gsVar = this.y;
            if (gsVar != null) {
                gsVar.b(haVar);
            }
            return true;
        }
        return false;
    }

    @Override // defpackage.gp
    public final void l(gh ghVar) {
        ghVar.h(this, this.h);
        if (x()) {
            C(ghVar);
        } else {
            this.l.add(ghVar);
        }
    }

    @Override // defpackage.gx
    public final void m() {
        int size = this.b.size();
        if (size > 0) {
            hxh[] hxhVarArr = (hxh[]) this.b.toArray(new hxh[size]);
            while (true) {
                size--;
                if (size >= 0) {
                    hxh hxhVar = hxhVarArr[size];
                    if (((ky) hxhVar.b).x()) {
                        ((ky) hxhVar.b).m();
                    }
                } else {
                    return;
                }
            }
        }
    }

    @Override // defpackage.gp
    public final void o(View view) {
        if (this.q != view) {
            this.q = view;
            this.p = Gravity.getAbsoluteGravity(this.o, view.getLayoutDirection());
        }
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        hxh hxhVar;
        int size = this.b.size();
        int i = 0;
        while (true) {
            if (i < size) {
                hxhVar = (hxh) this.b.get(i);
                if (!((ky) hxhVar.b).x()) {
                    break;
                } else {
                    i++;
                }
            } else {
                hxhVar = null;
                break;
            }
        }
        if (hxhVar != null) {
            ((gh) hxhVar.c).i(false);
        }
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1 && i == 82) {
            m();
            return true;
        }
        return false;
    }

    @Override // defpackage.gp
    public final void p(boolean z) {
        this.w = z;
    }

    @Override // defpackage.gp
    public final void q(int i) {
        if (this.o != i) {
            this.o = i;
            this.p = Gravity.getAbsoluteGravity(i, this.q.getLayoutDirection());
        }
    }

    @Override // defpackage.gp
    public final void r(int i) {
        this.s = true;
        this.u = i;
    }

    @Override // defpackage.gp
    public final void s(PopupWindow.OnDismissListener onDismissListener) {
        this.z = onDismissListener;
    }

    @Override // defpackage.gp
    public final void t(boolean z) {
        this.x = z;
    }

    @Override // defpackage.gp
    public final void u(int i) {
        this.t = true;
        this.v = i;
    }

    @Override // defpackage.gx
    public final void v() {
        if (!x()) {
            Iterator it = this.l.iterator();
            while (it.hasNext()) {
                C((gh) it.next());
            }
            this.l.clear();
            View view = this.q;
            this.d = view;
            if (view != null) {
                ViewTreeObserver viewTreeObserver = this.e;
                ViewTreeObserver viewTreeObserver2 = view.getViewTreeObserver();
                this.e = viewTreeObserver2;
                if (viewTreeObserver == null) {
                    viewTreeObserver2.addOnGlobalLayoutListener(this.c);
                }
                this.d.addOnAttachStateChangeListener(this.m);
            }
        }
    }

    @Override // defpackage.gp
    protected final boolean w() {
        return false;
    }

    @Override // defpackage.gx
    public final boolean x() {
        if (this.b.size() <= 0 || !((ky) ((hxh) this.b.get(0)).b).x()) {
            return false;
        }
        return true;
    }

    @Override // defpackage.gt
    public final void n(Parcelable parcelable) {
    }
}
